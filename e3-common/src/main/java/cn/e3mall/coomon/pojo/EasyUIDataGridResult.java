package cn.e3mall.coomon.pojo;

import java.io.Serializable;
import java.util.List;

public class EasyUIDataGridResult implements Serializable{
    private long total;

    private List rows;

    public long getTotal() {
        return total;
    }

    public List getRows() {
        return rows;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
