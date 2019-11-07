/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan59.detectiveconan;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan karakter anime conan

 */
public class PBO210118084Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        detective detective1;
        detective1 = new detective("detective"," Shinichi Kudo","pria","anak-anak","berjas dan ber kacamata");
        System.out.println("");
        detective1.displayKarakter();
        karate karate1;
        karate1= new karate("Jago Karate"," Ran Mouri ","Wanita","Dewasa","berjas");
        System.out.println("");
        karate1.displayKarakter();
        teman teman1;
        System.out.println("");
        teman1 = new teman("Teman Kecil Conan"," Ayumi Yoshida ","Wanita","Anak-anak","memakai bando");
        teman1.displayKarakter();;
    }
    
}
