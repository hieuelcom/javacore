package com.mycompany.chuong7;

class mixedup {
    public static void main(String[] args) {
        a a = new a();
        b b = new b();
        c c = new c();
        a a2 = new c();
        b.m1();
        c.m2();
        a.m3();
        c.m1();
        c.m2();
        c.m3();
        a.m1();
        a.m2();
        a.m3();
        a2.m1();
        a2.m2();
        a2.m3();
    }
}
