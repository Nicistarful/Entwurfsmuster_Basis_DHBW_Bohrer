package state;

public class Drill {
    private int rpm;
    private boolean hasPower;
    private State state;

    public Drill() {
        rpm = 0;
        hasPower = false;
        state = new OffState(this);
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
        Logger.log("RPM set to " + rpm);
    }

    public boolean getHasPower() {
        return hasPower;
    }

    public void setHasPower(boolean hasPower) {
        this.hasPower = hasPower;
        Logger.log("Drill has power: " + hasPower);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        Logger.log("Drill is now in state " + state.getClass().getSimpleName());
    }

    public void pressButton() {
        Logger.log("Button was pressed");
        state.pressButton();
    }
}
