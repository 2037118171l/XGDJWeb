package com.xgdjweb.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTasktitleIsNull() {
            addCriterion("tasktitle is null");
            return (Criteria) this;
        }

        public Criteria andTasktitleIsNotNull() {
            addCriterion("tasktitle is not null");
            return (Criteria) this;
        }

        public Criteria andTasktitleEqualTo(String value) {
            addCriterion("tasktitle =", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotEqualTo(String value) {
            addCriterion("tasktitle <>", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleGreaterThan(String value) {
            addCriterion("tasktitle >", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleGreaterThanOrEqualTo(String value) {
            addCriterion("tasktitle >=", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleLessThan(String value) {
            addCriterion("tasktitle <", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleLessThanOrEqualTo(String value) {
            addCriterion("tasktitle <=", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleLike(String value) {
            addCriterion("tasktitle like", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotLike(String value) {
            addCriterion("tasktitle not like", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleIn(List<String> values) {
            addCriterion("tasktitle in", values, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotIn(List<String> values) {
            addCriterion("tasktitle not in", values, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleBetween(String value1, String value2) {
            addCriterion("tasktitle between", value1, value2, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotBetween(String value1, String value2) {
            addCriterion("tasktitle not between", value1, value2, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNull() {
            addCriterion("tasktype is null");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNotNull() {
            addCriterion("tasktype is not null");
            return (Criteria) this;
        }

        public Criteria andTasktypeEqualTo(String value) {
            addCriterion("tasktype =", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotEqualTo(String value) {
            addCriterion("tasktype <>", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThan(String value) {
            addCriterion("tasktype >", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThanOrEqualTo(String value) {
            addCriterion("tasktype >=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThan(String value) {
            addCriterion("tasktype <", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThanOrEqualTo(String value) {
            addCriterion("tasktype <=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLike(String value) {
            addCriterion("tasktype like", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotLike(String value) {
            addCriterion("tasktype not like", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeIn(List<String> values) {
            addCriterion("tasktype in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotIn(List<String> values) {
            addCriterion("tasktype not in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeBetween(String value1, String value2) {
            addCriterion("tasktype between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotBetween(String value1, String value2) {
            addCriterion("tasktype not between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTaskcontentIsNull() {
            addCriterion("taskcontent is null");
            return (Criteria) this;
        }

        public Criteria andTaskcontentIsNotNull() {
            addCriterion("taskcontent is not null");
            return (Criteria) this;
        }

        public Criteria andTaskcontentEqualTo(String value) {
            addCriterion("taskcontent =", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentNotEqualTo(String value) {
            addCriterion("taskcontent <>", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentGreaterThan(String value) {
            addCriterion("taskcontent >", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentGreaterThanOrEqualTo(String value) {
            addCriterion("taskcontent >=", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentLessThan(String value) {
            addCriterion("taskcontent <", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentLessThanOrEqualTo(String value) {
            addCriterion("taskcontent <=", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentLike(String value) {
            addCriterion("taskcontent like", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentNotLike(String value) {
            addCriterion("taskcontent not like", value, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentIn(List<String> values) {
            addCriterion("taskcontent in", values, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentNotIn(List<String> values) {
            addCriterion("taskcontent not in", values, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentBetween(String value1, String value2) {
            addCriterion("taskcontent between", value1, value2, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andTaskcontentNotBetween(String value1, String value2) {
            addCriterion("taskcontent not between", value1, value2, "taskcontent");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNull() {
            addCriterion("isshow is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("isshow is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(String value) {
            addCriterion("isshow =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(String value) {
            addCriterion("isshow <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(String value) {
            addCriterion("isshow >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(String value) {
            addCriterion("isshow >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(String value) {
            addCriterion("isshow <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(String value) {
            addCriterion("isshow <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLike(String value) {
            addCriterion("isshow like", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotLike(String value) {
            addCriterion("isshow not like", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(List<String> values) {
            addCriterion("isshow in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(List<String> values) {
            addCriterion("isshow not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(String value1, String value2) {
            addCriterion("isshow between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(String value1, String value2) {
            addCriterion("isshow not between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andSroleIsNull() {
            addCriterion("srole is null");
            return (Criteria) this;
        }

        public Criteria andSroleIsNotNull() {
            addCriterion("srole is not null");
            return (Criteria) this;
        }

        public Criteria andSroleEqualTo(String value) {
            addCriterion("srole =", value, "srole");
            return (Criteria) this;
        }

        public Criteria andSroleNotEqualTo(String value) {
            addCriterion("srole <>", value, "srole");
            return (Criteria) this;
        }

        public Criteria andSroleGreaterThan(String value) {
            addCriterion("srole >", value, "srole");
            return (Criteria) this;
        }

        public Criteria andSroleGreaterThanOrEqualTo(String value) {
            addCriterion("srole >=", value, "srole");
            return (Criteria) this;
        }

        public Criteria andSroleLessThan(String value) {
            addCriterion("srole <", value, "srole");
            return (Criteria) this;
        }

        public Criteria andSroleLessThanOrEqualTo(String value) {
            addCriterion("srole <=", value, "srole");
            return (Criteria) this;
        }

        public Criteria andSroleLike(String value) {
            addCriterion("srole like", value, "srole");
            return (Criteria) this;
        }

        public Criteria andSroleNotLike(String value) {
            addCriterion("srole not like", value, "srole");
            return (Criteria) this;
        }

        public Criteria andSroleIn(List<String> values) {
            addCriterion("srole in", values, "srole");
            return (Criteria) this;
        }

        public Criteria andSroleNotIn(List<String> values) {
            addCriterion("srole not in", values, "srole");
            return (Criteria) this;
        }

        public Criteria andSroleBetween(String value1, String value2) {
            addCriterion("srole between", value1, value2, "srole");
            return (Criteria) this;
        }

        public Criteria andSroleNotBetween(String value1, String value2) {
            addCriterion("srole not between", value1, value2, "srole");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIsNull() {
            addCriterion("releasetime is null");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIsNotNull() {
            addCriterion("releasetime is not null");
            return (Criteria) this;
        }

        public Criteria andReleasetimeEqualTo(Date value) {
            addCriterion("releasetime =", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotEqualTo(Date value) {
            addCriterion("releasetime <>", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeGreaterThan(Date value) {
            addCriterion("releasetime >", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("releasetime >=", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeLessThan(Date value) {
            addCriterion("releasetime <", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeLessThanOrEqualTo(Date value) {
            addCriterion("releasetime <=", value, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeIn(List<Date> values) {
            addCriterion("releasetime in", values, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotIn(List<Date> values) {
            addCriterion("releasetime not in", values, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeBetween(Date value1, Date value2) {
            addCriterion("releasetime between", value1, value2, "releasetime");
            return (Criteria) this;
        }

        public Criteria andReleasetimeNotBetween(Date value1, Date value2) {
            addCriterion("releasetime not between", value1, value2, "releasetime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andClosepersonIsNull() {
            addCriterion("closeperson is null");
            return (Criteria) this;
        }

        public Criteria andClosepersonIsNotNull() {
            addCriterion("closeperson is not null");
            return (Criteria) this;
        }

        public Criteria andClosepersonEqualTo(String value) {
            addCriterion("closeperson =", value, "closeperson");
            return (Criteria) this;
        }

        public Criteria andClosepersonNotEqualTo(String value) {
            addCriterion("closeperson <>", value, "closeperson");
            return (Criteria) this;
        }

        public Criteria andClosepersonGreaterThan(String value) {
            addCriterion("closeperson >", value, "closeperson");
            return (Criteria) this;
        }

        public Criteria andClosepersonGreaterThanOrEqualTo(String value) {
            addCriterion("closeperson >=", value, "closeperson");
            return (Criteria) this;
        }

        public Criteria andClosepersonLessThan(String value) {
            addCriterion("closeperson <", value, "closeperson");
            return (Criteria) this;
        }

        public Criteria andClosepersonLessThanOrEqualTo(String value) {
            addCriterion("closeperson <=", value, "closeperson");
            return (Criteria) this;
        }

        public Criteria andClosepersonLike(String value) {
            addCriterion("closeperson like", value, "closeperson");
            return (Criteria) this;
        }

        public Criteria andClosepersonNotLike(String value) {
            addCriterion("closeperson not like", value, "closeperson");
            return (Criteria) this;
        }

        public Criteria andClosepersonIn(List<String> values) {
            addCriterion("closeperson in", values, "closeperson");
            return (Criteria) this;
        }

        public Criteria andClosepersonNotIn(List<String> values) {
            addCriterion("closeperson not in", values, "closeperson");
            return (Criteria) this;
        }

        public Criteria andClosepersonBetween(String value1, String value2) {
            addCriterion("closeperson between", value1, value2, "closeperson");
            return (Criteria) this;
        }

        public Criteria andClosepersonNotBetween(String value1, String value2) {
            addCriterion("closeperson not between", value1, value2, "closeperson");
            return (Criteria) this;
        }

        public Criteria andResolverIsNull() {
            addCriterion("resolver is null");
            return (Criteria) this;
        }

        public Criteria andResolverIsNotNull() {
            addCriterion("resolver is not null");
            return (Criteria) this;
        }

        public Criteria andResolverEqualTo(String value) {
            addCriterion("resolver =", value, "resolver");
            return (Criteria) this;
        }

        public Criteria andResolverNotEqualTo(String value) {
            addCriterion("resolver <>", value, "resolver");
            return (Criteria) this;
        }

        public Criteria andResolverGreaterThan(String value) {
            addCriterion("resolver >", value, "resolver");
            return (Criteria) this;
        }

        public Criteria andResolverGreaterThanOrEqualTo(String value) {
            addCriterion("resolver >=", value, "resolver");
            return (Criteria) this;
        }

        public Criteria andResolverLessThan(String value) {
            addCriterion("resolver <", value, "resolver");
            return (Criteria) this;
        }

        public Criteria andResolverLessThanOrEqualTo(String value) {
            addCriterion("resolver <=", value, "resolver");
            return (Criteria) this;
        }

        public Criteria andResolverLike(String value) {
            addCriterion("resolver like", value, "resolver");
            return (Criteria) this;
        }

        public Criteria andResolverNotLike(String value) {
            addCriterion("resolver not like", value, "resolver");
            return (Criteria) this;
        }

        public Criteria andResolverIn(List<String> values) {
            addCriterion("resolver in", values, "resolver");
            return (Criteria) this;
        }

        public Criteria andResolverNotIn(List<String> values) {
            addCriterion("resolver not in", values, "resolver");
            return (Criteria) this;
        }

        public Criteria andResolverBetween(String value1, String value2) {
            addCriterion("resolver between", value1, value2, "resolver");
            return (Criteria) this;
        }

        public Criteria andResolverNotBetween(String value1, String value2) {
            addCriterion("resolver not between", value1, value2, "resolver");
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