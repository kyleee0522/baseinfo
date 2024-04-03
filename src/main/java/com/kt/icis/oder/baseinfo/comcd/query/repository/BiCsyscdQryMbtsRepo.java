package com.kt.icis.oder.baseinfo.comcd.query.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import com.kt.icis.oder.baseinfo.comcd.query.payload.in.dto.BiCsyscdInQryDto;
import com.kt.icis.oder.baseinfo.comcd.query.repository.dto.BiCsyscdQryDto;
import com.kt.icis.oder.baseinfo.comcd.query.repository.sql.BiCsyscdQrySql;

@Mapper
public interface BiCsyscdQryMbtsRepo {
	@SelectProvider(type = BiCsyscdQrySql.class, method = "selectCsyscd")
	public List<BiCsyscdQryDto> selectCsyscd(BiCsyscdInQryDto inDto);	
}
