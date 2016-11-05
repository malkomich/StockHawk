package com.sam_chordas.android.stockhawk;

/**
 * Enum of message events available for the Event Bus.
 */
public class MessageEvent {

  // Event types
  public static final int STOCK_NOT_FOUND = 0;
  public static final int STOCK_ADDED = 1;

  private int type;
  private String reference;

  public MessageEvent(int type, String reference) {
    this.type = type;
    this.reference = reference;
  }

  public int getType() {
    return type;
  }

  public String getReference() {
    return reference;
  }
}
