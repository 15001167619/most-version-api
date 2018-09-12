package com.most.version.service.impl;

import com.most.version.service.IDoctorService;
import org.springframework.stereotype.Service;

/**
 * @author 武海升
 * @date 2018/9/12 15:07
 */
@Service
public class DoctorServiceV2Impl implements IDoctorService {

    @Override
    public String getDoctorInfo() {
        return "V2-DoctorInfo";
    }

}
