package com.example.sampledomain.domain.model.campaign;

import com.example.sampledomain.domain.model.user.UserType;

/**
 * キャンペーン適用条件
 */
public class CampaignApplyCondition {
    CampaignType campaignType;
    UserType userType;

    public CampaignApplyCondition(CampaignType campaignType, UserType userType) {
        this.campaignType = campaignType;
        this.userType = userType;
    }
}
