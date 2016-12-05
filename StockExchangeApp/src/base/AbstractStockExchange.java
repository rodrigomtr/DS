package base;

import java.util.Random;

import com.google.common.eventbus.EventBus;

public abstract class AbstractStockExchange implements StockExchange {

	private final Random rnd;
	private final String name;
	private final String[] stocks;

	public AbstractStockExchange(String name, String[] stocks) {
		this.rnd = new Random();
		this.name = name;
		this.stocks = stocks.clone();
	}

	@Override
	public String getName() {
		return name;
	}

	protected abstract StocksEvent randomEvent();

	protected String randomStock() {
		return stocks[rnd.nextInt(stocks.length)];
	}

	protected double randomQuote() {
		return rnd.nextInt(100) + 0.01 * rnd.nextInt(100);
	}

	protected int randomVolume() {
		return rnd.nextInt(1000000);
	}

	@Override
	public void connectTo(EventBus bus) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ie) {
					}
					bus.post(randomEvent());
				}
			}
		}, name).start();
	}

}
