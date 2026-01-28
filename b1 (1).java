import java.util.Scanner;

public class Bai1_ChuanHoaThongTinSach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập tên sách
        System.out.print("Nhap vao ten sach: ");
        String bookName = sc.nextLine();

        // Nhập tên tác giả
        System.out.print("Nhap ten tac gia: ");
        String authorName = sc.nextLine();

        /*
         * Chuẩn hóa chuỗi:
         * - trim(): xóa khoảng trắng đầu và cuối
        bookName = bookName.trim().replaceAll("\\s+", " ");
        authorName = authorName.trim().replaceAll("\\s+", " ");

        // Chuyển tên sách thành chữ in hoa
        bookName = bookName.toUpperCase();

        //  viết hoa chữ cái đầu mỗi từ
        String[] words = authorName.split(" ");
        StringBuilder formattedAuthor = new StringBuilder();

        for (String word : words) {
            formattedAuthor.append(
                    Character.toUpperCase(word.charAt(0))
                            + word.substring(1).toLowerCase()
                            + " "
            );
        }

        authorName = formattedAuthor.toString().trim();

        System.out.println("[" + bookName + "] - Tac gia: " + authorName);
    }
}
