
import static java.util.Collections.list;

public class Darbuotojas {

    String vardas;
    String pavarde;
    String pareigos;
    long asmensKodas;



    String vardasPavarde(){

        return vardas + pavarde;
    }
    int simboliusSkaicius(){
        return vardasPavarde().length();
    }
    String iskirptasTekstas(){
        StringBuilder a = new StringBuilder();


        return vardasPavarde().substring(2, 9);
    }
    char kokiaLytis(){
        String ak = String.valueOf(asmensKodas);
        if (ak.charAt(0) == '3' || ak.charAt(0) == '5'){
            return 'v';
        }
        else{
            return  'm';
        }

    }
    String kokieMetai(){
        String yr = "";
        String metai = String.valueOf(asmensKodas);
        if (metai.charAt(0) == '3' || metai.charAt(0) == '4') {
            yr = "19";
        }
        else{
            yr = "20";
        }
        metai = metai.substring(1,3);
        metai = yr + metai;
        return metai;
    }


}
