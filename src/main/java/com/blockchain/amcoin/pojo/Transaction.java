/*
 *Created on 06/01/18 by ambujmehra for Amcoin
 *
 * Copyright (c) 2018 Ambuj Mehra.
 */

package com.blockchain.amcoin.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Transaction.
 *
 * @author ambujmehra
 */
@Getter
@Setter
public class Transaction {
  private String Sender;
  private String recipient;
  private Double amount;

}
