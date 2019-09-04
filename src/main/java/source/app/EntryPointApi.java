package source.app;

import io.swagger.api.CarApi;
import io.swagger.model.Car;
import io.swagger.model.CarUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EntryPointApi implements CarApi {

    @Override
    public ResponseEntity<List<Car>> findBy_(@Valid CarUser carUser) {
        List<Car> carList = new ArrayList<>();
        Car car = new Car();
        car.setName("Corvette");
        car.setId(1l);
        carList.add(car);
        ResponseEntity<List<Car>> listResponseEntity = new ResponseEntity(carList, HttpStatus.OK);
        return listResponseEntity;
    }
}
