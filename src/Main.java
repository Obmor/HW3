public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Exercise 1");
        byte a = 12;
        byte b = 27;
        byte c = 44;
        byte d = 15;
        byte e = 9;
        int result = a * (b + (c - d * e));
        System.out.println(result);
        int possitive = 0 - result;
        int mathAbc = Math.abs(result);
        System.out.println(possitive);
        System.out.println(mathAbc);
        System.out.println("Exercise 2");
        byte aA = 5;
        byte bB = 7;
        System.out.println("aA " + aA);
        System.out.println("bB " + bB);
        int bBB = aA * 7 / 5;
        System.out.println("bBB " + bBB);
        int aAA =  bB * 5 / 7;
        System.out.println("aAA " + aAA);
        System.out.println("Exercise 3");
        short aAAA = 145;
        int bBBB = aAAA / 10 % 10;
        System.out.println(bBBB);
    }
}