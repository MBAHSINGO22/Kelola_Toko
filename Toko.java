package UTS;

import java.util.ArrayList;
import java.util.List;

public class Toko {
    private String kodeToko;
    private String namaToko;
    private Pegawai manajer;
    private List<Item> daftarItem;

    public Toko(String kodeToko, String namaToko) {
        this.kodeToko = kodeToko;
        this.namaToko = namaToko;
        this.daftarItem = new ArrayList<>();
    }

    public void setManajer(Pegawai manajer) {
        this.manajer = manajer;
    }

    public void tambahItem(Item item) {
        this.daftarItem.add(item);
    }

    public Item cariItemTermurah() {
        Item itemTermurah = null;
        for (Item item : daftarItem) {
            if (itemTermurah == null || item.getHarga() < itemTermurah.getHarga()) {
                itemTermurah = item;
            }
        }
        return itemTermurah;
    }

    public List<Item> cariItemHabisStok() {
        List<Item> itemHabisStok = new ArrayList<>();
        for (Item item : daftarItem) {
            if (item.getStok() == 0) {
                itemHabisStok.add(item);
            }
        }
        return itemHabisStok;
    }

    public String getKodeToko() {
        return kodeToko;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public Pegawai getManajer() {
        return manajer;
    }

    public List<Item> getDaftarItem() {
        return daftarItem;
    }
}