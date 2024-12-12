import java.security.cert.Certificate;

public class operationonarray {
    public static void main(String[] args) {
        int marks [] = {45,454,78,98,78,40};
//
//        for (int i = 1; i < marks.length ; i++) {
//            System.out.println(marks[i]);
//
//        }

//        int i = 1;
//        while (i < marks.length) {
//            System.out.println(marks[i]);
//            i++;
//        }

    //  ***  // {FOR EACH METHOD IN JAVA }

//        for(int mark : marks){
//            System.out.println(mark);
//        }

        int [][] multiarray = {{45,78},{78,89,78}};

//        for (int i = 0; i <multiarray.length ; i++) {
//            for (int j = 0; j <multiarray[i].length ; j++) {
//                System.out.println(multiarray[i][j]);
//
//            }
//
//        }

        ArrayExample obj = new ArrayExample();
        int arr [] = {1,4,7,10,5,7};
//        int ans = obj.sum(arr);
//        System.out.println(ans);

//        int maxval = obj.maxValue(arr);
//        System.out.println(maxval);


        int ans = obj.findElementIndex(arr,7);
        System.out.println(ans);

    }
}

class ArrayExample {

    public int  sum (int [] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
             ans += arr[i];
        }
        return ans;
    }

    public int maxValue(int arr []){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > ans){
                ans = i;
            }

        }
        return  ans;
    }

    public int findElementIndex (int [] arr , int elment){
        int ans = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == elment){
                ans = i;
                break;
            } else {
                ans = -1;
            }

        }
        return ans;
    }


}
