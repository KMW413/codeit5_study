import java.util.Scanner;

// cheating

public class CastingPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자 : ");
        char a = sc.next().charAt(0);

        System.out.println(a + " unicode : " + (int)a);
    }
}
