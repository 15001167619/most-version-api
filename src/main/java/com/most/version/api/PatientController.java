package com.most.version.api;

import com.most.version.factory.IBaseServiceFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 武海升
 * @date 2018/9/12 15:51
 */
@RestController
@RequestMapping(value = "api")
@Slf4j
public class PatientController {

    private final IBaseServiceFactory baseServiceFactory;

    @Autowired
    public PatientController(IBaseServiceFactory baseServiceFactory) {
        this.baseServiceFactory = baseServiceFactory;
    }

    /**
     * @param versionNum 版本号
     * @param parameters 参数值 json 字符串
     * @return
     */
    @RequestMapping(value={"getPatientInfo"}, method=RequestMethod.GET)
    public Object getPatientInfo(String versionNum,String parameters) {
        log.info("================>  versionNum ={}"+versionNum);
        log.info("================>  parameters ={}"+parameters);
        return baseServiceFactory.getPatientImpl(versionNum).getPatientInfo();
    }

    /**
     * @param versionNum 版本号
     * @param parameters 参数值 json 字符串
     * @return
     */
    @RequestMapping(value={"getPatientList"}, method=RequestMethod.GET)
    public Object getPatientList(String versionNum,String parameters) {
        log.info("================>  versionNum ={}"+versionNum);
        log.info("================>  parameters ={}"+parameters);
        return baseServiceFactory.getPatientImpl(versionNum).getPatientList();
    }

}
