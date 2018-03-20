/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naga.date;

import java.util.Date;

/**
 *
 * @author NSN
 */
public class DateTest {
    public static void main(String...a){
        Date startDate=new Date(2017, 04, 5);
        long sarttime=startDate.getTime();
        Date d2=new Date(2018,04,5);
        long currentDate=d2.getTime();
        long days=(currentDate-sarttime)/(1000*60*60*24);
        long months=days/30;
        long years=months/12;
        System.out.println("years "+days);
    }
    
}
