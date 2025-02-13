package io.github.gateguardian523.lightevaluator.functions.limit;

import io.github.gateguardian523.lightevaluator.IMathValue;
import io.github.gateguardian523.lightevaluator.functions.NNFunction;
import io.github.gateguardian523.lightevaluator.utils.MathUtils;

public class Clamp extends NNFunction {

    public Clamp(IMathValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    public int getRequiredArguments() {
        return 3;
    }

    @Override
    public double doubleValue() {
        return MathUtils.clamp(
                this.getArg(0).doubleValue(),
                this.getArg(1).doubleValue(),
                this.getArg(2).doubleValue());
    }
}