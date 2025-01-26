package com.reserva.resto.restaurant_service.service;

import com.reserva.resto.restaurant_service.entity.Restaurant;
import com.reserva.resto.restaurant_service.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImp implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public Restaurant createRestaurant(Restaurant restaurant) {return restaurantRepository.save(restaurant); }

    @Override
    public Restaurant getRestaurant(Long id) {return restaurantRepository.findById(id).orElse(null);}

    @Override
    public List<Restaurant> getAllRestaurants() {return restaurantRepository.findAll();}

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant) {
        Restaurant restaurantDB = getRestaurant(restaurant.getId());
        if (restaurantDB == null) {
            return null;
        }
        return restaurantRepository.save(restaurant);
    }

    @Override
    public void deleteRestaurant(Long id) {
        Restaurant restaurantDB = getRestaurant(id);
        if (restaurantDB != null) {
            restaurantRepository.delete(restaurantDB);
        }
    }


}
