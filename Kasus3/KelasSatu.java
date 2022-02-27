package Kasus3;

/**
 * <h1> Kasus 3 : KelasSatu </h1>
 * Program ini bertujuan untuk memahami lebih lanjut mengenai perbedaan
 * constructor yang sama nama nya tetapi berbeda pada parameternya
 * 
 * @author Danu Mahesa
 * @version 1.0
 * @since 2022-27-02
 */

public class KelasSatu {
     static {
        System.out.println(11); // angka ini akan ditampilkan terus setiap KelasSatu dipanggil
    }
    
    static
    {
        System.out.println(2); // angka ini akan ditampilkan di awal ketika constructor Kelas Satu  
                               // tanpa parameter dipanggil
    }
    
    public KelasSatu(int i) // constructor dengan parameter
    {
        System.out.println(3); // angka ini akan ditampilkan ketika constuctor dengan parameter dipanggil
    }
    public KelasSatu() // constructor tanpa parameter
    {
        System.out.println(4); // angka ini akan ditampilkan ketika constuctor tanpa parameter dipanggil
    }
}
