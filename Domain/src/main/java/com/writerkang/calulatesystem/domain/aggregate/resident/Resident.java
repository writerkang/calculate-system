package com.writerkang.calulatesystem.domain.aggregate.resident;

import com.writerkang.calulatesystem.domain.aggregate.apt.AptId;
import java.util.Objects;

public class Resident {
    private ResidentId id;
    private AptId aptId;
    private DongHo dongHo;
    private PaymentMethod paymentMethod;

    public Resident(ResidentId id, AptId aptId,
        DongHo dongHo,
        PaymentMethod paymentMethod) {

        Objects.requireNonNull(id);
        Objects.requireNonNull(aptId);
        Objects.requireNonNull(dongHo);
        Objects.requireNonNull(paymentMethod);

        this.id = id;
        this.aptId = aptId;
        this.dongHo = dongHo;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Resident resident = (Resident) o;
        return id.equals(resident.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
