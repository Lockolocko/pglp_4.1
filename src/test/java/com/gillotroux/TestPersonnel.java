package com.gillotroux;

import java.time.LocalDate;

import org.junit.Test;

public class TestPersonnel {

	@Test
	public void test() {
		LocalDate date=LocalDate.now();
		Personnel personnel1=new Personnel.Builder("Gillot-Roux","Raphaël",date);
	}

}
