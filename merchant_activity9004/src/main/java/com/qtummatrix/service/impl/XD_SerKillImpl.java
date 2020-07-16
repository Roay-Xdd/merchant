package com.qtummatrix.service.impl;

import com.qtummatrix.service.XD_SecKillService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class XD_SerKillImpl implements XD_SecKillService {


    @Override
    public boolean shop() {
        return false;
    }
}
