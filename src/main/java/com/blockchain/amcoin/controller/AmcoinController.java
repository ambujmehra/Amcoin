/*
 *Created on 06/01/18 by ambujmehra for Amcoin
 *
 * Copyright (c) 2018 Ambuj Mehra.
 */

package com.blockchain.amcoin.controller;

import com.blockchain.amcoin.commons.HealthCheckResponse;
import com.blockchain.amcoin.constants.Constants;
import com.blockchain.amcoin.service.impl.AmcoinBlockchainService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Amcoin controller.
 *
 * @author ambujmehra
 */
@RestController
@RequestMapping(value = Constants.baseUrl)
public class AmcoinController {

  @Autowired
  private AmcoinBlockchainService amcoinBlockchainService;

  @RequestMapping(value = Constants.healthCheckUrl, method = RequestMethod.GET)
  public ResponseEntity<HealthCheckResponse> healthCheckController() {
    HealthCheckResponse healthCheckResponse = new HealthCheckResponse();
    List<String> lisfOfUrls = new ArrayList<String>();
    lisfOfUrls.add(Constants.miningurl);
    lisfOfUrls.add(Constants.newTransactionUrl);

    healthCheckResponse.setListOfUrls(lisfOfUrls);
    healthCheckResponse.setHealthcheckMessage(Constants.healthCheckMessage);

    return new ResponseEntity<HealthCheckResponse>(healthCheckResponse, HttpStatus.OK);
  }


}
