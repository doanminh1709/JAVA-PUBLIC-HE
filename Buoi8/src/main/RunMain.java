package main;

import model.GiaoVien;
import model.Person;
import model.SinhVien;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        /* mình sử dụng kiểu dữ liệu của thằng cha
          trỏ đến đối tượng của thằng con
        nó luôn gọi đến cái phương thức sau từ khóa
        */
        Person sv = new SinhVien();
        Person gv = new GiaoVien();
        sv.ngu();
        gv.ngu();

      /*
        Ép kiểu : mục đích để gọi đến nhưng phương thức riêng của thằng con
         ta thường ép kiểu từ thằng cha xuống thằng con để gọi nhưng phương thức của con
         Ép kiểu từ con lên cha cũng được nhưng không cần thiết vì thằng con đã luôn truy
         cập được các phương thức của thằng cha
         có 2 kiểu cách ép kiểu 1 ép kiểu trực tiếp , 2 ép kiểu gián tiếp
      */
        //TRƯỚC KHI ÉP KIỂU
       // b.hocBai(); ERROR

        //SAU KHI ÉP KIỂU
        //C1 : ÉP KIỂU GIÁN TIẾP
        SinhVien b = (SinhVien)sv;
        b.hocBai();//Oke

        //C2 : ÉP KIỂU TRỰC TIẾP
        ((SinhVien)sv).hocBai();//OKE


        //toan tu instance of : sử dụng để kiểm tra xem một đối tượng có phải là thể hiện của một
        //kiểu dữ liệu cụ thể hay không ( lớp cha, lớp con ) toán tử này sẽ trả về true nếu đúng và
        // false nếu sai
        System.out.println(gv instanceof Person );//trả về true vì đây là một thể hiển của GiaoVien
        System.out.println(sv instanceof Person );//trả về true vì đây là một thể hiển của SinhVien


        //GỌI ĐẾN PHƯƠNG THỨC TRONG INTERFACE
        GiaoVien a = new GiaoVien();
        a.choi();
        a.nauNuong();
        a.test();

        //ÁP DỤNG TÍNH ĐA HÌNH ĐỂ NHẬP XUẤT DỮ LIỆU MÀ KHÔNG CẦN PHẢI TẠO NHIỀU HÀM NHẬP XUẤT
        GiaoVien giaoVien = new GiaoVien();
        System.out.println(" Nhap thong tin cua giao vien");
        input(giaoVien);
        System.out.println(" Xuat thong tin cua giao vien");
        output(giaoVien);


        SinhVien sinhVien = new SinhVien();
        System.out.println(" Nhap thong tin cua sinh vien");
        input(sinhVien);

    }

    public static void input(Person p) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap tuoi ");
        p.setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.println(" Nhap ten : ");
        p.setName(sc.nextLine());

        if (p instanceof SinhVien) {
            System.out.println(" Nhap ma sv : ");
            ((SinhVien) p).setMasv(sc.nextLine());
            System.out.println(" Nhap ten khoa : ");
            ((SinhVien) p).setKhoa(sc.nextLine());
        } else if (p instanceof GiaoVien) {
            System.out.println(" Nhap ten mon day : ");
            ((GiaoVien) p).setDayMon(sc.nextLine());
            System.out.println(" Nhap nam kn : ");
            ((GiaoVien) p).setNamKn(sc.nextInt());
        }
    }

    public static void output(Person p) {
        System.out.println(" Tuoi " + p.getTuoi());
        System.out.println(" Ten " + p.getName());
        if (p instanceof SinhVien) {
            System.out.println(" Ma sv : " + ((SinhVien) p).getMasv());
            System.out.println(" Ten khoa : " + ((SinhVien) p).getKhoa());
        }
        if (p instanceof GiaoVien) {
            System.out.println(" Ten mon day : " + ((GiaoVien) p).getDayMon());
            System.out.println(" Nam kinh nghiem: " + ((GiaoVien) p).getNamKn());
        }
    }
}

