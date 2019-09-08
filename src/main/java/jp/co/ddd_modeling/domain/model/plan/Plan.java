package jp.co.ddd_modeling.domain.model.plan;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * プラン
 */
@AllArgsConstructor
public enum Plan {
    
    /**
     * 1GBプラン
     */
    GB1(new PlanFee(1000)),

    /**
     * 3GBプラン
     */
    GB3(new PlanFee(2000)),

    /**
     * 30GBプラン
     */
    GB30(new PlanFee(6000)),
    ;

    /**
     * プラン料金
     */
    @Getter
    private final PlanFee planFee;
}
