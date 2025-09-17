package Bai6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class KhachSan {
    private List<KhachTro> dsKhachTro_145;

    public KhachSan() {
        dsKhachTro_145 = new ArrayList<>();
    }

    public void nhapDanhSach(Scanner sc) {
  
        System.out.print("Nhập số khách:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin khách trọ thứ " + (i + 1));
            KhachTro kt = new KhachTro();
            kt.nhapThongTin(sc);
            dsKhachTro_145.add(kt);
        }
    }

    public void hienThiDanhSach() {
        System.out.println("===== Danh sách khách trọ =====");
        for (KhachTro kt : dsKhachTro_145) {
            kt.hienThiThongTin();
            System.out.println("-------------------");
        }
    }

    public void xoaKhachTro(String cmnd) {
        Iterator<KhachTro> it = dsKhachTro_145.iterator();
        while (it.hasNext()) {
            KhachTro kt = it.next();
            if (kt.getCmnd().equals(cmnd)) {
                it.remove();
                System.out.println("Đã xóa khách trọ có CMND: " + cmnd);
                return;
            }
        }
        System.out.println("Không tìm thấy khách trọ có CMND: " + cmnd);
    }

    public void tinhTienTraPhong(String cmnd) {
        for (KhachTro kt : dsKhachTro_145) {
            if (kt.getCmnd().equals(cmnd)) {
                System.out.printf("Khách hàng %s cần trả: %.2f VND\n",
                                  kt.getCmnd(), kt.tinhTien());
                return;
            }
        }
        System.out.println("Không tìm thấy khách trọ có CMND: " + cmnd);
    }
}