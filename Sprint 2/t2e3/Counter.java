package t2e3;

public class Counter {

    public int phraseCounterHappy(String text) {
        int countHappy = 0;
        int countEyes = 0;
        int countNose = 0;
        String words[] = text.split("");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(":")) {
                countEyes++;
            } else if (words[i].equals("-") && countEyes == 1) {
                countEyes--;
                countNose++;
            } else if (words[i].equals(")") && countNose == 1) {
                countNose--;
                countHappy++;

            } else {
                countEyes = 0;
                countNose = 0;
            }
        }
        return countHappy;
    }

    public int phraseCounterSad(String text) {
        int countSad = 0;
        int countEyes = 0;
        int countNose = 0;
        String words[] = text.split("");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(":")) {
                countEyes++;
            } else if (words[i].equals("-") && countEyes == 1) {
                countEyes--;
                countNose++;
            } else if (words[i].equals("(") && countNose == 1) {
                countNose--;
                countSad++;

            } else {
                countEyes = 0;
                countNose = 0;
            }
        }
        return countSad;
    }

}
