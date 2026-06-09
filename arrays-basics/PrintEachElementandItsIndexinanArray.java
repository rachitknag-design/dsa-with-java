public class PrintEachElementandItsIndexinanArray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8};
        for(int i=0;i<arr.length;i++){
            System.out.println("["+i+","+arr[i]+"]");
        }
    }
}