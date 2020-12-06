package app.uiharuneko.java;

import java.util.Scanner;

public class WoxingwosuManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int feature,token = 0;
        final String ADMIN_USERNAME,ADMIN_PASSWORD;
        ADMIN_USERNAME = "admin";
        ADMIN_PASSWORD = "123456";
        System.out.println("--------欢迎进入我行我素购物管理系统--------");
        System.out.println("1.管理员登录"+"\n"+"2.会员登陆"+"\n"+"3.退出"+"\n");
        System.out.print("请选择登录菜单:");
        feature = sc.nextInt();
        switch(feature) {
            case 1:
                int i = 0;
                do {
                    System.out.print("请输入管理员用户名:");
                    String username = sc.next();
                    System.out.print("请输入管理员密码:");
                    String password = sc.next();
                    if (username == ADMIN_USERNAME && password == ADMIN_PASSWORD) {
                        System.out.println("欢迎进入管理员管理界面");
                        token = 1;
                        break;
                    } else {
                        System.out.println("用户名或密码错误，请重新输入");
                        i++;
                    }
                } while (i < 3);
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
        if(token == 0){
            System.out.println("登陆已超时");
        }
    }
}
