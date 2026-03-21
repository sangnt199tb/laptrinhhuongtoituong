package com.company;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;

    public static final double LUONG_MAX = 50000000;
    private static int soLuongNV = 0;

    public NhanVien() {
        soLuongNV++;
    }

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        soLuongNV++;
    }

    public static int getSoLuongNV() {
        return soLuongNV;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public boolean tangLuong(double x) {
        double heSoMoi = this.heSoLuong + x;
        double luongMoi = luongCoBan * heSoMoi;

        if (luongMoi > LUONG_MAX) {
            System.out.println("Không thể tăng lương vì vượt quá mức tối đa!");
            return false;
        } else {
            this.heSoLuong = heSoMoi;
            return true;
        }
    }

    public void inTTin() {
        System.out.println("Tên NV: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương: " + tinhLuong());
    }

    public void inTTin(String loiChao) {
        System.out.println(loiChao);
        System.out.println("Tên NV: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương: " + tinhLuong());
    }

    public static double tinhTongLuong(NhanVien... ds) {
        double tongLuong = 0;
        for (NhanVien nv : ds) {
            tongLuong += nv.tinhLuong();
        }
        return tongLuong;
    }


}
