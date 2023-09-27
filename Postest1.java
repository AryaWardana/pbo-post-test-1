/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package project.postest1;

/**
 *
 * @author Arya Wahyu Wardana
 */
import java.util.ArrayList;

public class Postest1 {
    public static void main(String[] args) {
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        // Menambahkan buku ke ArrayList
        daftarBuku.add(new Buku("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997));
        daftarBuku.add(new Buku("To Kill a Mockingbird", "Harper Lee", 1960));
        daftarBuku.add(new Buku("1984", "George Orwell", 1949));
        daftarBuku.add(new Buku("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        daftarBuku.add(new Buku("The Catcher in the Rye", "J.D. Salinger", 1951));

        // Menampilkan daftar buku
        System.out.println("Daftar Buku di Perpustakaan:");
        for (Buku buku : daftarBuku) {
            System.out.println(buku);
        }
    }
}
