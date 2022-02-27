package Kasus3;
/**
 * <h1> Kasus 3 : KelasDua </h1>
 * Program ini bertujuan untuk memahami lebih lanjut mengenai perbedaan
 * constructor yang sama nama nya tetapi berbeda pada parameternya
 * 
 * @author Danu Mahesa
 * @version 1.0
 * @since 2022-27-02
 */

public class KelasDua {
    {
        System.out.println(5);
    }
    public static void main(String[] args) {
        System.out.println(6); // angka ini akan ditampilka di baris pertama 
        KelasSatu satu = new KelasSatu(); // panggil constructor kelas satu tanpa parameter
        KelasSatu dua = new KelasSatu (10); // panggil constructor kelas satu dengan parameter
    }
    
}