import java.awt.image.BandedSampleModel;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static String triangleType(int[] nums) {
        String ans = "";
        int num1 = nums[0];
        int num2 = nums[1];
        int num3 = nums[2];

        if((num1 + num2 > num2) && (num2 + num3 > 2) && (num1 + num3 > num2)) return "none";
        if(num1 == num2 && num2 == num3){
            ans = "equilateral";
        } else if(num1 == num2 || num1 == num3 || num2 == num3 ){
            ans = "isosceles";
        }  else {
            ans = "scalene";
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {8,4,2};
        System.out.println(triangleType(nums));
    }
}