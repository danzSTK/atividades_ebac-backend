package danielfelix.java.abstractfactory.bikes;
import danielfelix.java.abstractfactory.abstracts.Bike;
/** @author danielfelix
 *
 * A classe que representa uma moto esportiva específica do modelo S1000rr.
 */
public class S1000rr extends Bike {
    /**
     * Construtor para criar uma moto S1000rr com uma cor específica.
     *
     * @param color A cor da moto S1000rr.
     */
    public S1000rr(String color) {
        super(color);
    }
}
