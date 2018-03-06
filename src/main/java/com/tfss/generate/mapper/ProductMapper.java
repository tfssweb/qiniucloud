package com.tfss.generate.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tfss.generate.dto.Product;
import com.tfss.generate.dto.ProductExample;
import com.tfss.generate.dto.ProductKey;

public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(ProductKey key);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(ProductKey key);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}