import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTestAgainstSecondConstructor {

    Car car;

    @BeforeEach
    public void Setup(){
        car = new Car("Chevrolet","Corvette");
    }
    //Act
    @Test
    public void testMake(){
        String expected = "Chevrolet";
        String actual = car.getMake();
//Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testModel(){
        String expected = "Corvette";
        String actual = car.getModel();
        assertEquals(expected, actual);
    }
}
