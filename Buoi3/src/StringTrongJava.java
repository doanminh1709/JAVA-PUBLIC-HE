import java.util.Locale;
import java.util.Scanner;

public class StringTrongJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Khai bao String
        //2 kieu khai bao
        //Cach 1
        String str = "Hello moi nguoi";
        //Cach 2
        String str2 = new String("Hello moi nguoi2");

        System.out.println("Str = " + str);
        System.out.println("Str2 = " + str2);

        //Nhap du lieu
        System.out.print(" Nhap vao chuoi a : ");
        String a = scanner.nextLine();
        System.out.println(" Chuoi a ="+ a);

//        System.out.println(a.length());//tra ve do dai thuc te cua mang
            a.length();//tra ve do dai thuc te cua mang

//     2.   a.charAt(1);
        System.out.printf("Vi tri thu 1 " + a.charAt(1));

// phuong thuc concat : nối 2 chuỗi lại với nhau
        str1.concat(str2);
        String str1 = "Hello ";
        String str2 = "Moi nguoi";

        str1 = str1.concat(str2);
        System.out.println(" Str1 = " + str1);

        //Substring(int index , int length)

        //public String substring(int startIndex): Phương thức này trả về đối tượng chuỗi
        // mới là chuỗi con của chuỗi đã cho tính từ startIndex đã nhập đến cuối cùng.

        //public String substring(int startIndex, int endIndex): Phương thức này trả
        // về đối tượng chuỗi mới là chuỗi con của chuỗi đã cho tính startIndex đến endIndex đã nhập.

        String s="hello";
        System.out.println(s.substring(0,2)); //he
        //Out put : he

        //Phương thức toLowerCase : Chuyển chuỗi thành chuỗi thường
        str = "HelLo";
        String vt = str.toLowerCase(Locale.ROOT);
        //vt = "hello";

        //Phương thức toUppderCase : Chuyển chuỗi thành chuỗi viết hoa
        String vt = str.toUpperCase(Locale.ROOT);
        System.out.println(vt);
        vt = "HELLO";

        //phương thức trim : loại bỏ khoảng trắng ở 2 đầu chuỗi và cuối chuôi
        String s1 = "  hello string   ";
        System.out.println(s1.trim());//"hello string"


    //So sánh 2 chuỗi : dựa trên bảng mã accssi
        String s1 = "c";
        String s2 = "b";
            System.out.println();
        int c = s1.compareTo(s2);
        if(c > 0){
            System.out.printf("s1 > s2");
        }else{
            System.out.println("s2 > s1");
        }
        String []str3 = {"nguoi" , "moi" , "hello" , "oi"};

        }

}
