package com.base.base.json;

/**
 * @Author wangbin
 * @Date 2021/7/13
 * @Description
 **/
public class GsonUtil {
    public static void main(String[] args) {
        final String RULE_JSON = "[\n" +
                "    {\n" +
                "        \"ruleName\": \"rule1\",\n" +
                "        \"feeAmountLow\": \"0\",\n" +
                "        \"feeAmountHigh\": \"10000\",\n" +
                "        \"approvalRoleList\": [\n" +
                "            1,2\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"ruleName\": \"rule2\",\n" +
                "        \"feeAmountLow\": \"10001\",\n" +
                "        \"feeAmountHigh\": \"500000\",\n" +
                "        \"approvalRoleList\": [\n" +
                "            3,4\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"ruleName\": \"rule3\",\n" +
                "        \"feeAmountLow\": \"500001\",\n" +
                "        \"feeAmountHigh\": \"\",\n" +
                "        \"approvalRoleList\": [\n" +
                "            5,6,7\n" +
                "        ]\n" +
                "    }\n" +
                "]";
    }

}
