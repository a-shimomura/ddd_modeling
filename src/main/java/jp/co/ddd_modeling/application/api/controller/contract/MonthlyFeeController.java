package jp.co.ddd_modeling.application.api.controller.contract;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.ddd_modeling.application.api.reauest.contract.MonthlyFeeRequest;
import jp.co.ddd_modeling.domain.model.contract.Contract;
import jp.co.ddd_modeling.domain.service.ContractService;
import lombok.AllArgsConstructor;

/**
 * 契約の月額料金Controller
 */
@RestController
@AllArgsConstructor
public class MonthlyFeeController {

    /**
     * 契約サービス
     */
    @Autowired
    private ContractService contractService;

    /**
     * 契約の月額料金取得
     * @param request
     * @return
     */
    @RequestMapping(value = "/monthly-fee", method = RequestMethod.GET)
    public Map<String, Integer> invoke(MonthlyFeeRequest request) {
        Contract contract = new Contract(request.getPlan().getPlan(), request.entertainmentFreeOption());

        if (!this.contractService.activatableEntertaimantFreeOption(contract)) {
            throw new RuntimeException("invalid option selected!");
        }

        Map<String, Integer> res = new HashMap<>();
        res.put("monthly_fee", contract.monthlyFee().getValue());
        return res;
    }
}
