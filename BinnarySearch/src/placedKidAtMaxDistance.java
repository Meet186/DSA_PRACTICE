public class placedKidAtMaxDistance {
    public static void main(String[] args) {
        int track [] = {1,2,4,8,9};
        int kids = 3;
        int ans  = placedKids(track,kids);
        System.out.println(ans);
    }



    static boolean isPossibleToPlaceKids(int arr [], int kids,int minDistance){
        int numberOfKids = 1;
        int lastKidPosition = arr[0];
        for (int i = 1; i <arr.length ; i++) {
           if(arr[i] - lastKidPosition >= minDistance){
               numberOfKids++;
               lastKidPosition = arr[i];
           }
        }
        return numberOfKids >= kids;
    }


    static int placedKids(int arr [], int kids){
        int si = 1, ei = (int) 1e9;
        int ans = 0;

        while (si <= ei){
            int mid = si + (ei-si)/2;
            if(isPossibleToPlaceKids(arr,kids,mid)){
                ans = mid;
                si = mid + 1;
            } else {
                ei = mid-1;
            }
        }
        return ans;
    }

}
