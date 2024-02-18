package org.example.record;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Order {
    private Customer customer;
    private List<Coffee> coffees;

    public static void main(String[] args) {
        Order order1 = new Order(new Customer("naveen"),
                List.of(new Coffee("cappuccino", Size.SMALL, 1),
                        new Coffee("coffee", Size.MEDIUM, 1),
                        new Coffee("tea", Size.LARGE, 1),
                        new Coffee("black coffee", Size.SMALL, 1),
                        new Coffee("Good Tea", Size.MEDIUM, 1)
                ));

        double finalPrice = order1.getCoffees().stream()
                .map(Coffee::getPrice)
                .mapToDouble(Double::doubleValue).sum();
        if (finalPrice < 20) {
            System.out.println(STR."Your order value is \{finalPrice}");
        } else if (finalPrice > 20) {
            var finalPriceAfterDiscount = finalPrice * 0.90;
            System.out.println(STR."Your order value is \{finalPriceAfterDiscount} and the discounted value is \{finalPrice * .10}");
        }
        order1.getDetails(order1);

    }

    public void getDetails(Order order) {
        System.out.println(order);
    }
}
