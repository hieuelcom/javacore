package com.mycompany.mavenproject1;

public class invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double unitPrice;

    public void setpartNumber(String mhang) {
        partNumber = mhang;
    }

    public String getpartNumbe() {
        return partNumber;
    }

    public void setpartDescription(String loaisp) {
        partDescription = loaisp;
    }

    public String getpartDescription() {
        return partDescription;
    }

    public void setquantity(int b) {
        quantity = b;
    }

    public int getquantity() {
        return quantity;
    }

    public void setunitPrice(double a) {
        if (a >= 0.0) {
            unitPrice = a;
        }
    }

    public double getunitPrice() {
        return unitPrice;
    }

    public void getImvoice(double z) {
        z = quantity * unitPrice;
    }
}
