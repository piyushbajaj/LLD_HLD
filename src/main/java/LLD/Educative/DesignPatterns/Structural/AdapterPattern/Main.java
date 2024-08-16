package LLD.Educative.DesignPatterns.Structural.AdapterPattern;

/**
 * Project: DSAlgo
 * Package: LLD.Educative.DesignPatterns.Structural.AdapterPattern
 * <p>
 * User: piyushbajaj
 * Date: 14/04/23
 * Time: 10:54 pm
 */
public class Main {
    public static void main(String[] args) {
        HotAirBalloon hotAirBalloon = new HotAirBalloon();
        Adapter hotAirBalloonAdapter = new Adapter(hotAirBalloon);

        hotAirBalloonAdapter.fly();
    }
}
