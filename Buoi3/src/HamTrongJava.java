import java.util.Scanner;

public class HamTrongJava {

    public static Scanner scanner = new Scanner(System.in);

    /*cú pháp hàm : modifier returnType
                nameOfMethod(Parameter List){
                    //method body
                }

                modifiers : phạm vi sửa đổi và truy cập
                return Type : kiểu dữ liẹu trả về
                nameOfmethod : tên của hàm (method)
                Parameter là các tham số đầu vào của hàm ( có thể có 1 hoặc nhiều tham số với kiểu dữ liệu khác nhau )

                //Ví dụ :Hàm tính tổng 2 số 2 và b
                public static int Tong(int a , int b){
                    int c = a+b;
                    return c;
                 }
               Giải thích cú pháp hàm :
               - Từ khóa public : Bất cú 1 method hay một phương thức nào có từ khóa public đứngtrước nó thì sẽ được
               truy cập bất cứ nơi đâu . Nghĩa là nếu như bạn đang ở một class , một package kác , thì bạn đều có thể
               gọi đến nó
               -Từ khóa static : cho phép rằng biến hay phương thức chỉ được khởi tạo lúc tải class , chúng ta chỉ
               cần gọi phương thức cú không phải khơi tạo class chứa nó . Trong java core ta chỉ cần code trong class Main
               nếu chúng ta bỏ từ khóa static thì chúng ta phải khởi tạo class Main rồi mới gọi được đến hàm

               vd :  public int Tong(int a , int b){
                    int c = a+b;
                    return c;
                 }
                 muốn gọi được nó trong main
               public static void main(String[] args) {

                HamTrongJava x = new HamTrongJava();
               int c =  x.Tong(2 , 3);

               }

      */


    public static void main(String[] args) {

        System.out.print(" Nhap vao so phan tu cua mang : ") ;
        int n = scanner.nextInt();
        int a[] = new int[n];
        Nhap(a , n);
        System.out.println(" Truoc khi sap xep ");
        Xuat(a);

        System.out.println("\n Sau khi xoa ");
        a = Insert(a , 2 , 1);
        //vi tri = chi so + 1
        a = Delete(a, 3);
//        Xuat(a);
        System.out.println("\n Sau khi sap xep ");
        Sort(a);
        Xuat(a);

    }
    public static void Nhap(int a[] , int n){
        for (int i = 0 ; i < n ; i++){
            System.out.printf(" A[%d] = " , i);
            a[i] = scanner.nextInt();
        }
    }
    public static void Xuat(int a[]){
        //C1 : sử dụng for bình thường
        for (int i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
        //C2 : sử dụng foreach
        for (int item:
             a) {
            System.out.print(item + " ");
        }
    }
    public static int[] Insert(int a[] , int value , int pos){
        int newArr[] = new int[a.length + 1];

        // A : 1 2 3 4 5
        // chen vao vi tri thu 2 voi gia tri bang 0
//         1 2 0  3 4 5
//         pos = 2 , value = 0;
//Chen vao vi tri
        for (int i = 0 ; i < pos - 1 ; i++){
            newArr[i] = a[i];
        }
        newArr[pos-1] = value;
        for(int i = pos ; i <= a.length ;i++){
            newArr[i] = a[i-1];
        }
// Chen vao chi so
        for (int i = 0 ; i < pos ; i++){
            newArr[i] = a[i];
        }
        newArr[pos] = value;
        for(int i = pos+1 ; i <= a.length ;i++){
            newArr[i] = a[i-1];
        }
        return newArr;
    }
    public static int[] Delete(int []a , int pos){
        int newArr[] = new int[a.length - 1];
        for (int i = 0 ; i < pos - 1 ; i++){
            newArr[i] = a[i];
        }
        //1 2 3 4 5
        //1 2 4
        for (int i = pos ; i < a.length ; i++){
            newArr[i-1] = a[i];
        }
        return newArr;
    }

    public static void Sort(int a[]){
        int temp;
        for (int i = 0 ; i < a.length - 1 ; i++){
            for (int j = i+1 ; j < a.length ; j++){
                if(a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
