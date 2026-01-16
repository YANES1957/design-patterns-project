package br.com.dio.designpatterns.controller;

import br.com.dio.designpatterns.facade.CalculationFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculationController {

    private final CalculationFacade facade;

    public CalculationController(CalculationFacade facade) {
        this.facade = facade;
    }

    @GetMapping
    public double calculate(
            @RequestParam String strategy,
            @RequestParam double value
    ) {
        return facade.execute(strategy, value);
    }
}
