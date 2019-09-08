package jp.co.ddd_modeling.domain.model.option;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * オプション料金値オブジェクト
 *
 */
@AllArgsConstructor
public class OptionFee {

    /**
     * value
     */
    @Getter
    private final Integer value;
}
