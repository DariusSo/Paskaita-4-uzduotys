import java.util.*;

public class SkaiciuOperacijos {
    double sudekSkaicius(List<Double>skaiciuListas){
        Aritmetika sudejimas = new Aritmetika();
        double suma = skaiciuListas.get(0);
        for (int i = 1; i < skaiciuListas.size() - 1; i++){

            suma = sudejimas.sudek(suma, skaiciuListas.get(i));

        }
        return suma;
    }

    double atimkSkaicius(List<Double>skaiciuListas){
        Aritmetika sudejimas = new Aritmetika();
        double atimtis = skaiciuListas.get(0);
        for (int i = 1; i < skaiciuListas.size(); i++){

            atimtis = sudejimas.atimk(atimtis, skaiciuListas.get(i));

        }
        return atimtis;
    }
    double padauginkSkaicius(List<Double>skaiciuListas){
        Aritmetika sudejimas = new Aritmetika();
        double daugyba = skaiciuListas.get(0);
        for (int i = 1; i < skaiciuListas.size(); i++){

            daugyba = sudejimas.padaugink(daugyba, skaiciuListas.get(i));

        }
        return daugyba;
    }
    double padalinkSkaicius(List<Double>skaiciuListas){
        Aritmetika sudejimas = new Aritmetika();
        double dalyba = skaiciuListas.get(0);
        for (int i = 1; i < skaiciuListas.size(); i++){

            dalyba = sudejimas.padalink(dalyba, skaiciuListas.get(i));

        }
        return dalyba;
    }
    double[] pakelkSkaiciusLaipsnyje(List<Double>skaiciuListas){
        Aritmetika sudejimas = new Aritmetika();
        double[] naujasListas = new double[skaiciuListas.size()];
        for(int i = 0; i < skaiciuListas.size(); i++){
            double a = sudejimas.pakelkLaipsniu(skaiciuListas.get(i), 3);
            naujasListas[i] = a;
        }
        return naujasListas;
    }
}
