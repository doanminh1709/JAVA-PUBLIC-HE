package Bai1;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String congViec;

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    public void input(){
        super.input();
        System.out.println(" Nhap cong viec ");
        congViec = new Scanner(System.in).nextLine();
    }
    public void output(){
        super.output();
        System.out.printf("%-10s\n" , congViec);
    }
}
