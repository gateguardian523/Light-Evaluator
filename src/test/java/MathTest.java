import io.github.gateguardian523.lightevaluator.MathUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest extends TestBase {

    @Test
    public void test() {
        assertEquals(MathUtils.clamp(5, -6, 10), 5);
        assertEquals(MathUtils.clamp(15, -6, 10), 10);

        assertEquals(MathUtils.wrapDegrees(210), -150);
        assertEquals(MathUtils.wrapDegrees(180), 180);
        assertEquals(MathUtils.wrapDegrees(-210), 150);
        assertEquals(MathUtils.wrapDegrees(-180), -180);

        assertEquals(MathUtils.lerpDegrees(-20, 20, 0.5), 0);
        assertEquals(MathUtils.lerpDegrees(-120, 120, 0.5), -180);
        assertEquals(MathUtils.lerpDegrees(-170, 170, 0.5), -180);
        assertEquals(MathUtils.lerpDegrees(-170, 170, 0.6), 178);
    }
}
