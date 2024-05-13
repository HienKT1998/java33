package vn.tvn.data.type;

public class characterDemo {

    public static void main(String[] args) {
        //ben trong character luu dang so
        char letterA = 'A';

        char unicodeA = '\u0041';

        char numberA = 65;
        char numberCharacter = '3';


        Character charA = 'A';
        char char_ = '\u2423';


        boolean isletter = Character.isLetter(letterA);
        boolean isletter2 = Character.isDigit(numberCharacter);
        int a = Character.getNumericValue(letterA);


        System.out.println(letterA);
        System.out.println(unicodeA);
        System.out.println(numberA);
        System.out.println(isletter);
        System.out.println(char_);
    }
}
