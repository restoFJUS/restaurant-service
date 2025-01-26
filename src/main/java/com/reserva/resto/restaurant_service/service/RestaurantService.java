package com.reserva.resto.restaurant_service.service;

import com.reserva.resto.restaurant_service.entity.Restaurant;

import java.util.List;

public interface RestaurantService {

    public Restaurant createRestaurant(Restaurant restaurant);
    public Restaurant getRestaurant(Long id);
    public List<Restaurant> getAllRestaurants();
    public Restaurant updateRestaurant(Restaurant restaurant);
    public void deleteRestaurant(Long id);
}
