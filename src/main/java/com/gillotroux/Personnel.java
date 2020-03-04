package com.gillotroux;

import java.time.*;

public final class Personnel {
    private final String nom;
    private final String prenom;
    private final LocalDate dateDeNaissance;
    private final int numeroFixPro;
    private final int numeroFixPer;
    
    public Personnel(String nom,String prenom){
    	this.nom=nom;
    	this.prenom=prenom;
    }
}
