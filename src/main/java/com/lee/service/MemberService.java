package com.lee.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.entity.Member;

import java.util.List;
import java.util.Map;


public interface MemberService extends IService<Member> {
    public IPage<Map<String, Object>> getPageInfo(Map<String, Object> queryParam, int offset, int size);
    public List<Member> getByUsername(String username);
}
