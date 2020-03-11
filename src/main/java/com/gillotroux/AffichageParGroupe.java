/**
 * Package de Gillot-Roux
 */
package com.gillotroux;

import java.util.ArrayList;

/**
 * Affichage par groupe.
 * @author Lockolocko
 *
 */
public class AffichageParGroupe {
    /**
     * ArrayList 
     */
    private ArrayList<InterfacePersonnels> Arr;
    /**
     * Groupe iterateur.
     * @author Lockolocko
     *
     */
    private class GrpIterator implements Iterator {
        /**
         * Création de l'arrayList.
         */
        public GrpIterator() {
            Arr=new ArrayList<InterfacePersonnels>();
        }
        
        /**
         * Vérifie si il y a un élément suivant.
         */
        public boolean hasNext() {
            if((Arr.iterator()).hasNext()) {
                return true;
            }
            return false;
        }
        /**
         * Retourne l'élément suivant.
         */
        public InterfacePersonnels next() {
            if(hasNext()) {
                InterfacePersonnels perso=Arr.iterator().next();
                return perso;
            }
            return null;
        }
        
    }
    /**
     * Donne un accès à hasNext() et next().
     * @return Iterator
     */
    public Iterator getIterator() {
        return new GrpIterator();
    }
}
