/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301083004.P270424;

/**
 *
 * @author acer
 */
public class MyInteger implements Relation {
    public boolean isGreater(Object a, Object b){
        return (int)a > (int)b;
    }
    public boolean isLess(Object a, Object b){
        return (int)a < (int)b;
    }
    public boolean isEqual(Object a, Object b){
        return (int)a == (int)b;
    }
}