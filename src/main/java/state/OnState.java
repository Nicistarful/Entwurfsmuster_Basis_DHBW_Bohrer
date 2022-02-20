package state;

public class OnState extends State {
    public OnState(Drill drill) {
        super(drill);
    }

    @Override
    public void pressButton() {
        super.drill.setHasPower(true);
        super.drill.setRpm(1000);
        super.drill.setState(new State1(super.drill));
    }
}
