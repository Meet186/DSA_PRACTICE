import java.util.ArrayList;

public class test {

    public void printArray(int array[],int index){
        if(index == array.length){
            return;
        }
        System.out.println(array[index]);
        printArray(array, index + 1);
    }

    public boolean isSorted(int array[],int index){
        if(index == array.length - 1){
            return true;
        }
        if(array[index] > array[index + 1]){
            return false;
        }
        return isSorted(array,index +1);
    }

    public int largestEl(int arr[],int index){
        if(index == arr.length - 1){
            return arr[index];
        }
        int small = largestEl(arr,index + 1);
        if(arr[index] > small){
            return arr[index];
        } else {
            return small;
        }



    }

    public String removeA(String s , int index){
        if(index  == 0){
            return "";
        }
        String small = removeA(s,index+1);
        char current = s.charAt(index);
        if(current != 'a'){
            return current + small;
        } else {
           return small;
        }

    }

    public  String removeA2(String s){
        if(s.length() == 0){
            return "";
        }
        String small = removeA2(s.substring(1));
        char current = s.charAt(0);
        if(current != 'a'){
            return current + small;
        } else {
            return small;
        }
    }






    public boolean isPlaindrom(String s , int l , int r){
        if(l == r){
            return true;
        }
        return (s.charAt(l) == s.charAt(r) && isPlaindrom(s,l+1,r-1));

    }

    public int power(int p, int q){
        if(q == 0){
            return 1;
        }
        int small = power(p,q/2);
        if(q % 2 == 0){
            return small * small;
        } else {
            return small * small * p;
        }


    }

    public boolean target(int array[],int target,int index){
        if(index == array.length) return false;
        if(array[index] == target) return true;
        boolean small = target(array,target,index+1);
        if(small) return true;
        return false;

    }

    public int seriesSum(int n){
        if(n == 0){
            return 0;
        }
        if(n % 2 == 0){
            return seriesSum(n-1) - n;
        } else {
            return seriesSum(n-1) + n;
        }


    }

    public ArrayList<String> sub(String s){
        ArrayList<String> ans = new ArrayList<>();
        if(s.length() == 0){
            ans.add("");
            return ans;
        }
        char current = s.charAt(0);
        ArrayList<String> smallAns  = sub(s.substring(1));
        for(String ss : smallAns){
            ans.add(ss);
            ans.add(current + ss);
        }
        return ans;
    }

    public static void main(String[] args) {
    }


    }
