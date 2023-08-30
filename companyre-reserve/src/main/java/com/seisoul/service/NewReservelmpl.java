package com.seisoul.service;

import com.seisoul.mapper.ReserveMapper;
import com.seisoul.entity.ReserveMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewReservelmpl implements NewReserve{
    @Autowired
    private ReserveMapper reserveMapper;
    @Override
    public int addReserve(ReserveMessage reserveMessage){return reserveMapper.addReserve(reserveMessage);}
}
