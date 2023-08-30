package com.seisoul.mapper;

import com.seisoul.entity.ReserveMessage;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReserveMapper {
    int addReserve(ReserveMessage reserveMessage);
}
