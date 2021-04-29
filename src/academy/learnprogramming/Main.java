package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println("myChar is " + myChar);
        System.out.println("myUnicodeChar is " + myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println("myCopyrightChar is " + myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        System.out.println("myTrueBooleanValue is " + myTrueBooleanValue);
        System.out.println("myFalseBooleanValue is " + myFalseBooleanValue);
    }
}
