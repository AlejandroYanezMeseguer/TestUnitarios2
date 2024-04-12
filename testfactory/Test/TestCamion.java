import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCamion {

    @Test
    @DisplayName("Test Camion")
    public void TestCamion(){
        IComunTransporte TestCamion = FactoryTransport.getProducto(FactoryTransport.camion);

        assertTrue(TestCamion instanceof Camion);

    }

}
