package com.writerkang.calulatesystem.domain.aggregate.resident;

import java.util.Objects;

public class DongHo {
    private final String dong;
    private final String ho;

    public DongHo(String dong, String ho) {
        Objects.requireNonNull(dong);
        Objects.requireNonNull(ho);

        this.dong = dong;
        this.ho = ho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DongHo dongHo = (DongHo) o;
        return dong.equals(dongHo.dong) && ho.equals(dongHo.ho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dong, ho);
    }
}
