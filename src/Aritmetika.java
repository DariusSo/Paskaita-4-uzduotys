public class Aritmetika {

    double sudek(double a, double b) {
        double c = a + b;
        return c;
    }
    double atimk(double a, double b) {
        double c = a - b;
        return c;
    }
    double padaugink(double a, double b) {
        double c = a * b;
        return c;
    }
    double padalink(double a, double b) {
        double c = a / b;
        return c;
    }
    public double pakelkLaipsniu(double skaicius, int laipsnis){

        return Math.pow(skaicius, laipsnis);



    }
    String sujunk(String zodis1, String zodis2){
        String sujungtas = zodis1 + zodis2;
        return sujungtas;
    }

}

