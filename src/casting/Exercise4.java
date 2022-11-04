package casting;

public class Exercise4 {

    public static void main(String[] args) {

        System.out.println("\nTASK 10\n");

        int DanSave = 14265;
        double option1 = 475.50;
        double option2 = 951;

        int monthsToSaveOption1 = (int) (DanSave/option1);
        int monthsToSaveOption2 = (int) (DanSave/option2);
        System.out.println("Option 1 will take " + monthsToSaveOption1 + " months ");
        System.out.println("Option 2 will take " + monthsToSaveOption2 + " months ");
    }
}
