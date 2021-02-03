package com.smart.web.mapper;

import com.smart.web.entity.Film;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 入参 Entity对象
 */
public interface FilmMapper {
    List<Film> selectFilms(@Param("cateLogId") String cateLogId);

    List<Film> selectFilmsByTop(@Param("cateLogId") String cateLogId);
}
