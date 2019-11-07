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
public class karate extends karakterAnimeConan {
    private String skillkarate;

    public String getSkillkarate() {
        return skillkarate;
    }

    public void setSkillkarate(String skillkarate) {
        this.skillkarate = skillkarate;
    }

    public karate(String skillkarate, String nama, String gender, String usia, String ciri) {
        super(nama, gender, usia, ciri);
        this.skillkarate = skillkarate;
    }
    

   

    @Override
    public void displayKarakter() {
        System.out.println("Nama Karakter :"+nama);
        System.out.println("Gender : "+gender);
        System.out.println("Usia : "+usia);
        System.out.println("ciri : "+ciri);
        System.out.println("Skill : "+skillkarate);
    }
    
    
}
