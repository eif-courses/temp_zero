package eif.viko.lt.pagrindai;

import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Parduotuve parduotuve = new Parduotuve("Norfa", "JAsinskio 15");

    String pavadinimai[] = {
        "BOSH",
        "BEKO",
        "SAMSUNG"
    };

    for (int i = 0; i < 1000; i++) {
      parduotuve.ideti(new Magnetola(pavadinimai[new Random().nextInt(pavadinimai.length)], "201"+i, new Random().nextDouble() * 100.0));
    }
    parduotuve.ideti(new Preke("Skalbimo masina", "2014", 150));



    for(Preke p: parduotuve.getPrekes()) {
      System.out.println("Preke: "+p.getPavadinimas());
    }



    System.out.println("IVeskite prekes pavadinima:");
    Scanner scanner = new Scanner(System.in);
    String zodis = scanner.nextLine();

    System.out.println(zodis);
    parduotuve.ieskoti(zodis.toString());

  }
}
