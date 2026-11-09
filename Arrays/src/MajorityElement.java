// Moore's voting algorithm
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,3,2,2};
        int count = 0;
        int major = 0;
        for(int i:arr){
            if(count == 0){
                major = i;
            }
            if(major == i){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(major);
    }
}
