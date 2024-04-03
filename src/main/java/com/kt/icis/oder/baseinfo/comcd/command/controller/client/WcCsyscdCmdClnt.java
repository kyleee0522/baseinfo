package com.kt.icis.oder.baseinfo.comcd.command.controller.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kt.icis.oder.baseinfo.comcd.command.controller.client.payload.in.WcCsyscdInCmdPyld;
import com.kt.icis.oder.baseinfo.comcd.command.controller.client.payload.out.WcCsyscdOutCmdPyld;

@FeignClient(name = "WcCsyscdCmdClnt", url = "http://localhost:8090/wrlincomn", fallbackFactory = WcCsyscdCmdClntFallbackFactory.class)
public interface WcCsyscdCmdClnt {
	@PostMapping(value = "/comcd/savecsyscd")
	WcCsyscdOutCmdPyld saveCsyscd(@RequestBody WcCsyscdInCmdPyld inPyld);
}
