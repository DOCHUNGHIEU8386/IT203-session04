import java.util.Scanner;

public class b5 {
    static int deleteBook(int[] arr, int n, int bookId){
        int index = -1;

        for(int i = 0 ; i < n ; i++){
            if(arr[i] == bookId){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("Khong tim thay sach can xoa");
            return n;
        }

        for(int i = index ; i < n - 1 ; i++){
            arr[i] = arr[i+1];
        }

        n--;
        System.out.println("Da xoa ma sach: " + bookId);
        return n;
    }

    static void displayBooks(int[] arr , int n){
        if(n == 0){
            System.out.println("Danh sach rong");
            return;
        }
        System.out.print("[");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101 , 102 , 103 , 104 , 105};
        int n = books.length;

        while(n > 0){
            System.out.print("Kho sach hien tai (" + n + ") cuon : ");
            displayBooks(books , n);

            System.out.print("Nhap ma sach can xoa (0 de thoat) :");
            int bookId = sc.nextInt();

            if(bookId == 0){
                System.out.println("Thoat chuong trinh");
                break;
            }

            n = deleteBook(books , n , bookId);
        }

        if(n == 0){
            System.out.println("Da xoa tat ca ma sach");
        }
    }
}
