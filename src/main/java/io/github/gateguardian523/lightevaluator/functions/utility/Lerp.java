package io.github.gateguardian523.lightevaluator.functions.utility;

import io.github.gateguardian523.lightevaluator.IMathValue;
import io.github.gateguardian523.lightevaluator.functions.NNFunction;
import io.github.gateguardian523.lightevaluator.utils.MathUtils;

public class Lerp extends NNFunction {

    public Lerp(IMathValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    public int getRequiredArguments() {
        return 3;
    }

    @Override
    public double doubleValue() {
        return MathUtils.lerp(
                this.getArg(0).doubleValue(),
                this.getArg(1).doubleValue(),
                this.getArg(2).doubleValue());
    }
}