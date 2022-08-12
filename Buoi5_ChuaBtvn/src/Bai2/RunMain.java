package Bai2;

import java.util.Scanner;

public class RunMain {
    public static Scanner scanner = new Scanner(System.in);
    public static int n;
    public static boolean check = false;

    public static void main(String[] args) {
        int choose;
        do {
            System.out.print(" Nhap vao so sinh vien : ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println(" Nhap so sinh vien > 0!");
            }
        } while (n < 0);
        Student students[] = new Student[10];

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
                    //Chi nhap duy nhat 1 lan
                    input(students);
                    break;
                }

                case 2: {
                    if (checkArrayEmpty()) {
                        output(students);
                    } else {
                        System.out.println("Chua co sinh vien nao!");
                    }
                    break;
                }
                case 3: {
                    if (checkArrayEmpty()) {
                        searchStudentById(students);
                    } else {
                        System.out.println("Chua co sinh vien nao!");
                    }
                    break;
                }

                case 4: {
                    if (checkArrayEmpty()) {
                        editByProvince(students);
                    } else {
                        System.out.println("Chua co sinh vien nao!");
                    }
                    break;
                }
                case 5: {
                    if (checkArrayEmpty()) {
                        removeStudentById(students);
                    } else {
                        System.out.println("Chua co sinh vien nao!");
                    }
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
        System.out.println("\t\t\t THONG TIN SINH VIEN");
        System.out.printf("%-10s %-10s %-10s", "Id student", "Name", "Age");
        System.out.printf("%-10s %-10s %-10s\n", "Id address", "District", "Province");
        for (int i = 0; i < n; i++) {
            students[i].output();
        }
    }

    //3. Ham tim kiem sinh vien co id
    public static void searchStudentById(Student[] students) {
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
    }

    //4.Ham sua sinh vien co province 'Thanh Hoa'
    public static void editByProvince(Student[] students) {
        for (int i = 0; i < n; i++) {
//            if(students[i].getAddress().getProvince().equals("Thanh Hoa"))
            if (students[i].getAddress().getProvince().compareTo("Thanh Hoa") == 0) {
                students[i].getAddress().setProvince("Hai Phong");
            }
        }
        System.out.println(" Sau khi sua");
        output(students);
    }

    //5.Ham xoa sinh vien theo id
    public static void removeStudentById(Student[] students) {
        boolean flag = false;
        System.out.print(" Nhap id sinh vien muon xoa : ");
        int id = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (id == students[i].getId()) {
                flag = true;
                for (int j = i + 1; j < n; j++) {
                    students[i] = students[i + 1];
                }
                i--;
                n--;
            }
        }
        if (!flag) {
            System.out.println(" Khong co sinh vien nao id nay ");
        } else {
            output(students);
        }
    }

    //Ham check mang sinh vien
    public static boolean checkArrayEmpty() {
        if (!check) return false;
        else return true;
    }

}
