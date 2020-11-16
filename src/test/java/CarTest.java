import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
//Arrange
    Car car;

    @BeforeEach
    public void Setup(){
        car = new Car();
    }
//Act
    @Test
    public void testMake(){
        String expected = "Chevrolet";
        car.setMake("Chevrolet");
        String actual = car.getMake();
//Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testModel(){
        String expected = "Corvette";
        car.setModel("Corvette");
        String actual = car.getModel();
        assertEquals(expected, actual);
    }

}
