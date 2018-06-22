
public class Main {
    public static void main(String[] args) {

        int resultVolume;

        BoxGreen green;
        green = new BoxGreen();
        green.haight = 48;
        green.width = 135;
        green.depth = 789;
        green.color = "зеленой";

        resultVolume = green.findVolume();

        System.out.println("Обьем " +
                green.color +
                " коробки с высотой-" +
                green.haight + ", Шыриной-" +
                green.width + ", Глубиной-" +
                green.depth + " = " + resultVolume);

    }
}
