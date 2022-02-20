import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import state.*;

public class StatePatternTests {
    @Test
    public void drillStartsInOffMode() {
        Drill drill = new Drill();
        Assertions.assertEquals(drill.getState().getClass(), OffState.class);
    }

    @Test
    public void drillIsNotRunningAfterStart() {
        Drill drill = new Drill();
        drill.pressButton();
        Assertions.assertEquals(drill.getState().getClass(), OnState.class);
        Assertions.assertEquals(0, drill.getRpm());
    }

    @Test
    public void drillGoesThroughAllStates() {
        Drill drill = new Drill();
        Assertions.assertEquals(drill.getState().getClass(), OffState.class);
        drill.pressButton();
        Assertions.assertEquals(drill.getState().getClass(), OnState.class);
        drill.pressButton();
        Assertions.assertEquals(drill.getState().getClass(), State1.class);
        drill.pressButton();
        Assertions.assertEquals(drill.getState().getClass(), State2.class);
        drill.pressButton();
        Assertions.assertEquals(drill.getState().getClass(), State3.class);
        drill.pressButton();
        Assertions.assertEquals(drill.getState().getClass(), State4.class);
        drill.pressButton();
        Assertions.assertEquals(drill.getState().getClass(), OffState.class);
    }
}
