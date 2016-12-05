package base;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StocksEvent {

	private final String stock;
	private final Map<String, Object> info;

	public StocksEvent(String stock, Map<String, Object> info) {
		this.stock = stock;
		this.info = new HashMap<>(info);
	}

	public String getStock() {
		return stock;
	}

	public Map<String, Object> getInfo() {
		return Collections.unmodifiableMap(info);
	}

	@Override
	public String toString() {
		return stock + " " + info;
	}
}
