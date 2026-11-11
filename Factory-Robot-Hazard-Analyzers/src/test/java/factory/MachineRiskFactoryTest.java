package factory;

import org.example.enums.MachineryState;
import org.example.exception.RobotSafetyException;
import org.example.factory.MachineryRiskFactory;
import org.example.strategy.MachineryRiskStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MachineryRiskFactoryTest {

    private final MachineryRiskFactory factory =
            new MachineryRiskFactory();

    // Verifies that the factory creates the worn risk strategy.
    @Test
    void shouldCreateWornRiskStrategy() throws RobotSafetyException {

        MachineryRiskStrategy strategy =
                factory.createStrategy(MachineryState.Worn);

        assertEquals(1.3, strategy.getRiskFactor(), 0.001);
    }

    // Verifies that the factory creates the faulty risk strategy.
    @Test
    void shouldCreateFaultyRiskStrategy() throws RobotSafetyException {

        MachineryRiskStrategy strategy =
                factory.createStrategy(MachineryState.Faulty);

        assertEquals(2.0, strategy.getRiskFactor(), 0.001);
    }

    // Verifies that the factory creates the critical risk strategy.
    @Test
    void shouldCreateCriticalRiskStrategy() throws RobotSafetyException {

        MachineryRiskStrategy strategy =
                factory.createStrategy(MachineryState.Critical);

        assertEquals(3.0, strategy.getRiskFactor(), 0.001);
    }

    // Verifies that null machinery state is rejected.
    @Test
    void shouldRejectNullMachineryState() {

        assertThrows(
                RobotSafetyException.class,
                () -> factory.createStrategy(null)
        );
    }
}