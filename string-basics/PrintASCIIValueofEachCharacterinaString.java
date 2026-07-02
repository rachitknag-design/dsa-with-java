public class PrintASCIIValueofEachCharacterinaString {
    public static void main(String[] args) {
        String str = "Welcome to Java!!";
        for(int i=0;i<str.length();i++){
            System.out.print((int)str.charAt(i)+" ");
        }
    }
}
