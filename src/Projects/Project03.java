package Projects;

import java.util.Scanner;

public class Project03 {

    public static void main(String[] args) {
        System.out.println("\nTASK 1\n");

        Scanner input = new Scanner(System.in);

        int a1 = Integer.parseInt("24");
        int a2 = Integer.parseInt("5");

        System.out.println("Sum of 24 and 5 is = " + (a1 + a2));
        System.out.println("Subtraction of 24 and 5 is = " + (a1 - a2));
        System.out.println("Division of 24 and 5 is = " + (a1 / (double)a2));
        System.out.println("Product of 24 and 5 is = " + (a1 * a2));
        System.out.println("Remainder of 24 and 5 is = " + (a1 % a2));

        System.out.println("\nTASK 2\n");

        int random1 = (int) (Math.random() * (35 - 1 + 1) + 1);

        if(random1 == 2){
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (random1 == 3) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (random1 == 5) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (random1 == 7) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (random1 == 11) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (random1 == 13) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (random1 == 17) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (random1 == 19) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (random1 == 23) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (random1 == 29) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else if (random1 == 31) {
        } else{
            System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
        }

            System.out.println("\nTASK 3\n");

        int myRandom1 = (int)(Math.random() * (50 - 1 + 1) +1);
        int myRandom2 = (int)(Math.random() * (50 - 1 + 1) +1);
        int myRandom3 = (int)(Math.random() * (50 - 1 + 1) +1);

        if(myRandom1 < myRandom2 && myRandom2 < myRandom3){
            System.out.println("Lowest number is = " + myRandom1 + "\nMiddle number is = " + myRandom2
                    + "\nGreatest number is = " + myRandom3);
        } else if (myRandom1 < myRandom3 && myRandom3 < myRandom2) {
            System.out.println("Lowest number is = " + myRandom1 + "\nMiddle number is = " + myRandom3
                    + "\nGreatest number is = " + myRandom2);
        } else if (myRandom2 < myRandom1 && myRandom1 < myRandom3) {
            System.out.println("Lowest number is = " + myRandom2 + "\nMiddle number is = " + myRandom1
                    + "Greatest number is = " + myRandom3);
        } else if (myRandom2 < myRandom3 && myRandom3 < myRandom1) {
            System.out.println("Lowest number is = " + myRandom2 + "\nMiddle number is = " + myRandom3
                    + "\nGreatest number is = " + myRandom1);
        } else if (myRandom3 < myRandom1 && myRandom1 < myRandom2) {
            System.out.println("Lowest number is = " + myRandom3 + "\nMiddle number is = " + myRandom1
                    + "\nGreatest number is = " + myRandom2);
        } else {
            System.out.println("Lowest number is = " + myRandom3 + "\nMiddle number is = " + myRandom2
                    + "\nGreatest number is = " + myRandom3);
        }

        System.out.println("\n------Task 4------");

        char i1 = '5';
        char i2 = 'a';
        char i3 = 'R';

        if(i1 >= 65 && i1 <=90){
            System.out.println("The letter is uppercase");
        } else if (i1 >= 97 && i1 <= 122) {
            System.out.println("The letter is lowercase");
        } else{
            System.out.println("Invalid character detected!!!");
        }

        if(i2 >= 65 && i2 <=90){
            System.out.println("The letter is uppercase");
        } else if (i2 >= 97 && i2 <= 122) {
            System.out.println("The letter is lowercase");
        } else{
            System.out.println("Invalid character detected!!!");
        }

        if(i3 >= 65 && i3 <=90){
            System.out.println("The letter is uppercase");
        } else if (i3 >= 97 && i3 <= 122) {
            System.out.println("The letter is lowercase");
        } else{
            System.out.println("Invalid character detected!!!");
        }

        System.out.println("\n------Task 5------");

        char c1 = '#';
        char c2 = 'e';
        char c3 = 'R';

        if((c1 >= 65 && c1 <= 90) || (c1 >= 97 && c1 <= 122)) {
            if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u' ||
                    c1 == 'A' || c1 == 'E' || c1 == 'I' || c1 == 'O' || c1 == 'U')
                System.out.println("The letter is vowel");
            else{
                System.out.println("The letter is consonant");
            }
        }
        else{
            System.out.println("Invalid character detected!!!");
        }

        if((c2 >= 65 && c2 <= 90) || (c2 >= 97 && c2 <= 122)) {
            if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u' ||
                    c2 == 'A' || c2 == 'E' || c2 == 'I' || c2 == 'O' || c2 == 'U')
                System.out.println("The letter is vowel");
            else{
                System.out.println("The letter is consonant");
            }
        }
        else{
            System.out.println("Invalid character detected!!!");
        }

        if((c3 >= 65 && c3 <= 90) || (c3 >= 97 && c3 <= 122)) {
            if (c3 == 'a' || c3 == 'e' || c3 == 'i' || c3 == 'o' || c3 == 'u' ||
                    c3 == 'A' || c3 == 'E' || c3 == 'I' || c3 == 'O' || c3 == 'U')
                System.out.println("The letter is vowel");
            else{
                System.out.println("The letter is consonant");
            }
        }
        else{
            System.out.println("Invalid character detected!!!");
        }

        System.out.println("\n------Task 6------");

        char sp1 ='8';
        char sp2 = '*';

        if((sp1 >= 33 && sp1 <= 47) || (sp1 >= 58 && sp1 <= 64)){
            System.out.println("Special character is = " + sp1);
        } else{
            System.out.println("Invalid character detected!!!");
        }

        if((sp2 >= 33 && sp2 <= 47) || (sp2 >= 58 && sp2 <= 64)){
            System.out.println("Special character is = " + sp2);
        } else{
            System.out.println("Invalid character detected!!!");
        }

        System.out.println("\n------Task 7------");

        char d1 = 'g';
        char d2 = '5';
        char d3 = '@';

        if((d1 >= 65 && d1 <= 90) || (d1 >= 97 && d1 <= 122)) {
            System.out.println("Character is a letter");}

        else if ((d1 >= 33 && d1 <= 47) || (d1 >= 58 && d1 <= 64)){
            System.out.println("Character is a special character");
        }
        else{
            System.out.println("Character is a digit");
        }

        if((d2 >= 65 && d2 <= 90) || (d2 >= 97 && d2 <= 122)) {
            System.out.println("Character is a letter");}

        else if ((d2 >= 33 && d2 <= 47) || (d2 >= 58 && d2 <= 64)){
            System.out.println("Character is a special character");
        }
        else{
            System.out.println("Character is a digit");
        }

        if((d3 >= 65 && d3 <= 90) || (d3 >= 97 && d3 <= 122)) {
            System.out.println("Character is a letter");}

        else if ((d3 >= 33 && d3 <= 47) || (d3 >= 58 && d3 <= 64)){
            System.out.println("Character is a special character");
        }
        else{
            System.out.println("Character is a digit");
        }

    }
}

