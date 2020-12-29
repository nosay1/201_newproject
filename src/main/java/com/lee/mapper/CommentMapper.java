package com.lee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lee.entity.Comment;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component
public interface CommentMapper extends BaseMapper<Comment> {
    List<Comment> selectCommentVoList(Map<String,Object> filter);
    Long selectCommentPageCount(Map<String,Object> filter);
    void deleteByArticleId(Integer articleid);
}
