package com.bupt.core.security.dao;

import com.bupt.core.security.model.Privilege;
import com.bupt.core.security.model.PrivilegeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrivilegeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_security_privilege
	 * @mbggenerated  Sun Jul 21 16:19:05 CST 2013
	 */
	int countByExample(PrivilegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_security_privilege
	 * @mbggenerated  Sun Jul 21 16:19:05 CST 2013
	 */
	int deleteByExample(PrivilegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_security_privilege
	 * @mbggenerated  Sun Jul 21 16:19:05 CST 2013
	 */
	int deleteByPrimaryKey(Integer privilegeId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_security_privilege
	 * @mbggenerated  Sun Jul 21 16:19:05 CST 2013
	 */
	int insert(Privilege record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_security_privilege
	 * @mbggenerated  Sun Jul 21 16:19:05 CST 2013
	 */
	int insertSelective(Privilege record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_security_privilege
	 * @mbggenerated  Sun Jul 21 16:19:05 CST 2013
	 */
	List<Privilege> selectByExample(PrivilegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_security_privilege
	 * @mbggenerated  Sun Jul 21 16:19:05 CST 2013
	 */
	Privilege selectByPrimaryKey(Integer privilegeId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_security_privilege
	 * @mbggenerated  Sun Jul 21 16:19:05 CST 2013
	 */
	int updateByExampleSelective(@Param("record") Privilege record,
			@Param("example") PrivilegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_security_privilege
	 * @mbggenerated  Sun Jul 21 16:19:05 CST 2013
	 */
	int updateByExample(@Param("record") Privilege record,
			@Param("example") PrivilegeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_security_privilege
	 * @mbggenerated  Sun Jul 21 16:19:05 CST 2013
	 */
	int updateByPrimaryKeySelective(Privilege record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_security_privilege
	 * @mbggenerated  Sun Jul 21 16:19:05 CST 2013
	 */
	int updateByPrimaryKey(Privilege record);
}