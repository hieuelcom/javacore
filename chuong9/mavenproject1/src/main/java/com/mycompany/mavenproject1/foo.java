/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.print.attribute.standard.Copies;
import javax.swing.text.DefaultEditorKit.CopyAction;

/**
 *
 * @author Admin
 */
public class foo {
    public static foo dostuff() {
        foo newfoo = new foo();
        dostuff(newfoo);
        return newfoo;
    }

    public static void dostuff1(foo copyfoo) {
        foo locialfoo = copyfoo;
    }

    public static void main(String[] args) {
        foo f1;
        foo f2 = new foo();
        foo f3 = new foo();
        foo f4 = f3;
        f1 = dostuff();

        copyfoo = null;
    }
}
