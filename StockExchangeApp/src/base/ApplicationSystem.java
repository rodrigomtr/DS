package base;

import com.google.common.eventbus.EventBus;

public class ApplicationSystem {

	public ApplicationSystem(StockExchange exchange, TickerDisplay ticker) {
		EventBus bus = new EventBus();
		exchange.connectTo(bus);
		ticker.connectTo(bus);
	}

}
