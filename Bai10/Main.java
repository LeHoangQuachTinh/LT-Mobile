package Bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BienLai> ds_145 = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== MENU BIEN LAI DIEN =====");
            System.out.println("1. Nhap thong tin bien lai");
            System.out.println("2. Hien thi danh sach bien lai");
            System.out.println("3. Tinh tien dien tung ho");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    BienLai bl = new BienLai();
                    bl.nhap(sc);
                    ds_145.add(bl);
                    break;
                case 2:
                    System.out.println("=== DANH SACH BIEN LAI ===");
                    for (BienLai b : ds_145) {
                        b.hienThi();
                    }
                    break;
                case 3:
                    System.out.println("=== TIEN DIEN MOI HO ===");
                    for (BienLai b : ds_145) {
                        System.out.printf("Chu ho: %s -> Tien: %d VND\n",
                                b.getTenChuHo(), b.getSoTien_145());
                    }
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 0);

        sc.close();
    }
}