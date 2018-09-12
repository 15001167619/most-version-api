package com.most.version.factory;

import com.most.version.service.IDoctorService;
import com.most.version.service.IPatientService;

/**
 * @author 武海升
 * @date 2018/9/12 15:12
 */
public abstract class IBaseServiceFactory {

    public abstract IDoctorService getDoctorServiceImpl(String versionNum);

    public abstract IPatientService getPatientImpl(String versionNum);

}
