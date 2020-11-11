package com.huangtl.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description TODO
 * @Author huangtl
 * @Date 2020/9/24 13:50
 **/
@SpringBootApplication
//@EnableDiscoveryClient
public class SentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelApplication.class, args);
    }

    /*public static void main(String[] args) {
        // 配置规则.
        initFlowRules();


        while (true) {
            // 1.5.0 版本开始可以直接利用 try-with-resources 特性，自动 exit entry
            try (Entry entry = SphU.entry("HelloWorld")) {
                // 被保护的逻辑
                System.out.println("hello world");
            } catch (BlockException ex) {
                // 处理被流控的逻辑
                System.out.println("blocked!");
            }
        }
    }

    private static void initFlowRules(){
        List<FlowRule> rules = new ArrayList<>(); //定义规则列表
        FlowRule rule = new FlowRule(); //定义一个规则
        rule.setResource("HelloWorld"); //什么资源应用此规则
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        rule.setCount(20); //没秒只能20次请求
        rules.add(rule);//加入该规则
        FlowRuleManager.loadRules(rules); //载入规则列表
    }*/
}
