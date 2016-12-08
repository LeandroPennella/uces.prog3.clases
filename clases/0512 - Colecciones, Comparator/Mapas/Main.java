package Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import Mapas.Aeropuerto;;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map<String, Aeropuerto> mapa=new HashMap<String, Aeropuerto>();
		Map<String, Aeropuerto> mapa=new TreeMap<String, Aeropuerto>();
		Iterator<String> i; 
		
		mapa.put("bue", new Aeropuerto("Ministro Pistrani",12313,3123123));
		mapa.put("MDQ", new Aeropuerto("Mar del Plata",213123123,123123));
		mapa.put("CBA", new Aeropuerto("Cordoba",231235,5555));
		mapa.put("abc", new Aeropuerto("sarasa",231235,5555));
		mapa.put("xyz", new Aeropuerto("saasa",231235,5555));
		
		i=mapa.keySet().iterator();
		while(i.hasNext())
		{
			String key=i.next();
			Aeropuerto aeropuerto=mapa.get(key);
			System.out.println(aeropuerto);
		}
		
		
		System.out.println("==============> Borro MDQ");
		mapa.remove("MDQ");
		
		i =mapa.keySet().iterator();
		while(i.hasNext())
		{
			String key=i.next();
			Aeropuerto aeropuerto=mapa.get(key);
			System.out.println(aeropuerto);
		}
		
		System.out.println("==============> Borro actualizo bue");
		mapa.put("xyz", new Aeropuerto("xxxxx",9999,99999));
		
		i =mapa.keySet().iterator();
		while(i.hasNext())
		{
			String key=i.next();
			Aeropuerto aeropuerto=mapa.get(key);
			System.out.println(aeropuerto);
		}
	}

}
