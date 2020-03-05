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
 * Un num�ro de service.
 */

    private final int id;

/**
 * Constructeur de la classe.
 * 
 * @param id le num�ro de service.
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
 * Permet de r�cup�rer la liste du personnel dans un service donn�.
 * @return {@link List}
 */

	public List<Personnel> getListe(){
		return listePersonnel;
	}

/**
 * Permet de retirer un employ� d'un service.
 * @param personnel {@link Personnel}
 */
	
	public void remove(Personnel personnel) {
	    listePersonnel.remove(personnel);
	}

/**
 * Permet l'affichage d'un service.
 */

	public void print() {
		System.out.println("Num�ro de service :" + id);
		for (Personnel personnel : listePersonnel) {
			personnel.print();
		}
	}
}
