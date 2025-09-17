package Bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<TheMuon> ds_145 = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== MENU THU VIEN =====");
            System.out.println("1. Nhap the muon");
            System.out.println("2. Hien thi danh sach the muon");
            System.out.println("3. In SV va sach phai tra vao cuoi thang");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    TheMuon tm = new TheMuon();
                    tm.nhap(sc);
                    ds_145.add(tm);
                    break;
                case 2:
                    System.out.println("=== DANH SACH THE MUON ===");
                    for (TheMuon t : ds_145) {
                        t.hienThi();
                    }
                    break;
                case 3:
                    System.out.println("=== DANH SACH PHAI TRA CUOI THANG ===");
                    for (TheMuon t : ds_145) {
                        if (t.canTraCuoiThang()) {
                            System.out.printf("Sinh vien: %s - Sach: %s\n",
                                    t.getTenSV(), t.getSoHieuSach());
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