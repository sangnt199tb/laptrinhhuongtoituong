package com.company;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        NhanVien nhanVien = new NhanVien();
        nhanVien.setTenNhanVien("Nguyen trong sang");
        nhanVien.setHeSoLuong(2.3);
        nhanVien.setLuongCoBan(4000000);
        nhanVien.inTTin("hello");

        int x = 3;
        int y = 8;

        System.out.println(y / x);
        System.out.println((double)y / x);
        System.out.println((double)(y / x));
        System.out.println(y / (double)x);
        System.out.println('H' + 'a');
        System.out.print("Mời bạn nhập vào số học sinh trong lớp: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String name;
        int year;
        Student[] students = new Student[num];
        for (int i = 0; i < num; i++){
            System.out.print("Mời bạn nhập vào tên của sinh viên thứ " + (i + 1) + " : ");
            name = scanner.nextLine();
            System.out.print("Mời bạn nhập vào năm sinh của sinh viên thứ " + (i + 1) + " : ");
            year = scanner.nextInt();
            scanner.nextLine();
            students[i] = new Student(name, year);
            System.out.println("==============");
        }

        for (int i = 0; i< num; i++){
            System.out.println("Thong tin sinh vien thứ " + (i + 1) + " "+students[i].getName() + " và năm sinh là: "  + students[i].getYear());
        }
    }
}
