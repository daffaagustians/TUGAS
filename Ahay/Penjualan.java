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
        String totalBayar = new String("\nTotal Bayar :");//contoh method string uppercase
        
        return "No Faktur: " + noFaktur +
                "\nNama Pelanggan: " + pelanggan.getNamaPelanggan() +
                "\nNomor HP: " + pelanggan.getNomorHP() +
                "\nAlamat: " + pelanggan.getAlamat() +
                "\nNama Barang: " + barang.getNamaBarang() +
                "\nHarga Barang: " + barang.getHargaBarang() +
                "\nNama Kasir: " + barang.getKasir() +
                "\nJumlah Beli: " + jumlahBarang +
                totalBayar.toUpperCase() + hitungTotalBayar();
                
                
    }
}
