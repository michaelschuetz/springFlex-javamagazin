package incubator.spring_flex.dto;

import java.io.Serializable;

public class OrderItem implements Serializable {

    private Pizza pizza;
    private int amount = 1;

    /*
     * getter & setter
     */

    public Pizza getPizza() {
        return this.pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
