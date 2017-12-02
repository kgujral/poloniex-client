package com.cf.data.model.poloniex;

import java.math.BigDecimal;
import java.util.List;

import com.google.gson.Gson;

/**
 *
 * @author Karan
 */
public class PoloniexOrderBookRateValuePair {

  public final List<BigDecimal> ratePair;

  public PoloniexOrderBookRateValuePair(List<BigDecimal> ratePair) {
    super();
    this.ratePair = ratePair;
  }

  @Override
  public String toString() {
    return new Gson().toJson(this);
  }

}
