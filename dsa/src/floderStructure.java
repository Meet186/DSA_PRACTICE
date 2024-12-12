public class floderStructure {
    public static void main(String[] args) {
        String arr [] = {"d1","d2","../","./"}; // output - 1
        int ans = folderBack(arr);
        System.out.println(ans);
    }
    static int folderBack(String arr []){
        int depth = 0;

        for(String el : arr ){
            if(el == "../"){
                depth --;
                if(depth < 0){
                    depth = 0;
                }
            } else if (el == "./") {
                continue;
            } else {
                depth++;
            }
        }
        return depth;
    }
}
