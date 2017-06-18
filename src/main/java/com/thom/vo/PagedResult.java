package com.thom.vo;

import java.util.List;

/**
 * Created by ThinkPad on 2017/4/16.
 */
public class PagedResult<T> {
    private List<T> rows;//数据

    private long total;//总条数

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
