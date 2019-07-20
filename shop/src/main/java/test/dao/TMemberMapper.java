package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.entity.TMember;
import test.entity.TMemberExample;

public interface TMemberMapper {
    int countByExample(TMemberExample example);

    int deleteByExample(TMemberExample example);

    int insert(TMember record);

    int insertSelective(TMember record);

    List<TMember> selectByExample(TMemberExample example);

    int updateByExampleSelective(@Param("record") TMember record, @Param("example") TMemberExample example);

    int updateByExample(@Param("record") TMember record, @Param("example") TMemberExample example);
}