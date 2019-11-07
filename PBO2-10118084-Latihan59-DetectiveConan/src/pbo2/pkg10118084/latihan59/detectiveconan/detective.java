/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan59.detectiveconan;

/**
 *
 * @author Freza
 */
public class detective extends karakterAnimeConan {
    private String skill;

    public detective(String skill, String nama, String gender, String usia, String ciri) {
        super(nama, gender, usia, ciri);
        this.skill = skill;
    }

    @Override
    public void displayKarakter() {
        System.out.println("Nama Karakter :"+nama);
        System.out.println("Gender : "+gender);
        System.out.println("Usia : "+usia);
        System.out.println("ciri : "+ciri);
        System.out.println("Skill : "+skill);
    }
    
    
    
}
