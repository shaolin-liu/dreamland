package com.neo.blog.base.config;

import com.alibaba.druid.filter.config.ConfigTools;
import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Charles Liu
 * @Description druid加密类
 * @Date 2018-09-09 2018/9/9
 */

public class DruidDESDataSource extends DruidDataSource{

    private static final long serialVersionUID = 152412250993080357L;

    private static Logger logger = LoggerFactory.getLogger(DruidDESDataSource.class);

    @Override
    public void setName(String name) {

//        try {
//            name = ConfigTools.decrypt(name);
//        } catch (Exception e) {
//            logger.error("数据源用户名解密失败，原用户名：{}", name, e);
//        }

        super.setName(name);
    }

    @Override
    public void setPassword(String password) {
//        try {
//            password = ConfigTools.decrypt(password);
//        } catch (Exception e) {
//            logger.error("数据源密码解密失败, 原密码：{}", password, e);
//        }
        super.setPassword(password);
    }


    public static void encrypt(String... args) throws Exception {
        for (int i = 0; i < args.length; i++) {
            logger.info("{}的原文是：{}", args[i], ConfigTools.decrypt(args[i]));
        }
    }

    public static void main(String[] args) {
        try {
            encrypt("123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
