import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBicicleta {

    @Test
    @DisplayName("Test Bicicleta")
    public void TestBicicleta(){
        IComunTransporte TestBicicleta = FactoryTransport.getProducto(FactoryTransport.bicicleta);

        assertTrue(TestBicicleta instanceof Bicicleta);

    }

}
