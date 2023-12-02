public class Barang {
    private String namaBarang;
    private double hargaBarang;
    private String kasir;

    public Barang(String namaBarang, double hargaBarang, String kasir) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.kasir = kasir;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public String getKasir(){
        return kasir;
    }
}