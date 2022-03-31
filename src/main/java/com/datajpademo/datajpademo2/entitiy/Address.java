package com.datajpademo.datajpademo2.entitiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.util.Objects;

/**
 * @author bir birs sgrg007@gmail.com
 * @since 3/30/2022
 */
@Getter
@Setter
@Embeddable
public class Address {
    private String address;
    private String city;
    private String state;
    private String zipCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address1 = (Address) o;
        return Objects.equals(getAddress(), address1.getAddress()) && Objects.equals(getCity(), address1.getCity()) && Objects.equals(getState(), address1.getState()) && Objects.equals(getZipCode(), address1.getZipCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddress(), getCity(), getState(), getZipCode());
    }
}
