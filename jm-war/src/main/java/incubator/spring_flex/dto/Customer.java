package incubator.spring_flex.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Class implementing a customer entity.
 * 
 * @author iwaszkiewicz
 * @date 06.02.2010
 */
public class Customer implements Serializable {

    private String firstname;
    private String lastname;
    private Date birthdate;
    private String phone;
    private String street;
    private String postal;
    private String city;
    private boolean newsletter;

    /*
     * getter & setter
     */

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostal() {
        return this.postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public boolean isNewsletter() {
		return newsletter;
	}

	public void setNewsletter(boolean newsletter) {
		this.newsletter = newsletter;
	}
    
}
