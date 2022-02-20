package state;

public abstract class State {
    public State(Drill drill) {
        this.drill = drill;
    }

    protected Drill drill;
    public abstract void pressButton();
}