/*
 *Created on 06/01/18 by ambujmehra for Amcoin
 *
 * Copyright (c) 2018 Ambuj Mehra.
 */

package com.blockchain.amcoin.service.impl;

import com.blockchain.amcoin.pojo.Block;
import com.blockchain.amcoin.pojo.BlockChain;
import com.blockchain.amcoin.pojo.Node;
import com.blockchain.amcoin.pojo.Transaction;
import com.blockchain.amcoin.service.IBlockchainService;
import com.blockchain.amcoin.utils.AmcoinBlockchainUtils;
import java.math.BigInteger;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Amcoin blockchain service.
 *
 * @author ambujmehra
 */
@Service
public class AmcoinBlockchainService extends BlockChain implements IBlockchainService {

  @Autowired
  private AmcoinBlockchainUtils amcoinBlockchainUtils;

  @Override
  public Block createNewBlock(BigInteger proof, String prevoiusHash) {
    Block block = amcoinBlockchainUtils.newBlock(this, proof, prevoiusHash);
    //as all the current transaction moved to this block, set the blockchain current trasaction to empty
    this.setChain(new ArrayList<Block>());
    //add this block to the chain
    this.getChain().add(block);
    return block;
  }

  @Override
  public int createNewTransaction(String sender, String recipient, Double amount) {
    Transaction transaction = amcoinBlockchainUtils.newTransaction(sender, recipient, amount);
    this.getCurrentTransactions().add(transaction);
    return this.getChain().get(this.getChain().size() - 1).getIndex();
  }

  @Override
  public Node registerNode(String address) {
    return null;
  }

}
