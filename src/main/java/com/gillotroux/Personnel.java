package com.gillotroux;

import java.time.*;

public final class Personnel {
    private final String nom;
    private final String prenom;
    private final LocalDate dateDeNaissance;
    private final list<int> numeroFixPro;
    private final list<int> numeroFixPer;
    
    private Personnel(Builder builder){
    	// Required parameters
        nom=builder.nom;
        prenom=builder.prenom;
        
        // Optionnal parameters
    }
    
    public static class Builder{
        private final String nom;
        private final String prenom;
    }
    
    
    
}
