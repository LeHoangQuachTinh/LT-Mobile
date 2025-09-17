package Bai7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen_145;
    private Date ngaySinh_145; // dạng dd/MM/yyyy
    private String queQuan_145;

    public Nguoi(){

    }
    public Nguoi(String hoTen_145,Date ngaySinh_145,String queQuan_145){
        this.hoTen_145 = hoTen_145;
        this.ngaySinh_145 = ngaySinh_145;
        this.queQuan_145 = queQuan_145;
    }
    public void nhap(Scanner sc) {
        System.out.print("Nhap ho ten: ");
        hoTen_145 = sc.nextLine();
        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        String strdate = sc.nextLine();
        ngaySinh_145 = strToDate(strdate);
        System.out.print("Nhap que quan: ");
        queQuan_145 = sc.nextLine();
    }
    private Date strToDate(String strDate){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return (Date) sdf.parse(strDate);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new Date(0);
        }
    }

    public void hienThi() {
        System.out.println("Ho ten: " + hoTen_145 + ", Ngay sinh: " + ngaySinh_145.toString() + ", Que quan: " + queQuan_145);
    }

    public String getHoTen_145() {
        return hoTen_145;
    }

    public Date getNgaySinh_145() {
        return ngaySinh_145;
    }

    public String getQueQuan_145() {
        return queQuan_145;
    }
}
