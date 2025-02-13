package io.github.gateguardian523.lightevaluator.functions.rounding;

import io.github.gateguardian523.lightevaluator.IMathValue;
import io.github.gateguardian523.lightevaluator.functions.NNFunction;

public class Round extends NNFunction {

    public Round(IMathValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    public int getRequiredArguments() {
        return 1;
    }

    @Override
    public double doubleValue() {
        return Math.round(this.getArg(0).doubleValue());
    }
}