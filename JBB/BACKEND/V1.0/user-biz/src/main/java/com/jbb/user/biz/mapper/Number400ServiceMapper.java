package com.jbb.user.biz.mapper;

import com.jbb.user.biz.entity.Number400Service;
import com.jbb.user.biz.entity.Number400ServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Number400ServiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number_service
     *
     * @mbggenerated
     */
    int countByExample(Number400ServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number_service
     *
     * @mbggenerated
     */
    int deleteByExample(Number400ServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number_service
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number_service
     *
     * @mbggenerated
     */
    int insert(Number400Service record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number_service
     *
     * @mbggenerated
     */
    int insertSelective(Number400Service record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number_service
     *
     * @mbggenerated
     */
    List<Number400Service> selectByExample(Number400ServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number_service
     *
     * @mbggenerated
     */
    Number400Service selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number_service
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Number400Service record, @Param("example") Number400ServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number_service
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Number400Service record, @Param("example") Number400ServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number_service
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Number400Service record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number_service
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Number400Service record);
}