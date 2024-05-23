package vn.tvn.data.type;

public class characterDemo {
    public static void main(String[] args) {

        char letterA = 'A';
        //bên trong char lưu dạng số =>> thuộc dạng numberic
        char unicodeA = '\u0041';

        char numberA = 65;
        char numberChar = '3';
        Character charA = 'A';
        char char_ = '\u2423';



        boolean isLetter = Character.isLetter(letterA);
        boolean isLetter2 = Character.isLetter(numberChar);
        int a = Character.getNumericValue(letterA);

        System.out.println(letterA);
        System.out.println(unicodeA);
        System.out.println(numberA);
        System.out.println(isLetter);
        System.out.println(isLetter2);
        System.out.println(a);
        System.out.println(char_);
    }


}
