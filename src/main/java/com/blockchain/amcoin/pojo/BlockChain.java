/*
 *Created on 06/01/18 by ambujmehra for Amcoin
 *
 * Copyright (c) 2018 Ambuj Mehra.
 */

package com.blockchain.amcoin.pojo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;


/**
 * The type Block chain.
 *
 * @author ambujmehra
 */
public class BlockChain {

  @Getter
  @Setter
  private List<Block> chain;
  @Getter
  @Setter
  private List<Transaction> currentTransactions;
  @Getter
  @Setter
  private Set<Node> nodes;

  public BlockChain() {
    chain = new ArrayList<Block>();
    currentTransactions = new ArrayList<Transaction>();
    nodes = new HashSet<Node>();
    chain.add(generateHeadBlock());
  }

  private Block generateHeadBlock() {
    Block headBlock = new Block();
    headBlock.setIndex(1);
    headBlock.setPreviousHash("1");
    headBlock.setProof(new BigInteger("100"));
    headBlock.setTimestamp(new Date());
    headBlock.setTransactions(this.currentTransactions);
    return headBlock;
  }

  /**
   * Hash string.
   *
   * @param block the block
   * @return the string
   */
  public String hash(Block block) {
    return "";
  }

  /**
   * Isvalid proof boolean.
   *
   * @param lastProof the last proof
   * @param proof the proof
   * @return the boolean
   */
  public  Boolean isvalidProof(BigInteger lastProof, BigInteger proof) {
    return true;
  }


}
