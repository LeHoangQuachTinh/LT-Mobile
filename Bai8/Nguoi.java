package Bai8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected  String hoTen_145;
    protected   LocalDate ngaySinh_145;  // có thể dùng String cho đơn giản
    protected  String queQuan_145;

    public Nguoi(){

    }
    public Nguoi(String hoTen_145,LocalDate ngaySinh_145,String queQuan_145){
        this.hoTen_145 = hoTen_145;
        this.ngaySinh_145=ngaySinh_145;
        this.queQuan_145=queQuan_145;
    }
    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen_145 = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String strdate = sc.nextLine();
        ngaySinh_145 = strToLocalDate(strdate);
        System.out.print("Nhap que quan: ");
        queQuan_145 = sc.nextLine();
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
        System.out.println("Ho ten: " + hoTen_145 + ", Ngay sinh: " + ngaySinh_145 + ", Que quan: " + queQuan_145);
    }

    // getter
    public String getHoTen_145() {
        return hoTen_145;
    }
}
