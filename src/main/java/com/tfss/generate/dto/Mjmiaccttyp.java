package com.tfss.generate.dto;

public class Mjmiaccttyp {
    private String mjaccttypcd;

    private String mjaccttypdesc;

    private String miaccttypcd;

    private String miaccttypdesc;

    public String getMjaccttypcd() {
        return mjaccttypcd;
    }

    public void setMjaccttypcd(String mjaccttypcd) {
        this.mjaccttypcd = mjaccttypcd == null ? null : mjaccttypcd.trim();
    }

    public String getMjaccttypdesc() {
        return mjaccttypdesc;
    }

    public void setMjaccttypdesc(String mjaccttypdesc) {
        this.mjaccttypdesc = mjaccttypdesc == null ? null : mjaccttypdesc.trim();
    }

    public String getMiaccttypcd() {
        return miaccttypcd;
    }

    public void setMiaccttypcd(String miaccttypcd) {
        this.miaccttypcd = miaccttypcd == null ? null : miaccttypcd.trim();
    }

    public String getMiaccttypdesc() {
        return miaccttypdesc;
    }

    public void setMiaccttypdesc(String miaccttypdesc) {
        this.miaccttypdesc = miaccttypdesc == null ? null : miaccttypdesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mjaccttypcd=").append(mjaccttypcd);
        sb.append(", mjaccttypdesc=").append(mjaccttypdesc);
        sb.append(", miaccttypcd=").append(miaccttypcd);
        sb.append(", miaccttypdesc=").append(miaccttypdesc);
        sb.append("]");
        return sb.toString();
    }
}