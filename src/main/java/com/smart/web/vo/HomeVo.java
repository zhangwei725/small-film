package com.smart.web.vo;

import com.smart.web.entity.Film;
import lombok.Data;

import java.util.List;

@Data
public class HomeVo {
    /**
     * 最新电影
     */
    private List<Film> newFilmList;
    /**
     * 电影排行榜
     */
    private List<Film> topFilmList;
    /**
     * 最新电视剧
     */
    private List<Film> newTvList;
    /**
     * 电视剧排行榜
     */
    private List<Film> topTvList;
    /**
     * 最新动漫
     */
    private List<Film> newAnimeList;
    /**
     * 动漫排行榜
     */
    private List<Film> topAnimeList;

}
