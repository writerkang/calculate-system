package com.writerkang.calulatesystem.infrastructure.aggregate.bill;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BillEntity {

    @EmbeddedId
    BillEntityId id;
}
