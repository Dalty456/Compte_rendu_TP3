public class TestCryptoMarche
{
    public static void main(String[] args)
    {
        testTransfert();
        testAchat();
        testCapitalEuros();
        testCapitalMonnaie();
    }

    public static void testTransfert()
    {
        Cryptomonnaie btc = new Cryptomonnaie("BTC", 10000);
        Portefeuille p1 = new Portefeuille("Alice", btc);
        Portefeuille p2 = new Portefeuille("Bob", btc);
        p1.achatDevise(10000);
        if (p1.transfertDevise(p2, 0.5))
            System.out.println("Test Portefeuille transfertDevise        ... OK");
        else
            System.out.println("Test Portefeuille transfertDevise        ... FAIL");
    }

    public static void testAchat()
    {
        Cryptomonnaie eth = new Cryptomonnaie("ETH", 2000);
        Portefeuille p = new Portefeuille("Charlie", eth);
        if (p.achatDevise(4000))
            System.out.println("Test Portefeuille achatDevise            ... OK");
        else
            System.out.println("Test Portefeuille achatDevise            ... FAIL");
    }

    public static void testCapitalEuros()
    {
        CryptoMarche marche = new CryptoMarche();
        Cryptomonnaie btc = new Cryptomonnaie("BTC", 10000);
        Portefeuille p1 = new Portefeuille("Alice", btc);
        Portefeuille p2 = new Portefeuille("Alice", btc);
        p1.achatDevise(10000);
        p2.achatDevise(20000);
        marche.ajouter(p1);
        marche.ajouter(p2);
        if (marche.capitalEnEuros("Alice") == 30000)
            System.out.println("Test CryptoMarche capitalEnEuros         ... OK");
        else
            System.out.println("Test CryptoMarche capitalEnEuros         ... FAIL");
    }

    public static void testCapitalMonnaie()
    {
        CryptoMarche marche = new CryptoMarche();
        Cryptomonnaie eth = new Cryptomonnaie("ETH", 2000);
        Portefeuille p1 = new Portefeuille("Alice", eth);
        Portefeuille p2 = new Portefeuille("Bob", eth);
        p1.achatDevise(2000);
        p2.achatDevise(4000);
        marche.ajouter(p1);
        marche.ajouter(p2);
        if (marche.capitalMonneaie(eth) == 6000)
            System.out.println("Test CryptoMarche capitalMonneaie        ... OK");
        else
            System.out.println("Test CryptoMarche capitalMonneaie        ... FAIL");
    }
}
