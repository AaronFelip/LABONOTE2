/**
 * Classe implémentant l'interface Calculable pour effectuer des opérations mathématiques de base.
 */
public class Calculatrice implements Calculable {

    /**
     * Ajoute deux entiers.
     *
     * @param a le premier entier
     * @param b le deuxième entier
     * @return la somme des deux entiers
     */
    @Override
    public int addition(int a, int b) {
        // TODO : Implémentez cette méthode
        return 0;
    }

    /**
     * Soustrait deux entiers.
     *
     * @param a le premier entier
     * @param b le deuxième entier
     * @return le résultat de la soustraction (a - b)
     */
    @Override
    public int soustraction(int a, int b) {
        // TODO : Implémentez cette méthode
        return 0;
    }

    /**
     * Multiplie deux entiers.
     *
     * @param a le premier entier
     * @param b le deuxième entier
     * @return le produit des deux entiers
     */
    @Override
    public int multiplication(int a, int b) {
        // TODO : Implémentez cette méthode
        return 0;
    }

    /**
     * Divise deux entiers.
     *
     * @param a le dividende
     * @param b le diviseur (doit être différent de zéro)
     * @return le résultat de la division (a / b) en tant que double
     * @throws ArithmeticException si le diviseur est égal à zéro
     */
    @Override
    public double division(int a, int b) {
        // TODO : Implémentez cette méthode
        return 0.0;
    }

    /**
     * Calcule la puissance d'un entier élevé à un exposant positif.
     *
     * @param base la base
     * @param exposant l'exposant (doit être positif ou zéro)
     * @return le résultat de base^exposant
     * @throws IllegalArgumentException si l'exposant est négatif
     */
    @Override
    public int puissance(int base, int exposant) {
        // TODO : Implémentez cette méthode
        return 0;
    }
}
