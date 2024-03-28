import java.util.Arrays;
import java.util.Scanner;

public class easy1 {

    public static void main(String[] args){
     int nums[] = new int[4];
     int result[]=new int[2];
     int target;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组");
        for(int i = 0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("输入目标数字");
        target = sc.nextInt();
        for(int i = 0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=nums[i];
                    result[1]=nums[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(result));//输出的地址，需要toString来让数组地址变成string字符串

    }


}






