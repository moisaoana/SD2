package com.example.demo.mapper;

import com.example.demo.dto.FoodItemDTO;
import com.example.demo.dto.RestaurantDTO;
import com.example.demo.model.DeliveryZone;
import com.example.demo.model.FoodItem;
import com.example.demo.model.Restaurant;
import com.example.demo.model.User;
import com.example.demo.model.enums.FoodCategory;
import com.example.demo.service.FoodItemService;
import com.example.demo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FoodItemMapper {


    public FoodItem convertFromDTO(FoodItemDTO foodItemDTO, Restaurant restaurant){
        double price=Double.parseDouble(foodItemDTO.getPrice());
        FoodCategory foodCategory=FoodCategory.valueOf(foodItemDTO.getCategory());
        return  new FoodItem(foodItemDTO.getName(), foodItemDTO.getDescription(), price, foodCategory, restaurant);
    }
    public FoodItemDTO convertToDTO(FoodItem foodItem){
        return new FoodItemDTO(foodItem.getName(), foodItem.getDescription(),String.valueOf(foodItem.getPrice()),foodItem.getCategory().toString(),foodItem.getRestaurant().getAdmin().getUsername());
    }
}
