import java.time.LocalDate;

public class Bai3_SoSanhStringVaStringBuilder {
    public static void main(String[] args) {

        // Danh sách giao dịch mượn sách
        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        long startSB = System.currentTimeMillis(); // Bắt đầu đo thời gian

        StringBuilder reportBuilder = new StringBuilder();

        reportBuilder.append("--- BAO CAO MUON SACH ---\n");
        reportBuilder.append("Ngay tao: ")
                     .append(LocalDate.now())
                     .append("\n");

        for (String t : transactions) {
            reportBuilder.append("Giao dich: ")
                         .append(t)
                         .append("\n");
            // append() thay đổi trực tiếp trên cùng object
        }

        long endSB = System.currentTimeMillis(); // Kết thúc đo thời gian

        long startStr = System.currentTimeMillis();

        String reportString = "";

        for (String t : transactions) {
            reportString += "Giao dich: " + t + "\n";
            // Mỗi lần + tạo ra một object String mới (String immutable)
        }

        long endStr = System.currentTimeMillis();

        System.out.println(reportBuilder.toString());

        System.out.println("Thoi gian StringBuilder: " + (endSB - startSB) + " ms");
        System.out.println("Thoi gian String: " + (endStr - startStr) + " ms");
    }
}
