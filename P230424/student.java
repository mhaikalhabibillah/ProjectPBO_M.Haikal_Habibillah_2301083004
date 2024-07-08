/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083004.P230424;

/**
 *
 * @author acer
 */
public class student extends person {
         public student(){
            // super ("ali","Padang");
             super.name="ali";
             super.addres="padang";
             System.out.println("student contructor");
         }  
    @Override
    public String getName(){
    System.out.println("Student:getName");
    return name;
}
  
    
}
