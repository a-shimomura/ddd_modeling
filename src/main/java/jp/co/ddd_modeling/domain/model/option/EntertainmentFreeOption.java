package jp.co.ddd_modeling.domain.model.option;

import java.util.ArrayList;
import java.util.List;

import jp.co.ddd_modeling.domain.model.plan.Plan;
import lombok.Getter;

/**
 * エンタメフリーオプションentity
 *
 */
public class EntertainmentFreeOption {

    /**
     * 有効状態か
     */
    @Getter
    private final boolean isActive;

    /**
     * 利用可能プラン
     */
    @Getter
    private final List<Plan> applicablePlans = new ArrayList<Plan>() {
        /**
         * serialVersionUID
         */
        private static final long serialVersionUID = -6673233590924214990L;
        {
            add(Plan.GB3);
        }
        {
            add(Plan.GB30);
        }
    };

    /**
     * コンストラクタ
     * 
     * @param isActive
     */
    public EntertainmentFreeOption(boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * オプション料金取得
     * 
     * @return
     */
    public OptionFee getOptionFee() {
        return this.isActive ? new OptionFee(1200) : new OptionFee(0);
    }
}
