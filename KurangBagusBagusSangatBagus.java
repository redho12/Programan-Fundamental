import java.util.Scanner;
 
class KurangBagusBagusSangatBagus {
  public static void main(String args[]){
     
    int a;
    Scanner input = new Scanner(System.in);
     
    System.out.print("");
    a = input.nextInt();
 
    if (a >= 76) {
      System.out.println("Sangat Bagus");
    }
    else if (a >= 55  ) {
       System.out.println("Bagus");
    }
    else {
      System.out.println("Kurang");
    }
  }
}
