import java.util.Arrays;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int listoDydis = 4;
        Double[] nuo100 = new Double[listoDydis];
        Double[] nuo99 = new Double[listoDydis];
        Random random100 = new Random();
        Random random99 = new Random();
        for(int i = 0; i < listoDydis; i++){
            nuo100[i] = (double) random100.nextInt(-100, 100);
            nuo99[i] = random99.nextDouble(-99.99, 99.99);
        }
        SkaiciuOperacijos skaiciuojam = new SkaiciuOperacijos();
        System.out.println("Skaiciai: " + Arrays.toString(nuo100));
        System.out.println("Sudetis -+100: " + skaiciuojam.sudekSkaicius(List.of(nuo100)));
        System.out.println("Atimtis -+100: " + skaiciuojam.atimkSkaicius(List.of(nuo100)));
        System.out.println("Daugyba -+100: " + skaiciuojam.padauginkSkaicius(List.of(nuo100)));
        System.out.println("Dalyba -+100: " + skaiciuojam.padalinkSkaicius(List.of(nuo100)));
        System.out.println("Laipsniu -+100: " + Arrays.toString(skaiciuojam.pakelkSkaiciusLaipsnyje(List.of(nuo100))));
        System.out.println("Sudetis -+99: " + skaiciuojam.sudekSkaicius(List.of(nuo99)));
        System.out.println("Atimtis -+99: " + skaiciuojam.atimkSkaicius(List.of(nuo99)));
        System.out.println("Daugyba -+99: " + skaiciuojam.padauginkSkaicius(List.of(nuo99)));
        System.out.println("Dalyba -+99: " + skaiciuojam.padalinkSkaicius(List.of(nuo99)));
        System.out.println("Laipsniu -+99: " + Arrays.toString(skaiciuojam.pakelkSkaiciusLaipsnyje(List.of(nuo99))));
        }
    }
