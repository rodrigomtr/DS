package base;

import com.google.common.eventbus.EventBus;

public interface StockExchange {

	String getName();
	
	void connectTo(EventBus bus);

}
