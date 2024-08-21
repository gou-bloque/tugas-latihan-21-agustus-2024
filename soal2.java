package latihan_if;

import java.util.Scanner;

public class soal2 {
  public static void main(String[] args) {
    int bil;

    Scanner input = new Scanner(System.in);
System.out.println("masukkan bilangan : ");
bil = input.nextInt();

    if (bil <= 0.0)
      if (bil == 0.0 ) {
        System.out.println("anda memasukkan bilangan nol");
      } else {
        System.out.println("anda memasukkan bilangan negatif");
      } else {
        System.out.println("anda memasukkan bilangan positif");
      }
    }
}