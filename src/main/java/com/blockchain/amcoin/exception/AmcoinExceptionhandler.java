/*
 *Created on 06/01/18 by ambujmehra for Amcoin
 *
 * Copyright (c) 2018 Ambuj Mehra.
 */

package com.blockchain.amcoin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * The type Amcoin exceptionhandler.
 *
 * @author ambujmehra
 */
@ControllerAdvice
public class AmcoinExceptionhandler extends ResponseEntityExceptionHandler {

  /**
   * Handle Amcoin exception response entity.
   *
   * @param amcoinException the amcoin exception
   * @return the response entity
   */
  @ExceptionHandler({AmcoinException.class})
  public ResponseEntity<AmcoinException> handleAffiliateException(
      AmcoinException amcoinException) {
    return new ResponseEntity<AmcoinException>(amcoinException, HttpStatus.INTERNAL_SERVER_ERROR);
  }

}
