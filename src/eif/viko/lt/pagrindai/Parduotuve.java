package eif.viko.lt.pagrindai;

import java.util.ArrayList;
import java.util.List;

public class Parduotuve {
  private String pavadinimas;
  private String adresas;
  private List<Preke> prekes = new ArrayList<>();
  int a;


  public void ideti(Preke preke){
    prekes.add(preke);
  }


  public Parduotuve(String pavadinimas, String adresas) {
    this.pavadinimas = pavadinimas;
    this.adresas = adresas;
  }

  public Parduotuve(String pavadinimas, String adresas, List<Preke> prekes) {
    this.pavadinimas = pavadinimas;
    this.adresas = adresas;
    this.prekes = prekes;
  }

  public String getPavadinimas() {
    return pavadinimas;
  }

  public String getAdresas() {
    return adresas;
  }

  public List<Preke> getPrekes() {
    return prekes;
  }

  public void ieskoti(String pavadinimas){
    boolean arRasta = false;
    for (Preke p : prekes) {
      if(p.getPavadinimas().equals(pavadinimas)){
        System.out.println("Preke surasta: " + p.getPavadinimas() +", "+ p.getKaina() + "eur");
        arRasta = true;
      }
    }
    if(!arRasta){
      System.out.println("Nerasta");
    }

  }
}
