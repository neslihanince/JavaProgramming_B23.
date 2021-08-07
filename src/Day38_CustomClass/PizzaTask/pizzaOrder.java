package Day38_CustomClass.PizzaTask;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class pizzaOrder {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

        //add 30 medium size pizza with 2 cheese topping and 2 pepperoni toppings

        for (int i =1; i <= 30; i++){

            Pizza pizza = new Pizza();
            pizza.customOrder('M', 2, 2);
            pizzas.add(pizza);
        }

        //add 80 large pizza with 3 cheese toppings and 4 pepperoni toppings

        for (int i = 1; i <= 80; i++){
            Pizza pizza = new Pizza();
            pizza.customOrder('L', 3, 4);
            pizzas.add(pizza);
        }

        //add 38 small pizza with 2 cheese topping and 1 pepperoni topping
        for (int i = 1; i <= 38; i++){
            Pizza pizza = new Pizza();
            pizza.customOrder('S', 2, 1);
            pizzas.add(pizza);
        }

        System.out.println("Total Number of Pizza :  " + pizzas.size());

        double totalPrice = 0;

        for (Pizza pizza :pizzas){
            totalPrice += pizza.calcCost();
        }

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("totalPrice = " + df.format(totalPrice));


    }
}
