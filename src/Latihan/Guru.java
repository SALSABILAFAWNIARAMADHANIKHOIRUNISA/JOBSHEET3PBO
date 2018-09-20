/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Hp
 */
public class Guru {
   private int ID;
   private String Nama;
   
    //konstruktor
    public Guru(int id, String nama){
        this.ID = id;
        this.Nama = nama;
       
    }
    //methode
    public void TampilkanRincian(){
        System.out.println("ID : "+this.ID);
        System.out.println("Nama Guru : "+ this.Nama);
       
    }
}
class Guru1 extends Guru{
    private String Mapel;
    
    public Guru1(int ID, String nama, String mapel){
        super (ID, nama);
        this.Mapel = mapel;
    }
    public void TampilkanRincian(){
        System.out.println("Mapel : "+this.Mapel);
        super.TampilkanRincian();
    }
}
class Data{
    public static void main(String[] args){
        Guru1 gr = new Guru1(1,"Bu Ardhian Suseno","B.Inggris");
        gr.TampilkanRincian();
    }
}
   

            

