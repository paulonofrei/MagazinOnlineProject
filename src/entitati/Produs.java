package entitati;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Produs extends Magazin {

  int cantitateProdus;

  double pretProdus;

  boolean discountProdus;

  double valoareDiscountProdus;

  String numeProdus;

  ArrayList<String> proprietatiProdus;

  String marcaProdus;

  String tipProdus;

  String categorieProdus;

  int garantieProdus;

  HashMap<String, Double> cosCumparaturi;


  public void setCantitateProdus (int cant) {

    this.cantitateProdus = cant;
  }


  public void setPretProdus (double pret) {

    this.pretProdus = pret;
  }


  public void setDiscountProdus (boolean discount) {

    this.discountProdus = discount;
  }


  public void setValoareDiscountProdus (double discount) {

    this.valoareDiscountProdus = discount;
  }


  public void setNumeProdus (String nume) {

    this.numeProdus = nume;
  }


  public void setProprietatiProdus (ArrayList<String> prop) {

    this.proprietatiProdus = prop;
  }


  public void setMarcaProdus (String marca) {

    this.marcaProdus = marca;
  }


  public void setTipProdus (String tip) {

    this.tipProdus = tip;
  }


  public void setCategorieProdus (String categorie) {

    this.categorieProdus = categorie;
  }


  public void setGarantieProdus (int garantie) {

    this.garantieProdus = garantie;
  }


  public void adaugaCantitateNoua (int cantitateNoua) {

    this.cantitateProdus = this.cantitateProdus + cantitateNoua;
  }


  public void afiseazaCantitate () {

    System.out.println("Cantitatea pentru produs este de  " + this.cantitateProdus + " bucati!");
  }


  public void interogareStoc (String produsCautat, int cantitate) {

    if (this.numeProdus == produsCautat) {
      if (this.cantitateProdus >= cantitate) {
        System.out.println("Produsul " + this.numeProdus + " are cantitate de: " + this.cantitateProdus);
      } else {
        System.out.println("Produsul " + this.numeProdus + " a fost gasit dar are cantitate de: " + (this.cantitateProdus - cantitate));
        this.cantitateProdus = this.cantitateProdus + cantitate;
        System.out.println("Cantitatea produsului a fost suplimentata la " + this.cantitateProdus);
      }
    } else {
      System.out.println("Produsul cautat nu a fost gasit");
    }
  }


  public void suplimentareStoc(int cantitateDorita){
    if(this.cantitateProdus<cantitateDorita)
    {
      System.out.println("Mai trebuie adaugat " + (cantitateDorita - this.cantitateProdus));
  adaugaCantitateNoua(cantitateDorita - this.cantitateProdus);
    }
    else{
      System.out.println("cantitateActuala este " + this.cantitateProdus);
    }
  }
  public void calcularePretDupaDiscount (double pret, double discount){
    System.out.println("Pretul produsului este " +pret);
    System.out.println("Discountul acordat este de " +discount +"%");
    double pretFinal= pret - ((discount*pret)/100);
    System.out.println("Pretul final este de " +pretFinal);
  }
  public void calcularePretDupaDiscount ( double discount){
    double pretFinal= this.pretProdus -(this.pretProdus*discount/100);
    System.out.println("Pretul final este " + pretFinal);
  }


}
