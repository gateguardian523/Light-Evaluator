package io.github.gateguardian523.lightevaluator.functions.classic;

import io.github.gateguardian523.lightevaluator.IMathValue;
import io.github.gateguardian523.lightevaluator.functions.NNFunction;

public class Exp extends NNFunction {

    public Exp(IMathValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    public int getRequiredArguments() {
        return 1;
    }

    @Override
    public double doubleValue() {
        return Math.exp(this.getArg(0).doubleValue());
    }
}