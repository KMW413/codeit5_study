import java.util.Scanner;

public class VariablePractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("가로 : ");
        double width = sc.nextDouble();
        System.out.print("세로 : ");
        double height = sc.nextDouble();

        double area = width * height;
        double circumference = 2 * (width + height);

        System.out.print("면적 : " + area);
        System.out.print("둘레 : " + circumference);
    }
}
