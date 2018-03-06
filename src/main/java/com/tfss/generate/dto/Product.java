package com.tfss.generate.dto;

import java.util.Date;

public class Product extends ProductKey {
    private String miaccttypcd;

    private String prodname;

    private Double prodprice;

    private Integer prodpictureid;

    private String prodtitle;

    private String proddesc;

    private String proddetail;

    private Date prodadddate;

    private Integer prodbuycnt;

    private String prod1;

    private String prod2;

    private String prod3;

    private String prod4;

    private String prod5;

    private Date datelastmaint;

    public String getMiaccttypcd() {
        return miaccttypcd;
    }

    public void setMiaccttypcd(String miaccttypcd) {
        this.miaccttypcd = miaccttypcd == null ? null : miaccttypcd.trim();
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname == null ? null : prodname.trim();
    }

    public Double getProdprice() {
        return prodprice;
    }

    public void setProdprice(Double prodprice) {
        this.prodprice = prodprice;
    }

    public Integer getProdpictureid() {
        return prodpictureid;
    }

    public void setProdpictureid(Integer prodpictureid) {
        this.prodpictureid = prodpictureid;
    }

    public String getProdtitle() {
        return prodtitle;
    }

    public void setProdtitle(String prodtitle) {
        this.prodtitle = prodtitle == null ? null : prodtitle.trim();
    }

    public String getProddesc() {
        return proddesc;
    }

    public void setProddesc(String proddesc) {
        this.proddesc = proddesc == null ? null : proddesc.trim();
    }

    public String getProddetail() {
        return proddetail;
    }

    public void setProddetail(String proddetail) {
        this.proddetail = proddetail == null ? null : proddetail.trim();
    }

    public Date getProdadddate() {
        return prodadddate;
    }

    public void setProdadddate(Date prodadddate) {
        this.prodadddate = prodadddate;
    }

    public Integer getProdbuycnt() {
        return prodbuycnt;
    }

    public void setProdbuycnt(Integer prodbuycnt) {
        this.prodbuycnt = prodbuycnt;
    }

    public String getProd1() {
        return prod1;
    }

    public void setProd1(String prod1) {
        this.prod1 = prod1 == null ? null : prod1.trim();
    }

    public String getProd2() {
        return prod2;
    }

    public void setProd2(String prod2) {
        this.prod2 = prod2 == null ? null : prod2.trim();
    }

    public String getProd3() {
        return prod3;
    }

    public void setProd3(String prod3) {
        this.prod3 = prod3 == null ? null : prod3.trim();
    }

    public String getProd4() {
        return prod4;
    }

    public void setProd4(String prod4) {
        this.prod4 = prod4 == null ? null : prod4.trim();
    }

    public String getProd5() {
        return prod5;
    }

    public void setProd5(String prod5) {
        this.prod5 = prod5 == null ? null : prod5.trim();
    }

    public Date getDatelastmaint() {
        return datelastmaint;
    }

    public void setDatelastmaint(Date datelastmaint) {
        this.datelastmaint = datelastmaint;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", miaccttypcd=").append(miaccttypcd);
        sb.append(", prodname=").append(prodname);
        sb.append(", prodprice=").append(prodprice);
        sb.append(", prodpictureid=").append(prodpictureid);
        sb.append(", prodtitle=").append(prodtitle);
        sb.append(", proddesc=").append(proddesc);
        sb.append(", proddetail=").append(proddetail);
        sb.append(", prodadddate=").append(prodadddate);
        sb.append(", prodbuycnt=").append(prodbuycnt);
        sb.append(", prod1=").append(prod1);
        sb.append(", prod2=").append(prod2);
        sb.append(", prod3=").append(prod3);
        sb.append(", prod4=").append(prod4);
        sb.append(", prod5=").append(prod5);
        sb.append(", datelastmaint=").append(datelastmaint);
        sb.append("]");
        return sb.toString();
    }
}