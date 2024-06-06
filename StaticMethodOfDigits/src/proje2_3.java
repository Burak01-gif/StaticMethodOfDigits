import java.util.Scanner;

public class proje2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digits Library Menu");
        System.out.println("1. Least significant digit");
        System.out.println("2. ith digit");
        System.out.println("3. Sum of digits with limit");
        System.out.println("4. Count digits");
        System.out.println("5. Remove digitK");
        System.out.println("6. Remove digit with value");
        System.out.println("7. Generate random number");
        System.out.println("8. Reverse digits");
        System.out.println("9. Check palindrome");
        System.out.println("10. CharDigitSum");
        System.out.println("11. Quit");

        System.out.println("Choose action to perform : ");
        int num = input.nextInt();

        if (num==11){
            System.out.println("Ok, good bye ");
        }else {
            System.out.print("Enter digit : ");
            int digit = input.nextInt();
            switch (num) {
                case 1:
                    digitZero(digit);
                    break;
                case 2:
                    digiti(digit);
                    break;
                case 3:
                    digitLimitSum(digit);
                    break;
                case 4:
                    digitCount(digit);
                    break;
                case 5:
                    digitRemoveK(digit);
                    break;
                case 6:
                    digitRemove(digit);
                    break;
                case 7:
                    randomNumber(digit);
                    break;
                case 8:
                    reverse(digit);
                    break;
                case 9:
                    isPalindrome(digit);
                    break;
                case 10:
                    CharDigitSum(digit);
                    break;
                default:
                    System.out.println("Does not exist in library");
            }
        }
    }

    public static int digitZero(int digit) {
        int zeroDig = 0;
        for (int i = zeroDig; i >= 0; i--) {
            zeroDig = digit % 10;
            if (i == zeroDig - 1)
                break;
        }
        System.out.println(zeroDig);
        return zeroDig;
    }

    public static int digiti(int digit) {
        Scanner input = new Scanner(System.in);
        int idigit = 0;
        int j = input.nextInt();
        for (int i = j; i > 0; i--) {
            idigit = digit / 10;
            digit = digit / 10;
        }
        idigit = idigit % 10;

        System.out.println(idigit);
        return idigit;
    }

    public static int digitLimitSum(int digit) {
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        int sumdigit = 0, sumdigit2 = 0;
        int count = 0, count2 = 0;
        int digit2 = digit;

        for (int i = limit; i >= 0; i--) {
            sumdigit = digit % 10;
            count = count + sumdigit;
            digit = digit / 10;
        }
        while (digit != 0) {
            sumdigit2 = digit % 10;
            count2 = count2 + sumdigit2;
            digit = digit / 10;
        }
        System.out.println(count2);
        return count2;
    }

    public static int digitCount(int digit) {
        Scanner input = new Scanner(System.in);
        int parameter = input.nextInt();
        int lastDigit = 0;
        int dig2 = digit;
        for (int i = parameter; i >= 0; i--) {
            lastDigit = digit % 10;
            digit = digit / 10;
            if (digit == 0) {
                lastDigit = dig2 % 10;
                dig2 = dig2 / 10;
            }
        }
        System.out.println(lastDigit);
        return lastDigit;
    }

    public static int digitRemoveK(int digit) {
        Scanner input = new Scanner(System.in);
        int parameter = input.nextInt();
        int lastDigit = 0;
        for (int i = parameter; i >= 0; i--) {
            lastDigit = digit % 10;
            digit = digit / 10;
        }
        System.out.println(lastDigit);
        return lastDigit;
    }

    public static int digitRemove (int digit){
        Scanner input = new Scanner(System.in);
        int parameter = input.nextInt();
        for (int i = parameter; i >= 0; i--) {
            digit = digit / 10;
        }
        System.out.println(digit);
        return digit;
    }

    public static int randomNumber (int digit){
        Scanner input = new Scanner(System.in);
        int parameter = input.nextInt();
        return digit;
    }

    public static int reverse (int digit){

        while(digit > 0) {
            System.out.print(digit % 10);
            digit /= 10;
        }
        return digit;
    }

    public static boolean  isPalindrome (int digit){
        int palindrome =digit;
        int rev = 0;
        while (palindrome!=0) {
            int last = palindrome % 10;
            rev=rev*10+last;
            palindrome = palindrome / 10;
        }
        if (digit==rev) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;

    }

    public static char CharDigitSum(int digit){
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();
            char character = 0;
            for (int i=0; i<=str.length(); i++){
                character = (char) i ;
                System.out.println("code" + i + "" + character);
            }
            return character;

        }
}