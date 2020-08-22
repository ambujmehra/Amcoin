/*
 *Created on 06/01/18 by ambujmehra for Amcoin
 *
 * Copyright (c) 2018 Ambuj Mehra.
 */

package com.blockchain.amcoin.exception;

/**
 * The type Amcoin exception.
 *
 * @author ambujmehra
 */
public class AmcoinException extends RuntimeException {

  /**
   * Instantiates a new Amcoin exception.
   */
  public AmcoinException() {
    super();
  }

  /**
   * Instantiates a new Amcoin exception.
   *
   * @param exception the exception
   */
  public AmcoinException(String exception) {
    super(exception);
  }

  /**
   * Instantiates a new Amcoin exception.
   *
   * @param exceptionMessage the exception message
   * @param exception the exception
   */
  public AmcoinException(String exceptionMessage, Exception exception) {
    super(exceptionMessage, exception);
  }

}
