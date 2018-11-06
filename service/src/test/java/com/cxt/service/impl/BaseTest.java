package com.cxt.service.impl; /**
 * author Administrator
 * date   2018/10/29
 */

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring-service.xml" })
// 测试操作的回滚设置
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
@Transactional
public class BaseTest {
}
