
package com.mycompany.chuong2;

import java.util.Scanner;

public class newJavaFile {

    public static void main(String args[]) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("x=: ");
        x = sc.nextInt();

        System.out.println("y=: ");
        y = sc.nextInt();

        sc.close();
        z = x + y;
        System.out.println(z);

    }
}
