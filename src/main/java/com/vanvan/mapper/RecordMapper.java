package com.vanvan.mapper;

import com.vanvan.po.Record;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

public interface RecordMapper {

    public List<Record> selectRecordByDate(@Param("value") LocalDate date1, @Param("value1")LocalDate date2);

}
