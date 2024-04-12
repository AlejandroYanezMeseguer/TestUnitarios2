import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class TestDato {

    @Test
    @DisplayName("Prueba del metodo dato de la clase dato")
    public void testDato(){
        Dato dato1 = Dato.getInstance();
        Dato dato2 = Dato.getInstance();
        assertSame(dato1,dato2);
    }

}
