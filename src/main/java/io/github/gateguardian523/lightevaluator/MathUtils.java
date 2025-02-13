package io.github.gateguardian523.lightevaluator;

public class MathUtils {

    public static double clamp(double value, double min, double max) {
        return value < min ? min : Math.min(value, max);
    }

    public static double lerp(double start, double end, double delta) {
        return start + delta * (end - start);
    }

    /**
     * Special interpolation method for interpolating yaw. The problem with yaw,
     * is that it may go in the "wrong" direction when having, for example,
     * -170 (as a) and 170 (as b) degress or other way around (170 and -170).
     * <p>
     * This interpolation method fixes this problem.
     */
    public static double lerpDegrees(double start, double end, double delta) {
        start = wrapDegrees(start);
        end = wrapDegrees(end);
        return wrapDegrees(start + delta * wrapDegrees(end - start));
    }

    /**
     * Wrap angle (degrees) in the range of -180 to 180
     *
     * @param angle angle to be wrapped
     * @return wrapped angle
     */
    public static double wrapDegrees(double angle) {
        double remainder = angle % 360.0;
        if (remainder > 180.0 || remainder < -180.0) {
            return Math.copySign(360.0 - Math.abs(remainder), -remainder);
        }
        return remainder;
    }
}
