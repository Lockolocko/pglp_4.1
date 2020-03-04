package com.gillotroux;

import java.time.LocalDate;

import org.junit.Test;

public class TestPersonnel {

	@Test
	public void test() {
		LocalDate date=LocalDate.now();
		
		// Creation de personnel
		Personnel personnel1=new Personnel.Builder("Gillot-Roux","Raphaël",date).build();
		Personnel personnel2=new Personnel.Builder("Dupont","Roger",date).build();
		
		// Creation liste personnel
		CompositePersonnels liste1=new CompositePersonnels(4);
		
		liste1.add(personnel1);
		liste1.add(personnel2);
		
		liste1.print();
	}

}
