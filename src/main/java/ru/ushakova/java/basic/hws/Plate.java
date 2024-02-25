package ru.ushakova.java.basic.hws;

public class Plate {

    protected Integer maxFood;
    protected Integer currentFoodAmount;

    public Plate(Integer currentFoodAmount) {
        this.maxFood = currentFoodAmount;
        this.currentFoodAmount = currentFoodAmount;
    }

    public Integer getMaxFood() {
        return maxFood;
    }

    public Integer getCurrentFoodAmount() {
        return currentFoodAmount;
    }

    public void addFood() {
        currentFoodAmount += maxFood - currentFoodAmount;
    }

    public Boolean reduceFood(Integer amount) {
        if ((currentFoodAmount != null && currentFoodAmount > 0) && (amount != null && amount > 0)) {
            currentFoodAmount -= amount;
        }
        return currentFoodAmount >= 0;
    }

}
