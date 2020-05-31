/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31190529_queue;
import java.util.LinkedList;
import java.util.*;
/**
 *
 * @author Lola
 */
public class E31190529_Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat dan menginisialisasi interface queue menggunakan objek linked list
        Queue<String> antrianPembayaranUKT = new LinkedList<>();
        
        //menambahkan data atau nilai element baru ke list queue
        antrianPembayaranUKT.add("Lisa Wahyuni");
        antrianPembayaranUKT.add("Irene Rahayu");
        antrianPembayaranUKT.add("Jennie Siregar");
        antrianPembayaranUKT.add("Jefrey Prakarsa");
        antrianPembayaranUKT.add("Lucas Pratama");
        
        //menampilkan output hasil list queue
        System.out.println("Antrian Pembayaran Mahasiswa : "+antrianPembayaranUKT);
        
        //menghapus sebuah element dari queue menggunakan method remove() 
        //method remove()akan melempar NoSuchElementException, jika list queue kosong
        String nama = antrianPembayaranUKT.remove();
        System.out.println("Menghapus dari Antriam Pembayaran : " +nama+ " | Daftar Antrian Baru : "+antrianPembayaranUKT);
        
        //menghapus sebuah element dari queue menggunakan method poll()
        //method remove() akan mengembalikan null, jika list queue kosong
        nama = antrianPembayaranUKT.poll();
        System.out.println("Menghapus dari Antriam Pembayaran : " +nama+ " | Daftar Antrian Baru : "+antrianPembayaranUKT);
        
    }
    
}
