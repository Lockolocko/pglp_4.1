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
        dateDeNaissance=builder.dateDeNaissance;
        
        // Optionnal parameters
        numeroFixPro=builder.numeroFixPro;
        numeroFixPer=builder.numeroFixPer;
    }
    
    public static class Builder{
    	// Required parameters
        private final String nom;
        private final String prenom;
        private final LocalDate dateDeNaissance;
        
        // Optionnal parameters
        private int numeroFixPro=0;
        private int numeroFixPer=0;
        
        public Builder(String nom,String prenom,LocalDate dateDeNaissance){
            this.nom=nom;
            this.prenom=prenom;
            this.dateDeNaissance=dateDeNaissance;
        }
        
        public Personnel build(){
           return new Personnel(this);
        }
        
    }
    
    
    
}
