package com.pizzapete.pizza_pete.Controller;


import com.pizzapete.pizza_pete.Entity.Pizza;
import com.pizzapete.pizza_pete.Service.PizzaService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@RestController
@RequestMapping("/api/pizzas")
@CrossOrigin(origins = "*")

public class PizzaController {
    private final PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping
    public List<Pizza> getAllPizzas() {
        return pizzaService.getAllPizzas();

    }
}
