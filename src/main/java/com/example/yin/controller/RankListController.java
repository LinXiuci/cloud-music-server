package com.example.yin.controller;

import com.example.yin.common.ErrorMessage;
import com.example.yin.common.SuccessMessage;
import com.example.yin.domain.RankList;
import com.example.yin.service.impl.RankListServiceImpl;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/***
 * 评分系列
 */
@RestController
public class RankListController {

    @Autowired
    private RankListServiceImpl rankListService;

    // 提交评分
    @ResponseBody
    @PostMapping("/rankList/add")
    public Object addRank(HttpServletRequest req) {
        String songListId = req.getParameter("songListId").trim();
        String consumerId = req.getParameter("consumerId").trim();
        String score = req.getParameter("score").trim();

        RankList rank_list = new RankList();
        rank_list.setSongListId(Long.parseLong(songListId));
        rank_list.setConsumerId(Long.parseLong(consumerId));
        rank_list.setScore(Integer.parseInt(score));

        boolean res = rankListService.addRank(rank_list);
        if (res) {
            return new SuccessMessage<Null>("评价成功").getMessage();
        } else {
            return new ErrorMessage("评价失败").getMessage();
        }
    }

    // 获取指定歌单的评分
    @GetMapping("/rankList")
    public Object rankOfSongListId(HttpServletRequest req) {
        String songListId = req.getParameter("songListId");
        return new SuccessMessage<Number>(null, rankListService.rankOfSongListId(Long.parseLong(songListId))).getMessage();
    }
    
    // 获取指定用户的歌单评分
    @GetMapping("/rankList/user")
    public Object getUserRank(HttpServletRequest req) {
        String consumerId = req.getParameter("consumerId");
        String songListId = req.getParameter("songListId");
        
        return new SuccessMessage<Number>(null, rankListService.getUserRank(Long.parseLong(consumerId), Long.parseLong(songListId))).getMessage();
    }
}
