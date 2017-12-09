package com.e3.common.easyui.vo;

import java.io.Serializable;
import java.util.List;

public class EasyUIDataGridResult<T> implements Serializable {

    private Integer total;

    private List<T> rows;

    public EasyUIDataGridResult(Integer total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public EasyUIDataGridResult(Long total, List<T> rows) {
        this.total = total.intValue();
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

}
