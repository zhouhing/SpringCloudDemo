package com.client.utils;

import lombok.Data;

/**
 * @author ZYH
 * @version 5.0.0
 * created at 2020/11/27 17:41
 * copyright @2020 Beijing Murong Information Technology Co., Ltd.
 */
@Data
public class PageResult {
    //当前页码
    private int pageIndex;
    //每页的限制数量
    private int pageLimit;

    public PageResult getPageResult(PageResult pageResult) {
        int current = pageResult.getPageIndex();
        int limitPage = pageResult.getPageLimit();
        pageResult.setPageIndex((current - 1) * limitPage);
        return pageResult;
    }
}
