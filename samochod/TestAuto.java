public class TestAuto{
    public static void main(String[] args){
        Auto auto = new Auto();
        auto.rocznik = 1999;
        auto.marka = "Audi";
        auto.model = "A5";
        System.out.println("Rocznik: " + auto.rocznik + "\nMarka: " + auto.marka + "\nModel: " + auto.model);
    }
}