package UTS;

public class Pegawai {
    private String noPegawai;
    private String nama;
    private String alamat;

    public Pegawai(String noPegawai, String nama) {
        this.noPegawai = noPegawai;
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoPegawai() {
        return noPegawai;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
}