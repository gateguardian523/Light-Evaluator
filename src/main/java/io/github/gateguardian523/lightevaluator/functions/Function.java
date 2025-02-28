package io.github.gateguardian523.lightevaluator.functions;

import io.github.gateguardian523.lightevaluator.Constant;
import io.github.gateguardian523.lightevaluator.IMathValue;

/**
 * Abstract function class
 * <p>
 * This class provides function capability (i.e. giving it arguments and
 * upon {@link #get()} method you receive output).
 */
public abstract class Function implements IMathValue {

    protected IMathValue[] args;
    protected String name;

    protected IMathValue result = new Constant(0);

    public Function(IMathValue[] values, String name) throws Exception {
        if (values.length < this.getRequiredArguments()) {
            String message = String.format("Function '%s' requires at least %s arguments. %s are given!", this.getName(), this.getRequiredArguments(), values.length);

            throw new Exception(message);
        }

        for (int i = 0; i < values.length; i++) {
            this.verifyArgument(i, values[i]);
        }

        this.args = values;
        this.name = name;
    }

    protected void verifyArgument(int index, IMathValue value) {
    }

    @Override
    public void set(double value) {
    }

    @Override
    public void set(String value) {
    }

    /**
     * Get the value of nth argument
     */
    public IMathValue getArg(int index) {
        if (index < 0 || index >= this.args.length) {
            throw new IllegalStateException("Index should be within the argument's length range! Given " + index + ", arguments length: " + this.args.length);
        }

        return this.args[index].get();
    }

    @Override
    public String toString() {
        StringBuilder args = new StringBuilder();
        for (int i = 0; i < this.args.length; i++) {
            args.append(this.args[i].toString());

            if (i < this.args.length - 1) {
                args.append(", ");
            }
        }
        return this.getName() + "(" + args + ")";
    }

    /**
     * Get name of this function
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get minimum count of arguments this function needs
     */
    public int getRequiredArguments() {
        return 0;
    }
}