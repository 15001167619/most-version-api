package com.most.version.service.impl;

import com.most.version.service.IPatientService;
import org.springframework.stereotype.Service;

/**
 * @author 武海升
 * @date 2018/9/12 15:39
 */
@Service
public class PatientServiceV2Impl implements IPatientService {

    @Override
    public String getPatientInfo() {
        return "v2-patientInfo";
    }

    @Override
    public String getPatientList() {
        return "v2-patientList";
    }

}
