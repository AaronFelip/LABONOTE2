import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        Calculable calculatrice = new Calculatrice();

        System.out.println("Bienvenue dans la Calculatrice !");
        System.out.print("Entrez le premier nombre : ");
        int a = clavier.nextInt();

        System.out.print("Entrez le deuxième nombre : ");
        int b = clavier.nextInt();

        System.out.println("Résultats :");
        System.out.println("Addition : " + calculatrice.addition(a, b));
        System.out.println("Soustraction : " + calculatrice.soustraction(a, b));
        System.out.println("Multiplication : " + calculatrice.multiplication(a, b));
        try {
            System.out.println("Division : " + calculatrice.division(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        try {
            System.out.println("Puissance (" + a + "^" + b + ") : " + calculatrice.puissance(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        clavier.close();
    }
}
