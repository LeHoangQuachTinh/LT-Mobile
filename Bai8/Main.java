package Bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CBGV> ds = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== MENU QUAN LY CBGV =====");
            System.out.println("1. Nhap thong tin CBGV");
            System.out.println("2. Hien thi danh sach CBGV");
            System.out.println("3. Hien thi CBGV co luong >= 8 trieu");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    CBGV gv = new CBGV();
                    gv.nhap(sc);
                    ds.add(gv);
                    break;
                case 2:
                    System.out.println("=== DANH SACH CBGV ===");
                    for (CBGV g : ds) {
                        g.hienThi();
                    }
                    break;
                case 3:
                    System.out.println("=== DANH SACH CBGV LUONG >= 8 TRIEU ===");
                    for (CBGV g : ds) {
                        if (g.tinhLuongThucLinh() >= 8000000) {
                            g.hienThi();
                        }
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