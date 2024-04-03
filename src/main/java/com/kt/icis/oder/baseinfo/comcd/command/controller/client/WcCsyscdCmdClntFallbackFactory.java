package com.kt.icis.oder.baseinfo.comcd.command.controller.client;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import com.kt.icis.oder.baseinfo.comcd.command.controller.client.payload.in.WcCsyscdInCmdPyld;
import com.kt.icis.oder.baseinfo.comcd.command.controller.client.payload.out.WcCsyscdOutCmdPyld;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class WcCsyscdCmdClntFallbackFactory implements FallbackFactory<WcCsyscdCmdClnt>{

	@Override
	public WcCsyscdCmdClnt create(Throwable cause) {
		return new WcCsyscdCmdClnt() {
			@Override
			public WcCsyscdOutCmdPyld saveCsyscd(WcCsyscdInCmdPyld inPyld) {
				log.error("FallbackFactory"+cause.getMessage());
				return new WcCsyscdOutCmdPyld();
			}
		};
	}
}
