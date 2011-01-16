package incubator.spring_flex.dto;

import java.io.Serializable;

/**
 * Class implementing a pizza entity.
 * 
 * @author iwaszkiewicz
 * @date 06.02.2010
 */
public class Pizza implements Serializable {

    private String name;
    private double price;

    /*
     * getter & setter
     */

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
