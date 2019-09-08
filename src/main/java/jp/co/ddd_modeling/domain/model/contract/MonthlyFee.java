package jp.co.ddd_modeling.domain.model.contract;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 月額料金値オブジェクト
 *
 */
@AllArgsConstructor
public class MonthlyFee {

    /**
     * value
     */
    @Getter
    private final Integer value;
}
