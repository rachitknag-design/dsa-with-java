import java.util.Scanner;

public class StockBuyAndSell {

    static int maxProfit(int[] arr){
        int maxProfit=0;
        int profit = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    profit = arr[j] - arr[i];
                    maxProfit = (maxProfit>profit)?maxProfit:profit;
                }
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        System.out.println("Enter the stockprices: ");
        int[] stockprice = new int[days];
        for(int i=0;i<days;i++){
            stockprice[i] = sc.nextInt();
        }

        System.out.println("Max Profit: "+maxProfit(stockprice));
        sc.close();
    }    
}
