package entitati;


import marketplace.Marketplace;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//TODO
//create client interface, implement client interface in Magazin
public class Magazin extends Marketplace {

  String numeMagazin;

  String adresaMagazin;

  String adresaEmailMagazin;

  int numarTelefonMagazin;

  HashMap<String, String> orarMagazin = new LinkedHashMap<>();

  String contBancarMagazin;

  HashMap<String, Integer> stocMagazin = new HashMap<>();


  public void orarMagazin () {

    orarMagazin.put("luni", "11-12");
    orarMagazin.put("marti", "11-12");
    orarMagazin.put("miercuri", "11-12");
    orarMagazin.put("joi", "11-12");
    orarMagazin.put("vineri", "11-12");
    orarMagazin.put("sambata", "11-12");
    orarMagazin.put("duminica", "11-12");
    for (Map.Entry i : orarMagazin.entrySet()) {
      System.out.println("orarul de " + i.getKey() + " este " + i.getValue());
    }
  }


  public void setNumeMagazin (String nume) {

    this.numeMagazin = nume;
  }


  public void setadresaMagazin (String adresa) {

    this.adresaMagazin = adresa;
  }


  public void setadresaEmailMagazin (String adresaEm) {

    this.adresaEmailMagazin = adresaEm;
  }


  public void setnumarTelefonMagazin (int nr) {

    this.numarTelefonMagazin = nr;
  }


  public void setcontBancarMagazin (String cont) {

    this.contBancarMagazin = cont;
  }


  public void setOrarMagazin (HashMap<String, String> orar) {

    this.orarMagazin = orar;
  }


  public void setStoc (HashMap<String, Integer> stoc) {

    this.stocMagazin = stoc;
  }


  public void adaugaStocMagazin (Produs produs, int cantitate) {

    stocMagazin.put(produs.numeProdus, cantitate);
    System.out.println("Am adaugat in stocul magazinului produsul de tip " + produs.numeProdus + " intr" +
                           "-o " +
                           "cantitate de " + cantitate + " bucati!");
  }


  public void interogareStoc (Produs produs, String produsCautat, int cantitate) {

    if (new Produs().numeProdus == produsCautat) {
      if (new Produs().cantitateProdus >= cantitate) {
        System.out.println("Produsul " + new Produs().numeProdus + " are cantitate de: " + new Produs().cantitateProdus);
        //TODO
        //adaugaCosCumparaturi
      }
      else
      {
        System.out.println("Stoc insuficient");
      }
    }
    else{
      System.out.println("Nu exista produsul ");
    }
    //TODO
    //return cosCumparaturi;

  }


}
