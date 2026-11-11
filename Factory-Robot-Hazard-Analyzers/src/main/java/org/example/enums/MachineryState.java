package org.example.enums;
import org.example.exception.RobotSafetyException;

public enum MachineryState {

    Worn,
    Faulty,
    Critical;

    // Converts a String into a supported machinery state.
    public static MachineryState fromString(String state)
            throws RobotSafetyException {

        try {
            return MachineryState.valueOf(state);

        } catch (IllegalArgumentException | NullPointerException exception) {

            throw new RobotSafetyException(
                    "Error: Unsupported machinery state"
            );
        }
    }
}