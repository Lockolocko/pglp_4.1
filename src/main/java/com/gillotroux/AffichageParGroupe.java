/**
 * Package de Gillot-Roux.
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
     * ArrayList.
     */
    private ArrayList<InterfacePersonnels> arr;

    /**
     * Constructeur.
     * @param root
     */
    public AffichageParGroupe(final InterfacePersonnels root) {
        arr.add(root);
    }

    /**
     * Groupe iterateur.
     * @author Lockolocko
     */
    private class GrpIterator implements Iterator {
        /**
         * Cr�ation de l'arrayList.
         */
        GrpIterator() {
            int verifie = 0;
            while (verifie < arr.size()) {
                // "Instance of" pour savoir si c'est un composite:
                //on ajoute tous les �l�ments du composite
                // ou un Personnel: on ne fait rien
                if (arr.iterator().next() instanceof Personnel) {
                    Personnel p = (Personnel) arr.iterator().next();
                    p.print();
                } else {
                    CompositePersonnels composite =
(CompositePersonnels) arr.iterator().next();
                    for (Personnel p1 : composite.getListe()) {
                        p1.print();
                    }
                }
                verifie++;
            }
        }
        /**
         * V�rifie si il y a un �l�ment suivant.
         * @return boolean
         */
        public boolean hasNext() {
            if ((arr.iterator()).hasNext()) {
                return true;
            }
            return false;
        }

        /**
         * Retourne l'�l�ment suivant.
         * @return Personnel
         */
        public InterfacePersonnels next() {
            if (hasNext()) {
                InterfacePersonnels perso = arr.iterator().next();
                return perso;
            }
            return null;
        }
    }

    /**
     * Donne un acc�s � hasNext() et next().
     * @return Iterator
     */
    public Iterator getIterator() {
        return new GrpIterator();
    }
}
