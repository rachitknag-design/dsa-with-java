public class FindMissingNumber {
    static int findmissing(int[] arr){

        int xor1 = 0, xor2=0;
        int n = arr.length+1;

        for(int i=1;i<=n;i++){
            xor1 = xor1^i;
        }
        for(int i=0;i<n-1;i++){
            xor2 = xor2^arr[i];
        }


        return xor1^xor2;

    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1,6,8};
        int misElement = findmissing(arr);
        System.out.println(misElement);
    }
}