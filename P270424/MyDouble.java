/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083004.P270424;

/**
 *
 * @author acer
 */
public class MyDouble implements Relation {
 
    public boolean isGreater(Object a, Object b){
        return (double)a > (double)b;
    }
    public boolean isLess(Object a, Object b){
        return (double)a < (double)b;
    }
    public boolean isEqual(Object a, Object b){
        return (double)a == (double)b;
    }
}