import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        LoopPractice l = new LoopPractice();
//        l.practice1();
//        l.practice2();
//        l.practice3();
//        l.practice4();
//        l.practice5();
//        l.practice6();
//        l.practice7();
        l.practice8();
        l.practice9();


    }

    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = Integer.parseInt(sc.nextLine());
        if (num > 0) {
            for (int i = 0; i <= num; i++) {
                System.out.print(i + " ");
            }
        }else {
            System.out.println("1 이상의 숫자를 입력해주세요.");
        }
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = Integer.parseInt(sc.nextLine());
        if (num > 0) {
            for (int i = num; i > 0; i--) {
                System.out.print(i + " ");
            }
        }else {
            System.out.println("1 이상의 숫자를 입력해주세요.");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int num = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
            System.out.print(i + " + " );
        }
        System.out.print("\b\b= " + sum);
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 :");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("두 번째 숫자 : ");
        int num2 = Integer.parseInt(sc.nextLine());

        if (num1 > 0  && num2 > 0) {
            int count = 0;
            if (num2 > num1) {
                count = num1;
                num1 = num2;
                num2 = count;
            }
            for (int i = num2 ; i <= num1; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 : ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("==== " + num + "단 ====");
        for (int i = 0; i < 9; i++) {
            System.out.println(num + " * " + (i + 1) + " = " + num * (i + 1));
        }
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 : ");
        int num = Integer.parseInt(sc.nextLine());

        if (num > 9) {
            System.out.println("9 이하의 숫자만 입력해주세요");
        }else {
            for (int i = num; i < 9; i++) {
                System.out.println("==== " + i + "단 ====");
                for (int j = 0; j < 9; j++) {
                    System.out.println(i + " * " + (j + 1) + " = " + (i * (j + 1)));
                }
            }
        }
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("시작 숫자 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("공차 : ");
        int num2 = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < 10; i++) {
            System.out.print( num1 + (num2 * i) + " ");
        }
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 :");
        int num = Integer.parseInt(sc.nextLine());
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
