import java.util.regex.Pattern;

public class btth {

    public static void main(String[] args) {

        // ====== DỮ LIỆU ĐẦU VÀO ======
        String bookId = "LIB-2024-S";
        String isbn = "0123456789";
        int publishYear = 2023;

        String rawTitle = " lập trình jaVa căn bản ";
        String rawAuthor = "nguyễn văn a";

        // ====== PHẦN 1: KIỂM TRA ĐỊNH DẠNG ======
        if (!isValidBookId(bookId)) {
            System.out.println("❌ Mã sách không hợp lệ");
            return;
        }

        if (!isValidISBN(isbn)) {
            System.out.println("❌ ISBN không hợp lệ");
            return;
        }

        if (!isValidPublishYear(publishYear)) {
            System.out.println("❌ Năm xuất bản không hợp lệ");
            return;
        }

        // ====== PHẦN 2: CHUẨN HÓA TIÊU ĐỀ & TÁC GIẢ ======
        String title = normalizeText(rawTitle);
        String author = normalizeText(rawAuthor);

        // ====== PHẦN 3: TẠO CHUỖI TRÍCH DẪN ======
        String citation = buildCitation(bookId, title, author, publishYear);

        // ====== IN KẾT QUẢ ======
        System.out.println("----- KẾT QUẢ BIÊN MỤC -----");
        System.out.println("Mã sách chuẩn: " + bookId);
        System.out.println("ISBN-10: " + isbn);
        System.out.println("Tên sách: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Năm XB: " + publishYear);
        System.out.println("Trích dẫn: " + citation);
    }

    // ================= REGEX VALIDATION =================

    static boolean isValidBookId(String bookId) {
        // LIB-xxxx-S
        // xxxx là đúng 4 chữ số → \\d{4}
        // ^ \$ → kiểm tra toàn chuỗi
        // \d{4} → đúng 4 chữ số
        // Không thừa, không thiếu ký tự
        String regex = "^LIB-\\d{4}-S$";
        return Pattern.matches(regex, bookId);
    }

    static boolean isValidISBN(String isbn) {
        // ISBN-10: chỉ gồm đúng 10 chữ số
        String regex = "^\\d{10}$";
        return Pattern.matches(regex, isbn);
    }

    static boolean isValidPublishYear(int year) {
        // Kiểm tra logic thay vì Regex vì có so sánh với năm hiện tại
        return year >= 1000 && year <= 2026;
    }

    // ================= CHUẨN HÓA CHUỖI =================

    static String normalizeText(String input) {

        // trim(): loại bỏ khoảng trắng dư đầu và cuối
        // split("\\s+"): tách theo 1 hoặc nhiều khoảng trắng liên tiếp
        String[] words = input.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            // Character.toUpperCase(): xử lý ký tự đầu tiên an toàn
            // substring(1).toLowerCase(): phần còn lại viết thường
            String formattedWord =
                    Character.toUpperCase(word.charAt(0)) +
                            word.substring(1).toLowerCase();

            result.append(formattedWord).append(" ");
        }

        return result.toString().trim();
    }

    // ================= STRINGBUILDER TRÍCH DẪN =================

    static String buildCitation(String bookId, String title, String author, int year) {

        StringBuilder sb = new StringBuilder();

        sb.append("[")
                .append(bookId)
                .append("] - ")
                .append(title)
                .append(" - ")
                .append(author)
                .append(" (")
                .append(year)
                .append(")");

        return sb.toString();
    }
}
