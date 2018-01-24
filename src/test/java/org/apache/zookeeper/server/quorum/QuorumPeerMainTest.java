package org.apache.zookeeper.server.quorum;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gaofeihang on 2018/1/24.
 */
public class QuorumPeerMainTest {

    private static final Logger LOG = LoggerFactory.getLogger(QuorumPeerMainTest.class);

    private static String CONF_DIR_BASE;

    @BeforeClass
    public static void init() {
        CONF_DIR_BASE = System.getProperty("user.dir") + "/conf/zk-quorum";
        LOG.info("conf dir base: {}", CONF_DIR_BASE);
    }

    @Test
    public void testServer1Bootstrap() {
        startServer(1);
    }

    @Test
    public void testServer2Bootstrap() {
        startServer(2);
    }

    @Test
    public void testServer3Bootstrap() {
        startServer(3);
    }

    private void startServer(int id) {
        String confPath = CONF_DIR_BASE + "/server-" + id + "/zoo.cfg";
        String[] args = new String[] { confPath };
        QuorumPeerMain.main(args);
    }

}
