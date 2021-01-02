import java.util.Scanner;

class MatriksAngka {
  public static void main(String[] args) {
    
    
    Scanner input = new Scanner(System.in);
    
    int nilai = input.nextInt();
    
    
    for (int i = 0; i < nilai; i++){
      for (int j = 0; j < nilai; j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}