package model;

import java.util.Scanner;

public class LopHoc {
    private String maLop;
    private String tenLop;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap ma lop : ");
        maLop = sc.nextLine();
        System.out.println(" Nhap ten lop : ");
        tenLop = sc.nextLine();
    }
    public void output(){
        System.out.printf("%-10s %-10s\n" , maLop , tenLop);
    }
    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
}
