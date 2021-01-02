import java.util.Scanner;

public class GambarPersegi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input jumlah data
        System.out.print("");
        int jumlah = input.nextInt();

        // Buat array
        int[] nilai = new int[jumlah];

        // Input nilai
        for (int i = 0; i < jumlah; i++) {
          for (int j = 0; j < jumlah; j++){
            System.out.print("*");
        }
        System.out.print("\n");
        }
    }
}
