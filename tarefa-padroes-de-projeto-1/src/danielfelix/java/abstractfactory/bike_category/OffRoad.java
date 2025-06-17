package danielfelix.java.abstractfactory.bike_category;
import danielfelix.java.abstractfactory.abstracts.Bike;
import danielfelix.java.abstractfactory.abstracts.Factory;
import danielfelix.java.abstractfactory.bikes.R1250gs;
/** @author danielfelix
 *
 * A classe que representa a categoria de motos Off-Road.
 */
public class OffRoad extends Factory {

    /**
     * Recupera uma moto Off-Road com base na categoria solicitada.
     *
     * @param requested A categoria da moto solicitada.
     * @return Uma instância da moto Off-Road recuperada, ou null se a categoria não for reconhecida.
     */
    @Override
    public Bike retrieveBike(String requested) {
        if ("offroad".equalsIgnoreCase(requested)) {
            return new R1250gs("Azul");
        }
        return null;
    }
}
