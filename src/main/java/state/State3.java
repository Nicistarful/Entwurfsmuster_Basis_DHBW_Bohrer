package state;

public class State3 extends State {
    public State3(Drill drill) {
        super(drill);
    }

    @Override
    public void pressButton() {
        super.drill.setRpm(4000);
        super.drill.setHasPower(true);
        super.drill.setState(new State4(super.drill));
    }
}
