public class NapChongPhuongThuc {
    //overloading
    public static void tong(int a) {
        System.out.println(a);
    }

    //Cách 1: số lương tham số mà mình truyền vào từng hàm thì nó phải khác nhau
    //Cách 2 : Kiểu dữ liệu truyền vào thì nó phải khác nhau
    ///===> Cách 1
    public static void tong(int a, int b) {
        System.out.println(a + b);
    }

    public static void tong(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    ///===> Cách 2
    public static void hieu(int a, int b) {
        System.out.println(a - b);
    }

    public static void hieu(float a, float b) {
        System.out.println(a - b);
    }

    public static void hieu(int a, float b) {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        tong(2, 3);
        tong(2, 3, 4);
//        tong(2 );
        hieu(5, 2);
        hieu(6.3f, 2.2f);
        hieu(5, 2.1f);
    }


}
