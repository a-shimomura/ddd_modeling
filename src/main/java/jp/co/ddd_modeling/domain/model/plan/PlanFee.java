package jp.co.ddd_modeling.domain.model.plan;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * プラン料金値オブジェクト
 *
 */
@AllArgsConstructor
public class PlanFee {

    /**
     * value
     */
    @Getter
    private final Integer value;
}
