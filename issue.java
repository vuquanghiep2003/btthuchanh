public class Main {

    public static void main(String[] args) {
        // Gọi hàm thực thi chương trình
        executeProgram(5);
    }

    // Hàm thực thi chương trình
    public static void executeProgram(int n) {
        // Sử dụng vòng lặp for để in các số từ 1 đến n
        for (int i = 1; i <= n; i++) {
            // Sử dụng lệnh rẽ nhánh để kiểm tra tính chẵn lẻ của số
            if (i % 2 == 0) {
                System.out.println(i + " là số chẵn");
            } else {
                System.out.println(i + " là số lẻ");
            }
        }
    }
}
