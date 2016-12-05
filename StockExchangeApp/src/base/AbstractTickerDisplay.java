package base;

import com.google.common.eventbus.EventBus;

public class AbstractTickerDisplay implements TickerDisplay {

	@Override
	public void connectTo(EventBus bus) {
		bus.register(this);
	}

}
