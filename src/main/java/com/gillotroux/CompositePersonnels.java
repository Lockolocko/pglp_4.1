/**
 * Package de Gillot-Roux.
 */

package com.gillotroux;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite de notre structure.
 * @author Lockolocko
 *
 */

public class CompositePersonnels implements InterfacePersonnels {

/**
 * Une liste du personnel.
 */

    private List<Personnel> listePersonnel = new ArrayList<Personnel>();

/**
 * Un numéro de service.
 */

    private final int id;

/**
 * Constructeur de la classe.
 * 
 * @param id le numéro de service.
 */

    public CompositePersonnels(int id) {
        this.id = id;
    }

/**
 * Permet l'ajout d'un nouveau personnel.
 * 
 * @param personnel un membre du personnel.
 */
	
    public void add(Personnel personnel) {
        listePersonnel.add(personnel);
    }

/**
 * Permet l'ajout d'un autre service au sein d'un service.
 * @param liste
 */

	public void add(CompositePersonnels liste) {
		for (Personnel personnel : liste.getListe()) {
	    listePersonnel.add(personnel);
		}
	}

/**
 * Permet de récupérer la liste du personnel dans un service donné.
 * @return {@link List}
 */

	public List<Personnel> getListe(){
		return listePersonnel;
	}

/**
 * Permet de retirer un employé d'un service.
 * @param personnel {@link Personnel}
 */
	
	public void remove(Personnel personnel) {
	    listePersonnel.remove(personnel);
	}

/**
 * Permet l'affichage d'un service.
 */

	public void print() {
		System.out.println("Numéro de service :" + id);
		for (Personnel personnel : listePersonnel) {
			personnel.print();
		}
	}
}
