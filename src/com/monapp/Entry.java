package com.monapp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.monapp.model.Car;
import com.monapp.model.Parking;

public class Entry {

	public static void main(String[] args) {
		
		Parking parking1 = new Parking(1, "Jean Jaures");
		Parking parking2 = new Parking(2, "Capitole");
		
		parking1.addCar(new Car(11,"VD334JK", "Peugeot", "Rouge"));
		parking1.addCar(new Car(23,"VFERSJK", "Renault", "Bleu"));
		parking1.addCar(new Car(465,"VH342JG", "Ford", "Rouge"));
		parking1.addCar(new Car(52,"DG4T2JK", "Ford", "Bleu"));
		parking1.addCar(new Car(85,"VD332JR", "Peugeot", "Rouge"));
		
		parking2.addCar(new Car(34,"VD334EK", "Peugeot", "Vert"));
		parking2.addCar(new Car(22,"VFERSAK", "Fiat", "Rouge"));
		parking2.addCar(new Car(624,"VH34HJG", "Ford", "Vert"));
		parking2.addCar(new Car(888,"VDADJR", "Renault", "Rouge"));
		
		
		List<Parking> parkings  = new ArrayList();
		parkings.add(parking1);
		parkings.add(parking2);
		
		
		ObjectMapper mapper = new ObjectMapper();
		
		//lire les données à partir d'un fichir json
		List<Parking> p;
		try {
			p = mapper.readValue(new File("parking.json"), new TypeReference<List<Parking>>() {} );
			System.out.println(p);
		  } catch (JsonGenerationException e) { 
			  e.printStackTrace(); 
		  } catch (JsonMappingException e) {
			  e.printStackTrace(); 
		  } catch (IOException e) {
		  e.printStackTrace(); }
		}

		
		//Transformer les données en .json
		
		  //try { mapper.writeValue(new File("parking.json"), parkings); 
		  //} catch (JsonGenerationException e) { 
			//  e.printStackTrace(); 
		  //} catch (JsonMappingException e) {
		//	  e.printStackTrace(); 
		  //} catch (IOException e) {
		 // e.printStackTrace(); }
		 

	}


