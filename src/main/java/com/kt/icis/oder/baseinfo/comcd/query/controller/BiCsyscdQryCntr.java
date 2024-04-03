package com.kt.icis.oder.baseinfo.comcd.query.controller;

import java.util.List;

import org.springframework.stereotype.Component;

import com.kt.icis.oder.baseinfo.comcd.query.payload.in.dto.BiCsyscdInQryDto;
import com.kt.icis.oder.baseinfo.comcd.query.payload.out.dto.BiCsyscdOutQryDto;
import com.kt.icis.oder.baseinfo.comcd.query.repository.dto.BiCsyscdQryDto;
import com.kt.icis.oder.baseinfo.comcd.query.repository.entity.BiCsyscdQryEntt;
import com.kt.icis.oder.baseinfo.comcd.query.service.BiCsyscdQrySvc;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class BiCsyscdQryCntr {
	private final BiCsyscdQrySvc csyscdQrySvc;
	
	public List<BiCsyscdQryDto> selectCsyscd(BiCsyscdInQryDto inDto) {	
		return csyscdQrySvc.selectCsyscd(inDto);
	}
	
	public BiCsyscdOutQryDto findCsyscd(BiCsyscdInQryDto inDto) {
		BiCsyscdQryEntt entt = csyscdQrySvc.findCsyscd(inDto);		
		return BiCsyscdOutQryDto.of(entt);
	}
}
