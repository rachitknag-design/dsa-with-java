
public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String str = "()(()())(())";

        int first = 0;
        int last = str.length()-1;

        while(first<str.length()) {
            if(str.charAt(first) == '(') {
                break;
            }
            first++;
        }

        while(last>=0) {
            if(str.charAt(last) == ')') {
                break;
            }
            last--;
        }

        String res = "";

        for(int i=0;i<str.length();i++) {
            if(i==first||i==last) {
                continue;
            }
            res = res + str.charAt(i);
        }

        System.out.println("original: "+str);
        System.out.println("Result: "+res);
    }
}