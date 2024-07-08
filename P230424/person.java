/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083004.P230424;

/**
 *
 * @author acer
 */
public class person {
    protected String name;
    protected String addres;
    
    public person(){
        System.out.println("person Contructor");
        name="";
        addres="";
    }
    public person(String name,String addres){
       this.name=name;
       this.addres=addres;
       
    }
    public String getName(){
        System.out.println("Person:getName");
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
     public String getAddres(){
        return addres;
    }
    public void setAddres(String addres){
        this.addres=addres;
    }
    
       
}
