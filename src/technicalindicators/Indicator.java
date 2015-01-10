package technicalindicators;

public enum Indicator {
	POSITIVE_VOLUME_INDEX(0), 
	NEGATIVE_VOLUME_INDEX(1),
	ONBALANCE_VOLUME(2),
	TYPICAL_VOLUME(3),
	PRICE_VOLUME_TREND(4),
	ACCUMULATION_DISTRIBUTION_OSCILLATOR(5),
	CHAIKINS_OSCILLATOR(6),
	CHAIKINS_VOLATILITY(7),
	ACCELERATION(8),
	HIGHEST_HIGH(9),
	LOWEST_LOW(10),
	RELATIVE_STRENGTH_INDEX(11),
	MACD_NINE_PERIOD_MOVING_AVERAGE(12),
	MACD_LINE(13),
	MOMENTUM(14),
	STOCHASTIC_OSCILLATOR_K(15),
	STOCKASTIC_OSCILLATOR_D(16),
	TYPICAL_PRICE(17),
	MEDIAN_PRICE(18),
	WEIGHTED_CLOSE(19),
	WILLIAMS_R(20),
	PRICE_RATE_OF_CHANGE(21),
	WILLIAMS_ACCUMULATION_DISTRIBUTION(22),
	BOLLINGER_UPPER(23),
	BOLLINGER_LOWER(24),
	BOLLINGER_MIDDLE(25),
	MOVING_AVERAGE_25(26),
	MOVING_AVERAGE_65(27);
	
	private int value;
	private Indicator(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
}