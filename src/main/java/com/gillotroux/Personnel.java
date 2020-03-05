/**
 * Package de Gillot-Roux.
 */

package com.gillotroux;

import java.time.LocalDate;

/**
 * Création d'un personnel.
 * @author Lockolocko
 *
 */
public final class Personnel implements InterfacePersonnels {
    private final String nom;
    private final String prenom;
    private final LocalDate dateDeNaissance;
    private final int numeroFixPro;
    private final int numeroFixPer;

    private Personnel(Builder builder) {
        // Required parameters
        nom = builder.nom;
        prenom = builder.prenom;
        dateDeNaissance = builder.dateDeNaissance;

        // Optionnal parameters
        numeroFixPro = builder.numeroFixPro;
        numeroFixPer = builder.numeroFixPer;
    }

    public static class Builder {
    	// Required parameters
        private final String nom;
        private final String prenom;
        private final LocalDate dateDeNaissance;

        // Optionnal parameters
        private int numeroFixPro = 0;
        private int numeroFixPer = 0;

        public Builder(String nom,String prenom,LocalDate dateDeNaissance) {
            this.nom = nom;
            this.prenom = prenom;
            this.dateDeNaissance = dateDeNaissance;
        }

        // Fonction des parameters optionnal
        public Builder numeroFixPro(int numero) {
        	numeroFixPro = numero;
        	return this;
        	
        }
        
        public Builder numeroFixPer(int numero) {
        	numeroFixPer = numero;
        	return this;
        }

        public Personnel build() {
           return new Personnel(this);
        }
        
    }

    public void print() {
    	System.out.println(nom+" "+prenom);
    }
}
