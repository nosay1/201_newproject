package com.lee.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lee.entity.Comment;
import com.lee.mapper.CommentMapper;
import com.lee.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {
    @Autowired
    CommentMapper commentMapper;


    @Override
    public List<Comment> getCommentList(Map<String, Object> filter) {
        return this.commentMapper.selectCommentVoList(filter);
    }

    @Override
    public Long getCommentPageCount(Map<String, Object> filter) {
        return this.commentMapper.selectCommentPageCount(filter);
    }
}
