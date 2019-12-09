import java.util.Scanner;
import java.util.Random;
public class TP1NO5
{
  public static void main(String args[]){
    Scanner inputuser = new Scanner(System.in);
    System.out.println("Kode ini dibuat oleh 2301925772 - Marshall Ezra Kevinnettou");
    System.out.println(">>>Tugas Personal 1 Nomor 5");
     System.out.println("");
    System.out.print("Masukkan bilangan a = ");
    int bila = inputuser.nextInt();
    System.out.print("Masukkan bilangan b = ");
    int bilb = inputuser.nextInt();
    Random bilrand = new Random();
    int acak = bilrand.nextInt(1000); // Random antara 0 - 999
    int modacak = acak % 2;
    if(modacak == 1){
      acak += 1;
    }
      System.out.println("Hasil random bilangan genap = " + acak);
  }
}