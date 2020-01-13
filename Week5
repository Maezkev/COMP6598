import java.util.Scanner;
import java.util.Random;

public class Week5 {
  public static void main(String args[]){
    System.out.println("Poin Pertama : Pencari bilangan genap diantara 2 bilangan");
    System.out.println("");
    
    Scanner inputuser3 = new Scanner(System.in);
    try{
      System.out.print("Number A : ");
      int bila = inputuser3.nextInt();
      System.out.print("Number B : ");
      int bilb = inputuser3.nextInt();

      System.out.print("Angka Genap di antara bilangan " + bila + " dengan bilangan " + bilb + " adalah, ");

      for(int sel = bila+1 ; sel < bilb ; sel++){
        if(sel % 2 == 0)
          System.out.print(sel + " ");
      }
    }catch(Exception e){
      System.out.print("Input harus berisi angka.");
    }
    
    System.out.println("");
    System.out.println("_______________");
    
    System.out.println("");
    System.out.println("Poin Kedua = Generate Random Number If Y and Stop If N");
    System.out.println("");
    
    char go = 'Y';
    int d, w = 1;
    Random gorand4 = new Random();
    Scanner inputuser4 = new Scanner(System.in);
    
    do{
      System.out.println("Continue?");    

      char yorn = inputuser4.next().charAt(0);
      char dec = Character.toUpperCase(yorn);

      if(dec == go){
        int rand = gorand4.nextInt(100 + 1 - 1) + 1;
        System.out.println("Your lucky number is, " + rand);
        System.out.println("");
        d = 1;
      }else{
        System.out.println("Thank you for using this program");
        d = 0;
      }
    }while(d == w);
  }
}
