package model;

public interface Item {
    default double calculatePrice() {
        return 0.0;
    }

}