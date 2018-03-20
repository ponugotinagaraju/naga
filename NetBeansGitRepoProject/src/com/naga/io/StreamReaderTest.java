/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naga.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import jdk.nashorn.internal.ir.Symbol;

/**
 *
 * @author NSN
 */
public class StreamReaderTest {
    public static void main(String...a)throws IOException{
        FileReader fr=new FileReader("D://NAGARAJU/Test.txt");
       // File file=new File("D://NAGARAJU/Test.txt");
       // file.setReadable(false);
       // FileInputStream bis;
      /* bis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(bis);
        Scanner sc = new Scanner(System.in);
        System.out.println("Reading the data from file.......");
        while (isr.read() > 0) {
            System.out.print((char) isr.read());
        }*/
     // BufferedInputStream bis=new BufferedInputStream(file);
     
        BufferedReader br=new BufferedReader(fr);
       
        
    }
}
