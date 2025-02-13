package io.github.gateguardian523.lightevaluator.functions.utility;

import io.github.gateguardian523.lightevaluator.IMathValue;

public class RandomInteger extends Random {

    public RandomInteger(IMathValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    public double doubleValue() {
        return (int) super.doubleValue();
    }
}