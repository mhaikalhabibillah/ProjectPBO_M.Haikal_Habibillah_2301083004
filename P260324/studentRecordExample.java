/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083004.P260324;

/**
 *
 * @author acer
 */
public class studentRecordExample {
    public static void main(String[]args){
        StudentRecord student1 = new StudentRecord();
        student1.setName("Habibi");
        student1.setAddress("Padang");
        student1.setAge(20);
        student1.setMathGrade(90);
        student1.setEnglishGrade(70);
        student1.setScienceGrade(80);
        
        ///
        System.out.println("Nama   :"+student1.getName());
        System.out.println("Alamat   :"+student1.getAddress());
        System.out.println("umur   :"+student1.getAge());
        System.out.println("Matematika   :"+student1.getMathGrade());
        System.out.println("Bahasa inggris   :"+student1.getEnglishGrade());
        System.out.println("Sains   :"+student1.getScienceGrade());
        System.out.println("Rata   :"+student1.getAverage());
              
        System.out.println("banyak siswa   ;"+StudentRecord.getStudentCount());
        
        
        System.out.println("==========");
        student1.print(student1.getName());
        System.out.println("==========");
        student1.print(student1.getEnglishGrade(),student1.getMathGrade(),student1.getScienceGrade());
        
        StudentRecord bibiRecord=new StudentRecord("bibi");
        StudentRecord kramRecord=new StudentRecord("kram","padang");
        StudentRecord deniRecord=new StudentRecord(90,80,70);
        
        
        bibiRecord.print(bibiRecord.getName());
        kramRecord.print(kramRecord.getName());
        deniRecord.print(deniRecord.getEnglishGrade(),deniRecord.getMathGrade(),deniRecord.getScienceGrade());
        
       System.out.println("Banyak siswa :"+StudentRecord.getStudentCount());
    }
    
}
