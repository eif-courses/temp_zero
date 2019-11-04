package eif.viko.lt.pagrindai;

public class Preke {
  private String pavadinimas;
  private String pagaminimo_data;
  private double kaina;

  public Preke(String pavadinimas, String pagaminimo_data, double kaina) {
    this.pavadinimas = pavadinimas;
    this.pagaminimo_data = pagaminimo_data;
    this.kaina = kaina;
  }

  public String getPavadinimas() {
    return pavadinimas;
  }

  public String getPagaminimo_data() {
    return pagaminimo_data;
  }

  public double getKaina() {
    return kaina;
  }
}
