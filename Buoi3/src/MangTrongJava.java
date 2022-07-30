import java.util.Scanner;

public class MangTrongJava {

    public static void main(StringTrongJava[] args) {

        Scanner scanner = new Scanner(System.in);

        // C1 : khởi tạo mảng nặc danh
        int []b = {1 , 2 , 3 , 4 , 5};
        // C2 : Khởi tạo mảng bằng vòng lặp
        int c[] = new int[4];
        for(int i = 0 ; i < 4 ; i++){
            c[i] = i;
        }

        //
        int n;
        System.out.print(" Nhap vao so phan tu cua mang : ");
        n = scanner.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.printf("arr[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
    }
}
