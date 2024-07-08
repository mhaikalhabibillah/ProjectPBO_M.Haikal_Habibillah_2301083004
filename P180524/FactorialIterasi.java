/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083004.P180524;

/**
 *
 * @author acer
 */
public class FactorialIterasi {
    static int factorial (int n){
        int result =1;
        for (int i=n; i>1;i--){
            result *=i;
        }
        return result;
    }
    
    public static void main(String[]arqs){
        int n=Integer.parseInt(arqs[0]);
        System.out.println(factorial(n));
    }
    
}
