import java.util.Scanner;

public class VariablePractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수 : ");
        int first = Integer.parseInt(sc.nextLine());

        System.out.println("두 번째 정수 : ");
        int second = Integer.parseInt(sc.nextLine());

        int add =  first + second;
        int minus = first - second;
        int multiply = first * second;
        int divide = first / second;

        System.out.println("더하기 결과 : " + add);
        System.out.println("빼기 결과 : " + minus);
        System.out.println("곱하기 결과 : " + multiply);
        System.out.println("나누기 결과 : " + divide);
    }

}
