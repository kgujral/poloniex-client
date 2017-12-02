package com.cf.data.model.poloniex;

import java.util.List;

import com.google.gson.Gson;

/**
 *
 * @author Karan
 */
public class PoloniexOrderBook {
  public final Long seq;

  public final Boolean isFrozen;

  public final List<PoloniexOrderBookRateValuePair> asks;

  public final List<PoloniexOrderBookRateValuePair> bids;

  public PoloniexOrderBook(Long seq, Boolean isFrozen, List<PoloniexOrderBookRateValuePair> asks,
      List<PoloniexOrderBookRateValuePair> bids) {
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
