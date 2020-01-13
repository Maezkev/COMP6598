import java.util.Scanner;
import java.util.Random;

public class Week3
{  
  public static void main(String args[])
  {  
    System.out.println("Poin Pertama : Pencari hari + Interval");
    System.out.println("");
    
    String[] hari = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};
    
    Scanner inputuser1 = new Scanner(System.in);
    System.out.print("Masukkan hari sekarang, ");
    String inputday = inputuser1.nextLine();
    System.out.print("Masukkan interval hari yang akan dikalkulasikan");
    int interv = inputuser1.nextInt();    
    
    String hurufday = inputday.toLowerCase();
    try{
    switch (hurufday){
      case "senin" : System.out.println(interv + " hari setelah hari " + hurufday + " adalah hari " + hari[((1 + interv) % 7)-1] + ".") ;break;
      case "selasa" : System.out.println(interv + " hari setelah hari " + hurufday + " adalah hari " + hari[((2 + interv) % 7)-1] + ".") ;break;
      case "rabu" : System.out.println(interv + " hari setelah hari " + hurufday + " adalah hari " + hari[((3 + interv) % 7)-1] + ".") ;break;
      case "kamis" : System.out.println(interv + " hari setelah hari " + hurufday + " adalah hari " + hari[((4 + interv) % 7)-1] + ".") ;break;
      case "jumat" : System.out.println(interv + " hari setelah hari " + hurufday + " adalah hari " + hari[((5 + interv) % 7)-1] + ".") ;break;
      case "sabtu" : System.out.println(interv + " hari setelah hari " + hurufday + " adalah hari " + hari[((6 + interv) % 7)-1] + ".") ;break;
      case "minggu" : System.out.println(interv + " hari setelah hari " + hurufday + " adalah hari " + hari[((7 + interv) % 7)-1] + ".") ;break;
    }}catch(Exception e){
      System.out.println(interv + " hari setelah hari " + hurufday + " adalah hari minggu") ;
    }
    
    System.out.println("_______________");
    
    System.out.println("");
    System.out.println("Poin Kedua = Generate angka random dari 20 - 100");
    System.out.println("");
    
    Scanner inputuser2 = new Scanner(System.in);
    Random angkarand = new Random();
    int acak = angkarand.nextInt(100 + 1 - 20) + 20;
    System.out.println(acak);
  }
}
