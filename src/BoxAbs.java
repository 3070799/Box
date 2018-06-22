public class BoxAbs implements BoxInt {

    public int haight;
    public int width;
    public int depth;

    @Override
    public int findVolume() {
        return  haight * width * depth;
    }
}
