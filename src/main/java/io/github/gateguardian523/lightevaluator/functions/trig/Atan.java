package io.github.gateguardian523.lightevaluator.functions.trig;

import io.github.gateguardian523.lightevaluator.IMathValue;
import io.github.gateguardian523.lightevaluator.functions.NNFunction;

public class Atan extends NNFunction {

    public Atan(IMathValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    public int getRequiredArguments() {
        return 1;
    }

    @Override
    public double doubleValue() {
        return Math.atan(this.getArg(0).doubleValue());
    }
}
