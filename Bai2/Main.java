import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        QLCB ql = new QLCB();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm cán bộ mới");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị tất cả cán bộ");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    ql.nhapCanBo(sc);
                    break;
                case 2:
                    System.out.print("Nhập họ tên cần tìm: ");
                    String ten = sc.nextLine();
                    ql.timKiemTheoTen(ten);
                    break;
                case 3:
                    ql.hienThiTatCa();
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (chon != 0);

        sc.close();
    }
}
