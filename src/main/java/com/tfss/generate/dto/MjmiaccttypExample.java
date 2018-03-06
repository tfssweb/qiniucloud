package com.tfss.generate.dto;

import java.util.ArrayList;
import java.util.List;

public class MjmiaccttypExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MjmiaccttypExample() {
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

        public Criteria andMjaccttypdescIsNull() {
            addCriterion("mjaccttypdesc is null");
            return (Criteria) this;
        }

        public Criteria andMjaccttypdescIsNotNull() {
            addCriterion("mjaccttypdesc is not null");
            return (Criteria) this;
        }

        public Criteria andMjaccttypdescEqualTo(String value) {
            addCriterion("mjaccttypdesc =", value, "mjaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMjaccttypdescNotEqualTo(String value) {
            addCriterion("mjaccttypdesc <>", value, "mjaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMjaccttypdescGreaterThan(String value) {
            addCriterion("mjaccttypdesc >", value, "mjaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMjaccttypdescGreaterThanOrEqualTo(String value) {
            addCriterion("mjaccttypdesc >=", value, "mjaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMjaccttypdescLessThan(String value) {
            addCriterion("mjaccttypdesc <", value, "mjaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMjaccttypdescLessThanOrEqualTo(String value) {
            addCriterion("mjaccttypdesc <=", value, "mjaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMjaccttypdescLike(String value) {
            addCriterion("mjaccttypdesc like", value, "mjaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMjaccttypdescNotLike(String value) {
            addCriterion("mjaccttypdesc not like", value, "mjaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMjaccttypdescIn(List<String> values) {
            addCriterion("mjaccttypdesc in", values, "mjaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMjaccttypdescNotIn(List<String> values) {
            addCriterion("mjaccttypdesc not in", values, "mjaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMjaccttypdescBetween(String value1, String value2) {
            addCriterion("mjaccttypdesc between", value1, value2, "mjaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMjaccttypdescNotBetween(String value1, String value2) {
            addCriterion("mjaccttypdesc not between", value1, value2, "mjaccttypdesc");
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

        public Criteria andMiaccttypdescIsNull() {
            addCriterion("miaccttypdesc is null");
            return (Criteria) this;
        }

        public Criteria andMiaccttypdescIsNotNull() {
            addCriterion("miaccttypdesc is not null");
            return (Criteria) this;
        }

        public Criteria andMiaccttypdescEqualTo(String value) {
            addCriterion("miaccttypdesc =", value, "miaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMiaccttypdescNotEqualTo(String value) {
            addCriterion("miaccttypdesc <>", value, "miaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMiaccttypdescGreaterThan(String value) {
            addCriterion("miaccttypdesc >", value, "miaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMiaccttypdescGreaterThanOrEqualTo(String value) {
            addCriterion("miaccttypdesc >=", value, "miaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMiaccttypdescLessThan(String value) {
            addCriterion("miaccttypdesc <", value, "miaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMiaccttypdescLessThanOrEqualTo(String value) {
            addCriterion("miaccttypdesc <=", value, "miaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMiaccttypdescLike(String value) {
            addCriterion("miaccttypdesc like", value, "miaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMiaccttypdescNotLike(String value) {
            addCriterion("miaccttypdesc not like", value, "miaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMiaccttypdescIn(List<String> values) {
            addCriterion("miaccttypdesc in", values, "miaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMiaccttypdescNotIn(List<String> values) {
            addCriterion("miaccttypdesc not in", values, "miaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMiaccttypdescBetween(String value1, String value2) {
            addCriterion("miaccttypdesc between", value1, value2, "miaccttypdesc");
            return (Criteria) this;
        }

        public Criteria andMiaccttypdescNotBetween(String value1, String value2) {
            addCriterion("miaccttypdesc not between", value1, value2, "miaccttypdesc");
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