public class Main {

    public static void main(String[] args) {

        var nationalUSParks = new Park[]{
                new Park("Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "361085, -110.0965")
        };
        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorURRivers = new River[]{
                new River("Mississippi", "47.2160, -95.2348", "29.1566, -89.2495", "35.1556, -90.0659"),
                new River("Missouri", "45.9239, -111.4983", "38.8146, -90.1218")
        };
        Layer<River> riverLayer = new Layer<>(majorURRivers);
        riverLayer.renderLayer();


    }
}
