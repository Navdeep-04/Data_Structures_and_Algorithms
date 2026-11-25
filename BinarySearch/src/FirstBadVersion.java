public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 5;
        int bad = 4;
        int start = 1;
        int end = n;
        while(start < end){
            int mid = (start + end)/2;
            if(isBadVersion(mid)){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.println(start);
    }
    public static boolean isBadVersion(int version){
        if(version == 4){
            return false;
        }
        return true;
    }
}
