package pkg07quiz;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class timeSystem {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
    LocalTime localTime = LocalTime.now();

    public void checkTime() {
        int temp = localTime.getHour();
        if (temp < 12 && temp > 6) {
            System.out.println("Bom dia, você se logou ao nosso sistema.");
        } else if (temp < 18 && temp > 12) {
            System.out.println("Boa tarde, você se logou ao nosso sistema.");
        } else if (temp >= 18) {
            System.out.println("Boa noite, você se logou ao nosso sistema.");
        } else if (temp <= 6){
            System.out.println("Boa madrugada, você se logou ao nosso sistema.");
        }
    }
}
