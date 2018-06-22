
public class Main {
    public static void main(String[] args) {

        int resultVolumeGreen;
        int resultVolumeBlue;

        BoxGreen green = new BoxGreen();
        green.haight = 48;
        green.width = 135;
        green.depth = 789;

        resultVolumeGreen = green.findVolume();

        System.out.println("Обьем " +
                green.color +
                " коробки с высотой-" +
                green.haight + ", шыриной-" +
                green.width + ", глубиной-" +
                green.depth + " = " + resultVolumeGreen);



        BoxBlue blue = new BoxBlue();
        blue.haight = 1;
        blue.width = 2;
        blue.depth = 3;

        resultVolumeBlue = blue.findVolume();


        System.out.println( "Обьем " +
                blue.color +
                " коробки с высотой-" +
                blue.haight + ", шыриной-" +
                blue.width + ", глубиной-" +
                blue.depth + " = " + resultVolumeBlue);










    }
}
