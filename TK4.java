import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class TK4{
    static Scanner inputuser = new Scanner(System.in);
    static int listnumber [] = new int [5];
    public static void main(String [] args){
        int nomenu = 0;
        while (nomenu != 4){
            System.out.print("\n\nSelamat Datang di Program Simulasi\n"
                            + "Menu\n"
                            + "1. Random Data\n"
                            + "2. Simulasi Bubble Sort - Ascending\n"
                            + "3. Simulasi Selecion Sort - Ascending\n"
                            + "4. Simulasi Bubble Sort - Descending\n"
                            + "5. Simulasi Selection Sort - Descending\n"
                            + "6. Keluar\n"
                            + "Masukkan Pilihan Anda : ");
            nomenu = inputuser.nextInt();
            switch(nomenu){
                case 1:
                    RD();
                    break;
                case 2:
                    BSA();
                    break;
                case 3:
                    //SSA();
                    //break;
                case 4:
                   //BSD();
                    //break;
                case 5:
                    //SSD()
                    //break;
                case 6:
                    break;
            }
        }
    }

    //Menu 1
    static void RD(){
        System.out.print("Batas Atas : ");
        int BA = inputuser.nextInt();
        System.out.print("Batas Bawah : ");
        int BB = inputuser.nextInt();

        for(int i = 0 ; i < 5 ; i-=-1){
            Random rand = new Random();
            listnumber[i] = rand.nextInt((BA - BB) + 1) + BB;
            System.out.print(listnumber[i] + "\t");
        }
    }

    //Menu 2
    static void BSA(){
        for(int p = 1 ; p <= listnumber.length - 1 ; p++){
            System.out.println("\nPass " + p);
            for(int k = 1 ; k <= listnumber.length ; k++){
                for(int o = 0 ; o < listnumber.length ; o++){
                    System.out.print(listnumber[o] + "\t");
                }
                System.out.println("");
                for(int i = 0 ; i < listnumber.length - k ; i++){ 
                    if(listnumber[i] > listnumber[i + 1]){
                        tukar(listnumber, i, i+1);
                    }                
                }
            }
        }
    }

    //Tukar
    static void tukar(int [] listnumber, int i, int j){
        int temp;
        temp = listnumber[i];
        listnumber[i] = listnumber[j];
        listnumber[j] = temp;
    }
}