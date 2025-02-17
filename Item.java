package UTS;

public class Item {
    private String kodeItem;
    private String nama;
    private double harga;
    private int stok;

    public Item(String kodeItem, String nama) {
        this.kodeItem = kodeItem;
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKodeItem() {
        return kodeItem;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
}