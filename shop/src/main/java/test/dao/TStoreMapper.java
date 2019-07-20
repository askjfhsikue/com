package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.entity.TStore;
import test.entity.TStoreExample;

public interface TStoreMapper {
    int countByExample(TStoreExample example);

    int deleteByExample(TStoreExample example);

    int deleteByPrimaryKey(Integer storeId);

    int insert(TStore record);

    int insertSelective(TStore record);

    List<TStore> selectByExample(TStoreExample example);

    TStore selectByPrimaryKey(Integer storeId);

    int updateByExampleSelective(@Param("record") TStore record, @Param("example") TStoreExample example);

    int updateByExample(@Param("record") TStore record, @Param("example") TStoreExample example);

    int updateByPrimaryKeySelective(TStore record);

    int updateByPrimaryKey(TStore record);
}