package model;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    private int maSv;
    private String tenKhoa;
    private int khoaHoc;
    private LopHoc lopHoc = new LopHoc();
    private static  int temp = 1;
    public SinhVien(){
        maSv = temp++;
    }

    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap ten khoa : ");
        tenKhoa = sc.nextLine();

        System.out.println(" Nhap khoa hoc : ");
        khoaHoc = sc.nextInt();
        sc.nextLine();
        lopHoc.input();
    }
    public void output(){
        super.output();
        System.out.printf("%-10d %-10s %-10d" , maSv , tenKhoa , khoaHoc);
        lopHoc.output();
    }

    public int getMaSv() {
        return maSv;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public LopHoc getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(LopHoc lopHoc) {
        this.lopHoc = lopHoc;
    }
}
