package io.github.gateguardian523.lightevaluator.functions.rounding;

import io.github.gateguardian523.lightevaluator.IMathValue;
import io.github.gateguardian523.lightevaluator.functions.NNFunction;

public class Floor extends NNFunction {

    public Floor(IMathValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    public int getRequiredArguments() {
        return 1;
    }

    @Override
    public double doubleValue() {
        return Math.floor(this.getArg(0).doubleValue());
    }
}