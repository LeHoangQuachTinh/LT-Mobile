import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhuPho khuPho_145 = new KhuPho();
        int choice;

        do {
            System.out.println("===== MENU QUAN LY KHU PHO =====");
            System.out.println("1. Nhap thong tin cac ho dan");
            System.out.println("2. Hien thi thong tin tat ca ho dan");
            System.out.println("3. Tim ho co nguoi 80 tuoi");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    khuPho_145.nhap(sc);
                    break;
                case 2:
                    khuPho_145.hienThi();
                    break;
                case 3:
                    khuPho_145.hienThiHoCoNguoi80Tuoi();
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
