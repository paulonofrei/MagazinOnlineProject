package utils;


import java.nio.charset.Charset;
import java.util.Random;


public class Metode {


  public void generateRandomStoreName() {
    byte[] array = new byte[7]; // length is bounded by 7
    new Random().nextBytes(array);
    String storeName = new String(array, Charset.forName("UTF-8"));
    System.out.println(storeName);
  }

}
