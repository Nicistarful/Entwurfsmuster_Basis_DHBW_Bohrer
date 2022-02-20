package state;

public class State1 extends State {
    public State1(Drill drill) {
        super(drill);
    }

    @Override
    public void pressButton() {
        super.drill.setRpm(2000);
        super.drill.setHasPower(true);
        super.drill.setState(new State2(super.drill));
    }
}
