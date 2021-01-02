import java.util.Scanner;

class ProgramKelulusan {
  public static void main(String[] args) {
  
     int a;
    Scanner input = new Scanner(System.in);
     
    System.out.print("");
    a = input.nextInt();
 
    if (a >= 55) {
      System.out.println("Selamat! Anda lulus dengan nilai"+ " "+ a);
    }
   /* else {
      System.out.println("Maaf, anda tidak lulus coba lagi tahun depan");
    }*/
    System.out.println("Program selesai");
  }
}