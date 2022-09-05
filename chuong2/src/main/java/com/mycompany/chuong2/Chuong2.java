/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.chuong2;

/**
 *
 * @author Admin
 */
//bai3
public class Chuong2 { 
    public static void main(String[] args){
        
    }
}
class bai5{
    public static void main(String[] args) {
     int sum=0;
    for (int num=1; num<10; num++){
            sum+=num;
        }   
    System.out.println(sum);
    }
}
class bai6{
    public static void main(String[] args) {
     int num=1, sum=0;
    while(num<10){
            sum+=num;
            num++;
        }   
    System.out.println(sum);
    }
}
class bai7{
    public static void main(String[] args) {
        int num=1, sum=0;
        do{
            sum+=num;
            num++;
        }while (num<10);
        System.out.println(sum);
    }
}