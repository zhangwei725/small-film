package com.smart.web.controller;


import com.smart.web.common.ResponseResult;
import com.smart.web.entity.CateLog;
import com.smart.web.entity.Decade;
import com.smart.web.entity.Film;
import com.smart.web.ex.ServiceException;
import com.smart.web.mapper.FilmMapper;
import com.smart.web.service.HomeService;
import com.smart.web.vo.HomeVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * 统一的结果集处理
 * 全局异常处理
 * 1> 控制层不处理异常
 * 2> 自定义异常
 * 注意: 程序不要处理异常 如果非要处理异常 必须抛出响应的异常信息
 * 异常的处理尽量不要太细
 * 首页功能
 * 1. 获取电影分类的信息
 * 2. 主要的数据(电影相关的 数据)
 * 最新电影    电影排行榜
 * 最新电视剧  电视剧排行榜
 * 最新动漫    动漫排行榜
 */
@RestController
@RequestMapping("/home")
public class HomeController {
    @Resource
    HomeService homeService;


    @GetMapping("/")
    private ResponseResult<HomeVo> index() {
        return ResponseResult.success(homeService.getHomeData());
    }

    @GetMapping("decades")
    private ResponseResult<List<CateLog>> getDecadeList() {
        return ResponseResult.success(homeService.findCateLogs());
    }

    @GetMapping("/detail")
    private ResponseResult<Film> detail(@RequestParam String filmId) {
        return null;
    }


}
