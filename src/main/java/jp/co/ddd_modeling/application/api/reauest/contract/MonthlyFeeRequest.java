package jp.co.ddd_modeling.application.api.reauest.contract;

import jp.co.ddd_modeling.domain.model.option.EntertainmentFreeOption;
import jp.co.ddd_modeling.domain.model.plan.Plan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * 契約の月額料金取得リクエスト
 *
 */
@Data
public class MonthlyFeeRequest {

    /**
     * PlanForm
     */
    private PlanForm plan;

    /**
     * エンタメフリーオプション適用フラグ
     */
    private boolean entameFree;

    /**
     * PlanForm
     */
    @AllArgsConstructor
    public enum PlanForm {
        g1(Plan.GB1),
        g3(Plan.GB3),
        g30(Plan.GB30);

        @Getter
        private final Plan plan;
    }

    /**
     * エンタメフリーオプション取得converter
     * 
     * @return
     */
    public EntertainmentFreeOption entertainmentFreeOption() {
        return new EntertainmentFreeOption(this.entameFree);
    }
}
