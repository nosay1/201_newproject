package com.lee.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lee.entity.Cate;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;


public interface CateService extends IService<Cate> {
    public IPage<Map<String, Object>> getPageInfo(Map<String, Object> queryParam, int offset, int size);
    public List<Cate> getByCatename(String catename);
    public List<Cate> getList();
    public boolean deleteCateAndArticleAndCommentById(Integer id);
}
