package com.andrei.sfgrestbrewery.domain;

import com.andrei.sfgrestbrewery.web.model.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;

import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by jt on 2019-05-25.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer implements Persistable {

    @Id
    private Integer id;

    private Long version;

    private String beerName;
    private BeerStyleEnum beerStyle;
    private String upc;

    private Integer quantityOnHand;
    private BigDecimal price;


    @CreatedDate
    private Timestamp createdDate;

    @LastModifiedDate
    private Timestamp lastModifiedDate;

    @Transient
    private boolean newBeer;

    @Override
    @Transient
    public boolean isNew() {
        return this.newBeer || id == null;
    }

    public Beer setAsNew(){
        this.newBeer = true;
        return this;
    }
}
