///Menggunakan konsep inheritance dari interface Transaksi
public class Penjualan implements Transaksi {
    private String noFaktur;
    private Pelanggan pelanggan;
    private Barang barang;
    private int jumlahBarang;

    public Penjualan(String noFaktur, Pelanggan pelanggan, Barang barang, int jumlahBarang) {
        this.noFaktur = noFaktur;
        this.pelanggan = pelanggan;
        this.barang = barang;
        this.jumlahBarang = jumlahBarang;
    }

    public double hitungTotalBayar() {
        return barang.getHargaBarang() * jumlahBarang;
    }

    public String getInfoTransaksi() {
        return "No Faktur: " + noFaktur +
                "\nPelanggan: " + pelanggan.getNamaPelanggan() +
                "\nBarang: " + barang.getNamaBarang() +
                "\nJumlah: " + jumlahBarang +
                "\nTotal Bayar: " + hitungTotalBayar();
    }
}
