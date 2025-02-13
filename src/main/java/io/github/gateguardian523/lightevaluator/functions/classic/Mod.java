package io.github.gateguardian523.lightevaluator.functions.classic;

import io.github.gateguardian523.lightevaluator.IMathValue;
import io.github.gateguardian523.lightevaluator.functions.NNFunction;

public class Mod extends NNFunction {

    public Mod(IMathValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    public int getRequiredArguments() {
        return 2;
    }

    @Override
    public double doubleValue() {
        return this.getArg(0).doubleValue() % this.getArg(1).doubleValue();
    }
}