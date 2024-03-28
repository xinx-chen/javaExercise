/**
 * 回文数
 */
import java.util.Scanner;
public class easy2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x ;
        System.out.println("请输入数字");
        x = sc.nextInt();
        String str = Integer.toString(x);
        boolean hui = new StringBuilder(str).reverse().toString().equals(str);
        if(hui){
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");
        }
    }
}
