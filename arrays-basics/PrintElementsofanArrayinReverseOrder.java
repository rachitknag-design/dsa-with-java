public class PrintElementsofanArrayinReverseOrder {
    public static void main(String[] args) {
        int[] arr = {7,6,54,3,2,4};
        for(int i=arr.length-1;i>=0;i--){
            System.out.println("["+i+","+arr[i]+"]");
        }
    }
}
