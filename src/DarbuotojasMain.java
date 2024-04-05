public class DarbuotojasMain {
    public static void main(String[] args) {
        Darbuotojas darb01 = new Darbuotojas();
        Darbuotojas darb02 = new Darbuotojas();
        Darbuotojas darb03 = new Darbuotojas();
        Darbuotojas darb04 = new Darbuotojas();

        darb01.vardas = "Mantas";
        darb01.pavarde = "Mantelis";
        darb01.asmensKodas = 38504158596L;
        darb01.pareigos = "Statybininkas";

        darb02.vardas = "Tadas";
        darb02.pavarde = "Tadelis";
        darb02.asmensKodas = 39405178586L;
        darb02.pareigos = "Statybininkas";

        darb03.vardas = "Deimante";
        darb03.pavarde = "Deimantine";
        darb03.asmensKodas = 603041585213L;
        darb03.pareigos = "Kasininke";

        darb04.vardas = "Petras";
        darb04.pavarde = "Petrelis";
        darb04.asmensKodas = 38904158789L;
        darb04.pareigos = "Pardavejas";

        System.out.println("VP: " + darb01.vardasPavarde() + " simboliai: " + darb01.simboliusSkaicius() + " 3-9 raides: " + darb01.iskirptasTekstas() + " Lytis: " + darb01.kokiaLytis() + " Gimimo metai: " + darb01.kokieMetai());
        System.out.println("VP: " + darb02.vardasPavarde() + " simboliai: " + darb02.simboliusSkaicius() + " 3-9 raides: " + darb02.iskirptasTekstas() + " Lytis: " + darb02.kokiaLytis() + " Gimimo metai: " + darb02.kokieMetai());
        System.out.println("VP: " + darb03.vardasPavarde() + " simboliai: " + darb03.simboliusSkaicius() + " 3-9 raides: " + darb03.iskirptasTekstas() + " Lytis: " + darb03.kokiaLytis() + " Gimimo metai: " + darb03.kokieMetai());
        System.out.println("VP: " + darb04.vardasPavarde() + " simboliai: " + darb04.simboliusSkaicius() + " 3-9 raides: " + darb04.iskirptasTekstas() + " Lytis: " + darb04.kokiaLytis() + " Gimimo metai: " + darb04.kokieMetai());

        System.out.println("Pirmo ir antro darbuotoju pareigos yra: " + palyginimas(darb01.pareigos, darb02.pareigos));
        System.out.println("Trecio ir ketvirto darbuotoju pareigos yra: " + palyginimas(darb03.pareigos, darb04.pareigos));

    }

    static String palyginimas(String pareigos1, String pareigos2){
        if (pareigos1 == pareigos2){
            return "vienodos";
        }
        else {
            return "skirtingos";
        }
    }

}
