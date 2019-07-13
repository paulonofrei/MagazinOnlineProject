package marketplace;


import utils.Metode;

import java.util.HashMap;


public class Marketplace extends Metode {

  String numeMarketplace;
  String adresaMarketplace;
  String adresaEmailMarketplace;
  int numarTelefonMarketplace;
  HashMap<String,String> orarMarketplace;
  String contBancarMarketplace;

  public void setNumeMarketplace(String nume) {
    this.numeMarketplace = nume;
  }
  public void setadresaMarketplace(String adresa) {
    this.adresaMarketplace = adresa;
  }
  public void setadresaEmailMarketplace(String adresaEm) {
    this.adresaEmailMarketplace = adresaEm;
  }
  public void setnumarTelefonMarketplace(int nr) {
    this.numarTelefonMarketplace = nr;
  }
  public void setcontBancarMarketplace(String cont) {
    this.contBancarMarketplace = cont;
  }

}
