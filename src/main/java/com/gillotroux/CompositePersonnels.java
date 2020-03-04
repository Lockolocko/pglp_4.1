package com.gillotroux;

import java.util.ArrayList;
import java.util.List;

public class CompositePersonnels implements InterfacePersonnels {
    private List<Personnel> listePersonnel = new ArrayList<Personnel>();
    private final int id;

    public CompositePersonnels(int id) {
        this.id = id;
    }
	
    public void add(Personnel personnel) {
        listePersonnel.add(personnel);
    }
	
	public void add(CompositePersonnels liste) {
		for (Personnel personnel : liste.getListe()) {
	    listePersonnel.add(personnel);
		}
	}
	
	public List<Personnel> getListe(){
		return listePersonnel;
	}
	
	public void remove(Personnel personnel) {
	    listePersonnel.remove(personnel);
	}
	
	public void print() {
		System.out.println("Numéro de service :" + id);
		for (Personnel personnel : listePersonnel) {
			personnel.print();
		}
	}
}
