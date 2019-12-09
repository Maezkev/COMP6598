import java.util.Scanner;
import java.util.Calendar;


public class TK2{
  public static void main(String args[]){
    Scanner inputuser = new Scanner(System.in);
    System.out.println("Nama Anggota : ");
    System.out.println("1. 2301925772 - Marshall Ezra Kevinnettou.");
    System.out.println("2. ");
    System.out.println("");
    System.out.print("Masukkan nama anda = ");
    String namauser = inputuser.nextLine();
    System.out.print("Masukkan tahun lahir anda = ");
    int lahiruser = inputuser.nextInt();
    int tahunsekarang = Calendar.getInstance().get(Calendar.YEAR);
    int umuruser = tahunsekarang - lahiruser;
    if(umuruser < 13){
      System.out.println("Adik " + namauser + ", berusia " + umuruser + " tahun, hanya dapat menonton film dengan klasifikasi SU");      
    }else if(umuruser < 17){
      System.out.println(namauser + ", Anda berusia " + umuruser + " tahun, dapat menonton film dengan klasifikasi SU dan 13+");
    }else if(umuruser < 21){
      System.out.println(namauser + ", Anda berusia " + umuruser + " tahun, dapat menonton film dengan klasifikasi SU, 13+ dan 17+");
    }else{
      System.out.println(namauser + ", Anda berusia " + umuruser + " tahun, dapat menonton film dengan klasifikasi SU, 13+, 17+, dan 21+");
    }
  }
}