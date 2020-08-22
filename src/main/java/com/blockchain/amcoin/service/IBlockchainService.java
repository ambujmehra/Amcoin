/*
 *Created on 06/01/18 by ambujmehra for Amcoin
 *
 * Copyright (c) 2018 Ambuj Mehra.
 */

package com.blockchain.amcoin.service;

import com.blockchain.amcoin.pojo.Block;
import com.blockchain.amcoin.pojo.Node;
import java.math.BigInteger;

/**
 * The interface Blockchain service.
 */
public interface IBlockchainService {

  /**
   * Create new block block.
   *
   * @param proof the proof
   * @param prevoiusHash the prevoius hash
   * @return the block
   */
  Block createNewBlock(BigInteger proof, String prevoiusHash);

  /**
   * Create new transaction block and return last index
   *
   * @param sender the sender
   * @param recipient the recipient
   * @param amount the amount
   * @return the index
   */
  int createNewTransaction(String sender, String recipient, Double amount);

  /**
   * Register node node.
   *
   * @param address the address
   * @return the node
   */
  Node registerNode(String address);


}
