import java.util.Scanner;

public class LoopPractice {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LoopPractice loopPractice = new LoopPractice();
//        loopPractice.practice1();
//        loopPractice.practice2();
//        loopPractice.practice3();
//        loopPractice.practice4();
//        loopPractice.practice5();
        loopPractice.practice6();
//        loopPractice.practice7();
//        loopPractice.practice8();
//        loopPractice.practice9();


    }

    public void practice1() {
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int number = Integer.parseInt(sc.nextLine());
        if ( number > 0 ) {
            for (int i = 1; i <= number; i++) {
                System.out.print(i + " ");
            }
        }else {
            System.out.println("1이상의 숫자를 입력해주세요.");
        }
    }
    public void practice2() {
        System.out.print("\n1이상의 숫자를 입력하세요 : ");
        int number = Integer.parseInt(sc.nextLine());
        if ( number > 0 ) {
            while (number > 0) {
                System.out.print(number-- + " ");
            }
        }else {
            System.out.println("1이상의 숫자를 입력해주세요 :");
        }
    }

    public void practice3() {
        System.out.print("\n정수를 하나 입력하세요 : ");
        int number = Integer.parseInt(sc.nextLine());
        if ( number > 0 ) {
            int fac = 0;
            for (int i = 0; i < number; i++) {
                System.out.print(i + 1 + " + ");
                fac += i + 1;
            }
            System.out.println("\b\b= " + fac);
        } else {
            System.out.println("정수를 입력해주세요.");
        }
    }

    public void practice4() {
        System.out.print("첫 번째 숫자 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("두 번째 숫자 : ");
        int num2 = Integer.parseInt(sc.nextLine());

        if (num1 > 0 && num2 > 0) {
            if (num1 > num2) {
                int tmp = num1;
                num1 = num2;
                num2 = tmp;
            }
            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }

        }else {
            System.out.println("\n1 이상의 숫자를 입력해주세요");
        }
    }

    public void practice5() {
        System.out.print("\n숫자 : ");
        int number = Integer.parseInt(sc.nextLine());
        if ( number > 0 && number < 10 ) {
            System.out.println("\n===== " + number + "단 ===== ");
            for (int i = 1; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + number * i);
            }
        }else {
            System.out.println("1~9의 숫자중 하나를 입력해주세요");
        }
    }

    public void practice6() {
        System.out.print("숫자 : ");
        int number = Integer.parseInt(sc.nextLine());
        if (number > 9) {
            System.out.println("9 이하의 숫자만 입력해주세요.");
        } else {
            for (int i = number; i < 10; i++) {
                System.out.println("===== " + i + "단 ===== ");
                for (int j = 0; j < 9; j++) {
                    System.out.println(i + " * " + (j + 1) + " = " + i * (j + 1));
                }
            }
        }
    }
    public void practice7() {
        System.out.print("시작 숫자 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("\n공차 : ");
        int num2 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < 10; i++) {
            System.out.print(num1 + (i * num2) + " ");
        }
    }

    public void practice8() {
        System.out.print("\n정수 입력 : ");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void practice9() {
        System.out.print("\n정수 입력 : ");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number ; i++ ) {
            for (int j = number; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
