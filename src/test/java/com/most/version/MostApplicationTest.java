package com.most.version;

import com.most.version.factory.IBaseServiceFactory;
import com.most.version.factory.extend.BaseServiceFactoryImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 武海升
 * @date 2018/9/12 16:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MostApplicationTest {

    @Test
    public void testSelect() {
        log.info("------ test ---------");
        IBaseServiceFactory baseServiceFactory = new BaseServiceFactoryImpl();
        String v2 = baseServiceFactory.getPatientImpl("v2").getPatientList();
        System.out.println(v2);

    }

}
