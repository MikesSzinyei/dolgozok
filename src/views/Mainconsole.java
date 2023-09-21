package views;

public class Mainconsole {
    public Mainconsole () {

    }
    public void welcome() {
        System.out.println("üdv");
    }
    public void showSalarySum(double sum) {
        String prefix = "Dolgozók összfizetése: ";
        System.out.printf("%s %.2f\n", prefix, sum);
    }
}
