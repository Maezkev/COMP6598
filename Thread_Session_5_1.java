import java.util.Scanner;

public class Forum_if {
  public static void main(String[] args) {
    Scanner inputuser = new Scanner(System.in);
    System.out.println("Dapatkan DISKON hingga 100% sesuai dengan nilai anda (A/B/C/D)!");
    System.out.print("Masukkan jumlah pembelian anda : ");
    Double jml_beli = inputuser.nextDouble();
    System.out.print("Masukkan nilai anda : ");
    String scr = inputuser.next();
    switch(scr.toLowerCase()){
      case "a" : System.out.print("Hemat 100% dengan hanya membayar Rp 0");break;
      case "b" : System.out.print("Hemat 75% dengan hanya membayar Rp " + (jml_beli-(jml_beli * 75 /100)));break;
      case "c" : System.out.print("Hemat 50% dengan hanya membayar Rp " + (jml_beli-(jml_beli * 50 /100)));break;
      case "d" : System.out.print("Hemat 25% dengan hanya membayar Rp " + (jml_beli-(jml_beli * 25 /100)));break;
      default : System.out.print(scr + " Tidak termasuk nilai yang valid. Masukkan nilai antara A / B / C / D");break;
    }
  }
}
