package base;

import java.util.HashMap;
import java.util.Map;

public class SimpleStockExchange extends AbstractStockExchange {

	public SimpleStockExchange(String name, String[] stocks) {
		super(name, stocks);
	}

	@Override
	protected StocksEvent randomEvent() {
		Map<String, Object> info = new HashMap<>();
		info.put("quote", randomQuote());
		return new StocksEvent(randomStock(), info);
	}

}
