package com.pizzapete.pizza_pete.repository;
import com.pizzapete.pizza_pete.Entity.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
