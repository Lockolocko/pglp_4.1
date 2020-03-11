/**
 * Package de Gillot-Roux
 */
package com.gillotroux;
/**
 * Affichage par groupe.
 * @author Lockolocko
 *
 */
public class AffichageParGroupe {
    private Arraylist<InterfacePersonnels> Arr;
    
    private class GrpIterator implements Iterator{

        public boolean hasNext() {
            // TODO Auto-generated method stub
            return false;
        }

        public Object next() {
            // TODO Auto-generated method stub
            return null;
        }
        
    }
    
    public Iterator getIterator() {
        return new GrpIterator();
    }
}
