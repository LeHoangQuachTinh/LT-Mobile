import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuyenSinh ql = new TuyenSinh();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập thí sinh mới");
            System.out.println("2. Hiển thị tất cả thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    ql.nhapThiSinh(sc);
                    break;
                case 2:
                    ql.hienThiTatCa();
                    break;
                case 3:
                    System.out.print("Nhập SBD cần tìm: ");
                    String sbd = sc.nextLine();
                    ql.timKiemTheoSBD(sbd);
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
