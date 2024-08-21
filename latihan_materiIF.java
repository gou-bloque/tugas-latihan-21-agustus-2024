package latihan_if;

import java.util.Scanner;

public class latihan_materiIF {
  public static void main(String[] args) {
    int bil;

    Scanner input = new Scanner(System.in);
System.out.println("masukkan bilangan : ");
bil = input.nextInt();

if (bil % 2 == 0) 
if (bil == 0) {
  
  System.out.println(Integer.toString(bil) + " anda memasukkan bilangan 0");
}
else {
  System.out.println(Integer.toString(bil) + " adalah bilangan genap");
} else {
  System.out.println(Integer.toString(bil) + " adalah bilangan ganjil");
}
  }
}