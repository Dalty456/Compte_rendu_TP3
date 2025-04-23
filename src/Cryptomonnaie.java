public class Cryptomonnaie
{
    private String nom;
    private double valeur;

    public Cryptomonnaie(String nom, double valeur)
    {
        this.nom = nom;
        this.valeur = valeur;
    }

    public String getNom()
    {
        return nom;
    }

    public double getValeur()
    {
        return valeur;
    }

    public void setValeur(double valeur)
    {
        this.valeur = valeur;
    }

    public String toString()
    {
        return nom + "(" + valeur + ")";
    }
}
