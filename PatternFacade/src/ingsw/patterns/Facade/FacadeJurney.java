package ingsw.patterns.Facade;

import java.util.Vector;

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

	public void getHotelAndVoloByLocation(String Partenza, String Arrivo, Volo v1, Vector<Hotel> h1) {

		try {
			
			v1.setVolo(gestoreVolo.getVolo(Partenza, Arrivo));
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		gestoreHotel.getHotelByLocation(Arrivo, h1);
		// System.out.println(h1.size());

	}

}
