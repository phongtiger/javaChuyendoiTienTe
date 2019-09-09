import java.util.Scanner;

public class moneyEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap vao ti gia dola vn ");
        double tigia = scanner.nextDouble();
        System.out.println("Nhap vao USD ");
        double usd = scanner.nextDouble();
        System.out.println("Sang tien VND la " + usd*tigia);
    }
}
