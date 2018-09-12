package com.most.version.factory.extend;

import com.most.version.common.Constants;
import com.most.version.factory.IBaseServiceFactory;
import com.most.version.service.IDoctorService;
import com.most.version.service.IPatientService;
import com.most.version.service.impl.DoctorServiceV1Impl;
import com.most.version.service.impl.DoctorServiceV2Impl;
import com.most.version.service.impl.PatientServiceV1Impl;
import com.most.version.service.impl.PatientServiceV2Impl;
import org.springframework.stereotype.Service;

/**
 * @author 武海升
 * @date 2018/9/12 15:15
 */
@Service
public class BaseServiceFactoryImpl extends IBaseServiceFactory {

    @Override
    public IDoctorService getDoctorServiceImpl(String versionNum) {
        if(versionNum == null){
            return null;
        }
        if(versionNum.equalsIgnoreCase(Constants.VERSION_NUM_V1)){
            return new DoctorServiceV1Impl();
        } else if(versionNum.equalsIgnoreCase(Constants.VERSION_NUM_V2)){
            return new DoctorServiceV2Impl();
        }
        return null;
    }

    @Override
    public IPatientService getPatientImpl(String versionNum) {
        if(versionNum == null){
            return null;
        }
        if(versionNum.equalsIgnoreCase(Constants.VERSION_NUM_V1)){
            return new PatientServiceV1Impl();
        } else if(versionNum.equalsIgnoreCase(Constants.VERSION_NUM_V2)){
            return new PatientServiceV2Impl();
        }
        return null;
    }

}
