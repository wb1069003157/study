package com.base.base.json;

import lombok.Data;

import java.util.List;

/**
 * @Author wangbin
 * @Date 2021/7/13
 * @Description
 **/
@Data
public class Rule {
    /**
     * 规则名称
     */
    private String ruleName;

    /**
     * 金额规则下限
     */
    private String feeAmountLow;

    /**
     * 金额规则上限
     */
    private String feeAmountHigh;

    /**
     * 需要审核的角色列表
     */
    private List<Long> approvalRoleList;
}
