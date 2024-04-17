import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();
        
        if (checkNumber(number)) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }
        
        scanner.close();
    }
    
    // Phương thức kiểm tra số chẵn/lẻ
    public static boolean checkNumber(int number) {
        boolean isEven = false;
        
        if (number % 2 == 0) {
            isEven = true;
        }
        
        return isEven;
    }
}
