package io.github.gateguardian523.lightevaluator.functions.classic;

import io.github.gateguardian523.lightevaluator.IMathValue;
import io.github.gateguardian523.lightevaluator.functions.NNFunction;

public class Pow extends NNFunction {

    public Pow(IMathValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    public int getRequiredArguments() {
        return 2;
    }

    @Override
    public double doubleValue() {
        return Math.pow(this.getArg(0).doubleValue(), this.getArg(1).doubleValue());
    }
}