package ar.edu.unahur.obj2.ejercicio4;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EnvioYaTest {

    private EnvioYa envioYa;

    @BeforeTest
    public void setup() {
        envioYa = new EnvioYa();
    }

    @Test
    public void testCalculoCostoEnvio() {
        double costo = envioYa.calculoCostoEnvio(TipoEnvio.Normal, TipoPaquete.Chico, 100 );
        assertEquals(costo, 100000.0);
    }
}
