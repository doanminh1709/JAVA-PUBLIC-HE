package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    public static void main(String[] args) {
        ArrayList<NhanVien> listNv = new ArrayList<>();
        do {
            System.out.println("1.Them vao 1 list");
            System.out.println("2.Hien thi danh sach can bo");
            System.out.println("3.Xoa mot can bo theo id");
            System.out.println("4.Tim kiem 1 can bo theo id");
            System.out.println("5.Sap xep danh sach theo chieu tang danh cau nam sinh");
            System.out.println("6.Dung chuong trinh");
            System.out.println(" Nhap vao lua chon ");
            int chose = new Scanner(System.in).nextInt();

            switch (chose) {
                case 1: {
                    add(listNv);
                    break;
                }
                case 2: {
                    show(listNv);
                    break;
                }
                case 3: {
                    delete(listNv);
                    break;
                }
                case 4: {
                    search(listNv);
                    break;
                }
                case 5: {
                    sort(listNv);
                    break;
                }
                case 6: {
                    System.exit(0);
                    break;
                }
            }
        } while (true);
    }

    public static void add(ArrayList<NhanVien> listNv) {
        NhanVien nv = new NhanVien();
        nv.input();
        listNv.add(nv);
    }

    public static void show(ArrayList<NhanVien> listNv) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "id", "hoTen", "namSinh", "gioiTinh", "diaChi", "Cong viec");
        for (NhanVien nv : listNv) {
            nv.output();
        }
    }

    public static void delete(ArrayList<NhanVien> listNv) {
        System.out.println(" Nhap vao id muon xoa");
        int id = new Scanner(System.in).nextInt();
        for (int i = 0; i < listNv.size(); i++) {
            if (listNv.get(i).getId() == id) {
                listNv.remove(i);
                break;
            }
        }
    }

    public static void search(ArrayList<NhanVien> listNv) {
        System.out.println(" Nhap vao id muon tim kiem");
        int id = new Scanner(System.in).nextInt();
        for (int i = 0; i < listNv.size(); i++) {
            if (listNv.get(i).getId() == id) {
                listNv.get(i).output();
                break;
            }
        }
    }
    public static void sort(ArrayList<NhanVien> listNv) {
        for (int i = 0 ; i < listNv.size() - 1 ; i++){
            for (int j = i+1 ; j < listNv.size() ; j++){
                if (listNv.get(i).getNamSinh() > listNv.get(j).getNamSinh()){
                    NhanVien temp = listNv.get(i);
                    listNv.set(i , listNv.get(j));
                    listNv.set(j , temp);
                }
            }
        }
        show(listNv);
    }
}
