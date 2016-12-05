package base;

import com.google.common.eventbus.EventBus;
import com.google.inject.ImplementedBy;

@ImplementedBy(SimpleTickerDisplay.class)
public interface TickerDisplay {

	void connectTo(EventBus bus);

}
