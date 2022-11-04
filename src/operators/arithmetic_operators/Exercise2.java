package operators.arithmetic_operators;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Exercise2 {

    public static void main(String[] args) {


    /*
    Monthly: 7500
    Bi-Weekly: 3461
    Weekly: 1730
     */

    int yearlySalary = 90_000;


        System.out.println("Monthly: " + yearlySalary / 12);
        System.out.println("Bi-Weekly: " + yearlySalary / 26);
        System.out.println("Weekly: " + yearlySalary / 52);

    }
}
