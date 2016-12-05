package base;

import java.util.HashMap;
import java.util.Map;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ComplexStockExchange extends AbstractStockExchange {

	@Inject
	public ComplexStockExchange(@Named("name") String name, @Named("stocks") String[] stocks) {
		super(name, stocks);
	}

	@Override
	protected StocksEvent randomEvent() {
		Map<String, Object> info = new HashMap<>();
		info.put("volume", randomVolume());
		info.put("quote", randomQuote());
		return new StocksEvent(randomStock(), info);
	}

}
