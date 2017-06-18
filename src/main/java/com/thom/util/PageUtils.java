package com.thom.util;

import com.github.pagehelper.Page;
import com.thom.vo.PagedResult;

import java.util.List;

/**
 * Created by ThinkPad on 2017/4/16.
 */
public class PageUtils {
    public static <T> PagedResult<T> toPagedResult(List<T> data) {
        PagedResult<T> result = new PagedResult<T>();
        if (data instanceof Page) {
            Page page = (Page) data;
            result.setRows(page.getResult());
            result.setTotal(page.getTotal());
        } else {
            result.setRows(data);
            result.setTotal(data.size());
        }

        return result;
    }
}
