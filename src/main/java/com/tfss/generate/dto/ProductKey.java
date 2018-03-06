package com.tfss.generate.dto;

public class ProductKey {
    private Integer prodid;

    private String mjaccttypcd;

    public Integer getProdid() {
        return prodid;
    }

    public void setProdid(Integer prodid) {
        this.prodid = prodid;
    }

    public String getMjaccttypcd() {
        return mjaccttypcd;
    }

    public void setMjaccttypcd(String mjaccttypcd) {
        this.mjaccttypcd = mjaccttypcd == null ? null : mjaccttypcd.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prodid=").append(prodid);
        sb.append(", mjaccttypcd=").append(mjaccttypcd);
        sb.append("]");
        return sb.toString();
    }
}