public class Pelanggan {
    private String namaPelanggan;
    private String nomorHP;
    private String alamat;

    public Pelanggan(String namaPelanggan, String nomorHP, String alamat) {
        this.namaPelanggan = namaPelanggan;
        this.nomorHP = nomorHP;
        this.alamat = alamat;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public String getAlamat() {
        return alamat;
    }
}
