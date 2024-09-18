package com.test.basic.chapter2;
import java.util.Scanner;
/**
 * Created by beigui on 2016/1/28.
 * 作业：
 *  请编写一个程序，接收用户输入的三个数，判断是否可以组成三角形（两条边相加大于第三条边）。
 */
public class Homework_operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三角的三边：");

        double a = getValueSum(scanner);
        double b = getValueSum(scanner);
        double c = getValueSum(scanner);

        if(a + b < c || a + c < b || b + c < a){
            throw new RuntimeException("请输入符合规则的数字");
        }else{
            System.out.println("可以做三角形");
        }
        scanner.close();
    }
    public static double getValueSum(Scanner scanner){
        while (!scanner.hasNextDouble()){
            scanner.next();
//            throw new RuntimeException("请输入数字");
            System.out.println("请输入数字：");
        }
        return scanner.nextDouble();
    }
}
