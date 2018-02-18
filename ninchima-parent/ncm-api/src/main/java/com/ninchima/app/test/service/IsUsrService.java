package com.ninchima.app.test.service;

import java.util.List;

import com.ninchima.app.test.domain.sUsr;
/**
  * @ClassName(类名)      : 柜员信息表
  * @Description(描述)    : 柜员信息
  * @author(作者)         ：帅晓锋
  * @date (开发日期)      ：2016-3-29 上午9:59:39
 */
public interface IsUsrService {
	public sUsr  findsUsr(sUsr sUsr);
	
	public sUsr findByCode(sUsr sUsr);
	
	public void updateByPrimaryKeySelective(sUsr sUsr);
	
	//查询用户列表--吴桂镇
	public List<sUsr>  findSusrInfoList(sUsr su);
    //查询部门人数 --吴桂镇
	public Integer findNumByCDE(String depCde);
	//新增  --吴桂镇
	public Object insertByPrimaryKeySelective(sUsr su);
	
    //查询机构下是否有用户
	public Integer instuHasLinkWithUser(String instuCde);

	public String findNameUsrByCde(String optUsr);

	public List<sUsr> selectAll(sUsr user);

	public List<sUsr> findusrmoible(sUsr s);

	public List<sUsr> selectByInstuAndQugrd(sUsr user);
	
	public List<sUsr> selectAllUsrLev(sUsr susr);
	
}