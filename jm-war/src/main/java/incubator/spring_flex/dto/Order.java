package incubator.spring_flex.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Class implementing an order entity. <br/>
 * We must use a table name different from 'order' as this key reserved by SQL.
 * 
 * @author iwaszkiewicz
 * @date 06.02.2010
 */
public class Order implements Serializable {

    private Customer customer;
    private Collection<OrderItem> orderItems;

    /*
     * Getter & Setter
     */

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Collection<OrderItem> getOrderItems() {
        if (this.orderItems == null) {
            this.orderItems = new ArrayList<OrderItem>();
        }
        return this.orderItems;
    }

    public void setOrderItems(Collection<OrderItem> pizzas) {
        this.orderItems = pizzas;
    }

    public void addPizza(Pizza pizza) {
        OrderItem orderedPizza = new OrderItem();
        orderedPizza.setPizza(pizza);
        
        for(OrderItem tmp : getOrderItems()){
            if(tmp.getPizza().getName().equals(pizza.getName())){
                tmp.setAmount(tmp.getAmount() + 1);
                return;
            }
        }
        
        getOrderItems().add(orderedPizza);
    }

    public void removePizza(OrderItem orderedPizza) {
        
        OrderItem toRemove = null;
        
        for(OrderItem tmp : getOrderItems()){
            if(tmp.getPizza().getName().equals(orderedPizza.getPizza().getName())){
                int amount = tmp.getAmount() - 1;
                
                if(amount == 0){
                    toRemove = tmp;
                    break;
                } else {
                    tmp.setAmount(amount);
                    return;
                }
            }
        }
        getOrderItems().remove(toRemove);
    }
}
