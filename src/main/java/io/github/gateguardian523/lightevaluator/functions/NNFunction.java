package io.github.gateguardian523.lightevaluator.functions;

import io.github.gateguardian523.lightevaluator.IMathValue;
import io.github.gateguardian523.lightevaluator.Operation;

/**
 * Function that expects number input arguments and outputs a number
 */
public abstract class NNFunction extends Function {

    public NNFunction(IMathValue[] values, String name) throws Exception {
        super(values, name);
    }

    @Override
    protected void verifyArgument(int index, IMathValue value) {
        if (!value.isNumber()) {
            throw new IllegalStateException("Function " + this.name + " cannot receive string arguments!");
        }
    }

    @Override
    public IMathValue get() {
        this.result.set(this.doubleValue());

        return this.result;
    }

    @Override
    public boolean isNumber() {
        return true;
    }

    @Override
    public boolean booleanValue() {
        return Operation.isTrue(this.doubleValue());
    }

    @Override
    public String stringValue() {
        return "";
    }
}
