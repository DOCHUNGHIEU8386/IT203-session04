public class Bai4_KiemTraMaTheThuVien {

    public static void main(String[] args) {

        // Mã thẻ thư viện cần kiểm tra
        String cardID = "TV202312345";

        if (isValidCard(cardID)) {
            System.out.println("Ma the hop le!");
        }
    }

    
    public static boolean isValidCard(String cardID) {

        // Kiểm tra 2 chữ cái đầu (tiền tố)
        if (!cardID.matches("^[A-Z]{2}.*")) {
            System.out.println("Thieu hoac sai tien to (phai la 2 chu in hoa)");
            return false;
        }

        // Kiểm tra 4 chữ số năm vào học
        if (!cardID.matches("^[A-Z]{2
