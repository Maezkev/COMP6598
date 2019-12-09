import java.util.Scanner;
 public class TP1NO4
 {
   public static void main(String args[])
   { 
    Scanner inputuser = new Scanner(System.in);
    System.out.println("Kode ini dibuat oleh 2301925772 - Marshall Ezra Kevinnettou");
    System.out.println(">>>Tugas Personal 1 Nomor 4");
     System.out.println("");
    System.out.print("Angka pertama : ");
    int numb1 = inputuser.nextInt();
    System.out.print("Angka kedua : ");
    int numb2 = inputuser.nextInt();
    System.out.println("");
    if (numb1 > numb2){
      System.out.println("a. Angka yang paling besar adalah angka yang pertama, yaitu " + numb1);
      System.out.println("b. Angka yang paling kecil adalah angka yang kedua, yaitu " + numb2);
    } else{
      System.out.println("a. Angka yang paling besar adalah angka yang kedua, yaitu, " + numb2);
      System.out.println("b. Angka yang paling kecil adalah angka yang pertama, yaitu, " + numb1);
    }
    int hasilc = (int)Math.pow(numb1,numb2);
    System.out.println("c. Hasil dari " + numb1 + " dipangkatkan " + numb2 + " adalah " + hasilc);
    int hasild1 = numb1 * numb1;
    int hasild2 = numb2 * numb2;
    System.out.println("d. Hasil dari " + numb1 + "² adalah " + hasild1 + " dan hasil dari " + numb2 + "² adalah " + hasild2);
   }
 }