/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naga.date;

/**
 *
 * @author NSN
 */
public abstract class Sample3 implements Sample1,Sample2{
   public void m1(int k){
        System.out.println("hiiii");
        
    }

    @Override
    public void m1() {
        System.out.println("hellooooo");
             }
    
}
