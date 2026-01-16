package br.com.dio.designpatterns.facade;

import br.com.dio.designpatterns.strategy.CalculationStrategy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class CalculationFacade {

    private final Map<String, CalculationStrategy> strategies;

    public CalculationFacade(List<CalculationStrategy> strategyList) {
        this.strategies = strategyList.stream()
                .collect(Collectors.toMap(
                        strategy -> strategy.getClass().getSimpleName(),
                        strategy -> strategy
                ));
    }

    public double execute(String strategyName, double value) {
        CalculationStrategy strategy = strategies.get(strategyName);

        if (strategy == null) {
            throw new IllegalArgumentException("Strategy not found: " + strategyName);
        }

        return strategy.calculate(value);
    }
}
