package com.example.dto;

/**
 * 分装分页信息的类
 */
public class Page {
    //兼容所有的前端
    /**
     * 当前页
     */
    private Integer pageNo;
    /**
     * 页容量
     */
    private Integer pageSize;
    /**
     * 总页数
     */
    private Integer pageCount;

    /**
     * 数据总数
     */
    private long total;

    /**
     * 下一个
     */
    private Boolean hasNext;

    /**
     * 上一个
     */
    private Boolean hasPre;

    /**
     * 当前页数据
     */
    protected Object page;

    public Page() {
    }

    public Page(Integer pageNo, Integer pageSize, Integer pageCount, long total, Boolean hasNext, Boolean hasPre, Object page) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.pageCount = pageCount;
        this.total = total;
        this.hasNext = hasNext;
        this.hasPre = hasPre;
        this.page = page;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                ", pageCount=" + pageCount +
                ", total=" + total +
                ", hasNext=" + hasNext +
                ", hasPre=" + hasPre +
                ", page=" + page +
                '}';
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Boolean getHasNext() {
        return hasNext;
    }

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public Boolean getHasPre() {
        return hasPre;
    }

    public void setHasPre(Boolean hasPre) {
        this.hasPre = hasPre;
    }

    public Object getPage() {
        return page;
    }

    public void setPage(Object page) {
        this.page = page;
    }
}
