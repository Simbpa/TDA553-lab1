package test;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.Assert.assertThrows;


import java.awt.Color;

import org.junit.Test;
import src.*;

public class CarRepairShopTest {
    @Test
    public void canLoadCar() {
        Volvo240 testCar = new Volvo240();
        CarRepairShop testShop = new CarRepairShop(2, 10, 15);
        testShop.loadCar(testCar);
        assertEquals(true, testShop.isCarInLoad(testCar));
    }

    @Test
    public void canUnloadCar() {
        Volvo240 testCar = new Volvo240();
        CarRepairShop testShop = new CarRepairShop(2, 10, 15);
        testShop.loadCar(testCar);
        testShop.unloadCar(testCar);
        assertEquals(false, testShop.isCarInLoad(testCar));
    }

    @Test
    public void cantLoadCarTooFarAway() {
        Volvo240 testCar = new Volvo240();
        CarRepairShop testShop = new CarRepairShop(2, 10, 15);
        testShop.loadCar(testCar);
        testShop.unloadCar(testCar);
        assertEquals(false, testShop.isCarInLoad(testCar));
    }
}
