package jp.co.ddd_modeling.domain.model.contract;

import jp.co.ddd_modeling.domain.model.option.EntertainmentFreeOption;
import jp.co.ddd_modeling.domain.model.plan.Plan;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 契約entity
 */
@AllArgsConstructor
@Getter
public class Contract {

    /**
     * 契約
     */
    private final Plan plan;

    /**
     * エンタメフリーオプション
     */
    private final EntertainmentFreeOption entertainmentFreeOption;

    /**
     * 月額料金取得
     */
    public MonthlyFee monthlyFee() {
        return new MonthlyFee(
            this.plan.getPlanFee().getValue() + this.entertainmentFreeOption.getOptionFee().getValue()
        );
    }
}
