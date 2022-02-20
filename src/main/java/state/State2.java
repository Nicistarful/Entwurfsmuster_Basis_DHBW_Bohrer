package state;

public class State2 extends State {
    public State2(Drill drill) {
        super(drill);
    }

    @Override
    public void pressButton() {
        super.drill.setRpm(3000);
        super.drill.setHasPower(true);
        super.drill.setState(new State3(super.drill));
    }
}
