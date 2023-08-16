package com.post.priceservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.post.priceservice.modell.Price;

@Repository
public interface Pricerepo extends JpaRepository<Price,Integer> {
}
