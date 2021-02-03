package com.smart.web.service.impl;

import com.smart.web.common.ResponseCode;
import com.smart.web.entity.CateLog;
import com.smart.web.entity.Film;
import com.smart.web.ex.ServiceException;
import com.smart.web.mapper.CateLogMapper;
import com.smart.web.mapper.FilmMapper;
import com.smart.web.service.HomeService;
import com.smart.web.vo.HomeVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {
    @Resource
    FilmMapper filmMapper;

    @Resource
    CateLogMapper cateLogMapper;


    @Override
    public HomeVo getHomeData() throws ServiceException {
        try {
            //最新电影的数据
            HomeVo homeVo = new HomeVo();
            List<Film> films = filmMapper.selectFilms("f39c979857a4874a0157a4a6a4fe0000");
            homeVo.setNewFilmList(films);
            //最新电影的数据
            List<Film> tvList = filmMapper.selectFilms("f39c979857a4c8c50157a8ea80700018");
            homeVo.setNewTvList(tvList);
            //最新的动漫
            List<Film> animeList = filmMapper.selectFilms("f39c979857a4c8c50157a8eaaee30019");
            homeVo.setNewAnimeList(animeList);
            // 获取热门数据
            List<Film> topFilms = filmMapper.selectFilmsByTop("f39c979857a4874a0157a4a6a4fe0000");
            List<Film> topTvList = filmMapper.selectFilmsByTop("f39c979857a4c8c50157a8ea80700018");
            List<Film> topAnimeFilms = filmMapper.selectFilmsByTop("f39c979857a4c8c50157a8eaaee30019");
            homeVo.setTopAnimeList(topAnimeFilms);
            homeVo.setTopFilmList(topFilms);
            homeVo.setTopTvList(topTvList);
            return homeVo;
        } catch (Exception e) {
            throw new ServiceException(200, "业务错误");
        }
    }


    public List<CateLog> findCateLogs() {
        try {
            return cateLogMapper.selectCateLogs();
        } catch (Exception e) {
            throw new ServiceException(ResponseCode.ERROR);
        }
    }
    /**
     * @param username
     * @param password
     * @return
     * @throws ServiceException
     */
//    public User login(String username, String password) throws ServiceException {
//        User user = userMapper.selectUserByName(username);
//        if (user != null) {
//            if (user.getPassword().equals(password)) {
//                return user;
//            } else {
//                throw new ServiceException(ResponseCode.USER_PASSWORD_NAME);
//            }
//        } else {
//            throw new ServiceException(ResponseCode.USER_NOT_NAME);
//        }
//    }
}
