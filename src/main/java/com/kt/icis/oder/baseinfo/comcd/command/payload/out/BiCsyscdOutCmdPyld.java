package com.kt.icis.oder.baseinfo.comcd.command.payload.out;

import com.kt.icis.oder.baseinfo.comcd.command.payload.out.dto.BiCsyscdOutCmdDto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BiCsyscdOutCmdPyld {
	private BiCsyscdOutCmdDto outDs;
}
