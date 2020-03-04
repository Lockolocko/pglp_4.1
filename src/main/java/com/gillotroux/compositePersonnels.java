package com.gillotroux;

import java.util.ArrayList;
import java.util.List;

public class compositePersonnels implements InterfacePersonnels{
	private List<Personnel> listePersonnel=new ArrayList<Personnel>();
	
	public void add(Personnel personnel) {
	    listePersonnel.add(personnel);
	}
	
	public void remove(Personnel personnel) {
	    listePersonnel.remove(personnel);
	}
	
	public void print() {
		for(Personnel personnel : listePersonnel) {
			personnel.print();
		}
	}
}
