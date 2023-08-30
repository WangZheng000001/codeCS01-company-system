package com.seisoul.service;

import com.seisoul.mapper.ReserveMapper;
import com.seisoul.entity.ReserveEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReserveServiceImpl implements ReserveService {
    @Autowired
    private ReserveMapper reserveMapper;
    @Override
    public int addReserve(ReserveEntity reserveEntity){return reserveMapper.addReserve(reserveEntity);}
}
