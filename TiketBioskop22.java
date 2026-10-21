import java.util.Scanner;
public class TiketBioskop22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi
        int jumlahTiket, hargaTiket = 50000;
        int hargaAwal, diskon, totalBayar;
        int totalTiket = 0, totalPenjualan = 0;

        //gasken cuyy
        do {
            System.out.print("Masukkan jumlah tiket (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }

            hargaAwal = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = hargaAwal * 15 / 100;
            } else if (jumlahTiket > 4) {
                diskon = hargaAwal * 10 / 100;
            } else {
                diskon = 0;
            }

            totalBayar = hargaAwal - diskon;
            System.out.println("Harga awal : Rp " + hargaAwal);
            System.out.println("Diskon     : Rp " + diskon);
            System.out.println("Total bayar: Rp " + totalBayar);
            System.out.println();

            totalTiket += jumlahTiket;
            totalPenjualan += totalBayar;

        } while (true);

        //tampilan
        System.out.println("===== Rekap Penjualan Hari Ini =====");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);
    }
}
    
