import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Mời bạn nhập vào cân nặng");
        weight = scanner.nextDouble();
        System.out.println("Mời bạn nhập vào chiều cao");
        height = scanner.nextDouble();
        bmi = weight/(height*height);
        if (bmi < 18.5) {
            System.out.println("Thiếu cân");
        }
        else if ( bmi < 25) {
            System.out.println("Bình thường");
        }
        else if ( bmi < 30) {
            System.out.println("Quá cân");
        }
        else {
            System.out.println("Béo phì");
        }
    }
}
