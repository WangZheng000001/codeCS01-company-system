package com.seisoul.mapper;

import com.seisoul.entity.ReserveEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReserveMapper {
    int addReserve(ReserveEntity reserveEntity);
}

