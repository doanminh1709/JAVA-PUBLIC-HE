package Bai2;

import java.util.Scanner;

public class RunMain {
    public static Scanner scanner = new Scanner(System.in);
    public static int n;
    public static boolean check = false;

    public static void main(String[] args) {
        int choose;
        Student[] students = new Student[1000];
        do {
            System.out.println("\t\t\tMENU");
            System.out.println("1.Nhap thong tin cua cac sinh vien");
            System.out.println("2.Hien thi cac thong tin sinh vien ra man hinh");
            System.out.println("3.Tim kiem thong tin sinh vien theo id va hien thi ra man hinh");
            System.out.println("4.Sua sinh vien co privince 'Thanh Hoa' thanh 'Hai Phong'");
            System.out.println("5.Xoa sinh vien theo id");
            System.out.println("6.Thoat chuong trinh");
            System.out.print(" Nhap vao lua chon cua ban : ");
            choose = scanner.nextInt();
            switch (choose) {

                case 1: {
                    input(students);
                    break;
                }

                case 2: {
                    output(students);
                    break;
                }
                case 3: {
                    searchStudentById(students);
                    break;
                }

                case 4: {
                    editByProvince(students);
                    break;
                }
                case 5: {
                    removeStudentById(students);
                    break;
                }
                case 6: {
                    System.out.println(" Cam on ban da su dung chuong trinh");
                    return;
                }
                default: {
                    System.out.println("Khong co chuc nang nay ");
                    break;
                }
            }
        } while (true);
    }

    //1.Ham nhap
    public static void input(Student[] students) {
        do {
            System.out.print(" Nhap vao so sinh vien : ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println(" Nhap so sinh vien > 0!");
            }
        } while (n < 0);
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(" Nhap thong tin sinh vien thu : " + (i + 1));
            students[i].input();
            check = true;
        }
    }

    //2. Ham xuat
    public static void output(Student[] students) {
        if (checkArrayEmpty()) {
            System.out.println("\t\t\t THONG TIN SINH VIEN");
            System.out.printf("%-10s %-10s %-10s", "Id student", "Name", "Age");
            System.out.printf("%-10s %-10s %-10s\n", "Id address", "District", "Province");
            for (int i = 0; i < n; i++) {
                students[i].output();
            }
        } else {
            System.out.println("Chua co sinh vien nao!");
        }
    }

    //3. Ham tim kiem sinh vien co id
    public static void searchStudentById(Student[] students) {
        if (checkArrayEmpty()) {
            boolean flag = false;
            int mark = 0;
            System.out.print(" Nhap id sinh vien muon tim : ");
            int id = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                if (students[i].getId() == id) {
                    mark = i;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(" Khong tim thay sinh vien co id " + id);
            } else {
                System.out.println("\t\t\t THONG TIN SINH VIEN");
                System.out.printf("%-10s %-10s %-10s", "Id student", "Name", "Age");
                System.out.printf("%-10s %-10s %-10s\n", "Id address", "District", "Province");
                students[mark].output();
            }
        } else {
            System.out.println("Chua co sinh vien nao!");
        }
    }

    //4.Ham sua sinh vien co province 'Thanh Hoa'
    public static void editByProvince(Student[] students) {
        if (checkArrayEmpty()) {
            for (int i = 0; i < n; i++) {
//            if(students[i].getAddress().getProvince().equals("Thanh Hoa"))
                if (students[i].getAddress().getProvince().compareTo("Thanh Hoa") == 0) {
                    students[i].getAddress().setProvince("Hai Phong");
                }
            }
            System.out.println(" Sau khi sua");
            output(students);
        } else {
            System.out.println("Chua co sinh vien nao!");
        }
    }

    //5.Ham xoa sinh vien theo id
    public static void removeStudentById(Student[] students) {
        boolean flag = false;
        System.out.print(" Nhap id sinh vien muon xoa : ");
        int id = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (id == students[i].getId()) {
                flag = true;
                for (int j = i; j < n - 1; j++) {
                    students[j] = students[j + 1];
                }
                i--;
                n--;
            }
        }
        if (!flag) {
            System.out.println(" Khong co sinh vien nao id nay ");
        } else {
            System.out.println("\n===> DANH SACH SINH VIEN SAU KHI XOA SV ID : "+id);
            output(students);
        }
    }

    //Ham check mang sinh vien
    public static boolean checkArrayEmpty() {
        return check;
    }

}
