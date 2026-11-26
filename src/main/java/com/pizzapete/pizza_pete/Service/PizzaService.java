package com.pizzapete.pizza_pete.Service;


import com.pizzapete.pizza_pete.Entity.Pizza;
import com.pizzapete.pizza_pete.repository.PizzaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PizzaService {
    private final PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

}
