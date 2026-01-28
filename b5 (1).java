import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai5_PhanTichNhatKyMuonTraSach {

    public static void main(String[] args) {

        // Danh sách nhật ký mượn / trả sách
        String[] logs = {
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345",
                "2024-05-21 | User: TranMinhB | Action: RETURN | BookID: BK67890",
                "2024-05-22 | User: NguyenVanA | Action: BORROW | BookID: BK99999"
        };

        int borrowCount = 0;
        int returnCount = 0;

        /*
         * Regex sử dụng Capturing Groups để tách dữ liệu:
         * Group 1: Ngày (YYYY-MM-DD)
         * Group 2: Tên người dùng
         * Group 3: Hành động (BORROW / RETURN)
         * Group 4: Mã sách
         */
        Pattern pattern = Pattern.compile(
                "(\\d{4}-\\d{2}-\\d{2})\\s*\\|\\s*" +
                "User:\\s*(\\w+)\\s*\\|\\s*" +
                "Action:\\s*(BORROW|RETURN)\\s*\\|\\s*" +
                "BookID:\\s*(\\w+)"
        );

        // Duyệt từng dòng log
        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);

            // Kiểm tra dòng log có đúng định dạng hay không
            if (matcher.find()) {

                String date = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookId = matcher.group(4);

                System.out.println("Ngay: " + date);
                System.out.println("Nguoi dung: " + user);
                System.out.println("Hanh dong: " + action);
                System.out.println("Ma sach: " + bookId);
                System.out.println("----------------------");

                // Thống kê số lượt mượn và trả
                if (action.equals("BORROW")) {
                    borrowCount++;
                } else {
                    returnCount++;
                }
            }
        }

        // In kết quả thống kê
        System.out.println("Tong so luot BORROW: " + borrowCount);
        System.out.println("Tong so luot RETURN: " + returnCount);
    }
}
