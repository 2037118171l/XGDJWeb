package com.xgdjweb.bean;

import java.util.ArrayList;
import java.util.List;

public class PictureuploadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PictureuploadExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPicturetitleIsNull() {
            addCriterion("picturetitle is null");
            return (Criteria) this;
        }

        public Criteria andPicturetitleIsNotNull() {
            addCriterion("picturetitle is not null");
            return (Criteria) this;
        }

        public Criteria andPicturetitleEqualTo(String value) {
            addCriterion("picturetitle =", value, "picturetitle");
            return (Criteria) this;
        }

        public Criteria andPicturetitleNotEqualTo(String value) {
            addCriterion("picturetitle <>", value, "picturetitle");
            return (Criteria) this;
        }

        public Criteria andPicturetitleGreaterThan(String value) {
            addCriterion("picturetitle >", value, "picturetitle");
            return (Criteria) this;
        }

        public Criteria andPicturetitleGreaterThanOrEqualTo(String value) {
            addCriterion("picturetitle >=", value, "picturetitle");
            return (Criteria) this;
        }

        public Criteria andPicturetitleLessThan(String value) {
            addCriterion("picturetitle <", value, "picturetitle");
            return (Criteria) this;
        }

        public Criteria andPicturetitleLessThanOrEqualTo(String value) {
            addCriterion("picturetitle <=", value, "picturetitle");
            return (Criteria) this;
        }

        public Criteria andPicturetitleLike(String value) {
            addCriterion("picturetitle like", value, "picturetitle");
            return (Criteria) this;
        }

        public Criteria andPicturetitleNotLike(String value) {
            addCriterion("picturetitle not like", value, "picturetitle");
            return (Criteria) this;
        }

        public Criteria andPicturetitleIn(List<String> values) {
            addCriterion("picturetitle in", values, "picturetitle");
            return (Criteria) this;
        }

        public Criteria andPicturetitleNotIn(List<String> values) {
            addCriterion("picturetitle not in", values, "picturetitle");
            return (Criteria) this;
        }

        public Criteria andPicturetitleBetween(String value1, String value2) {
            addCriterion("picturetitle between", value1, value2, "picturetitle");
            return (Criteria) this;
        }

        public Criteria andPicturetitleNotBetween(String value1, String value2) {
            addCriterion("picturetitle not between", value1, value2, "picturetitle");
            return (Criteria) this;
        }

        public Criteria andPicturepathIsNull() {
            addCriterion("picturepath is null");
            return (Criteria) this;
        }

        public Criteria andPicturepathIsNotNull() {
            addCriterion("picturepath is not null");
            return (Criteria) this;
        }

        public Criteria andPicturepathEqualTo(String value) {
            addCriterion("picturepath =", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotEqualTo(String value) {
            addCriterion("picturepath <>", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathGreaterThan(String value) {
            addCriterion("picturepath >", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathGreaterThanOrEqualTo(String value) {
            addCriterion("picturepath >=", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathLessThan(String value) {
            addCriterion("picturepath <", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathLessThanOrEqualTo(String value) {
            addCriterion("picturepath <=", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathLike(String value) {
            addCriterion("picturepath like", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotLike(String value) {
            addCriterion("picturepath not like", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathIn(List<String> values) {
            addCriterion("picturepath in", values, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotIn(List<String> values) {
            addCriterion("picturepath not in", values, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathBetween(String value1, String value2) {
            addCriterion("picturepath between", value1, value2, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotBetween(String value1, String value2) {
            addCriterion("picturepath not between", value1, value2, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturenameIsNull() {
            addCriterion("picturename is null");
            return (Criteria) this;
        }

        public Criteria andPicturenameIsNotNull() {
            addCriterion("picturename is not null");
            return (Criteria) this;
        }

        public Criteria andPicturenameEqualTo(String value) {
            addCriterion("picturename =", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameNotEqualTo(String value) {
            addCriterion("picturename <>", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameGreaterThan(String value) {
            addCriterion("picturename >", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameGreaterThanOrEqualTo(String value) {
            addCriterion("picturename >=", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameLessThan(String value) {
            addCriterion("picturename <", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameLessThanOrEqualTo(String value) {
            addCriterion("picturename <=", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameLike(String value) {
            addCriterion("picturename like", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameNotLike(String value) {
            addCriterion("picturename not like", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameIn(List<String> values) {
            addCriterion("picturename in", values, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameNotIn(List<String> values) {
            addCriterion("picturename not in", values, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameBetween(String value1, String value2) {
            addCriterion("picturename between", value1, value2, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameNotBetween(String value1, String value2) {
            addCriterion("picturename not between", value1, value2, "picturename");
            return (Criteria) this;
        }

        public Criteria andPuttonIsNull() {
            addCriterion("putton is null");
            return (Criteria) this;
        }

        public Criteria andPuttonIsNotNull() {
            addCriterion("putton is not null");
            return (Criteria) this;
        }

        public Criteria andPuttonEqualTo(String value) {
            addCriterion("putton =", value, "putton");
            return (Criteria) this;
        }

        public Criteria andPuttonNotEqualTo(String value) {
            addCriterion("putton <>", value, "putton");
            return (Criteria) this;
        }

        public Criteria andPuttonGreaterThan(String value) {
            addCriterion("putton >", value, "putton");
            return (Criteria) this;
        }

        public Criteria andPuttonGreaterThanOrEqualTo(String value) {
            addCriterion("putton >=", value, "putton");
            return (Criteria) this;
        }

        public Criteria andPuttonLessThan(String value) {
            addCriterion("putton <", value, "putton");
            return (Criteria) this;
        }

        public Criteria andPuttonLessThanOrEqualTo(String value) {
            addCriterion("putton <=", value, "putton");
            return (Criteria) this;
        }

        public Criteria andPuttonLike(String value) {
            addCriterion("putton like", value, "putton");
            return (Criteria) this;
        }

        public Criteria andPuttonNotLike(String value) {
            addCriterion("putton not like", value, "putton");
            return (Criteria) this;
        }

        public Criteria andPuttonIn(List<String> values) {
            addCriterion("putton in", values, "putton");
            return (Criteria) this;
        }

        public Criteria andPuttonNotIn(List<String> values) {
            addCriterion("putton not in", values, "putton");
            return (Criteria) this;
        }

        public Criteria andPuttonBetween(String value1, String value2) {
            addCriterion("putton between", value1, value2, "putton");
            return (Criteria) this;
        }

        public Criteria andPuttonNotBetween(String value1, String value2) {
            addCriterion("putton not between", value1, value2, "putton");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private final String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private final String typeHandler;

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