package  Bai6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhachSan ks_145 = new KhachSan();
        int choice;

        do {
            System.out.println("===== MENU QUAN LY KHACH SAN =====");
            System.out.println("1. Nhap thong tin khach tro");
            System.out.println("2. Hien thi thong tin khach tro");
            System.out.println("3. Xoa khach tro theo CMND");
            System.out.println("4. Tinh tien tra phong theo CMND");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ks_145.nhapDanhSach(sc);
                    break;
                case 2:
                    ks_145.hienThiDanhSach();
                    break;
                case 3:
                    sc.nextLine(); // bỏ dòng thừa
                    System.out.print("Nhap CMND can xoa: ");
                    String cmndXoa = sc.nextLine();
                    ks_145.xoaKhachTro(cmndXoa);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Nhap CMND de tinh tien: ");
                    String cmndTinh = sc.nextLine();
                    ks_145.tinhTienTraPhong(cmndTinh);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);
    }
}
