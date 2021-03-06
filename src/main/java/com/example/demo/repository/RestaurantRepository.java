package com.example.demo.repository;

import com.example.demo.model.Restaurant;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {
    //findall
    Optional<Restaurant> findByName(String name);
    Optional<Restaurant> findByAdmin_Username(String username);
    Optional<Restaurant> findByAdmin(User admin);

}
