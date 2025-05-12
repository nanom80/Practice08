package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하세요 (예: 3 + 4): ");

        int a = sc.nextInt();          // 첫 번째 피연산자
        String op = sc.next();         // 연산자
        int b = sc.nextInt();          // 두 번째 피연산자

        int result = 0;

        switch (op) {
            case "+":
                Add add = new Add();
                add.setValue(a, b);
                result = add.calculate();
                break;
            case "-":
                Sub sub = new Sub();
                sub.setValue(a, b);
                result = sub.calculate();
                break;
            case "*":
                Mul mul = new Mul();
                mul.setValue(a, b);
                result = mul.calculate();
                break;
            case "/":
                Div div = new Div();
                div.setValue(a, b);
                try {
                    result = div.calculate();
                } catch (ArithmeticException e) {
                    System.out.println("오류: " + e.getMessage());
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("지원하지 않는 연산자입니다.");
                sc.close();
                return;
        }

        System.out.println("결과: " + result);
        sc.close();
    	
    }
}
