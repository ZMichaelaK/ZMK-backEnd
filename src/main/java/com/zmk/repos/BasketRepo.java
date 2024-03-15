package com.zmk.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zmk.domain.Basket;

public interface BasketRepo extends JpaRepository<Basket, Integer>{

}
