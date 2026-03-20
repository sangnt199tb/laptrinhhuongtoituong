package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        kiemTraNgayTrongThang();
//        tinhTienDien();
//        qltv();


        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(0);
        bankAccount.setOwner("Nguyen trong sang");
        System.out.println(bankAccount.getOwner());
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
                        System.out.println("cuốn sách thứ " + (i + 1) + " " + titles[i] + " có số lượng "  + quantities[i]);
                    }
                    break;
                case 2:
                    // kiểm tra số lượng sách tối đa
                    if (count >= 100) {
                        System.out.println("Không thể nhập thêm sách vì đã vượt quá khả năng lưu trữ của thư viện");
                        break;
                    }
                    String newTitle;
                    while (true) {
                        System.out.print("Nhập vào tiêu đề sách: ");
                        newTitle = sc.nextLine();
                        if (newTitle.trim().isEmpty()) {
                            System.out.println("Tên sách không được bỏ trống!");
                        } else {
                            break;
                        }
                    }

                    int qty;
                    while (true) {
                        System.out.print("Nhập vào số lượng sách: ");
                        if (sc.hasNextInt()) {
                            qty = sc.nextInt();
                            sc.nextLine();
                            if (qty < 0) {
                                System.out.println("Số lượng sách không được nhỏ hơn 0!");
                            } else {
                                break;
                            }
                        } else {
                            System.out.println("Vui lòng nhập số hợp lệ!");
                            sc.nextLine();
                        }
                    }
                    titles[count] = newTitle;
                    quantities[count] = qty;
                    count++;
                    System.out.println("Thêm sách thành công!");
                    break;
                case 3:
                    // Tìm sách
                    String bookName;
                    while (true) {
                        System.out.print("Mời bạn nhập tên sách cần tìm: ");
                        bookName = sc.nextLine();
                        if (bookName.trim().length() == 0) {
                            System.out.println("Tên sách không được bỏ trống!");
                        } else {
                            break;
                        }
                    }
                    for (int i = 0; i < count; i++){
                        if(titles[i].contains(bookName)){
                            System.out.println(bookName + " còn " + quantities[i] + " quyển trong thư viện");
                            break;
                        }
                    }
                    break;
                case 4:
                    // Mượn sách
                    String book;
                    while (true) {
                        System.out.print("Mời bạn nhập tên sách cần mượn: ");
                        book = sc.nextLine();
                        if (book.trim().isEmpty()) {
                            System.out.println("Tên sách cần mượn không được bỏ trống!");
                        } else {
                            break;
                        }
                    }
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (titles[i].equalsIgnoreCase(book)) {
                            found = true;
                            if (quantities[i] == 0) {
                                System.out.println("Cuốn sách \"" + book + "\" đã hết!");
                            } else {
                                quantities[i]--;
                                System.out.println("Mượn sách thành công!");
                                System.out.println("Còn lại " + quantities[i] + " quyển.");
                            }
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Cuốn sách bạn cần mượn không có trong thư viện");
                    }
                    break;
                case 5:
                    // Trả sách
                    String theBooks;
                    while (true) {
                        System.out.print("Mời bạn nhập tên sách cần trả: ");
                        theBooks = sc.nextLine();
                        if (theBooks.trim().isEmpty()) {
                            System.out.println("Tên sách cần cẩn trả không được bỏ trống!");
                        } else {
                            break;
                        }
                    }
                    for (int i = 0; i < count; i++) {
                        if (titles[i].equalsIgnoreCase(theBooks)) {
                            found = true;
                            quantities[i]++;
                            System.out.println("Trả sách thành công!");
                            System.out.println("Còn lại " + quantities[i] + " quyển.");
                            break;
                        }
                    }
                    System.out.println("Cuốn sách bạn cần mượn không có trong thư viện");
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

    public static void tinhTienDien(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số m3 nước tiêu thụ: ");
        int soNuoc = sc.nextInt();
        // Kiểm tra dữ liệu đầu vào
        if (soNuoc <= 0) {
            System.out.println("Số nước tiêu thụ phải lớn hơn 0!");
            return; // dừng chương trình
        }
        double tien = 0;
        if (soNuoc <= 10) {
            tien = soNuoc * 5973;
        } else if (soNuoc <= 20) {
            tien = 10 * 5973 + (soNuoc - 10) * 7052;
        } else if (soNuoc <= 30) {
            tien = 10 * 5973 + 10 * 7052  + (soNuoc - 20) * 8669;
        } else {
            tien = 10 * 5973  + 10 * 7052  + 10 * 8669 + (soNuoc - 30) * 15929;
        }
        double tongTien = tien * 1.05;
        System.out.println("Tổng tiền phải trả: " + tongTien + " đồng cho " + soNuoc + "m3 nước");
        sc.close();
    }
}
