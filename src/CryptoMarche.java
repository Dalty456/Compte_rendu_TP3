import java.util.*;

public class CryptoMarche
{
    private ArrayList<Portefeuille> portefeuilles = new ArrayList<>();

    public void ajouter(Portefeuille p)
    {
        portefeuilles.add(p);
    }

    public double capitalEnEuros(String proprietaire)
    {
        double total = 0;
        for (Portefeuille p : portefeuilles)
        {
            if (p.getProprietaire().equals(proprietaire))
            {
                total += p.getCapitalEuros();
            }
        }
        return total;
    }

    public double capitalMonneaie(Cryptomonnaie monnaie)
    {
        double total = 0;
        for (Portefeuille p : portefeuilles)
        {
            if (p.getDevise().getNom().equals(monnaie.getNom()))
            {
                total += p.getCapitalEuros();
            }
        }
        return total;
    }
}
