package com.jbb.user.biz.mapper;

import com.jbb.user.biz.entity.Number400;
import com.jbb.user.biz.entity.Number400Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Number400Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number
     *
     * @mbggenerated
     */
    int countByExample(Number400Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number
     *
     * @mbggenerated
     */
    int deleteByExample(Number400Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number
     *
     * @mbggenerated
     */
    int insert(Number400 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number
     *
     * @mbggenerated
     */
    int insertSelective(Number400 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number
     *
     * @mbggenerated
     */
    List<Number400> selectByExample(Number400Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number
     *
     * @mbggenerated
     */
    Number400 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Number400 record, @Param("example") Number400Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Number400 record, @Param("example") Number400Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Number400 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_number
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Number400 record);
}