package ingsw.patterns.Facade;

import java.util.Vector;

public class HotelBroker {

	Vector<Hotel> hotels;
//	static Integer id =0;
	public HotelBroker() {
		hotels = new Vector<>();
	    hotels.add(new Hotel("Hotel Marconi", "Lamezia", 50));
	    hotels.add(new Hotel("Holiday Inn", "Lamezia", 70));
	    hotels.add(new Hotel("Hotel Londra", "Londra", 80));
	    hotels.add(new Hotel("Hotel Parigi", "Parigi", 65));
	    hotels.add(new Hotel("Hotel Firenze", "Firenze", 30));
	    hotels.add(new Hotel("Hotel Bologna", "Bologna", 150));
	    hotels.add(new Hotel("Hotel SPQR", "Roma", 50));
	    hotels.add(new Hotel("Hotel Barcellona", "Barcellona", 50));

	}

	public void addHotel(String n, String l, float p){
		
		Hotel h = new Hotel(n, l, p);
		hotels.add(h);
		
		
	}
	
	public Vector<Hotel> getListHotel(){
		return hotels;
	}
	
	public Hotel getHotel(int n)
	{
		Hotel trovato;
		trovato=hotels.get(n);
	
				
		if(trovato != null)
			return trovato ;
		else
			throw new RuntimeException("Hotel non Trovato");
			
	}
	
	public Hotel getHotel(String n)
	{
		
		
		for(int i =0; i<hotels.size(); i++)
			if(hotels.get(i).getLocation().equals(n))
				return hotels.get(i);
	
		
			throw new RuntimeException("Hotel non Trovato");
			
	}

}
