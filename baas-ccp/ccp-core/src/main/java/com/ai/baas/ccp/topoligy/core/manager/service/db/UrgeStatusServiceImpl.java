package com.ai.baas.ccp.topoligy.core.manager.service.db;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import com.ai.baas.ccp.dao.mapper.bo.OmcUrgeStatus;
import com.ai.baas.ccp.topoligy.core.constant.OmcCalKey;
import com.ai.baas.ccp.topoligy.core.exception.OmcException;
import com.ai.baas.ccp.topoligy.core.manager.service.UrgeStatusService;
import com.ai.baas.ccp.topoligy.core.persistence.dao.OmcUrgeStatusDao;
import com.ai.baas.ccp.topoligy.core.persistence.dao.impl.OmcUrgeStatusDaoImpl;
import com.ai.baas.ccp.topoligy.core.util.db.JdbcProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UrgeStatusServiceImpl implements UrgeStatusService {
	
	private static final Logger logger = LoggerFactory.getLogger(UrgeStatusServiceImpl.class);
	
	@Autowired
	private OmcUrgeStatusDao omcUrgeStatusDao;
	
	@Override
	public int modifyUrgeStatus(Connection connection,OmcUrgeStatus omcUrgeStatus) throws OmcException {
		int nInsertCnt = 0;
		int nUpdateCnt = omcUrgeStatusDao.update(connection, omcUrgeStatus);
		if (nUpdateCnt == 0){
			nInsertCnt = omcUrgeStatusDao.insert(connection, omcUrgeStatus);
		}
		
		if ((nUpdateCnt == 0)&&(nInsertCnt == 0)){
			logger.error("***omcScoutStatus更新失败【" + omcUrgeStatus.toString() + "】");
			throw new OmcException("UPDATE","omcScoutStatus更新失败");
		}
		
        return 1;
	}

	@Override
	public OmcUrgeStatus selectUrgeStatus(String tenantId, String businessCode, String urgeType, String ownerType,
			String ownerId)  throws OmcException {
		Map<String, String> params = new HashMap<String, String>();
		params.put(OmcCalKey.OMC_TENANT_ID, tenantId);
		params.put(OmcCalKey.OMC_OWNER_ID, ownerId);
		params.put(OmcCalKey.OMC_OWNER_TYPE, ownerType);
		params.put(OmcCalKey.OMC_URGE_TYPE, urgeType);
		params.put(OmcCalKey.OMC_BUSINESS_CODE, businessCode);
		Connection connection = JdbcProxy.getInstance().getConnection();
		OmcUrgeStatusDao omcUrgeStatusDao = new OmcUrgeStatusDaoImpl();
		return omcUrgeStatusDao.selectByparam(connection, params);

	}

}
