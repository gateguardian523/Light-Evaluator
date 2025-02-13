package io.github.gateguardian523.lightevaluator.functions.classic;

import io.github.gateguardian523.lightevaluator.IMathValue;
import io.github.gateguardian523.lightevaluator.functions.NNFunction;

public class Ln extends NNFunction {

    public Ln(IMathValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    public int getRequiredArguments() {
        return 1;
    }

    @Override
    public double doubleValue() {
        return Math.log(this.getArg(0).doubleValue());
    }
}