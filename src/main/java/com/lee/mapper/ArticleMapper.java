package com.lee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.entity.Article;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public interface ArticleMapper extends BaseMapper<Article> {
    public void deleteByCateId(Integer id);
    public Article getNextInfo(Map<String,Object> searchParam);
    public Article getPreInfo(Map<String,Object> searchParam);
}
