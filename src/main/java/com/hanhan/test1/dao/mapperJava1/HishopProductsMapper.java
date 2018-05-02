package com.hanhan.test1.dao.mapperJava1;

import com.hanhan.test1.dto.HishopProducts;
import com.hanhan.test1.dto.HishopProductsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HishopProductsMapper {
    int countByExample(HishopProductsExample example);

    int deleteByExample(HishopProductsExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(HishopProducts record);

    int insertSelective(HishopProducts record);

    List<HishopProducts> selectByExample(HishopProductsExample example);

    HishopProducts selectByPrimaryKey(Integer productid);

    int updateByExampleSelective(@Param("record") HishopProducts record, @Param("example") HishopProductsExample example);

    int updateByExample(@Param("record") HishopProducts record, @Param("example") HishopProductsExample example);

    int updateByPrimaryKeySelective(HishopProducts record);

    int updateByPrimaryKey(HishopProducts record);
}