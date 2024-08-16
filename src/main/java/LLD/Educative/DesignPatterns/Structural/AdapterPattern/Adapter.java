package LLD.Educative.DesignPatterns.Structural.AdapterPattern;

/**
 * Project: DSAlgo
 * Package: LLD.Educative.DesignPatterns.Structural.AdapterPattern
 * <p>
 * User: piyushbajaj
 * Date: 14/04/23
 * Time: 10:49 pm
 */
public class Adapter implements IAircraft {

    HotAirBalloon hotAirBalloon;

    public Adapter(HotAirBalloon hotAirBalloon) {
        this.hotAirBalloon = hotAirBalloon;
    }

    @Override
    public void fly() {
        String feulUsed = hotAirBalloon.inflateWithGas();
        hotAirBalloon.fly(feulUsed);
    }
}
