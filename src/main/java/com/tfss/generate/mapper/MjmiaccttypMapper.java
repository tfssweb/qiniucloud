package com.tfss.generate.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tfss.generate.dto.Mjmiaccttyp;
import com.tfss.generate.dto.MjmiaccttypExample;

public interface MjmiaccttypMapper {
    int countByExample(MjmiaccttypExample example);

    int deleteByExample(MjmiaccttypExample example);

    int deleteByPrimaryKey(String mjaccttypcd);

    int insert(Mjmiaccttyp record);

    int insertSelective(Mjmiaccttyp record);

    List<Mjmiaccttyp> selectByExample(MjmiaccttypExample example);

    Mjmiaccttyp selectByPrimaryKey(String mjaccttypcd);

    int updateByExampleSelective(@Param("record") Mjmiaccttyp record, @Param("example") MjmiaccttypExample example);

    int updateByExample(@Param("record") Mjmiaccttyp record, @Param("example") MjmiaccttypExample example);

    int updateByPrimaryKeySelective(Mjmiaccttyp record);

    int updateByPrimaryKey(Mjmiaccttyp record);
}