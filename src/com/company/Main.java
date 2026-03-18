package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        kiemTraNgayTrongThang();
        qltv();
    }

    public static void kiemTraNgayTrongThang(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tháng (1-12): ");
        int month = sc.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày");
                break;
            default:
                System.out.println("Tháng không hợp lệ!");
        }
    }

    public static void qltv(){
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String libraryName = "My Small Library";
        String[] titles = new String[100];
        int[] quantities = new int[100];
        int count = 0;
        while (true) {
            System.out.println("============= Main menu =============");
            System.out.println("1. Show library information");
            System.out.println("2. Add new book");
            System.out.println("3. Find book");
            System.out.println("4. Borrow a book");
            System.out.println("5. Return a book");
            System.out.println("6. Exit");
            System.out.println("====================================");
            System.out.print("Enter menu ID (1-6): ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    // Hiển thị thông tin thư viện
                    System.out.println("Tên thư viện: " + libraryName);
                    System.out.println("Số đầu sách có trong thư việc: " + count);
                    System.out.println("Danh sách các cuốn sách");
                    for (int i = 0; i < count; i ++){
                        System.out.println("cuốn sách thứ " + i + titles[i] + " số lượng" + quantities[i]);
                    }
                    break;
                case 2:
                    // Thêm sách
                    System.out.println("Nhập vào tiêu đề sách");
                    String newTitle = sc.nextLine();

                    System.out.println("Nhập vào số lượng sách");
                    int qty = sc.nextInt();
                    sc.nextLine();

                    titles[count] = newTitle;
                    quantities[count] = qty;
                    count++;
                    System.out.println("thêm sách thành công");
                    break;
                case 3:
                    // Tìm sách
                    break;
                case 4:
                    // Mượn sách
                    break;
                case 5:
                    // Trả sách
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        }
    }
}
