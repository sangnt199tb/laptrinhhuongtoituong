package com.company;

public class HinhVuong {
    private double canh;

    public HinhVuong() {}

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public double tinhDienTich() {
        return canh * canh;
    }

    public double tinhChuVi() {
        return 4 * canh;
    }
}
