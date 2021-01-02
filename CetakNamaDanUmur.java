import java.util.Scanner;

class CetakNamaDanUmur {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("");
      String Nama = input.nextLine();
      System.out.print("");
      int tahun = input.nextInt();
      int umur = 2020 - tahun;
      System.out.printf("%s (%d tahun)", Nama, umur);
      
  
       
    }
}