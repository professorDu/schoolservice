package com.usts.college.bean;

public class Apart {
    private Integer apartId;

    private String apartApa;
    
    

    public Apart() {
		super();
	}

	public Apart(Integer apartId, String apartApa) {
		super();
		this.apartId = apartId;
		this.apartApa = apartApa;
	}

	public Integer getApartId() {
        return apartId;
    }

    public void setApartId(Integer apartId) {
        this.apartId = apartId;
    }

    public String getApartApa() {
        return apartApa;
    }

    public void setApartApa(String apartApa) {
        this.apartApa = apartApa == null ? null : apartApa.trim();
    }

    @Override
    public String toString() {
        return "Apart{" +
                "apartId=" + apartId +
                ", apartApa='" + apartApa + '\'' +
                '}';
    }
}