import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class TP2 {
  static Scanner inputuser = new Scanner(System.in);
  static ArrayList<String[]> isiMK = new ArrayList<String[]>();
  
  //Method Main
  public static void main(String[] args) {
    int nomenu = 0;
    while (nomenu != 4){
      System.out.println("\nMenu Pendataan dan Perhitungan IPS (Index Prestasi Semester) \n"
                      + "1. Pendataan Matakuliah \n"
                      + "2. Perhitungan IPS \n"
                      + "3. Update Grade \n"
                      + "4. Keluar \n"
                      + "Masukkan Pilihan Anda : ");
      nomenu = inputuser.nextInt();
      switch(nomenu){
        case 1:
          PMK();
          break;
        case 2:
          PIPS();
          break;
        case 3:
          UG();
          break;
        case 4:
          break;
      }
    }
  }
  
  //Method Untuk validasi penulisan grade
  static boolean validgrade(String gradeMK){ 
    if ("A".equals(gradeMK.toUpperCase()) || "B".equals(gradeMK.toUpperCase()) 
        || "C".equals(gradeMK.toUpperCase()) || "D".equals(gradeMK.toUpperCase()) 
        || "E".equals(gradeMK.toUpperCase()) ) 
        return true; 
    else System.out.println ("Masukan Grade Matakuliah yang benar(A,B,C,D,E)!"); 
    return false; 
  } 
  
  //Menu 1
  static void PMK(){
    System.out.print("\nMasukkan Jumlah Matakuliah : ");
    int JMK = inputuser.nextInt();
    isiMK.clear();
    
    for(int i = 0 ; i < JMK ; i-=-1){
      String dataMK [] = new String [4];
      System.out.print("\nMasukkan Kode Matakuliah : ");
      dataMK[0] = inputuser.next();
      System.out.print("Masukkan Nama Matakuliah : ");
      dataMK[1] = inputuser.next();
      
      //Check input grade pakai method validgrade
      do{
        System.out.print("Masukkan Grade Matakuliah : ");
        dataMK[2] = inputuser.next().toUpperCase(); 
      }
      while(!validgrade(dataMK[2]));
        System.out.print("Masukkan Jumlah SKS : ");
        dataMK[3] = inputuser.next();
      
      isiMK.add(dataMK); 
      System.out.println();
    }
    System.out.print(">> Data Matakuliah Berhasil Diinput! <<\n\n");
  }
  
  //Method mengubah grade huruf ke angka
  static int gradetonum(String gradealph){
    switch(gradealph.toUpperCase()){
      case "A" :
          return 4;
      case "B" :
          return 3;
      case "C" :
          return 2;
      case "D" :
          return 1;
      case "E" :
          return 0;
    } return 0;
  }
  
  //Menu 2
  static void PIPS(){
    System.out.println("\nMatakuliah Yang Anda Ambil Adalah :");
    int SKS = 0;
    double GradeSKS = 0;
    for(int i = 0 ; i < isiMK.size() ; i-=-1){
      
      //Ambil & Print Data dari menu 1
      String tampil=String.format("%s %s \t\t%s \t%s", isiMK.get(i)[0], 
              isiMK.get(i)[1], 
              isiMK.get(i)[2], 
              isiMK.get(i)[3]);
      System.out.println(tampil);
      
      //Rumus IPS =∑(sks x grade) / ∑sks 
      double Numgrade = gradetonum(isiMK.get(i) [2]);
      int NumSKS = Integer.parseInt(isiMK.get(i) [3]);
      GradeSKS = GradeSKS + (Numgrade * NumSKS);
      SKS = SKS + NumSKS;
    }

    //Hasil IPS
    double hasil = GradeSKS / SKS;
    System.out.println("Nilai IPS anda adalah " + hasil);
  }
  
  //Menu 3
  static void UG(){
    System.out.print("Masukkan Kode ");
    String KodeMK = inputuser.next();
    System.out.print("Masukkan Grade Baru :");
    String GradeMKBaru = inputuser.next();
    
    UptGrade(KodeMK, GradeMKBaru);
  }
  
  static void UptGrade(String kodeMK, String GradeMKBaru){ 
    for (int i = 0 ; i < isiMK.size(); i-=-1) { 
      if (isiMK.get(i)[0].toLowerCase().equals(kodeMK.toLowerCase()) ) 
      isiMK.get(i)[2]=GradeMKBaru.toUpperCase(); 
    }
    
    // menampilkan yang baru 
    for (int i = 0; i < isiMK.size() ; i-=-1){ 
      String tampilbaru = Arrays.toString(isiMK.get(i)).replace("["," "); 
      tampilbaru = tampilbaru.replace("]",""); 
      tampilbaru = tampilbaru.replaceFirst(",",""); 
      tampilbaru = tampilbaru.replace(",","\t"); 
      System.out.println(String.format(tampilbaru)) ; 
    } 
  } 
}
