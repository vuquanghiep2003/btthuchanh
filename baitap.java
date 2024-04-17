public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        double average = calculateAverage(numbers);
        System.out.println("Trung bình của mảng là: " + average);
    }

    // Phương thức tính trung bình các phần tử trong mảng
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Mảng không hợp lệ");
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        return (double) sum / numbers.length;
    }
}
