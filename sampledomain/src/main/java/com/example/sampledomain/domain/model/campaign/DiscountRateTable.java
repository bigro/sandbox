package com.example.sampledomain.domain.model.campaign;

import com.example.sampledomain.domain.model.user.UserType;

import java.util.HashMap;
import java.util.Map;

/**
 * 割引表
 */
public class DiscountRateTable {
    Map<CampaignApplyCondition, DiscountRate> map = new HashMap<>();

    public DiscountRateTable() {
        map.put(new CampaignApplyCondition(CampaignType.キャンペーン対象, UserType.会員), DiscountRate.割引20パーセント);
        map.put(new CampaignApplyCondition(CampaignType.キャンペーン対象, UserType.ゲスト), DiscountRate.割引10パーセント);
        map.put(new CampaignApplyCondition(CampaignType.対象外, UserType.会員), DiscountRate.割引5パーセント);
        map.put(new CampaignApplyCondition(CampaignType.対象外, UserType.ゲスト), DiscountRate.割引なし);
    }

    public DiscountRate of(CampaignApplyCondition condition) {
        return map.get(condition);
    }
}
