class LargestOddNumberInString {
    public static void main(String[] args) {
        String num = "42706";

        String res = "";
        for(int i=num.length()-1;i>=0;i--) {
            if((num.charAt(i)-'0')%2!=0) {
                res = num.substring(0,i+1);
            }
        }

        System.out.println(res);
    }
}