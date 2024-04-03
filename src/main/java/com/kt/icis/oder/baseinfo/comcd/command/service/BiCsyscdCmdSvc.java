package com.kt.icis.oder.baseinfo.comcd.command.service;

import org.springframework.stereotype.Service;

import com.kt.icis.oder.baseinfo.comcd.command.repository.BiCsyscdCmdRepo;
import com.kt.icis.oder.baseinfo.comcd.command.repository.entity.BiCsyscdCmdEntt;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BiCsyscdCmdSvc {
	private final BiCsyscdCmdRepo csyscdCmdRepo;
	
	public BiCsyscdCmdEntt saveCsyscd(BiCsyscdCmdEntt inEntt) {
		return csyscdCmdRepo.save(inEntt);
	}
	
	public int insertCsyscd(BiCsyscdCmdEntt inEntt) {
		return csyscdCmdRepo.insertCsyscd(inEntt.getGrpId(), 
									inEntt.getCd(), 
									inEntt.getName(), 
									inEntt.getVal1(),
									inEntt.getVal2(),
									inEntt.getVal3(),
									inEntt.getVal4(),
									inEntt.getVal5());
	}
}
