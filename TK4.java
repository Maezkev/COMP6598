import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class TK4 {
    static Scanner inputuser = new Scanner(System.in);
    static int listnumber[] = new int[5];

    public static void main(String[] args) {
        int nomenu = 0;
        while (nomenu != 6) {
            System.out.print("\n\nSelamat Datang di Program Simulasi\n" + "Menu\n" + "1. Random Data\n"
                    + "2. Simulasi Bubble Sort - Ascending\n" + "3. Simulasi Selecion Sort - Ascending\n"
                    + "4. Simulasi Bubble Sort - Descending\n" + "5. Simulasi Selection Sort - Descending\n"
                    + "6. Keluar\n" + "Masukkan Pilihan Anda : ");
            nomenu = inputuser.nextInt();
            switch (nomenu) {
            case 1:
                RD();
                break;
            case 2:
                BSA();
                break;
            case 3:
                // SSA();
                // break;
            case 4:
                BSD();
                break;
            case 5:
                // SSD()
                // break;
            case 6:
                break;
            }
        }
    }

    // Menu 1
    static void RD() {
        System.out.print("Batas Atas : ");
        int BA = inputuser.nextInt();
        System.out.print("Batas Bawah : ");
        int BB = inputuser.nextInt();

        for (int i = 0; i < 5; i -= -1) {
            Random rand = new Random();
            listnumber[i] = rand.nextInt((BA - BB) + 1) + BB;
            System.out.print(listnumber[i] + "\t");
        }
    }

    // Menu 2
    static void BSA() {
        for (int i = 1; i <= listnumber.length - 1; i++) {
            System.out.println("\nPass " + i);
            tampilangka(listnumber);

            for (int j = 0; j <= listnumber.length - 2; j++) {
                if (listnumber[j] >= listnumber[j + 1]) {
                    tukar(listnumber, j, j + 1);
                }
                tampilangka(listnumber);
            }

            System.out.println("\nResult of Pass " + i + ": ");
            tampilangka(listnumber);
            System.out.println("");
        }
    }

    // Menu 4
    static void BSD() {
        for (int i = 1; i <= listnumber.length - 1; i++) {
            System.out.println("\nPass " + i);
            tampilangka(listnumber);

            for (int j = 0; j <= listnumber.length - 2; j++) {
                if (listnumber[j] <= listnumber[j + 1]) {
                    tukar(listnumber, j, j + 1);
                }
                tampilangka(listnumber);
            }

            System.out.println("\nResult of Pass " + i + ": ");
            tampilangka(listnumber);
            System.out.println("");
        }
    }

    // Menampilkan List Number
    public static void tampilangka(int[] listnumber) {
        for (int k = 0; k <= listnumber.length - 1; k++) {
            System.out.print(listnumber[k] + "   ");
        }
        System.out.println();
    }

    // Tukar
    public static void tukar(int[] listnumber, int v1, int v2) {
        int temp;
        temp = listnumber[v1];
        listnumber[v1] = listnumber[v2];
        listnumber[v2] = temp;
    }
}