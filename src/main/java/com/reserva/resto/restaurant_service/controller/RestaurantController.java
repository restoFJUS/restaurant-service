package com.reserva.resto.restaurant_service.controller;

import com.reserva.resto.restaurant_service.entity.Restaurant;
import com.reserva.resto.restaurant_service.service.RestaurantService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/abm-restaurantes")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    //--> ABM de Restaurantes
    //--> POSTs
    @PostMapping("/create-restaurant")
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody Restaurant restaurant) {
        Restaurant restaurantCreated = restaurantService.createRestaurant(restaurant);
        return ResponseEntity.status(HttpStatus.CREATED).body(restaurantCreated);
    }

    //--> GETs
    @GetMapping("/get-all-restaurants")
    public ResponseEntity<List<Restaurant>> getAllRestaurants() {
        List<Restaurant> allRestaurants = restaurantService.getAllRestaurants();
        return ResponseEntity.ok(allRestaurants);
    }

    @GetMapping("/get-restaurant/{id}")
    public ResponseEntity<Restaurant> getRestaurant(@PathVariable Long id) {
        Restaurant restaurant = restaurantService.getRestaurant(id);
        return ResponseEntity.ok(restaurant);
    }

    //--> PUTs
    @PutMapping("/update-restaurant")
    public ResponseEntity<Restaurant> updateRestaurant(@RequestBody Restaurant restaurant) {
        Restaurant restaurantUpdated = restaurantService.updateRestaurant(restaurant);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(restaurantUpdated);
    }

    //--> DELETEs
    @DeleteMapping("/delete-restaurant/{id}")
    public ResponseEntity<?> deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteRestaurant(id);
        return ResponseEntity.ok().body(restaurantService.getRestaurant(id));
    }


}
