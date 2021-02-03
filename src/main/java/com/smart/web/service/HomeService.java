package com.smart.web.service;

import com.smart.web.entity.CateLog;
import com.smart.web.vo.HomeVo;

import java.util.List;

public interface HomeService {
    HomeVo getHomeData();

    List<CateLog> findCateLogs();
}
