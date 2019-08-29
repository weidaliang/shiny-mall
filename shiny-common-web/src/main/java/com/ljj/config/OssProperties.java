package com.ljj.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * weidaliang
 * Date 2019/8/29
 * Desc:配置文件配置项
 */
@Component
public class OssProperties implements InitializingBean{

    @Value("${oss.endpoint}")
    private String oss_endpoint;

    @Value("${oss.keyid}")
    private String oss_keyid;

    @Value("${oss.keysecret}")
    private String oss_keysecret;

    @Value("${oss.filehost}")
    private String oss_filehost;

    @Value("${oss.bucketname}")
    private String oss_bucketname;

    public static String endpoint;
    public static String keyid;
    public static String keysecret;
    public static String filehost;
    public static String bucketname;

    public void afterPropertiesSet() throws Exception {
        endpoint = oss_endpoint;
        keyid = oss_keyid;
        keysecret = oss_keysecret;
        filehost = oss_filehost;
        bucketname = oss_bucketname;
    }
}

