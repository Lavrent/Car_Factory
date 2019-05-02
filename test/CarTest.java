import com.aca.carFactory.*;
import com.aca.carFactory.car.Car;
import com.aca.carFactory.car.CarType;
import com.aca.carFactory.car.Sedan;

public class CarTest {
    public static void main(String[] args) {
        assert new Sedan().getCarType() == CarType.Sedan;
    }
}
