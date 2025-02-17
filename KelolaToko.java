package UTS;

import java.util.Scanner;

public class KelolaToko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INPUT DATA TOKO ROTI & KUE");
        System.out.print("Masukkan jumlah item: ");
        int jumlahItem = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        Item[] itemArray = new Item[jumlahItem];
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Masukkan data item " + (i + 1) + ":");
            System.out.print("Kode item: ");
            String kodeItem = scanner.nextLine();
            System.out.print("Nama item: ");
            String namaItem = scanner.nextLine();
            System.out.print("Harga: ");
            double harga = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            scanner.nextLine();

            itemArray[i] = new Item(kodeItem, namaItem);
            itemArray[i].setHarga(harga);
            itemArray[i].setStok(stok);
            System.out.println();
        }

        System.out.println("INPUT DATA TOKO");
        System.out.print("Kode Toko: ");
        String kodeToko = scanner.nextLine();
        System.out.print("Nama Toko: ");
        String namaToko = scanner.nextLine();
        System.out.println();

        System.out.println("INPUT DATA MANAJER");
        System.out.print("Kode Pegawai: ");
        String noPegawai = scanner.nextLine();
        System.out.print("Nama: ");
        String namaPegawai = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
        System.out.println();

        Toko toko = new Toko(kodeToko, namaToko);
        Pegawai manajer = new Pegawai(noPegawai, namaPegawai);
        manajer.setAlamat(alamat);

        toko.setManajer(manajer);
        for (Item item : itemArray) {
            toko.tambahItem(item);
        }

        System.out.println("\nINFORMASI TOKO ROTI & KUE");
        System.out.println(toko.getNamaToko() + "(" + toko.getKodeToko() + ")");
        System.out.println("Manajer: " + toko.getManajer().getNama());
        System.out.println("\nDaftar Item:");
        System.out.println("Kode Item   Nama Item       Harga   Stok");
        System.out.println("-------------------------------------------");
        for (Item item : toko.getDaftarItem()) {
            System.out.printf("%-10s %-15s %-10.2f %-3d\n", item.getKodeItem(), item.getNama(), item.getHarga(),
                    item.getStok());
        }

        Item itemTermurah = toko.cariItemTermurah();
        System.out.println("\nItem paling murah: " + itemTermurah.getNama() + ", harga " + itemTermurah.getHarga()
                + ", jumlah stok " + itemTermurah.getStok());

        System.out.println("\nDaftar item yang habis stoknya adalah:");
        System.out.println("Kode Item   Nama Item");
        System.out.println("--------------------------");
        for (Item item : toko.cariItemHabisStok()) {
            System.out.printf("%-10s %-15s\n", item.getKodeItem(), item.getNama());
        }
    }
}