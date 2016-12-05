package base;

import com.google.common.eventbus.EventBus;
import com.google.inject.ImplementedBy;

@ImplementedBy(SimpleStockExchange.class)
public interface StockExchange {

	String getName();
	
	void connectTo(EventBus bus);

}
