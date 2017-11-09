package ingsw.patterns.Facade;

import java.util.ArrayList;
import java.util.Vector;

public class VoloBroker {

	Vector<Volo> voli;

	public VoloBroker() {

		voli = new Vector<Volo>();

		voli.add(new Volo(1, "Lamezia", "Roma"));
		voli.add(new Volo(2, "Roma", "Parigi"));
		voli.add(new Volo(3, "Roma", "Londra"));
		voli.add(new Volo(4, "Lamezia", "Firenze"));
		voli.add(new Volo(5, "Firenze", "Berlino"));
		voli.add(new Volo(6, "Napoli", "Barcellona"));
		voli.add(new Volo(7, "Milano", "NewYork"));

	}

	public Vector<Volo> getVectorVoli() {
		return voli;
	}

	public Volo getVolo(String Partenza, String Arrivo) {

		ArrayList<Volo> v1 = new ArrayList<Volo>();

		for (Volo volo : voli) {
			if (volo.getPartenza().equals(Partenza))
			{
				v1.add(volo);
			}
			}

		if (v1.isEmpty())
			throw new RuntimeException("Non Ci Sono Voli da Questa Partenza");
		else {

			ArrayList<Volo> v2 = new ArrayList<Volo>();
			for (Volo volo : v1) {
				if (volo.getArrivo().equals(Arrivo))
					v2.add(volo);
			}

			if (v2.isEmpty()) {
				throw new RuntimeException("Non Ci Sono Voli per questa Destinazione");

			} else
				return v2.get(0);
		}

	}

}
