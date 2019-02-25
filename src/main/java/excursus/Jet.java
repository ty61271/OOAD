package excursus;

public class Jet extends Airplane{
    public static final int MULTIPLTER=2;

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed*MULTIPLTER);
    }
    public void accelerate(){
        super.setSpeed(getSpeed()*2);
    }
}
