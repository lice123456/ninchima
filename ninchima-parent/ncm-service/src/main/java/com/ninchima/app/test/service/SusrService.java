package com.ninchima.app.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ninchima.app.test.dao.SusrDao;
import com.ninchima.app.test.domain.sUsr;
/**
  * @ClassName(类名)      : SusrDualService
  * @Description(描述)    : TODO
  * @author(作者)         ：帅晓锋
  * @date (开发日期)      ：2016-3-29 上午10:00:19
 */
@Component
@Transactional
public class SusrService  implements IsUsrService{
	@Autowired
	private SusrDao susrDao;

	@Override
	public sUsr findsUsr(sUsr Usr) {
		sUsr sUsr=susrDao.findsUsr(Usr);
		return sUsr;
	}
	
	public sUsr findByCode(sUsr su){
		sUsr ss = susrDao.findByCode(su);
		return ss;
	}

	@Override
	public void updateByPrimaryKeySelective(sUsr sUsr) {
		 susrDao.updateByPrimaryKeySelective(sUsr);
	}

	@Override
	public List<sUsr> findSusrInfoList(sUsr su) {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------------------------------------------");
		return susrDao.findSusrInfoList(su);
	}
	@Override
	public Integer findNumByCDE(String depCde){
		return susrDao.findNumByCDE(depCde);
	}

	@Override
	public Object insertByPrimaryKeySelective(sUsr su) {
		return null;
	}
	/*
	 * (non-Javadoc) 
	 * @see com.caxins.themis.base.service.IsUsrService#instuHasLinkWithUser(java.lang.String)
	 */
	@Override
	public Integer instuHasLinkWithUser(String instuCde){
		return susrDao.instuHasLinkWithUser(instuCde);
	}

	@Override
	public String findNameUsrByCde(String optUsr) {
		return susrDao.findNameUsrByCde(optUsr);
	}

	@Override
	public List<sUsr> selectAll(sUsr user) {
		return susrDao.selectAll(user);
	}
	
	@Override
	public List<sUsr> findusrmoible(sUsr s) {
		// TODO Auto-generated method stub
		return susrDao.findusrmoible(s);
	}
	
	@Override
	public List<sUsr> selectByInstuAndQugrd(sUsr user) {
		return susrDao.selectByInstuAndQugrd(user);
		
	}
	
	@Override
	public List<sUsr> selectAllUsrLev(sUsr susr) {
		return susrDao.selectAllUsrLev(susr);
	}
}