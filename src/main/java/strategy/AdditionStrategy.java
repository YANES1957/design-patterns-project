package br.com.dio.designpatterns.strategy;

import org.springframework.stereotype.Component;

@Component
public class AdditionStrategy implements br.com.dio.designpatterns.strategy.CalculationStrategy {

    @Override
    public double calculate(double value) {
        return value + 10;
    }
}
