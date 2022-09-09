package com.mycompany.chuong4;

public class catarraydemo {
    public static void main(String[] args) {
        cat cat1 = new cat();
        cat1.meo();
        cat1.name = "tom";

        cat[] mycat = new cat[3];
        mycat[0] = new cat();
        mycat[1] = new cat();
        mycat[2] = cat1;

        mycat[0].name = "bug";
        mycat[1].name = "oggy";

        System.out.print("last cat's name");
        System.out.println(mycat[2].name);

        int x = 0;
        while (x < mycat.length) {
            mycat[x].meo();
            x = x + 1;
        }
    }
}
