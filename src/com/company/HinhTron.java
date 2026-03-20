package com.company;

public class HinhTron {
    private double banKinh;

    public HinhTron() {}

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
}
