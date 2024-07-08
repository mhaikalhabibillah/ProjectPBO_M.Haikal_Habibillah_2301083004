/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083004.P230424;

/**
 *
 * @author acer
 */
public class studentExample {
    public static void printInformation(person p){
        if(p instanceof student){
          System.out.println("Nama siswa  :"+p.getName());
          System.out.println("Alamat siswa  :"+p.getAddres()); 
        }
        if(p instanceof Employee){
          System.out.println("Nama Karyawan  :"+p.getName());
          System.out.println("Alamat Karyawan  :"+p.getAddres()); 
        }
        
    }
    public static void main(String[]args){
    person ref;
    student ali=new student();
    ali.setName("ali");
    ali.setAddres("padang");
    Employee budi=new Employee();
    budi.setName("budi");
    budi.setAddres("bukit tinggi");
    
    
    ref=ali;
    System.out.println("Nama  mahasiswa ="+ref.getName());
     System.out.println("Alamat  ="+ref.getAddres());
     
     ref=budi;
    System.out.println("Nama karyawan  ="+ref.getName());
     System.out.println("Alamat  ="+ref.getAddres());
 }
    
    
}
