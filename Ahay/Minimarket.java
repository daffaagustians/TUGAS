import java.util.InputMismatchException;
import java.util.Scanner;

public class Minimarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          // Input dari pengguna
        System.out.print("Masukkan nomor faktur: ");
        String noFaktur = scanner.nextLine();

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan nama barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();

        // Input dari pengguna
        // (kode input sebelumnya)

        int jumlahBarang = 0; // Inisialisasi dengan nilai default
        boolean validInput = false;

        // Exception handling untuk memastikan input yang valid
        while (!validInput) {
            try {
                System.out.print("Masukkan jumlah barang: ");
                jumlahBarang = scanner.nextInt();
                if (jumlahBarang <= 0) {
                    throw new IllegalArgumentException("Jumlah barang harus lebih dari 0!");
                }
                validInput = true; // Input valid, keluar dari loop
            } catch (InputMismatchException e) {
                System.out.println("Jumlah barang harus berupa angka!");
                scanner.next(); // Membersihkan buffer
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Membuat objek dan menampilkan informasi transaksi
        // (kode selanjutnya sama seperti sebelumnya)
           // Membuat objek dan menampilkan informasi transaksi
        Barang barang = new Barang(namaBarang, hargaBarang);
        Pelanggan pelanggan = new Pelanggan(namaPelanggan);
        Penjualan penjualan = new Penjualan(noFaktur, pelanggan, barang, jumlahBarang);

        System.out.println("\nDetail Transaksi:");
        System.out.println(penjualan.getInfoTransaksi());

        scanner.close();
    }
}
