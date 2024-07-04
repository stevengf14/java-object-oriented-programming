package ec.com.linkedinlearning.objectorientedprogramming.C5;

import java.io.IOException;

/**
 *
 * @author Steve
 */
public class Main {

    public static void main(String[] args) throws IOException {
        /*DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader("message.txt");

        System.out.println(digitsOnlyFileReader.readFile());
        System.out.println(digitsOnlyFileReader.getPath());*/

        PasswordChangeEvent eventOne = new PasswordChangeEvent("321928399");
        AccountTransferPaymentEvent eventTwo = new AccountTransferPaymentEvent("1936428194");
        MissedPaymentEvent eventThree = new MissedPaymentEvent("93827451");

        Event[] events = {eventOne, eventTwo, eventThree};

        for (Event e : events) {
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }

    }

}
