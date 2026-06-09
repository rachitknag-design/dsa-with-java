import java.util.Scanner;

public class CreateTwoArraysoneforOddElementsandoneforEvenElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrOdd = new int[5];
        int[] arrEven = new int[5];
        int a=0,b=0;
        System.out.println("Enter elements for Even array: ");
        while(a!=arrEven.length){
            int in = sc.nextInt();
            if(in%2==0){
                arrEven[a] = in;
                a++;
            }
        }

        System.out.println("Enter elements for Odd array: ");
        while(b!=arrOdd.length){
            int in = sc.nextInt();
            if(in%2!=0){
                arrOdd[b] = in;
                b++;
            }
        }
        System.out.print("Even array elements: \n[");
        for(int ele : arrEven){
            System.out.print(ele+" ");
        }
        System.out.println("]");

        System.out.print("Odd array elements: \n[");
        for(int ele : arrOdd){
            System.out.print(ele+" ");
        }
        System.out.println("]");

        sc.close();
    }
}
