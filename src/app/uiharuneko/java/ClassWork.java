package app.uiharuneko.java;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("两位数计算器");
        boolean flag = true;
        do{
            mainWay();
            System.out.println("如果要继续计算，请按1");
            int redo = sc.nextInt();
            if(redo != 1 ){
                flag = false;
            }
        }while(flag);
    }
    public static void mainWay(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要执行的功能");
        System.out.println("1为相加，2为相减，3为相乘，4为相除，5为整数求余");
        int feature = sc.nextInt();
        System.out.println("请输入第一位数");
        double first = sc.nextDouble();
        System.out.println("请输入第二位数");
        double second = sc.nextDouble();
        double calc = 0;
        switch(feature) {
            case 1:
                calc = add(first, second);
                break;
            case 2:
                calc = sub(first, second);
                break;
            case 3:
                calc = mcl(first, second);
                break;
            case 4:
                calc = div(first, second);
                break;
            case 5:
                calc = sur(first, second);
                break;
            default:
                System.out.println("请重新输入");
                break;
        }
        System.out.println(calc);
    }
    public static double add(double first,double second){
        return first+second;
        }
    public static double sub(double first,double second){
        return first-second;
    }
    public static double mcl(double first,double second){
        return first*second;
    }
    public static double div(double first,double second){
        return first/second;
    }
    public static double sur(double first,double second){
        first = (int)first;
        second = (int)second;
        return first%second;
    }
}
