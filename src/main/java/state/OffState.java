package state;

public class OffState extends State {
    public OffState(Drill drill) {
        super(drill);
    }

    @Override
    public void pressButton() {
        super.drill.setHasPower(true);
        super.drill.setRpm(0);
        super.drill.setState(new OnState(super.drill));
    }
}
