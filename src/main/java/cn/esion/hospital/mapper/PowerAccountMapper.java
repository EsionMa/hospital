package cn.esion.hospital.mapper;

import cn.esion.hospital.entity.PowerAccount;
import cn.esion.hospital.entity.PowerAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowerAccountMapper {
    long countByExample(PowerAccountExample example);

    int deleteByExample(PowerAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PowerAccount record);

    int insertSelective(PowerAccount record);

    List<PowerAccount> selectByExample(PowerAccountExample example);

    PowerAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PowerAccount record, @Param("example") PowerAccountExample example);

    int updateByExample(@Param("record") PowerAccount record, @Param("example") PowerAccountExample example);

    int updateByPrimaryKeySelective(PowerAccount record);

    int updateByPrimaryKey(PowerAccount record);
}