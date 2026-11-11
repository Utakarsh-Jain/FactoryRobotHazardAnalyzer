package org.example.factory;

import org.example.enums.MachineryState;
import org.example.exception.RobotSafetyException;
import org.example.strategy.CriticalRiskStrategy;
import org.example.strategy.FaultyRiskStrategy;
import org.example.strategy.MachineryRiskStrategy;
import org.example.strategy.WornRiskStrategy;

public class MachineryRiskFactory {

    // Creates the appropriate strategy for the machinery state.
    public MachineryRiskStrategy createStrategy(MachineryState state)
            throws RobotSafetyException {

        if (state == null) {
            throw new RobotSafetyException(
                    "Error: Unsupported machinery state"
            );
        }

        return switch (state) {
            case Worn -> new WornRiskStrategy();
            case Faulty -> new FaultyRiskStrategy();
            case Critical -> new CriticalRiskStrategy();
        };
    }
}