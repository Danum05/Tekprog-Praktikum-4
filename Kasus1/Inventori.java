package Kasus1;
/**
 * <h1> Kasus 1 : Inventori </h1>
 * Program ini bertujuan untuk menampilkan nama, kode dan jumlah stok barang.
 * Lalu program ini juga bertujuan sebagai studi kasus tentang penggunaan 
 * enkapsulasi pada sebuah variabel.
 * 
 * @author Danu Mahesa
 * @version 1.0
 * @since 2022-27-02
 */

public class Inventori {
    Barang[] barangs;
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getstok() + ")"); // menampilkan variabel
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getstok() + ")");
    }
    void pengadaan() {
        initBarang();
        barangs[0].setStok(20);//inoutkan isi dari variabel privat stok dengan method setStok()
        barangs[0].setStok(30);
        barangs[0].setStok(30);
        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }

}