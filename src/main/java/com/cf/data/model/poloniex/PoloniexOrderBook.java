package com.cf.data.model.poloniex;

import java.math.BigDecimal;
import java.util.List;

import com.google.gson.Gson;

/**
 *
 * @author Karan
 */
public class PoloniexOrderBook {
  public final Long seq;

  public final Boolean isFrozen;

  public final List<List<BigDecimal>> asks;

  public final List<List<BigDecimal>> bids;

  public PoloniexOrderBook(Long seq, Boolean isFrozen, List<List<BigDecimal>> asks, List<List<BigDecimal>> bids) {
    this.seq = seq;
    this.isFrozen = isFrozen;
    this.asks = asks;
    this.bids = bids;
  }

  @Override
  public String toString() {
    return new Gson().toJson(this);
  }
}
