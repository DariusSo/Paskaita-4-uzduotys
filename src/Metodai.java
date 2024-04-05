import java.time.LocalDateTime;

public class Metodai {
    String metai(int metai){
        int menesiai = metai * 12;
        int dienos = metai * 365;
        int valandos = dienos * 24;
        String data = menesiai + "men. " + dienos + "d. " + valandos + "h";
        return data;
    }

    String poVidurnakcio(){
        int val = LocalDateTime.now().getHour();
        int min = LocalDateTime.now().getMinute();
        int minutes = val * 60 + min;
        int sekundes = minutes * 60;
        String kiekPraejo = "Praejo " + minutes + " ir " + sekundes + " po vidurnakcio";
        return kiekPraejo;
    }

    double bibliotekosVidurkis(int knygosPerMen, int zmoniusVidurkisPerMetus){
        double v = knygosPerMen * 12 / zmoniusVidurkisPerMetus;
        return v;
    }
    double traukinys(int keleiviai, int neTen, int vagonai){
        int vilnius = keleiviai - neTen;
        double ats = vilnius / vagonai;
        return ats;
    }
}
