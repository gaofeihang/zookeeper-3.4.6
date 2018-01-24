package org.apache.zookeeper.server;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gaofeihang on 2018/1/24.
 */
public class ZooKeeperServerMainTest {

    private static final Logger LOG = LoggerFactory.getLogger(ZooKeeperServerMainTest.class);

    private static String CLIENT_PORT = "2181";
    private static String DIR_BASE = "/data/zk-standalone";
    private static String DATA_DIR = DIR_BASE + "/data";

    @BeforeClass
    public static void init() {
        LOG.info("data dir: {}", DATA_DIR);
    }

    @Test
    public void testBootstrap() {
        String[] args = new String[] { CLIENT_PORT, DATA_DIR };
        ZooKeeperServerMain.main(args);
    }

}
