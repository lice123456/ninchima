package com.ninchima.app.test.dao;

import java.util.List;

import com.ninchima.app.test.domain.sUsr;
/**
 * @ClassName(类名)      : sUsrDao
 * @Description(描述)    : 查询柜员信息Dao
 * @author(作者)         ：帅晓锋
 * @date (开发日期)      ：2016-4-12 下午6:38:52
*/	
public interface SusrDao {
	/**查询柜员信息
	* @param findsUsr
	* @return
	*/	
	public sUsr  findsUsr(sUsr sUsr);
	
	public sUsr findByCode(sUsr su);
	
	public void updateByPrimaryKeySelective(sUsr sUsr);
	
	public List<sUsr> findSusrInfoList(sUsr su);
	
	//查询机构中人员人数
	public Integer findNumByCDE(String depCde);
	
	public Integer instuHasLinkWithUser(String instuCde);
	
	public int insertByPrimaryKeySelective(sUsr su);

	public String findNameUsrByCde(String optUsr);

	public List<sUsr> selectAll(sUsr sUsr);
	
	public List<sUsr> findusrmoible(sUsr s);  //查询机构管理员的手机号

	public List<sUsr> selectByInstuAndQugrd(sUsr user);

	public List<sUsr> selectAllUsrLev(sUsr susr);
	
}