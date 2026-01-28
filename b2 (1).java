import java.util.Scanner;

public class b2 {
    static int searchBooks(String[] arr , String search){
        for(int i  = 0 ; i < arr.length ; i++){
            if(arr[i].equalsIgnoreCase(search)){
                // dùng equalsIgnoreCase để so sách chuỗi , equal thì tham số vào là object , == không được dùng để so sánh cho string
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] books = {"Lap trinh Java", "Co so du lieu", "Cau truc du lieu", "Lap trinh Web", "Mang may tinh"};

        System.out.print("Nhap ten sach can tim :");
        String search = sc.nextLine();

        int index = searchBooks(books , search);

        if(index != -1){
            System.out.println("Tim thay sach " + search + " tai vi tri so : " + index);
        }else{
            System.out.println("Sach khong ton tai trong thu vien");
        }
    }
}
