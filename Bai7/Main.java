package Bai7;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HSHocSinh> ds_145 = new ArrayList<>();
        int chon;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap danh sach hoc sinh");
            System.out.println("2. Hien thi hoc sinh sinh nam 1985 va que o Thai Nguyen");
            System.out.println("3. Hien thi hoc sinh lop 10A1");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap so hoc sinh: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nNhap thong tin hoc sinh thu " + (i+1));
                        HSHocSinh hs = new HSHocSinh();
                        hs.nhap(sc);
                        ds_145.add(hs);
                    }
                    break;

                case 2:
                    System.out.println("\n--- Hoc sinh sinh nam 1985 va que Thai Nguyen ---");
                    boolean timThay = false;
                    for (HSHocSinh hs : ds_145) {
                        Calendar cal = Calendar.getInstance();
                        cal.setTime(hs.getNgaySinh_145());
                        int year = cal.get(Calendar.YEAR);
                        if (year == 1985 && hs.getQueQuan_145().equalsIgnoreCase("Thai Nguyen")) {
                            hs.hienThi();
                            timThay = true;
                        }
                    }
                    if (!timThay) {
                        System.out.println("Khong co hoc sinh nao phu hop.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Hoc sinh lop 10A1 ---");
                    boolean co = false;
                    for (HSHocSinh hs : ds_145) {
                        if (hs.getLop_145().equalsIgnoreCase("10A1")) {
                            hs.hienThi();
                            co = true;
                        }
                    }
                    if (!co) {
                        System.out.println("Khong co hoc sinh lop 10A1.");
                    }
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);

        sc.close();
    }
}
