package latihan_if;

import java.util.Scanner;

public class soal3 {
   public static void main(String[] args) {
    int bil;

    Scanner input = new Scanner(System.in);
System.out.println("masukkan bilangan : ");
bil = input.nextInt();

if (bil == 1) {
  System.out.println("pulpen");
}
else if (bil == 2) {
  System.out.println("pensil");
}
 else if (bil == 3) {
  System.out.println("penggaris");
 }
  else if (bil == 4) {
    System.out.println("penghapus");
  }
  else if (bil == 5) {
    System.out.println("rautan");
  }
  else if (bil == 6) {
    System.out.println("staples");
  }
  else if (bil == 7) {
    System.out.println("klip kertas");
  }
  else if (bil == 8) {
    System.out.println("stipex");
  }
  else if (bil == 9) {
    System.out.println("spidol");
  }
  else if (bil == 10) {
    System.out.println("buku tulis");
  } 
  else if (bil == 11) {
    System.out.println("buku catatan");
  }
 if ((bil > 11)) {
  System.out.println("pilihan tidak tersedia");
  }
 }
}