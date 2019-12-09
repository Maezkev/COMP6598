import java.util.Scanner;

public class TK1{
  public static void main(String args[]){
    Scanner inputuser = new Scanner(System.in);
    System.out.println("Nama Anggota : ");
    System.out.println("1. 2301925772 - Marshall Ezra Kevinnettou.");
    System.out.println("2. ");
    System.out.println("");
    System.out.print("Masukkan jumlah kilogram yang akan dikonversi = ");
    double numkg = inputuser.nextDouble();
    double numgram = numkg * 1000;
    double numons = numgram / 100;
    double numpon = numons / 5;
    System.out.println(numkg + " kg sama dengan = " + numpon + " pon atau " + numons + " ons atau " + numgram + " gram.");
  }
}