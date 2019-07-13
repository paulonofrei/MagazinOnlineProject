package executie;


import entitati.Client;

import java.util.HashMap;


public class Executie {

  public static void main (String args[]) {

    HashMap<String, Integer> cosCumparaturi = new HashMap<>();

    /*Magazin Surubel = new Magazin();
    Surubel.generateRandomStoreName();
    Surubel.setadresaEmailMagazin("contact@surubel.com");
    Surubel.setStoc(new HashMap<>());
    Surubel.orarMagazin();
    Produs telefon = new Produs();
    telefon.setNumeProdus("televizor hd");
    telefon.setCantitateProdus(5);
    telefon.adaugaCantitateNoua(10);
    telefon.afiseazaCantitate();

    Surubel.adaugaStocMagazin(telefon,20);
    telefon.afiseazaCantitate();
    telefon.interogareStoc("TELEFON", 50);
    telefon.suplimentareStoc(80);
    telefon.calcularePretDupaDiscount(156, 23);
    telefon.setPretProdus(200);
    telefon.calcularePretDupaDiscount(25);


    telefon.afisareCosCumparaturi(produseMagazin);
*/
    Client mircea = new Client();
    Client x = new Client();
    Client y = new Client();
    /*cosCumparaturi.put("alcatel", 15);
    mircea.afisareCosCumparaturi(cosCumparaturi);
    mircea.setAdresaLivareClientDefault("dancu");
    mircea.setAdresaFacturareClientDefault("podu ros");
    mircea.setNumeClient("mircea");
    *//*mircea.livareClient();*//*
    mircea.setPersoanaJuridica(true);
    mircea.adaugaInformatiiFirma(mircea);*/

   /* x.setPersoanaJuridicaCuDiscount(true,15.2);
    x.adaugaInformatiiFirma(x);*/

    y.setareDiscountPersoanaJuridica(5.5);

  }


}
