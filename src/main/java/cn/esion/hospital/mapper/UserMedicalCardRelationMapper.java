package cn.esion.hospital.mapper;

import cn.esion.hospital.entity.UserMedicalCardRelation;
import cn.esion.hospital.entity.UserMedicalCardRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMedicalCardRelationMapper {
    long countByExample(UserMedicalCardRelationExample example);

    int deleteByExample(UserMedicalCardRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserMedicalCardRelation record);

    int insertSelective(UserMedicalCardRelation record);

    List<UserMedicalCardRelation> selectByExample(UserMedicalCardRelationExample example);

    UserMedicalCardRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserMedicalCardRelation record, @Param("example") UserMedicalCardRelationExample example);

    int updateByExample(@Param("record") UserMedicalCardRelation record, @Param("example") UserMedicalCardRelationExample example);

    int updateByPrimaryKeySelective(UserMedicalCardRelation record);

    int updateByPrimaryKey(UserMedicalCardRelation record);
}