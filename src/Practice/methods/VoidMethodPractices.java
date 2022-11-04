package Practice.methods;

import utilities.ScannerHelper;

public class VoidMethodPractices {

    public static void main(String[] args) {

        System.out.println("------Task 1------");

        String name = ScannerHelper.getAName();

        System.out.println("The length of the name is = " + name.length() + " letters.");
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length() - 1));


            }
        }
