package jp.co.ddd_modeling.domain.service;

import org.springframework.stereotype.Service;

import jp.co.ddd_modeling.domain.model.contract.Contract;

/**
 * 契約サービス
 *
 */
@Service
public class ContractService {

    /**
     * エンタメフリーオプションが利用可能か
     * @param contract
     * @return
     */
    public boolean activatableEntertaimantFreeOption(Contract contract) {
        return contract.getEntertainmentFreeOption()
                .getApplicablePlans()
                .contains(contract.getPlan());
    }
}
