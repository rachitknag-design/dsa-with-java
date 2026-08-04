public class CountLettersNumbersandSpecialCharactersinaString {
    public static void main(String[] args) {
        // String str = "Ram has scored 233 marks in total which is 46% and has been awarde $50 USD as price";
        
        String str = "Rachit21 Nag!!";
        int cl=0,cn=0,csc=0;

        for(char ch: str.toCharArray()){
            if(Character.isAlphabetic(ch))
                cl++;
            else if(Character.isDigit(ch))
                cn++;
            else
                csc++;

        }
        System.out.println("Count of letters: "+cl);
        System.out.println("Count of Special charater: "+csc);
        System.out.println("Count of numbers: "+cn);
    }
}
