import java.util.Scanner;

public class LabelTanggal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] bulan = {
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
        };

        // Input bulan
        int tanggal = input.nextInt();
        int nomorBulan = input.nextInt();
        int tahun = input.nextInt();
        

        System.out.println(tanggal + " "+bulan[nomorBulan-1]+" " + tahun);

    }
}