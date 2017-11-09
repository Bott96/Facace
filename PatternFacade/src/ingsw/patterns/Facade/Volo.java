package ingsw.patterns.Facade;

public class Volo {

	private int Id;
	private String Partenza;
	private String Arrivo;

	public Volo() {
		// TODO Auto-generated constructor stub
	}

	public Volo(int id, String partenza, String arrivo) {

		Id = id;
		Partenza = partenza;
		Arrivo = arrivo;
	}

	public int getId() {
		return Id;
	}

	public void setVolo(Volo v1) {
		this.Id = v1.Id;
		this.Partenza = v1.Partenza;
		this.Arrivo = v1.Arrivo;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getPartenza() {
		return Partenza;
	}

	public void setPartenza(String partenza) {
		Partenza = partenza;
	}

	public String getArrivo() {
		return Arrivo;
	}

	public void setArrivo(String arrivo) {
		Arrivo = arrivo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Partenza + "->" + Arrivo;
	}

}
