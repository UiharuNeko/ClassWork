package app.uiharuneko.java;

import java.util.Scanner;

public class Work2020113002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("请输入要四舍五入的小数");
            double num = sc.nextDouble();
            System.out.println("四舍五入后的数为"+round(num));
            System.out.println("如果要继续计算，请按1");
            int redo = sc.nextInt();
            if(redo != 1 ){
                flag = false;
            }
        }while(flag);
    }

    public static int round(double n){
        int sur = 0,numInt;
        double temp;
        numInt = (int)n;
        temp = (n - numInt)*10;
        if (n > 0){
            if (temp > 5){
                sur = numInt + 1;
            }else if(temp <= 5){
                sur = numInt;
            }
        }else{
            if (temp <= -5){
                sur = numInt - 1;
            }else if(temp > -5){
                sur = numInt;
            }
        }
        return sur;
    }
}
