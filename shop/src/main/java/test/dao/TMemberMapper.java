package test.dao;

import java.util.List;

import test.entity.TMember;

public interface TMemberMapper {
    int countByExample(int example);

    int deleteByExample(int example);

    int insert(TMember record);

    int insertSelective(TMember record);

    List<TMember> selectByExample(int example);

//    int updateByExampleSelective(@Param("record") TMember record, @Param("example")   example);
//
//    int updateByExample(@Param("record") TMember record, @Param("example")   example);
}