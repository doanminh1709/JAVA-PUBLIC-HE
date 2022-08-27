package main;

import model.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    private static ArrayList<SinhVien> listSv = new ArrayList<>();

    public static void main(String[] args) {
        int chose;
        do {
            System.out.println("\t\tMENU");
            System.out.println("1.Nhap thong tin 1 nv"
                    + "\n2.Hien thi thong tin nv"
                    + "\n3.Xoa thong tin nv theo ma nv"
                    + "\n4.Sua ten khoa sv QTKD thanh CNTT"
                    + "\n5.Sap xep danh sach sinh vien chieu tang dan khoa hoc"
                    + "\n6.Sap xep sv theo chieu giam dan ten sv"
                    + "\n7.Thoat chuong trinh");
            System.out.print(" Nhap lua chon cua ban :");
            chose = new Scanner(System.in).nextInt();
            switch (chose) {
                case 1: {
                    add();
                    break;
                }
                case 2: {
                    showListSv();
                    break;
                }
                case 3: {
                    remove();
                    break;
                }
                case 4: {
                    edit();
                    break;
                }
                case 5: {
                    sortByLevel();
                    break;
                }
                case 6: {
                    sortByName();
                    break;
                }
                case 7: {
                    exist();
                    break;
                }
            }
        } while (true);

    }

    public static void add() {
        SinhVien sinhVien = new SinhVien();
        sinhVien.input();
        listSv.add(sinhVien);
    }

    public static void showListSv() {
        title();
        for (SinhVien sv : listSv) {
            sv.output();
        }
    }

    public static void remove() {

        if (listSv.size() <= 0) {
            System.out.println(" Chua co sinh vien nao trong list");
        } else {
            boolean check = false;
            System.out.println(" Nhap vao id sv muon xoa : ");
            int msv = new Scanner(System.in).nextInt();
            for (int i = 0; i < listSv.size(); i++) {
                if (listSv.get(i).getMaSv() == msv) {
                    listSv.remove(i);
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("Danh sach sv sau khi xoa");
                showListSv();
            } else
                System.out.println("Khong ton tai msv nay");
        }
    }

    public static void edit() {
        boolean check = false;
        if (listSv.size() <= 0) {
            System.out.println(" Chua co sinh vien nao trong list");
        } else {
            for (int i = 0; i < listSv.size(); i++) {
                if (listSv.get(i).getTenKhoa().compareTo("QTKD") == 0) {
                    listSv.get(i).setTenKhoa("CNTT");
                    check = true;
                }
            }
        }
        if (check)
            showListSv();
        else
            System.out.println("Khong co sv nao khoa QTKD");

    }

    public static void sortByLevel() {
        for (int i = 0; i < listSv.size() - 1; i++) {
            for (int j = i + 1; j < listSv.size(); j++) {
                if (listSv.get(i).getKhoaHoc() > listSv.get(j).getKhoaHoc()) {
                    SinhVien temp = listSv.get(i);
                    listSv.set(i, listSv.get(j));
                    listSv.set(j, temp);
                }
            }
        }
        showListSv();
    }

    public static void sortByName() {
        for (int i = 0; i < listSv.size() - 1; i++) {
            for (int j = i + 1; j < listSv.size(); j++) {
                if (listSv.get(i).getHoTen().compareTo(listSv.get(j).getHoTen()) < 0) {
                    SinhVien temp = listSv.get(i);
                    listSv.set(i, listSv.get(j));
                    listSv.set(j, temp);
                }
            }
        }
        showListSv();
    }

    public static void exist() {
        System.out.println(" Cam on ban da su dung chuong trinh ");
        System.exit(0);
    }

    public static void title() {
        System.out.printf("%-10s %-10s %-10s", "HoTen", "Tuoi", "QueQuan");
        System.out.printf("%-10s %-10s %-10s", "MaSv", "TenKhoa", "KhoaHoc");
        System.out.printf("%-10s %-10s\n", "MaLop", "TenLop");
    }
}
