import java.util.Scanner;
import java.util.Arrays;

public class TP3{
  static Scanner inputuser = new Scanner(System.in);
  
  //Array memakai Integer dan Bukannya int agar dapat diisi null(Kepentingan validasi).
  static Integer bil [] = new Integer [6];

  public static void main(String [] args){
    int nomenu = 0;
    while(nomenu != 3){
      System.out.print("Menu :" +
                       "\n1. Penjumlahan Bilangan Prima" +
                       "\n2. Jumlah Bilangan Prima" +
                       "\n3. Keluar" +
                       "\nMasukkan Pilihan Anda : ");
      nomenu = inputuser.nextInt();
      switch(nomenu){
        case 1 :
          PBP();
          break;
        case 2 :
          JBP();
          break;
        case 3: break;
      }
    }
  }
  
  
  //Method Untuk Validasi Masukkan Bilangan
  static boolean validangka(int inbil){ 
    if(bil[1] == inbil){
      if (inbil > 0){
        return true;
      }else{
        System.out.println (">> Harap masukkan bilangan bulat positif.\n"); 
        return false;
      }
    }else{
      if (inbil > bil[1]){
        return true;
      }else{
        System.out.println (">> Harap masukkan bilangan yang lebih besar dari " + bil[1] + " \n"); 
        return false;
      }
    }
  }

  //Method Untuk Mencari Bilangan Prima
  static void find(){
    bil[3] = 0;
    bil[4] = 0;
    for(int i = bil[1] ; i <= bil[2] ; i-=-1){
      if(i % 2 != 0){
        if(i % 3 != 0){
          System.out.print(i + "\t");
          bil[3] += i;//jumlah bilangan prima
          bil[4]++;//banyakk bilangan prima
        }
      }
    }
  }
  
  //Method Untuk Menu 1
  static void PBP(){
    do{
      System.out.print("Masukkan Bilangan 1 : ");
      bil[1] = inputuser.nextInt();
    }while(!validangka(bil[1]));
    do{
      System.out.print("Masukkan Bilangan 2 : ");
      bil[2] = inputuser.nextInt();
    }while(!validangka(bil[2]));

    System.out.println("Bilangan prima antara " + bil[1] + " dan " + bil[2] + " adalah :");
    find();
    System.out.println("\nPenjumlahan bilangan prima adalah " + bil[3] + ".\n");
  }
  
   //Method Untuk Menu 2
  static void JBP(){
    do{
      System.out.print("Masukkan Bilangan 1 : ");
      bil[1] = inputuser.nextInt();
    }while(!validangka(bil[1]));
    do{
      System.out.print("Masukkan Bilangan 2 : ");
      bil[2] = inputuser.nextInt();
    }while(!validangka(bil[2]));

    System.out.println("Bilangan prima antara " + bil[1] + " dan " + bil[2] + " adalah :");
    find();
    System.out.println("\nBanyak bilangan prima adalah " + bil[4] + ".\n");
  }
}