package com.writerkang.calulatesystem.infrastructure.aggregate.bill;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class BillEntityId implements Serializable {

    private String id;

    protected BillEntityId(){}

    public BillEntityId(String id) {
        this.id = id;
    }
}
