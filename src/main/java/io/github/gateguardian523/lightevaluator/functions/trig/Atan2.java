package io.github.gateguardian523.lightevaluator.functions.trig;

import io.github.gateguardian523.lightevaluator.IMathValue;
import io.github.gateguardian523.lightevaluator.functions.NNFunction;

public class Atan2 extends NNFunction {

    public Atan2(IMathValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    public int getRequiredArguments() {
        return 2;
    }

    @Override
    public double doubleValue() {
        return Math.atan2(this.getArg(0).doubleValue(), this.getArg(1).doubleValue());
    }
}
