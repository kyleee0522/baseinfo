package com.kt.icis.oder.baseinfo.comcd.query.payload.out;

import com.kt.icis.oder.baseinfo.comcd.query.payload.out.dto.BiCsyscdOutQryDto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BiCsyscdOutQryPyld {
	private BiCsyscdOutQryDto outDs;
}
