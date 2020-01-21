import java.util.Scanner;

public class Week4{
  public static void main(String args[]){
    System.out.println("Poin Pertama : Penentu bilangan positif / negatif dan ganjil / genap");
    System.out.println("");
    
    String posneg, gangen;
    try{
    Scanner inputuser1 = new Scanner(System.in);
    System.out.print("Masukkan bilangan (bebas), ");
    int bil = inputuser1.nextInt();
    if(bil % 2 == 0){
      gangen = "Bilangan Genap";
      posneg = (bil > 0) ? " Positif" : " Negatif";
    }else{
      gangen = "Bilangan Ganjil";
      posneg = (bil > 0) ? " Positif" : " Negatif";
    }
    System.out.println("Bilangan " + bil + " merupakan " + gangen + posneg);
    }catch(Exception e){
      System.out.println("Tolong masukkan angka, bukan yang lain.");
    }
    
    System.out.println("_______________");
    
    System.out.println("");
    System.out.println("Poin Kedua = Merevisi kode");
    System.out.println("");
    
    Scanner inputuser2 = new Scanner(System.in);
    System.out.print("Masukkan angka a, ");
    int a = inputuser2.nextInt();
    System.out.print("Masukkan angka b, ");
    int b = inputuser2.nextInt();
    if(a > 0 && b > 0)
      System.out.println("Both a and b are positive number.");
    else if (a < 0 && b > 0)
      System.out.println("a is negative number and b is positive number.");
    else if (a > 0 && b < 0)
      System.out.println("a is positive number and b is negative number.");
    else
      System.out.println("Both a and b are negative number.");
  }
}
