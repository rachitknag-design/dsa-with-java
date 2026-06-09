public class CalculateSumandProductofArrayElements {
    public static void main(String[] args) {
        int[] arr = {4,3,5,6,8};
        int sum = 0, prod = 1;
        for(int ele : arr){
            sum+=ele;
            prod*=ele;
        }
        System.out.println("Sum of array elements: "+sum);
        System.out.println("Product of array elements: "+prod);
    }
}
