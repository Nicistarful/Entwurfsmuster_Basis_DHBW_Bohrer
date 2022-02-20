package state;

public class State4 extends State {
    public State4(Drill drill) {
        super(drill);
    }

    @Override
    public void pressButton() {
        super.drill.setRpm(0);
        super.drill.setHasPower(false);
        super.drill.setState(new OffState(super.drill));
    }
}
