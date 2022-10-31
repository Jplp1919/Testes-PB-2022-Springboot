package t2e3;

import java.util.Scanner;

public class ScanText {

    public void ScanText() {
        Scanner sc = new Scanner(System.in);
        String text;
        Counter counter = new Counter();
        int sadcount;
        int happycount;
        System.out.println("Digite texto a ser escaneado: ");
        text = sc.nextLine();
        sadcount=counter.phraseCounterSad(text);
        happycount=counter.phraseCounterHappy(text);
        System.out.println("f" + happycount);
        System.out.println("s" + sadcount);
        if (happycount > sadcount){
            System.out.println("Divertido");
        } else if (sadcount > happycount){
            System.out.println("Chateado");
        } else {
            System.out.println("Neutro");
        }
        
    }

}
