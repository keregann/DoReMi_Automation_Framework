package steps;
import org.junit.Test;
import tabs.FlightsTab;

public class FlightsTest extends BaseTest{

    @Test
    public void testFlight() throws InterruptedException {
        FlightsTab ft = new FlightsTab();
        ft.setFlight()
                .clickBookNowBtn()
                .enterData();
    }
}
