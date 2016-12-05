package base;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.common.eventbus.Subscribe;

public class TimeTickerDisplay extends AbstractTickerDisplay {

	@Subscribe
	public void handle(StocksEvent event) {
		String now = new SimpleDateFormat("HH:mm:ss").format(new Date());
		System.out.println(now + " - " + event);
	}
}
