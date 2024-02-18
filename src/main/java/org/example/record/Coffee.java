package org.example.record;

public record Coffee(String name, Size size, double basePrice) {
    public double getPrice() {
        return switch (size) {
            case SMALL -> basePrice;
            case MEDIUM -> basePrice + 1;
            case LARGE -> basePrice + 2;
        };
    }
}
