/*
 *Created on 06/01/18 by ambujmehra for Amcoin
 *
 * Copyright (c) 2018 Ambuj Mehra.
 */

package com.blockchain.amcoin.utils;

import com.blockchain.amcoin.pojo.Block;
import com.blockchain.amcoin.pojo.Transaction;
import com.blockchain.amcoin.service.impl.AmcoinBlockchainService;
import java.math.BigInteger;
import java.util.Date;
import org.springframework.stereotype.Component;

/**
 * The type Amcoin blockchain utils.
 *
 * @author ambujmehra
 */
@Component
public class AmcoinBlockchainUtils {

  /**
   * New transaction transaction.
   *
   * @param sender the sender
   * @param recipient the recipient
   * @param amount the amount
   * @return the transaction
   */
  public Transaction newTransaction(String sender, String recipient, Double amount) {
    Transaction transaction = new Transaction();
    transaction.setAmount(amount);
    transaction.setRecipient(recipient);
    transaction.setSender(sender);
    return transaction;
  }

  /**
   * New block block.
   *
   * @param amcoinBlockchainService the amcoin blockchain service
   * @param proof the proof
   * @param prevoiusHash the prevoius hash
   * @return the block
   */
  public Block newBlock(AmcoinBlockchainService amcoinBlockchainService, BigInteger proof,
      String prevoiusHash) {
    Block block = new Block();
    block.setIndex(amcoinBlockchainService.getChain().size() + 1);
    block.setTimestamp(new Date());
    block.setProof(proof);
    //set the current transaction to this block and send it for mining
    block.setTransactions(amcoinBlockchainService.getCurrentTransactions());
    if (prevoiusHash != null) {
      block.setPreviousHash(prevoiusHash);
    } else {
      block.setPreviousHash(amcoinBlockchainService.hash(
          amcoinBlockchainService.getChain().get(amcoinBlockchainService.getChain().size() - 1)));
    }
    return block;

  }

}
