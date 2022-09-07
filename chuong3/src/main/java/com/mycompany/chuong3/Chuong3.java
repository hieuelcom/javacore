/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.chuong3;

/**
 *
 * @author Admin
 */
public class Chuong3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
class SounDeck {
	public boolean canRecord = false;
    void play(){
    	System.out.println("Playing");
    }
     void record(){
    	System.out.println("Recording");
    }
}
class sounDeckTestDrive{
	public static void main(String[] args){
    	SounDeck t = new SounDeck();
        t.canRecord= true;
        t.play();
        if (t.canRecord ==true){
        	t.record();
        }
    }
}
class DVDPlayer{
	public boolean canRecord = false;
    void playDVD(){
    	System.out.println("DVD Playing");
    }
     void recordDVD(){
    	System.out.println("DVD Recording");
    }
}
class DVDPlayerTestDrive{
	public static void main(String[] args){
    	DVDPLayer d = new DVDPlayer();
        d.canRecord= true;
        d.playDVD();
        if (d.canRecord ==true){
        	d.recordDVD();
        }
    }
}