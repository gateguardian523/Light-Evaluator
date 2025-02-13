package io.github.gateguardian523.lightevaluator;

/**
 * Negate operator class
 * <p>
 * This class is responsible for negating given value
 */
public class Negate extends Wrapper {

    public Negate(IMathValue value) {
        super(value);
    }

    @Override
    protected void process() {
        this.result.set(this.doubleValue());
    }

    @Override
    public double doubleValue() {
        return this.booleanValue() ? 1 : 0;
    }

    @Override
    public boolean booleanValue() {
        return !this.value.booleanValue();
    }

    @Override
    public String toString() {
        return "!" + this.value.toString();
    }
}