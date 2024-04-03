package com.kt.icis.oder.baseinfo.comcd.query.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.kt.icis.oder.baseinfo.comcd.query.repository.entity.BiCsyscdQryEntt;

@Repository
public interface BiCsyscdQryRepo extends PagingAndSortingRepository<BiCsyscdQryEntt, String>{	
	public BiCsyscdQryEntt findByGrpIdAndCd(String grpId, String cd);	
}
