import java.util.Scanner;

public class b1 {

    static int[] addBookToLibraries(int n){
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];

        System.out.println("Nhap ma sach cho " + n + " cuon sach");
        for(int i = 0 ; i < n ; i++){
            System.out.print("Sach thu " + (i + 1) + " :");
            books[i] = sc.nextInt();
        }

        return books;
    }

    static void displayLibraries(int[] arr){
        System.out.println("--- Ket Qua ---");
        System.out.print("Danh sach ma : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sach can quan ly : ");
        int n = sc.nextInt();

        int[] libarary = addBookToLibraries(n);
        displayLibraries(libarary);
    }
}
