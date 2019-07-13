package entitati;


import java.util.*;


public class Client extends Produs {

  String adresaEmailClient;

  String numeClient, prenumeClient;

  String parolaClient;

  int numarTelefonMobilClient;

  String adresaClientDefault, adresaLivareClientDefault, adresaFacturareClientDefault;

  int ziNastereClient, lunaNastereClient, anNastereClient;

  String nivelEducatieClient;

  String numeFirmaClient, JClient, CUIClient;

  String cardCumparaturiClient;

  boolean eligibilDiscount;

  double valoareDiscount, valoareDiscountPersoanaJuridica;

  ArrayList<String> carduriCadouClient;

  HashMap<String, Integer> cosCumparaturi = new HashMap<>();

  boolean persoanaJuridica;


  public void setAdresaLivareClientDefault (String adresa) {

    this.adresaLivareClientDefault = adresa;
    System.out.println("Adresa de livrare a clientului este " + adresa);
  }


  public void setNumeClient (String nume) {

    this.numeClient = nume;
  }


  public void setValoareDiscountPersoanaJuridica (double discountPJ) {

    this.valoareDiscountPersoanaJuridica = discountPJ;
  }


  public void setPersoanaJuridica (boolean valoare) {

    this.persoanaJuridica = valoare;
    setValoareDiscountPersoanaJuridica(19.19);
  }


  public void setPersoanaJuridicaCuDiscount (boolean valoare, double discount) {

    this.persoanaJuridica = valoare;
    setValoareDiscountPersoanaJuridica(discount);
  }


  public void setareDiscountPersoanaJuridica (double discount) {

    setPersoanaJuridica(true);
    setValoareDiscountPersoanaJuridica(discount);
    System.out.println("Discount general pe persoana juridica este de " + discount);

  }


  public void setAdresaFacturareClientDefault (String adresa) {

    this.adresaFacturareClientDefault = adresa;
    System.out.println("Adresa de facturare a clientului este " + adresa);
  }


  public void afisareCosCumparaturi (HashMap<String, Integer> produse) {

    for (Map.Entry i : produse.entrySet()) {
      System.out.println("In cosul de cumparaturi avem  produsul " + i.getKey() + " cu cantitatea" +
                             " de " + i.getValue());
    }

  }


  public HashMap<String, Integer> adaugaInCosulDeCumparaturi (
      String numeProdus,
      int cantitateProdus
  ) {

    cosCumparaturi.put(numeProdus, cantitateProdus);
    return cosCumparaturi;
  }


  public void livareClient () {

    System.out.println("Adresa de livrare a produsului este " + this.adresaLivareClientDefault);
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Sunteti de acord cu adresa existenta? (DA/NU) ");
    String raspuns = keyboard.nextLine();
    switch (raspuns) {
      case "DA":
        System.out.println("Vreti ca adresa de livrare sa fie aceeasi cu adresa de facturare?" +
                               "(DA/NU) ");
        String raspuns2 = keyboard.nextLine();
        switch (raspuns2) {
          case "DA":
            System.out.println("Comanda si factura se livreaza la " + this.adresaLivareClientDefault);
            break;
          case "NU":
            System.out.println("Introduceti o alta adresa de facturare");
            String adresaFacturareNoua = keyboard.nextLine();
            System.out.println("Comanda se livreaza la adresa " + this.adresaLivareClientDefault +
                                   " si va fi facturata la " + adresaFacturareNoua);
            break;
          default:
            System.out.println("Optiune inexistenta");
            break;
        }
        break;
      case "NU":
        System.out.println("Introduceti o alta adresa de livrare: ");
        String adresaLivrareNoua = keyboard.nextLine();
        System.out.println(
            "Vreti ca adresa de livrare sa fie aceeasi cu adresa de facturare?(DA/NU) ");
        String raspuns3 = keyboard.nextLine();
        switch (raspuns3) {
          case "DA":
            System.out.println("Comanda si factura se livreaza la " + adresaLivrareNoua);
            break;
          case "NU":
            System.out.println("Introduceti o alta adresa de facturare");
            String adresaFacturareNoua = keyboard.nextLine();
            System.out.println("Comanda se livreaza la adresa " + adresaLivrareNoua +
                                   " si va fi facturata la " + adresaFacturareNoua);
            break;
          default:
            System.out.println("Optiune inexistenta");
            break;
        }
        break;

      default:
        System.out.println("Optiune inexistenta");
        break;
    }

  }


  public void adaugaInformatiiFirma (Client client) {

    Scanner keyboard = new Scanner(System.in);
    if (persoanaJuridica) {
      HashMap<String, String> informatiiFirma = new LinkedHashMap<>();

      System.out.println("Introduceti CUI client: ");
      this.CUIClient = keyboard.nextLine();
      informatiiFirma.put("CUI:", this.CUIClient);
      System.out.println("Introduceti J client: ");
      this.JClient = keyboard.nextLine();
      informatiiFirma.put("J:", this.JClient);
      System.out.println("Introduceti nume firma client: ");
      this.numeFirmaClient = keyboard.nextLine();
      informatiiFirma.put("Nume Firma:", this.numeFirmaClient);
      System.out.println("Introduceti adresa livrare client: ");
      this.adresaLivareClientDefault = keyboard.nextLine();
      informatiiFirma.put("Adresa Livrare:", this.adresaLivareClientDefault);
      System.out.println("Introduceti adresa facturare client: ");
      this.adresaFacturareClientDefault = keyboard.nextLine();
      informatiiFirma.put("Adresa Facturare:", this.adresaFacturareClientDefault);
      for (Map.Entry i : informatiiFirma.entrySet()) {
        System.out.println("Clientul " + client.numeClient + " are urmatoarele date " + i.getKey() + i
            .getValue());
      }
    } else {
      System.out.println("Clientul nu este persoana juridica si nu se pot adauga informatii " +
                             "despre firma sa");
    }
    System.out.println("Clientul " + client.numeClient + " are o valoare de discount generala de " + this.valoareDiscountPersoanaJuridica);

  }
}
