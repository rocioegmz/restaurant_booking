package ProyectoIntegrador.BookingRestaurantes.service;

import ProyectoIntegrador.BookingRestaurantes.domain.Restaurant;
import ProyectoIntegrador.BookingRestaurantes.repository.IRestaurantRepository;
import lombok.AllArgsConstructor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RestaurantService {
    public static final Logger logger= Logger.getLogger(RestaurantService.class);
    private IRestaurantRepository restaurantRepository;

    public Restaurant saveRestaurant(Restaurant restaurant){
        logger.info("Save the restaurant with id: " + restaurant.getId());
        return restaurantRepository.save(restaurant);
    }
}
