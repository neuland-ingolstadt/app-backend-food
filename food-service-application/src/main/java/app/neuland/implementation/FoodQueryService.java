package app.neuland.implementation;

import app.neuland.interfaces.inbound.FoodQueryUseCase;
import app.neuland.interfaces.outbound.FoodDataRepository;

public class FoodQueryService implements FoodQueryUseCase {

    private final FoodDataRepository foodDataRepository;

    public FoodQueryService(FoodDataRepository foodDataRepository) {
        this.foodDataRepository = foodDataRepository;
    }

}
