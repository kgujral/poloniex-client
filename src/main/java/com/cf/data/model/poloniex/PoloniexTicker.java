package com.cf.data.model.poloniex;

import java.math.BigDecimal;

import com.google.gson.Gson;

/**
 *
 * @author David
 */
public class PoloniexTicker {
  public final BigDecimal last;
  public final BigDecimal lowestAsk;
  public final BigDecimal highestBid;
  public final BigDecimal percentChange;
  public final BigDecimal baseVolume;
  public final BigDecimal quoteVolume;

  public PoloniexTicker(BigDecimal last, BigDecimal lowestAsk, BigDecimal highestBid, BigDecimal percentChange,
      BigDecimal baseVolume, BigDecimal quoteVolume) {
    this.last = last;
    this.lowestAsk = lowestAsk;
    this.highestBid = highestBid;
    this.percentChange = percentChange;
    this.baseVolume = baseVolume;
    this.quoteVolume = quoteVolume;
  }

  @Override
  public String toString() {
    return new Gson().toJson(this);
  }
}
