package com.spring.annotations;

public class Chip {

    private String chipId;
    private String modelNo;

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public String getChipId() {
        return chipId;
    }

    @Override
    public String toString() {
        return "Chip{" +
                "chipId=" + chipId +
                ", modelNo='" + modelNo + '\'' +
                '}';
    }
}
