package Bai9;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

class SinhVien {
    private String hoTen_145;
    private String maSV_145;
    private LocalDate ngaySinh_145;
    private String lop_145;

    public void nhap(Scanner sc) {
        sc.nextLine(); // clear buffer
        System.out.print("Nhap ho ten: ");
        hoTen_145 = sc.nextLine();
        System.out.print("Nhap ma SV: ");
        maSV_145 = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String strDate = sc.nextLine();
        ngaySinh_145 = strToLocalDate(strDate);
        System.out.print("Nhap lop_145: ");
        lop_145 = sc.nextLine();
    }
    private LocalDate strToLocalDate(String strDate){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = sdf.parse(strDate);
            return date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public void hienThi() {
        System.out.printf("Ho ten: %s, MaSV_145: %s, Ngay sinh: %s, Lop_145: %s\n",
                hoTen_145, maSV_145, ngaySinh_145, lop_145);
    }

    public String getHoTen_145() {
        return hoTen_145;
    }
}

