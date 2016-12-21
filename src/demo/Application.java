package demo;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int num1;
        double num2;
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入一个整数");
        num1 = reader.nextInt();
        System.out.print("请输入一个数");
        num2 = reader.nextDouble();
        System.out.println(num1+"*"+ num2+"="+(num1*num2) );
    }
}
