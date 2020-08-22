/*
 *Created on 06/01/18 by ambujmehra for Amcoin
 *
 * Copyright (c) 2018 Ambuj Mehra.
 */

package com.blockchain.amcoin.pojo;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * The type Block.
 *
 * @author ambujmehra
 */
@Getter
@Setter
public class Block {

  private int index;
  private Date timestamp;
  private List<Transaction> transactions;
  private BigInteger proof;
  private String previousHash;


}
