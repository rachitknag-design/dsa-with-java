public class CreateaDuplicateofanArray {
    public static void main(String[] args) {
        int arr[] = {32,45,32,66,77};
        int duli[] = new int[arr.length];
        duli=arr;
        System.out.print("Original Array: \n[");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println("]");
        System.out.print("First dulicated array elements: \n[");
        for(int ele : duli){
            System.out.print(ele+" ");
        }
        System.out.println("]");

        int duli1[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            duli1[i] = arr[i];
        }
        System.out.print("Second dulicated array elements: \n[");
        for(int ele : duli1){
            System.out.print(ele+" ");
        }
        System.out.println("]");
        
    }
}
