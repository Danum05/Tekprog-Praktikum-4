package Kasus1;
/**
 * <h1> Kasus 1 : Barang </h1>
 * Program ini bertujuan untuk menampilkan nama, kode dan jumlah stok barang.
 * Lalu program ini juga bertujuan sebagai studi kasus tentang penggunaan 
 * enkapsulasi pada sebuah variabel.
 * 
 * @author Danu Mahesa
 * @version 1.0
 * @since 2022-27-02
 */

public class Barang {
    
    public int getstok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok += stok; // diubah menjadi +=, karena yang diminta hanya operasi tambah
    }
    // data fields
    String kode_barang;
    String nama_barang;
    private int stok; // jadikan variabel stok menjadi private
    
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
}
