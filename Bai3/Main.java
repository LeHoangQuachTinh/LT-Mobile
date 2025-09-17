import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySach ql_145 = new QuanLySach();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập tài liệu");
            System.out.println("2. Tìm kiếm theo mã");
            System.out.println("3. Tìm kiếm theo loại (sach/bao/tapchi)");
            System.out.println("4. Hiển thị tất cả");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    ql_145.nhapTaiLieu(sc);
                    break;
                case 2:
                    System.out.print("Nhập mã cần tìm: ");
                    String ma = sc.nextLine();
                    ql_145.timKiemTheoMa(ma);
                    break;
                case 3:
                    System.out.print("Nhập loại cần tìm (sach/bao/tapchi): ");
                    String loai = sc.nextLine();
                    ql_145.timKiemTheoLoai(loai);
                    break;
                case 4:
                    ql_145.hienThiTatCa();
                    break;
                case 0:
                    System.out.println("Kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);

        sc.close();
    }
}
