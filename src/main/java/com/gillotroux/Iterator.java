/**
 * Package de Gillot-Roux.
 * @since 1.0
 * @author Lockolocko
 */
package com.gillotroux;
/**
 * Iterateur.
 * @author Lockolocko
 *
 * @param <T>
 */
public interface Iterator<T> {
    /**
     * Retourne vrai si la liste contient un élément suivant.
     * @return boolean
     */
    boolean hasNext();
    /**
     * Retourne l'élément suivant.
     * @return T
     */
    T next();
}
