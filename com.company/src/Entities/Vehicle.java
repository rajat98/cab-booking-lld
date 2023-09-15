package Entities;

import Enums.Category;

public class Vehicle {
    private String modelName;
    private String brandName;
    private String plateNo;
    private Category category;

    public Vehicle() {
        this.brandName = "Nissan";
        this.modelName = "GTR";
        this.plateNo = "ABC123";
        this.category = Category.SPORTS;
    }
}
