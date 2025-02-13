package io.github.gateguardian523.lightevaluator.functions.string;

import io.github.gateguardian523.lightevaluator.IMathValue;
import io.github.gateguardian523.lightevaluator.functions.SNFunction;

public class StringContains extends SNFunction {

    public StringContains(IMathValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    public int getRequiredArguments() {
        return 2;
    }

    @Override
    public double doubleValue() {
        return this.getArg(0).stringValue().contains(this.getArg(1).stringValue()) ? 1 : 0;
    }
}
