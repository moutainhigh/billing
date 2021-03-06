package com.ai.baas.cust.service.atom.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ai.baas.cust.dao.interfaces.BlSubsCommMapper;
import com.ai.baas.cust.dao.mapper.bo.BlSubsComm;
import com.ai.baas.cust.dao.mapper.bo.BlSubsCommCriteria;
import com.ai.baas.cust.service.atom.interfaces.IBlSubsCommonAtomSV;
@Component
public class BlSubsCommonAtomImpl implements IBlSubsCommonAtomSV {

	@Autowired
	private BlSubsCommMapper mapper;
	@Override
	public List<BlSubsComm> getSubsCommon(String subsId,String tenantId) {
		BlSubsCommCriteria example=new BlSubsCommCriteria();
		BlSubsCommCriteria.Criteria criteria=example.createCriteria();
		criteria.andTenantIdEqualTo(tenantId);
		criteria.andSubsIdEqualTo(subsId);
		
		 return mapper.selectByExample(example);
	}
	   @Override
	    public List<BlSubsComm> getSubsCommonByProductId(String productId) {
	        BlSubsCommCriteria example=new BlSubsCommCriteria();
	        BlSubsCommCriteria.Criteria criteria=example.createCriteria();
	        criteria.andProductIdEqualTo(productId);	        
	         return mapper.selectByExample(example);
	    }
	@Override
	public void updateSubsCommon(String productId,BlSubsComm blSubsComm){
	    BlSubsCommCriteria example=new BlSubsCommCriteria();
        BlSubsCommCriteria.Criteria criteria=example.createCriteria();
        criteria.andProductIdEqualTo(productId);
        
        mapper.updateByExampleSelective(blSubsComm, example);
	}
	

}
