package latihan_if.BioskopOOP;

public class Pembayaran {
 private double totalHarga;
 private double uangBayar;

 public Pembayaran(double totalHarga, double uangBayar){
  this.totalHarga = totalHarga;
  this.uangBayar = uangBayar;
 }

 public double hitungKembalian(){
  return uangBayar - totalHarga;
 }
}
