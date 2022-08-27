package model;

import inteface.PersonInterface;
import inteface.TestIntaece;

public class SinhVien extends Person implements PersonInterface , TestIntaece {

    private String masv;
    private String khoa;

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }


    @Override
    public void ngu(){
        System.out.println("sinh vien dang ngu");
    }

    public void hocBai(){
        System.out.println("Dang hoc bai ");
    }

    @Override
    public void choi() {
        System.out.println("Sv dang choi ");
    }

    @Override
    public void nauNuong() {
        System.out.println(" Sv dang nau nuong ");
    }

    @Override
    public void test() {
        System.out.println(" Test nhap sinh vien");
    }
}
