package com.cf.data.model.poloniex;

import java.math.BigDecimal;

import com.google.gson.Gson;

/**
 *
 * @author David
 */
public class PoloniexFeeInfo {
  public final BigDecimal makerFee;
  public final BigDecimal takerFee;
  public final BigDecimal thirtyDayVolume;
  public final BigDecimal nextTier;

  public PoloniexFeeInfo(BigDecimal makerFee, BigDecimal takerFee, BigDecimal thirtyDayVolume, BigDecimal nextTier) {
    this.makerFee = makerFee;
    this.takerFee = takerFee;
    this.thirtyDayVolume = thirtyDayVolume;
    this.nextTier = nextTier;
  }

  @Override
  public String toString() {
    return new Gson().toJson(this);
  }
}
