package io.github.gateguardian523.lightevaluator.functions.utility;

import io.github.gateguardian523.lightevaluator.IMathValue;

public class DieRollInteger extends DieRoll {

    public DieRollInteger(IMathValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    public double doubleValue() {
        return (int) super.doubleValue();
    }
}