package com.thom.dto;

public class TbParameterWithBLOBs extends TbParameter {
    private String remark;

    private String mockData;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getMockData() {
        return mockData;
    }

    public void setMockData(String mockData) {
        this.mockData = mockData == null ? null : mockData.trim();
    }
}