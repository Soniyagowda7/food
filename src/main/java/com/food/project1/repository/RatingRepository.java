package com.food.project1.repository;

import com.food.project1.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating , Integer> {
}
