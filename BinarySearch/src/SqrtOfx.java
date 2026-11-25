public class SqrtOfx {
    public static void main(String[] args) {
        int x = 16;
        int start = 1;
        int end = x;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid*mid == x){
                System.out.println(mid);
                break;
            }else if(mid*mid > x){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
    }
}
