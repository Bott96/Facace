package ingsw.patterns.Facade;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ListModel;

class HotelVolo {

	private Hotel h;
	private Volo v;

	public HotelVolo(Hotel h, Volo v) {
		this.h = h;
		this.v = v;
	}

	public Hotel getH() {
		return h;
	}

	public void setH(Hotel h) {
		this.h = h;
	}

	public Volo getV() {
		return v;
	}

	public void setV(Volo v) {
		this.v = v;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return h + ", " + v;
	}

}

public class FacadeJurney {

	private HotelBroker gestoreHotel = new HotelBroker();
	private VoloBroker gestoreVolo = new VoloBroker();

	public Vector<Hotel> getAviableHotel() {

		return gestoreHotel.getListHotel();
	}

	public Vector<Volo> getAviableFlight() {

		return gestoreVolo.getVectorVoli();
	}

	public HotelVolo getHotelAndVoloByLocation(String Partenza, String Arrivo, String nome) {
		Hotel h;
		Volo v;

		try {
			h = gestoreHotel.getHotel(nome);
			v = gestoreVolo.getVolo(Partenza, Arrivo);

			HotelVolo hv = new HotelVolo(h, v);
			return hv;
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		return null;
	}

}
