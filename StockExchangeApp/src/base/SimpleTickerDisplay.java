package base;

import com.google.common.eventbus.Subscribe;

public class SimpleTickerDisplay extends AbstractTickerDisplay {

	@Subscribe
	public void handle(StocksEvent event) {
		System.out.println(event);
	}

}
