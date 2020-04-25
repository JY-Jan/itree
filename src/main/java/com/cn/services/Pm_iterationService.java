/**
 * Copyrigt (2020, ) Institute of Software, Chinese Academy of Sciences
 */
package com.cn.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.cn.mappers.Pm_iterationMapper;
import com.cn.models.Pm_iteration;
import com.github.tools.annotations.api.FunctionDescriber;
import com.github.webfrk.core.HttpBodyHandler;
import com.github.tools.annotations.ServiceDefinition;
import java.math.BigInteger;
import javax.validation.constraints.*;

/**
 * This code is auto-generated by <code>ServiceGenerator<code>
 *
 */
@ServiceDefinition
public class Pm_iterationService extends HttpBodyHandler {

	@Autowired
	private Pm_iterationMapper pm_iterationMapper;

	@FunctionDescriber(shortName = "根据项目id展示该项目的所有迭代", description = "暂无", prerequisite = "暂无")
	public java.util.List<com.cn.models.Pm_iteration> getPm_iteration(BigInteger project_id) {
		return pm_iterationMapper.getPm_iteration(project_id);
	}
	@FunctionDescriber(shortName = "根据缺陷id展示该项目的所有迭代", description = "暂无", prerequisite = "暂无")
	public java.util.List<com.cn.models.Pm_iteration> getPm_itBybug(BigInteger bug_id) {
		return pm_iterationMapper.getPm_itBybug(bug_id);
	}
	@FunctionDescriber(shortName = "根据缺陷id展示该项目的所有成员", description = "暂无", prerequisite = "暂无")
	public java.util.List<com.cn.models.Pm_user> getUserBybug_id(BigInteger bug_id) {
		return pm_iterationMapper.getUserBybug_id(bug_id);
	}
	@FunctionDescriber(shortName = "根据项目id展示该项目的所有成员", description = "暂无", prerequisite = "暂无")
	public java.util.List<com.cn.models.Pm_user> getUserByp_id(BigInteger project_id) {
		return pm_iterationMapper.getUserByp_id(project_id);
	}
	/*//sxw
	@FunctionDescriber(shortName = "展示（本项目）迭代信息", description = "暂无", prerequisite = "暂无")
	public java.util.List<com.cn.models.Pm_iteration> getPm_iteration() {
		return pm_iterationMapper.getPm_iteration();
	}*/

	@FunctionDescriber(shortName = "根据迭代id展示该迭代的用户故事", description = "暂无", prerequisite = "暂无")
	public java.util.List<com.cn.models.Pm_iteration> listPm_iteration(BigInteger iteration_id) {
		return pm_iterationMapper.listPm_iteration(iteration_id);
	}

}
