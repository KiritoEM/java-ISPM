public class Complexe {
    // déclaration des varibales
    private double re;
    private double im;

    // constructeur
    public Complexe(double re, double im) {
        this.re = re;
        this.im = im;
    }

    // affichage du nombre complexe
    public void afficher() {
        System.out.println(this.re + " " + this.im + "i");
    }

    // Méthode pour la somme de deux nombres complexe
    public Complexe somme(Complexe c) {
        return new Complexe(this.re + c.re, this.im + c.im);
    }

    // Méthode pour la conjugaison de nombre complexe
    public Complexe conjuguer() {
        return new Complexe(this.re, -this.im);
    }

    // getter de re
    public double getRe() {
        return re;
    }

    // setter de re
    public void setRe(double re) {
        this.re = re;
    }

    public Complexe produit(Complexe autre) {
        return new Complexe((this.re * autre.re) - (this.im * autre.im), (this.re * autre.im) + (this.im * autre.re));
    }

    public double module() {
        return Math.sqrt(Math.pow(this.re, 2) + Math.pow(this.im, 2));
    }

    // méthode principale
    public static void main(String args[]) {
        Complexe c1 = new Complexe(3, 4);
        Complexe c2 = new Complexe(1, 2);

        // Affichage
        c1.afficher();
        c2.afficher();

        // somme de c1 et c3 par la méthode somme de la classe Complexe
        Complexe c3 = c1.somme(c2);
        System.out.print("c1 + c2: ");
        c3.afficher();

        // conjugaison de c1 et c3 par la méthode somme de la classe Complexe
        Complexe c4 = c1.conjuguer();
        System.out.print("Conjugué de c1: ");
        c4.afficher();

        // Affichage via des getters et setters
        c1.setRe(5);
        System.out.println("valeur du re privé via le getter: " + c1.getRe());

        // produit complexe
        Complexe c5 = c1.produit(c2);
        System.out.println("Produit de c1 et c2: ");
        c5.afficher();

        // module de c1 et c3 par la méthode somme de la classe Complexe
        System.out.print("module de c1: z=  " + c1.module());
    }
}
