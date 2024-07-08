/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083004.P140524;

/**
 *
 * @author acer
 */
public class TestException {
    public static void main(String[]args){
        try{
        for (int i=0; true; i++){
            System.out.println("args["+1+"]="
                    +args[i]);
        }
        }catch(Exception ex){
            System.out.println("Error   :"+ ex.getMessage());
        }
    }
}
