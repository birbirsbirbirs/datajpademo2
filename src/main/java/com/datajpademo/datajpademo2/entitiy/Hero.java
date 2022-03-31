package com.datajpademo.datajpademo2.entitiy;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author bir birs sgrg007@gmail.com
 * @since 3/30/2022
 */
@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverrides({
        @AttributeOverride(
                name = "shippingAddress.address",
                column = @Column(name="shipping_address")
        ),
        @AttributeOverride(
                name = "shippingAddress.city",
                column = @Column(name="shipping_city")
        ),
        @AttributeOverride(
                name = "shippingAddress.state",
                column = @Column(name="shipping_state")
        ),
        @AttributeOverride(
                name = "shippingAddress.zipCode",
                column = @Column(name="shipping_zip_code")
        ),
        @AttributeOverride(
                name = "billToAddress.address",
                column = @Column(name="bill_to_address")
        ),
        @AttributeOverride(
                name = "billToAddress.address",
                column = @Column(name="bill_to_address")
        ),
        @AttributeOverride(
                name = "billToAddress.city",
                column = @Column(name="bill_to_city")
        ),
        @AttributeOverride(
                name = "billToAddress.state",
                column = @Column(name="bill_to_state")
        ),
        @AttributeOverride(
                name = "billToAddress.zipCode",
                column = @Column(name="bill_to_zip_code")
        )
})
public class Hero extends BaseEntity {
    private String name;
    private Address shippingAddress;
    private Address billToAddress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hero)) return false;
        if (!super.equals(o)) return false;
        Hero hero = (Hero) o;
        return Objects.equals(getName(), hero.getName()) && Objects.equals(getShippingAddress(), hero.getShippingAddress()) && Objects.equals(getBillToAddress(), hero.getBillToAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getName(), getShippingAddress(), getBillToAddress());
    }
}
