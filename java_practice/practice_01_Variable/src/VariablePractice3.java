import java.util.Scanner;

public class VariablePractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("가로 : ");
        int width = Integer.parseInt(sc.nextLine());

        System.out.println("세로 : ");
        int height = Integer.parseInt(sc.nextLine());

        int area = width * height;
        int circumference = 2 * (width + height);

        System.out.println("면적 : " + area);
        System.out.println("둘레 : " + circumference);
    }
}
