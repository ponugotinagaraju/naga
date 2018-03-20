/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naga.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author NSN
 */
public class MapCompletely {

    public static void main(String... a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(101, 200);
        map.put(102, 300);
        map.put(103, 200);
        map.put(104, 400);
        map.forEach((k, v) -> System.out.println(k + ":" + v));
        // Collection<Integer> list= map.values();
        //list.forEach(v->System.out.println(v));
        System.out.println(".............................");
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        ht.put(101, 400);
        ht.put(102, 500);
        ht.put(103, 400);
        ht.put(104, 600);
        ht.put(104, 900);
        ArrayList al;
        int[] a1;
        //ht.put(106,null);
        // ht.forEach((k,v)->System.out.println(k+":"+v));
        a1 = new int[5];
        a1[0]=89;
        a1[1]=9;
        a1[2]=0;
        map=null;
        System.out.println(map);
        System.out.println();
                
            }
       
    

}
