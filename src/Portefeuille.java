public class Portefeuille
{
    private String proprietaire;
    private Cryptomonnaie devise;
    private double quantite;

    public Portefeuille(String proprietaire, Cryptomonnaie devise)
    {
        this.proprietaire = proprietaire;
        this.devise = devise;
        this.quantite = 0;
    }

    public String getProprietaire()
    {
        return proprietaire;
    }

    public Cryptomonnaie getDevise()
    {
        return devise;
    }

    public double getCapitalEuros()
    {
        return quantite * devise.getValeur();
    }

    public boolean transfertDevise(Portefeuille destination, double montantJetons)
    {
        if (this.devise.getNom().equals(destination.getDevise().getNom()) && this.quantite >= montantJetons)
        {
            this.quantite -= montantJetons;
            destination.quantite += montantJetons;
            return true;
        }
        return false;
    }

    public boolean achatDevise(double montantEuros)
    {
        if (montantEuros >= 0)
        {
            this.quantite += montantEuros / devise.getValeur();
            return true;
        }
        return false;
    }
}
