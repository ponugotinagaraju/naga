/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naga.git;

import java.util.Scanner;

/**
 *
 * @author NSN
 */
public class NetBeansGitRepoProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("hello world welcome:");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
       String name= sc.next();
        if(name.equals("naga")){
            System.out.println("hello welcome to:"+name);
        }
    }
    
}
