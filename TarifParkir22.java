import java.util.Scanner;
public class TarifParkir22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi
        int jenis, durasi, total = 0;

        //gasken cuyy
        do {
            System.out.print("Masukkan jenis (1 mobil, 2 motor, 0 keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi (jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);

        //tampilan
        System.out.println("Total pembayaran: Rp " + total);
    }
}
    

