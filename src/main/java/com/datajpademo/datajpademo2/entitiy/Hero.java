package com.datajpademo.datajpademo2.entitiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

/**
 * @author bir birs sgrg007@gmail.com
 * @since 3/30/2022
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hero extends BaseEntity{

    private String name;
}
