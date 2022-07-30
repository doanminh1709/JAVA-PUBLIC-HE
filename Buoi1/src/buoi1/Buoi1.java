package buoi1;

import java.util.Scanner;

public class Buoi1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
//        byte a = scanner.nextByte();
//        System.out.println("a = " + a);
        //Các kiểu dữ liệu basic trong java
        //kieu dữ liệu

        // 1.Kiểu logic
        //    boolean : có 2 giá trị true và false
        // 2.Kiểu dữ liệu số nguyên(Interger)
//                byte , short , int , long , char
//                //Khoảng dữ liệu của các kiểu giá trị
//                byte  : 8 bit :[-128 , 127];
//                short : 2 byte (16bit) [-32.768 32.767];
//                int : 4 byte(32bit) [-2,147,483,648 ,  2,147,483,647]
        //3.Kiểu dữ liệu số thực (real number)
        //      float , double

        //khai báo
//        float x = 4;
//
//             //double là kiểu dữ liệu mặc định cho số thực
//        double b = 2.5d;
//            //viêt ngắn gon là
//        double e = 2.5;

        //byte : 8 bit [-128 , 127]
        //boolean : true , false
//        Long m;
//        long h;
//        Boolean g = scanner.nextBoolean();
//        boolean k = scanner.nextBoolean();
//        float m;
        //short :
        //char
        //int
        //long
        //long
        //double
        //String
//        int n;
//        System.out.println(" Nhap n : ");
//        n = scanner.nextInt();
//
//        int tong=0;
//        if(n > 0){
//            tong+=n;
//        }else {
//            tong-=n;
//        }

        // ?:
//        tong =(n > 0) ? (tong+n) : (tong-n);
//        System.out.println("tong = " + tong);

        //while
//        int i=0;
//        do{
//            System.out.println(i);
//            i++;
//        }while ( i < 5);

//        int m;
//        do{
//            System.out.print(" Nhap m : ");
//            m = scanner.nextInt();
//        }while (m > 0);
//        do{
//
//        }while(dkien lap);
//        dieu kien lap : thường là 1 biểu thức quan hệ , trả về true hoặc false

        //nguyên lĩ hoạt động : thực hiện lệnh do while trước , sau đó mơi kiểm tra điều kiện,
        //nếu như mà điều kiện lặp mà đúng thì nó tiếp tụuc thực diẹn lệnh do while lần nữa , còn nếu như
        //mà điều kiện sai , thì nó sẽ kết thúc vòng lặp

        //còn lặp khi mà điều kiện còn đúng
        //System.out.println("Gia tri cua m : " + m);

//        int a = 1, b;
//        do {
//            b = 1;
//            do {
//                System.out.println(a + b);
//                b+=2;
//            } while (b < 20);
//            a++;
//        } while (a < 20);
        //chuyển kiểu mà độ chính xác không giảm
//        byte->short->int->long->float->double
        //chuyển kiểu mà độ chính xác bị giảm
        //double float long int short byte
//                float e = 3.2f;
//                double i = 2.3d;
//                i = 2.4
//        long a = 1000;
//        int b = (int)a;
//        System.out.println(b);
//        byte a = 1;
//        short b = 2;
//        int c = 10;
//        long d = 100L;
//        int sum = a+b+c+(int)d;
//        System.out.println(sum);
        int kt = 0;
        int sum = 0;
        do{
            if(kt % 3 == 0 && kt % 5 == 0){
                sum+=kt;
            }
            kt++;
        }while(kt < 100);
        System.out.println("Sum = " + sum);

        //printf format
        //dich sang ben trai 10 vi tri
        System.out.printf("%-10s %-10s %-10s\n" , "ho ten" ,"tuoi", "masv");
        System.out.printf("%-10s %-10d %-10s\n" , "minh" ,21, "1234");
        System.out.printf("%-10s %-10d %-10s\n" , "lam" ,20, "3456");
    }
    
}
