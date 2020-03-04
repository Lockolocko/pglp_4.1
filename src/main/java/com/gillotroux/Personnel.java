package com.gillotroux;

import java.time.*;

public final class Personnel {
    private final String nom;
    private final String prenom;
    private final LocalDate dateDeNaissance;
    private final int numeroFixPro;
    private final int numeroFixPer;
    
    private Personnel(Builder builder){
    	// Required parameters
        nom=builder.nom;
        prenom=builder.prenom;
        
        // Optionnal parameters
    }
    
    public static class Builder{
    	// Required parameters
        private final String nom;
        private final String prenom;
        private final LocalDate dateDeNaissance;
        
        // Optionnal parameters
        private int numeroFixPro;
        private int numeroFixPer;
        
        public Builder(String nom,String prenom){
            this.nom=nom;
            this.prenom=prenom;
        }
        
        
    }
    
    
    
}
