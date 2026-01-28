import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai2_TimViTriLuuTruSach {
    public static void main(String[] args) {

        // Chuỗi mô tả thông tin sách
        String description = "Sach giao khoa Toan lop 12, Ke: A1-102, tinh trang moi";

        // Kiểm tra xem chuỗi có chứa thông tin kệ sách hay không
        if (description.contains("Ke:")) {

           
            Pattern pattern = Pattern.compile("Ke:\\s*([^,\\n]+)");
            Matcher matcher = pattern.matcher(description);

            // Nếu tìm thấy vị trí lưu trữ
            if (matcher.find()) {
                // group(1) là phần nội dung nằm trong dấu ngoặc ()
                String location = matcher.group(1).trim();
                System.out.println("Vi tri tim thay: " + location);
            }

            // Thay thế "Ke:" bằng nội dung đầy đủ hơn
            String newDescription = description.replace(
                    "Ke:", "Vi tri luu tru:"
            );

            System.out.println("Mo ta moi: " + newDescription);

        } else {
            System.out.println("Khong tim thay thong tin ke sach");
        }
    }
}
