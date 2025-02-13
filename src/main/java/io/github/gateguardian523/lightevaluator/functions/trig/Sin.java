package io.github.gateguardian523.lightevaluator.functions.trig;

import io.github.gateguardian523.lightevaluator.IMathValue;
import io.github.gateguardian523.lightevaluator.functions.NNFunction;

public class Sin extends NNFunction {

    public Sin(IMathValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    public int getRequiredArguments() {
        return 1;
    }

    @Override
    public double doubleValue() {
        return Math.sin(this.getArg(0).doubleValue());
    }
}