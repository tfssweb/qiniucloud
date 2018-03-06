package com.tfss.generate.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProdidIsNull() {
            addCriterion("prodid is null");
            return (Criteria) this;
        }

        public Criteria andProdidIsNotNull() {
            addCriterion("prodid is not null");
            return (Criteria) this;
        }

        public Criteria andProdidEqualTo(Integer value) {
            addCriterion("prodid =", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotEqualTo(Integer value) {
            addCriterion("prodid <>", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidGreaterThan(Integer value) {
            addCriterion("prodid >", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("prodid >=", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidLessThan(Integer value) {
            addCriterion("prodid <", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidLessThanOrEqualTo(Integer value) {
            addCriterion("prodid <=", value, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidIn(List<Integer> values) {
            addCriterion("prodid in", values, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotIn(List<Integer> values) {
            addCriterion("prodid not in", values, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidBetween(Integer value1, Integer value2) {
            addCriterion("prodid between", value1, value2, "prodid");
            return (Criteria) this;
        }

        public Criteria andProdidNotBetween(Integer value1, Integer value2) {
            addCriterion("prodid not between", value1, value2, "prodid");
            return (Criteria) this;
        }

        public Criteria andMjaccttypcdIsNull() {
            addCriterion("mjaccttypcd is null");
            return (Criteria) this;
        }

        public Criteria andMjaccttypcdIsNotNull() {
            addCriterion("mjaccttypcd is not null");
            return (Criteria) this;
        }

        public Criteria andMjaccttypcdEqualTo(String value) {
            addCriterion("mjaccttypcd =", value, "mjaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMjaccttypcdNotEqualTo(String value) {
            addCriterion("mjaccttypcd <>", value, "mjaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMjaccttypcdGreaterThan(String value) {
            addCriterion("mjaccttypcd >", value, "mjaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMjaccttypcdGreaterThanOrEqualTo(String value) {
            addCriterion("mjaccttypcd >=", value, "mjaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMjaccttypcdLessThan(String value) {
            addCriterion("mjaccttypcd <", value, "mjaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMjaccttypcdLessThanOrEqualTo(String value) {
            addCriterion("mjaccttypcd <=", value, "mjaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMjaccttypcdLike(String value) {
            addCriterion("mjaccttypcd like", value, "mjaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMjaccttypcdNotLike(String value) {
            addCriterion("mjaccttypcd not like", value, "mjaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMjaccttypcdIn(List<String> values) {
            addCriterion("mjaccttypcd in", values, "mjaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMjaccttypcdNotIn(List<String> values) {
            addCriterion("mjaccttypcd not in", values, "mjaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMjaccttypcdBetween(String value1, String value2) {
            addCriterion("mjaccttypcd between", value1, value2, "mjaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMjaccttypcdNotBetween(String value1, String value2) {
            addCriterion("mjaccttypcd not between", value1, value2, "mjaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMiaccttypcdIsNull() {
            addCriterion("miaccttypcd is null");
            return (Criteria) this;
        }

        public Criteria andMiaccttypcdIsNotNull() {
            addCriterion("miaccttypcd is not null");
            return (Criteria) this;
        }

        public Criteria andMiaccttypcdEqualTo(String value) {
            addCriterion("miaccttypcd =", value, "miaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMiaccttypcdNotEqualTo(String value) {
            addCriterion("miaccttypcd <>", value, "miaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMiaccttypcdGreaterThan(String value) {
            addCriterion("miaccttypcd >", value, "miaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMiaccttypcdGreaterThanOrEqualTo(String value) {
            addCriterion("miaccttypcd >=", value, "miaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMiaccttypcdLessThan(String value) {
            addCriterion("miaccttypcd <", value, "miaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMiaccttypcdLessThanOrEqualTo(String value) {
            addCriterion("miaccttypcd <=", value, "miaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMiaccttypcdLike(String value) {
            addCriterion("miaccttypcd like", value, "miaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMiaccttypcdNotLike(String value) {
            addCriterion("miaccttypcd not like", value, "miaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMiaccttypcdIn(List<String> values) {
            addCriterion("miaccttypcd in", values, "miaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMiaccttypcdNotIn(List<String> values) {
            addCriterion("miaccttypcd not in", values, "miaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMiaccttypcdBetween(String value1, String value2) {
            addCriterion("miaccttypcd between", value1, value2, "miaccttypcd");
            return (Criteria) this;
        }

        public Criteria andMiaccttypcdNotBetween(String value1, String value2) {
            addCriterion("miaccttypcd not between", value1, value2, "miaccttypcd");
            return (Criteria) this;
        }

        public Criteria andProdnameIsNull() {
            addCriterion("prodname is null");
            return (Criteria) this;
        }

        public Criteria andProdnameIsNotNull() {
            addCriterion("prodname is not null");
            return (Criteria) this;
        }

        public Criteria andProdnameEqualTo(String value) {
            addCriterion("prodname =", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotEqualTo(String value) {
            addCriterion("prodname <>", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameGreaterThan(String value) {
            addCriterion("prodname >", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameGreaterThanOrEqualTo(String value) {
            addCriterion("prodname >=", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameLessThan(String value) {
            addCriterion("prodname <", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameLessThanOrEqualTo(String value) {
            addCriterion("prodname <=", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameLike(String value) {
            addCriterion("prodname like", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotLike(String value) {
            addCriterion("prodname not like", value, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameIn(List<String> values) {
            addCriterion("prodname in", values, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotIn(List<String> values) {
            addCriterion("prodname not in", values, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameBetween(String value1, String value2) {
            addCriterion("prodname between", value1, value2, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdnameNotBetween(String value1, String value2) {
            addCriterion("prodname not between", value1, value2, "prodname");
            return (Criteria) this;
        }

        public Criteria andProdpriceIsNull() {
            addCriterion("prodprice is null");
            return (Criteria) this;
        }

        public Criteria andProdpriceIsNotNull() {
            addCriterion("prodprice is not null");
            return (Criteria) this;
        }

        public Criteria andProdpriceEqualTo(Double value) {
            addCriterion("prodprice =", value, "prodprice");
            return (Criteria) this;
        }

        public Criteria andProdpriceNotEqualTo(Double value) {
            addCriterion("prodprice <>", value, "prodprice");
            return (Criteria) this;
        }

        public Criteria andProdpriceGreaterThan(Double value) {
            addCriterion("prodprice >", value, "prodprice");
            return (Criteria) this;
        }

        public Criteria andProdpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("prodprice >=", value, "prodprice");
            return (Criteria) this;
        }

        public Criteria andProdpriceLessThan(Double value) {
            addCriterion("prodprice <", value, "prodprice");
            return (Criteria) this;
        }

        public Criteria andProdpriceLessThanOrEqualTo(Double value) {
            addCriterion("prodprice <=", value, "prodprice");
            return (Criteria) this;
        }

        public Criteria andProdpriceIn(List<Double> values) {
            addCriterion("prodprice in", values, "prodprice");
            return (Criteria) this;
        }

        public Criteria andProdpriceNotIn(List<Double> values) {
            addCriterion("prodprice not in", values, "prodprice");
            return (Criteria) this;
        }

        public Criteria andProdpriceBetween(Double value1, Double value2) {
            addCriterion("prodprice between", value1, value2, "prodprice");
            return (Criteria) this;
        }

        public Criteria andProdpriceNotBetween(Double value1, Double value2) {
            addCriterion("prodprice not between", value1, value2, "prodprice");
            return (Criteria) this;
        }

        public Criteria andProdpictureidIsNull() {
            addCriterion("prodpictureid is null");
            return (Criteria) this;
        }

        public Criteria andProdpictureidIsNotNull() {
            addCriterion("prodpictureid is not null");
            return (Criteria) this;
        }

        public Criteria andProdpictureidEqualTo(Integer value) {
            addCriterion("prodpictureid =", value, "prodpictureid");
            return (Criteria) this;
        }

        public Criteria andProdpictureidNotEqualTo(Integer value) {
            addCriterion("prodpictureid <>", value, "prodpictureid");
            return (Criteria) this;
        }

        public Criteria andProdpictureidGreaterThan(Integer value) {
            addCriterion("prodpictureid >", value, "prodpictureid");
            return (Criteria) this;
        }

        public Criteria andProdpictureidGreaterThanOrEqualTo(Integer value) {
            addCriterion("prodpictureid >=", value, "prodpictureid");
            return (Criteria) this;
        }

        public Criteria andProdpictureidLessThan(Integer value) {
            addCriterion("prodpictureid <", value, "prodpictureid");
            return (Criteria) this;
        }

        public Criteria andProdpictureidLessThanOrEqualTo(Integer value) {
            addCriterion("prodpictureid <=", value, "prodpictureid");
            return (Criteria) this;
        }

        public Criteria andProdpictureidIn(List<Integer> values) {
            addCriterion("prodpictureid in", values, "prodpictureid");
            return (Criteria) this;
        }

        public Criteria andProdpictureidNotIn(List<Integer> values) {
            addCriterion("prodpictureid not in", values, "prodpictureid");
            return (Criteria) this;
        }

        public Criteria andProdpictureidBetween(Integer value1, Integer value2) {
            addCriterion("prodpictureid between", value1, value2, "prodpictureid");
            return (Criteria) this;
        }

        public Criteria andProdpictureidNotBetween(Integer value1, Integer value2) {
            addCriterion("prodpictureid not between", value1, value2, "prodpictureid");
            return (Criteria) this;
        }

        public Criteria andProdtitleIsNull() {
            addCriterion("prodtitle is null");
            return (Criteria) this;
        }

        public Criteria andProdtitleIsNotNull() {
            addCriterion("prodtitle is not null");
            return (Criteria) this;
        }

        public Criteria andProdtitleEqualTo(String value) {
            addCriterion("prodtitle =", value, "prodtitle");
            return (Criteria) this;
        }

        public Criteria andProdtitleNotEqualTo(String value) {
            addCriterion("prodtitle <>", value, "prodtitle");
            return (Criteria) this;
        }

        public Criteria andProdtitleGreaterThan(String value) {
            addCriterion("prodtitle >", value, "prodtitle");
            return (Criteria) this;
        }

        public Criteria andProdtitleGreaterThanOrEqualTo(String value) {
            addCriterion("prodtitle >=", value, "prodtitle");
            return (Criteria) this;
        }

        public Criteria andProdtitleLessThan(String value) {
            addCriterion("prodtitle <", value, "prodtitle");
            return (Criteria) this;
        }

        public Criteria andProdtitleLessThanOrEqualTo(String value) {
            addCriterion("prodtitle <=", value, "prodtitle");
            return (Criteria) this;
        }

        public Criteria andProdtitleLike(String value) {
            addCriterion("prodtitle like", value, "prodtitle");
            return (Criteria) this;
        }

        public Criteria andProdtitleNotLike(String value) {
            addCriterion("prodtitle not like", value, "prodtitle");
            return (Criteria) this;
        }

        public Criteria andProdtitleIn(List<String> values) {
            addCriterion("prodtitle in", values, "prodtitle");
            return (Criteria) this;
        }

        public Criteria andProdtitleNotIn(List<String> values) {
            addCriterion("prodtitle not in", values, "prodtitle");
            return (Criteria) this;
        }

        public Criteria andProdtitleBetween(String value1, String value2) {
            addCriterion("prodtitle between", value1, value2, "prodtitle");
            return (Criteria) this;
        }

        public Criteria andProdtitleNotBetween(String value1, String value2) {
            addCriterion("prodtitle not between", value1, value2, "prodtitle");
            return (Criteria) this;
        }

        public Criteria andProddescIsNull() {
            addCriterion("proddesc is null");
            return (Criteria) this;
        }

        public Criteria andProddescIsNotNull() {
            addCriterion("proddesc is not null");
            return (Criteria) this;
        }

        public Criteria andProddescEqualTo(String value) {
            addCriterion("proddesc =", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescNotEqualTo(String value) {
            addCriterion("proddesc <>", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescGreaterThan(String value) {
            addCriterion("proddesc >", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescGreaterThanOrEqualTo(String value) {
            addCriterion("proddesc >=", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescLessThan(String value) {
            addCriterion("proddesc <", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescLessThanOrEqualTo(String value) {
            addCriterion("proddesc <=", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescLike(String value) {
            addCriterion("proddesc like", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescNotLike(String value) {
            addCriterion("proddesc not like", value, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescIn(List<String> values) {
            addCriterion("proddesc in", values, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescNotIn(List<String> values) {
            addCriterion("proddesc not in", values, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescBetween(String value1, String value2) {
            addCriterion("proddesc between", value1, value2, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddescNotBetween(String value1, String value2) {
            addCriterion("proddesc not between", value1, value2, "proddesc");
            return (Criteria) this;
        }

        public Criteria andProddetailIsNull() {
            addCriterion("proddetail is null");
            return (Criteria) this;
        }

        public Criteria andProddetailIsNotNull() {
            addCriterion("proddetail is not null");
            return (Criteria) this;
        }

        public Criteria andProddetailEqualTo(String value) {
            addCriterion("proddetail =", value, "proddetail");
            return (Criteria) this;
        }

        public Criteria andProddetailNotEqualTo(String value) {
            addCriterion("proddetail <>", value, "proddetail");
            return (Criteria) this;
        }

        public Criteria andProddetailGreaterThan(String value) {
            addCriterion("proddetail >", value, "proddetail");
            return (Criteria) this;
        }

        public Criteria andProddetailGreaterThanOrEqualTo(String value) {
            addCriterion("proddetail >=", value, "proddetail");
            return (Criteria) this;
        }

        public Criteria andProddetailLessThan(String value) {
            addCriterion("proddetail <", value, "proddetail");
            return (Criteria) this;
        }

        public Criteria andProddetailLessThanOrEqualTo(String value) {
            addCriterion("proddetail <=", value, "proddetail");
            return (Criteria) this;
        }

        public Criteria andProddetailLike(String value) {
            addCriterion("proddetail like", value, "proddetail");
            return (Criteria) this;
        }

        public Criteria andProddetailNotLike(String value) {
            addCriterion("proddetail not like", value, "proddetail");
            return (Criteria) this;
        }

        public Criteria andProddetailIn(List<String> values) {
            addCriterion("proddetail in", values, "proddetail");
            return (Criteria) this;
        }

        public Criteria andProddetailNotIn(List<String> values) {
            addCriterion("proddetail not in", values, "proddetail");
            return (Criteria) this;
        }

        public Criteria andProddetailBetween(String value1, String value2) {
            addCriterion("proddetail between", value1, value2, "proddetail");
            return (Criteria) this;
        }

        public Criteria andProddetailNotBetween(String value1, String value2) {
            addCriterion("proddetail not between", value1, value2, "proddetail");
            return (Criteria) this;
        }

        public Criteria andProdadddateIsNull() {
            addCriterion("prodadddate is null");
            return (Criteria) this;
        }

        public Criteria andProdadddateIsNotNull() {
            addCriterion("prodadddate is not null");
            return (Criteria) this;
        }

        public Criteria andProdadddateEqualTo(Date value) {
            addCriterion("prodadddate =", value, "prodadddate");
            return (Criteria) this;
        }

        public Criteria andProdadddateNotEqualTo(Date value) {
            addCriterion("prodadddate <>", value, "prodadddate");
            return (Criteria) this;
        }

        public Criteria andProdadddateGreaterThan(Date value) {
            addCriterion("prodadddate >", value, "prodadddate");
            return (Criteria) this;
        }

        public Criteria andProdadddateGreaterThanOrEqualTo(Date value) {
            addCriterion("prodadddate >=", value, "prodadddate");
            return (Criteria) this;
        }

        public Criteria andProdadddateLessThan(Date value) {
            addCriterion("prodadddate <", value, "prodadddate");
            return (Criteria) this;
        }

        public Criteria andProdadddateLessThanOrEqualTo(Date value) {
            addCriterion("prodadddate <=", value, "prodadddate");
            return (Criteria) this;
        }

        public Criteria andProdadddateIn(List<Date> values) {
            addCriterion("prodadddate in", values, "prodadddate");
            return (Criteria) this;
        }

        public Criteria andProdadddateNotIn(List<Date> values) {
            addCriterion("prodadddate not in", values, "prodadddate");
            return (Criteria) this;
        }

        public Criteria andProdadddateBetween(Date value1, Date value2) {
            addCriterion("prodadddate between", value1, value2, "prodadddate");
            return (Criteria) this;
        }

        public Criteria andProdadddateNotBetween(Date value1, Date value2) {
            addCriterion("prodadddate not between", value1, value2, "prodadddate");
            return (Criteria) this;
        }

        public Criteria andProdbuycntIsNull() {
            addCriterion("prodbuycnt is null");
            return (Criteria) this;
        }

        public Criteria andProdbuycntIsNotNull() {
            addCriterion("prodbuycnt is not null");
            return (Criteria) this;
        }

        public Criteria andProdbuycntEqualTo(Integer value) {
            addCriterion("prodbuycnt =", value, "prodbuycnt");
            return (Criteria) this;
        }

        public Criteria andProdbuycntNotEqualTo(Integer value) {
            addCriterion("prodbuycnt <>", value, "prodbuycnt");
            return (Criteria) this;
        }

        public Criteria andProdbuycntGreaterThan(Integer value) {
            addCriterion("prodbuycnt >", value, "prodbuycnt");
            return (Criteria) this;
        }

        public Criteria andProdbuycntGreaterThanOrEqualTo(Integer value) {
            addCriterion("prodbuycnt >=", value, "prodbuycnt");
            return (Criteria) this;
        }

        public Criteria andProdbuycntLessThan(Integer value) {
            addCriterion("prodbuycnt <", value, "prodbuycnt");
            return (Criteria) this;
        }

        public Criteria andProdbuycntLessThanOrEqualTo(Integer value) {
            addCriterion("prodbuycnt <=", value, "prodbuycnt");
            return (Criteria) this;
        }

        public Criteria andProdbuycntIn(List<Integer> values) {
            addCriterion("prodbuycnt in", values, "prodbuycnt");
            return (Criteria) this;
        }

        public Criteria andProdbuycntNotIn(List<Integer> values) {
            addCriterion("prodbuycnt not in", values, "prodbuycnt");
            return (Criteria) this;
        }

        public Criteria andProdbuycntBetween(Integer value1, Integer value2) {
            addCriterion("prodbuycnt between", value1, value2, "prodbuycnt");
            return (Criteria) this;
        }

        public Criteria andProdbuycntNotBetween(Integer value1, Integer value2) {
            addCriterion("prodbuycnt not between", value1, value2, "prodbuycnt");
            return (Criteria) this;
        }

        public Criteria andProd1IsNull() {
            addCriterion("prod1 is null");
            return (Criteria) this;
        }

        public Criteria andProd1IsNotNull() {
            addCriterion("prod1 is not null");
            return (Criteria) this;
        }

        public Criteria andProd1EqualTo(String value) {
            addCriterion("prod1 =", value, "prod1");
            return (Criteria) this;
        }

        public Criteria andProd1NotEqualTo(String value) {
            addCriterion("prod1 <>", value, "prod1");
            return (Criteria) this;
        }

        public Criteria andProd1GreaterThan(String value) {
            addCriterion("prod1 >", value, "prod1");
            return (Criteria) this;
        }

        public Criteria andProd1GreaterThanOrEqualTo(String value) {
            addCriterion("prod1 >=", value, "prod1");
            return (Criteria) this;
        }

        public Criteria andProd1LessThan(String value) {
            addCriterion("prod1 <", value, "prod1");
            return (Criteria) this;
        }

        public Criteria andProd1LessThanOrEqualTo(String value) {
            addCriterion("prod1 <=", value, "prod1");
            return (Criteria) this;
        }

        public Criteria andProd1Like(String value) {
            addCriterion("prod1 like", value, "prod1");
            return (Criteria) this;
        }

        public Criteria andProd1NotLike(String value) {
            addCriterion("prod1 not like", value, "prod1");
            return (Criteria) this;
        }

        public Criteria andProd1In(List<String> values) {
            addCriterion("prod1 in", values, "prod1");
            return (Criteria) this;
        }

        public Criteria andProd1NotIn(List<String> values) {
            addCriterion("prod1 not in", values, "prod1");
            return (Criteria) this;
        }

        public Criteria andProd1Between(String value1, String value2) {
            addCriterion("prod1 between", value1, value2, "prod1");
            return (Criteria) this;
        }

        public Criteria andProd1NotBetween(String value1, String value2) {
            addCriterion("prod1 not between", value1, value2, "prod1");
            return (Criteria) this;
        }

        public Criteria andProd2IsNull() {
            addCriterion("prod2 is null");
            return (Criteria) this;
        }

        public Criteria andProd2IsNotNull() {
            addCriterion("prod2 is not null");
            return (Criteria) this;
        }

        public Criteria andProd2EqualTo(String value) {
            addCriterion("prod2 =", value, "prod2");
            return (Criteria) this;
        }

        public Criteria andProd2NotEqualTo(String value) {
            addCriterion("prod2 <>", value, "prod2");
            return (Criteria) this;
        }

        public Criteria andProd2GreaterThan(String value) {
            addCriterion("prod2 >", value, "prod2");
            return (Criteria) this;
        }

        public Criteria andProd2GreaterThanOrEqualTo(String value) {
            addCriterion("prod2 >=", value, "prod2");
            return (Criteria) this;
        }

        public Criteria andProd2LessThan(String value) {
            addCriterion("prod2 <", value, "prod2");
            return (Criteria) this;
        }

        public Criteria andProd2LessThanOrEqualTo(String value) {
            addCriterion("prod2 <=", value, "prod2");
            return (Criteria) this;
        }

        public Criteria andProd2Like(String value) {
            addCriterion("prod2 like", value, "prod2");
            return (Criteria) this;
        }

        public Criteria andProd2NotLike(String value) {
            addCriterion("prod2 not like", value, "prod2");
            return (Criteria) this;
        }

        public Criteria andProd2In(List<String> values) {
            addCriterion("prod2 in", values, "prod2");
            return (Criteria) this;
        }

        public Criteria andProd2NotIn(List<String> values) {
            addCriterion("prod2 not in", values, "prod2");
            return (Criteria) this;
        }

        public Criteria andProd2Between(String value1, String value2) {
            addCriterion("prod2 between", value1, value2, "prod2");
            return (Criteria) this;
        }

        public Criteria andProd2NotBetween(String value1, String value2) {
            addCriterion("prod2 not between", value1, value2, "prod2");
            return (Criteria) this;
        }

        public Criteria andProd3IsNull() {
            addCriterion("prod3 is null");
            return (Criteria) this;
        }

        public Criteria andProd3IsNotNull() {
            addCriterion("prod3 is not null");
            return (Criteria) this;
        }

        public Criteria andProd3EqualTo(String value) {
            addCriterion("prod3 =", value, "prod3");
            return (Criteria) this;
        }

        public Criteria andProd3NotEqualTo(String value) {
            addCriterion("prod3 <>", value, "prod3");
            return (Criteria) this;
        }

        public Criteria andProd3GreaterThan(String value) {
            addCriterion("prod3 >", value, "prod3");
            return (Criteria) this;
        }

        public Criteria andProd3GreaterThanOrEqualTo(String value) {
            addCriterion("prod3 >=", value, "prod3");
            return (Criteria) this;
        }

        public Criteria andProd3LessThan(String value) {
            addCriterion("prod3 <", value, "prod3");
            return (Criteria) this;
        }

        public Criteria andProd3LessThanOrEqualTo(String value) {
            addCriterion("prod3 <=", value, "prod3");
            return (Criteria) this;
        }

        public Criteria andProd3Like(String value) {
            addCriterion("prod3 like", value, "prod3");
            return (Criteria) this;
        }

        public Criteria andProd3NotLike(String value) {
            addCriterion("prod3 not like", value, "prod3");
            return (Criteria) this;
        }

        public Criteria andProd3In(List<String> values) {
            addCriterion("prod3 in", values, "prod3");
            return (Criteria) this;
        }

        public Criteria andProd3NotIn(List<String> values) {
            addCriterion("prod3 not in", values, "prod3");
            return (Criteria) this;
        }

        public Criteria andProd3Between(String value1, String value2) {
            addCriterion("prod3 between", value1, value2, "prod3");
            return (Criteria) this;
        }

        public Criteria andProd3NotBetween(String value1, String value2) {
            addCriterion("prod3 not between", value1, value2, "prod3");
            return (Criteria) this;
        }

        public Criteria andProd4IsNull() {
            addCriterion("prod4 is null");
            return (Criteria) this;
        }

        public Criteria andProd4IsNotNull() {
            addCriterion("prod4 is not null");
            return (Criteria) this;
        }

        public Criteria andProd4EqualTo(String value) {
            addCriterion("prod4 =", value, "prod4");
            return (Criteria) this;
        }

        public Criteria andProd4NotEqualTo(String value) {
            addCriterion("prod4 <>", value, "prod4");
            return (Criteria) this;
        }

        public Criteria andProd4GreaterThan(String value) {
            addCriterion("prod4 >", value, "prod4");
            return (Criteria) this;
        }

        public Criteria andProd4GreaterThanOrEqualTo(String value) {
            addCriterion("prod4 >=", value, "prod4");
            return (Criteria) this;
        }

        public Criteria andProd4LessThan(String value) {
            addCriterion("prod4 <", value, "prod4");
            return (Criteria) this;
        }

        public Criteria andProd4LessThanOrEqualTo(String value) {
            addCriterion("prod4 <=", value, "prod4");
            return (Criteria) this;
        }

        public Criteria andProd4Like(String value) {
            addCriterion("prod4 like", value, "prod4");
            return (Criteria) this;
        }

        public Criteria andProd4NotLike(String value) {
            addCriterion("prod4 not like", value, "prod4");
            return (Criteria) this;
        }

        public Criteria andProd4In(List<String> values) {
            addCriterion("prod4 in", values, "prod4");
            return (Criteria) this;
        }

        public Criteria andProd4NotIn(List<String> values) {
            addCriterion("prod4 not in", values, "prod4");
            return (Criteria) this;
        }

        public Criteria andProd4Between(String value1, String value2) {
            addCriterion("prod4 between", value1, value2, "prod4");
            return (Criteria) this;
        }

        public Criteria andProd4NotBetween(String value1, String value2) {
            addCriterion("prod4 not between", value1, value2, "prod4");
            return (Criteria) this;
        }

        public Criteria andProd5IsNull() {
            addCriterion("prod5 is null");
            return (Criteria) this;
        }

        public Criteria andProd5IsNotNull() {
            addCriterion("prod5 is not null");
            return (Criteria) this;
        }

        public Criteria andProd5EqualTo(String value) {
            addCriterion("prod5 =", value, "prod5");
            return (Criteria) this;
        }

        public Criteria andProd5NotEqualTo(String value) {
            addCriterion("prod5 <>", value, "prod5");
            return (Criteria) this;
        }

        public Criteria andProd5GreaterThan(String value) {
            addCriterion("prod5 >", value, "prod5");
            return (Criteria) this;
        }

        public Criteria andProd5GreaterThanOrEqualTo(String value) {
            addCriterion("prod5 >=", value, "prod5");
            return (Criteria) this;
        }

        public Criteria andProd5LessThan(String value) {
            addCriterion("prod5 <", value, "prod5");
            return (Criteria) this;
        }

        public Criteria andProd5LessThanOrEqualTo(String value) {
            addCriterion("prod5 <=", value, "prod5");
            return (Criteria) this;
        }

        public Criteria andProd5Like(String value) {
            addCriterion("prod5 like", value, "prod5");
            return (Criteria) this;
        }

        public Criteria andProd5NotLike(String value) {
            addCriterion("prod5 not like", value, "prod5");
            return (Criteria) this;
        }

        public Criteria andProd5In(List<String> values) {
            addCriterion("prod5 in", values, "prod5");
            return (Criteria) this;
        }

        public Criteria andProd5NotIn(List<String> values) {
            addCriterion("prod5 not in", values, "prod5");
            return (Criteria) this;
        }

        public Criteria andProd5Between(String value1, String value2) {
            addCriterion("prod5 between", value1, value2, "prod5");
            return (Criteria) this;
        }

        public Criteria andProd5NotBetween(String value1, String value2) {
            addCriterion("prod5 not between", value1, value2, "prod5");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintIsNull() {
            addCriterion("datelastmaint is null");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintIsNotNull() {
            addCriterion("datelastmaint is not null");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintEqualTo(Date value) {
            addCriterion("datelastmaint =", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintNotEqualTo(Date value) {
            addCriterion("datelastmaint <>", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintGreaterThan(Date value) {
            addCriterion("datelastmaint >", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintGreaterThanOrEqualTo(Date value) {
            addCriterion("datelastmaint >=", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintLessThan(Date value) {
            addCriterion("datelastmaint <", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintLessThanOrEqualTo(Date value) {
            addCriterion("datelastmaint <=", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintIn(List<Date> values) {
            addCriterion("datelastmaint in", values, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintNotIn(List<Date> values) {
            addCriterion("datelastmaint not in", values, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintBetween(Date value1, Date value2) {
            addCriterion("datelastmaint between", value1, value2, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintNotBetween(Date value1, Date value2) {
            addCriterion("datelastmaint not between", value1, value2, "datelastmaint");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}