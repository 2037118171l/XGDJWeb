package com.xgdjweb.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VolunteerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VolunteerExample() {
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

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
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

        public Criteria andVolunteernameIsNull() {
            addCriterion("volunteername is null");
            return (Criteria) this;
        }

        public Criteria andVolunteernameIsNotNull() {
            addCriterion("volunteername is not null");
            return (Criteria) this;
        }

        public Criteria andVolunteernameEqualTo(String value) {
            addCriterion("volunteername =", value, "volunteername");
            return (Criteria) this;
        }

        public Criteria andVolunteernameNotEqualTo(String value) {
            addCriterion("volunteername <>", value, "volunteername");
            return (Criteria) this;
        }

        public Criteria andVolunteernameGreaterThan(String value) {
            addCriterion("volunteername >", value, "volunteername");
            return (Criteria) this;
        }

        public Criteria andVolunteernameGreaterThanOrEqualTo(String value) {
            addCriterion("volunteername >=", value, "volunteername");
            return (Criteria) this;
        }

        public Criteria andVolunteernameLessThan(String value) {
            addCriterion("volunteername <", value, "volunteername");
            return (Criteria) this;
        }

        public Criteria andVolunteernameLessThanOrEqualTo(String value) {
            addCriterion("volunteername <=", value, "volunteername");
            return (Criteria) this;
        }

        public Criteria andVolunteernameLike(String value) {
            addCriterion("volunteername like", value, "volunteername");
            return (Criteria) this;
        }

        public Criteria andVolunteernameNotLike(String value) {
            addCriterion("volunteername not like", value, "volunteername");
            return (Criteria) this;
        }

        public Criteria andVolunteernameIn(List<String> values) {
            addCriterion("volunteername in", values, "volunteername");
            return (Criteria) this;
        }

        public Criteria andVolunteernameNotIn(List<String> values) {
            addCriterion("volunteername not in", values, "volunteername");
            return (Criteria) this;
        }

        public Criteria andVolunteernameBetween(String value1, String value2) {
            addCriterion("volunteername between", value1, value2, "volunteername");
            return (Criteria) this;
        }

        public Criteria andVolunteernameNotBetween(String value1, String value2) {
            addCriterion("volunteername not between", value1, value2, "volunteername");
            return (Criteria) this;
        }

        public Criteria andVtimeIsNull() {
            addCriterion("vtime is null");
            return (Criteria) this;
        }

        public Criteria andVtimeIsNotNull() {
            addCriterion("vtime is not null");
            return (Criteria) this;
        }

        public Criteria andVtimeEqualTo(Date value) {
            addCriterion("vtime =", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeNotEqualTo(Date value) {
            addCriterion("vtime <>", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeGreaterThan(Date value) {
            addCriterion("vtime >", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vtime >=", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeLessThan(Date value) {
            addCriterion("vtime <", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeLessThanOrEqualTo(Date value) {
            addCriterion("vtime <=", value, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeIn(List<Date> values) {
            addCriterion("vtime in", values, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeNotIn(List<Date> values) {
            addCriterion("vtime not in", values, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeBetween(Date value1, Date value2) {
            addCriterion("vtime between", value1, value2, "vtime");
            return (Criteria) this;
        }

        public Criteria andVtimeNotBetween(Date value1, Date value2) {
            addCriterion("vtime not between", value1, value2, "vtime");
            return (Criteria) this;
        }

        public Criteria andNeednumIsNull() {
            addCriterion("neednum is null");
            return (Criteria) this;
        }

        public Criteria andNeednumIsNotNull() {
            addCriterion("neednum is not null");
            return (Criteria) this;
        }

        public Criteria andNeednumEqualTo(Integer value) {
            addCriterion("neednum =", value, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumNotEqualTo(Integer value) {
            addCriterion("neednum <>", value, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumGreaterThan(Integer value) {
            addCriterion("neednum >", value, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumGreaterThanOrEqualTo(Integer value) {
            addCriterion("neednum >=", value, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumLessThan(Integer value) {
            addCriterion("neednum <", value, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumLessThanOrEqualTo(Integer value) {
            addCriterion("neednum <=", value, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumIn(List<Integer> values) {
            addCriterion("neednum in", values, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumNotIn(List<Integer> values) {
            addCriterion("neednum not in", values, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumBetween(Integer value1, Integer value2) {
            addCriterion("neednum between", value1, value2, "neednum");
            return (Criteria) this;
        }

        public Criteria andNeednumNotBetween(Integer value1, Integer value2) {
            addCriterion("neednum not between", value1, value2, "neednum");
            return (Criteria) this;
        }

        public Criteria andApplicantsnumIsNull() {
            addCriterion("applicantsnum is null");
            return (Criteria) this;
        }

        public Criteria andApplicantsnumIsNotNull() {
            addCriterion("applicantsnum is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantsnumEqualTo(Integer value) {
            addCriterion("applicantsnum =", value, "applicantsnum");
            return (Criteria) this;
        }

        public Criteria andApplicantsnumNotEqualTo(Integer value) {
            addCriterion("applicantsnum <>", value, "applicantsnum");
            return (Criteria) this;
        }

        public Criteria andApplicantsnumGreaterThan(Integer value) {
            addCriterion("applicantsnum >", value, "applicantsnum");
            return (Criteria) this;
        }

        public Criteria andApplicantsnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("applicantsnum >=", value, "applicantsnum");
            return (Criteria) this;
        }

        public Criteria andApplicantsnumLessThan(Integer value) {
            addCriterion("applicantsnum <", value, "applicantsnum");
            return (Criteria) this;
        }

        public Criteria andApplicantsnumLessThanOrEqualTo(Integer value) {
            addCriterion("applicantsnum <=", value, "applicantsnum");
            return (Criteria) this;
        }

        public Criteria andApplicantsnumIn(List<Integer> values) {
            addCriterion("applicantsnum in", values, "applicantsnum");
            return (Criteria) this;
        }

        public Criteria andApplicantsnumNotIn(List<Integer> values) {
            addCriterion("applicantsnum not in", values, "applicantsnum");
            return (Criteria) this;
        }

        public Criteria andApplicantsnumBetween(Integer value1, Integer value2) {
            addCriterion("applicantsnum between", value1, value2, "applicantsnum");
            return (Criteria) this;
        }

        public Criteria andApplicantsnumNotBetween(Integer value1, Integer value2) {
            addCriterion("applicantsnum not between", value1, value2, "applicantsnum");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNull() {
            addCriterion("cphone is null");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNotNull() {
            addCriterion("cphone is not null");
            return (Criteria) this;
        }

        public Criteria andCphoneEqualTo(String value) {
            addCriterion("cphone =", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotEqualTo(String value) {
            addCriterion("cphone <>", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThan(String value) {
            addCriterion("cphone >", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cphone >=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThan(String value) {
            addCriterion("cphone <", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThanOrEqualTo(String value) {
            addCriterion("cphone <=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLike(String value) {
            addCriterion("cphone like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotLike(String value) {
            addCriterion("cphone not like", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneIn(List<String> values) {
            addCriterion("cphone in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotIn(List<String> values) {
            addCriterion("cphone not in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneBetween(String value1, String value2) {
            addCriterion("cphone between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotBetween(String value1, String value2) {
            addCriterion("cphone not between", value1, value2, "cphone");
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

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("college like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("college not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("college not between", value1, value2, "college");
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

        public Criteria andAssemblytimeIsNull() {
            addCriterion("assemblytime is null");
            return (Criteria) this;
        }

        public Criteria andAssemblytimeIsNotNull() {
            addCriterion("assemblytime is not null");
            return (Criteria) this;
        }

        public Criteria andAssemblytimeEqualTo(Date value) {
            addCriterion("assemblytime =", value, "assemblytime");
            return (Criteria) this;
        }

        public Criteria andAssemblytimeNotEqualTo(Date value) {
            addCriterion("assemblytime <>", value, "assemblytime");
            return (Criteria) this;
        }

        public Criteria andAssemblytimeGreaterThan(Date value) {
            addCriterion("assemblytime >", value, "assemblytime");
            return (Criteria) this;
        }

        public Criteria andAssemblytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("assemblytime >=", value, "assemblytime");
            return (Criteria) this;
        }

        public Criteria andAssemblytimeLessThan(Date value) {
            addCriterion("assemblytime <", value, "assemblytime");
            return (Criteria) this;
        }

        public Criteria andAssemblytimeLessThanOrEqualTo(Date value) {
            addCriterion("assemblytime <=", value, "assemblytime");
            return (Criteria) this;
        }

        public Criteria andAssemblytimeIn(List<Date> values) {
            addCriterion("assemblytime in", values, "assemblytime");
            return (Criteria) this;
        }

        public Criteria andAssemblytimeNotIn(List<Date> values) {
            addCriterion("assemblytime not in", values, "assemblytime");
            return (Criteria) this;
        }

        public Criteria andAssemblytimeBetween(Date value1, Date value2) {
            addCriterion("assemblytime between", value1, value2, "assemblytime");
            return (Criteria) this;
        }

        public Criteria andAssemblytimeNotBetween(Date value1, Date value2) {
            addCriterion("assemblytime not between", value1, value2, "assemblytime");
            return (Criteria) this;
        }

        public Criteria andCollectionplaceIsNull() {
            addCriterion("collectionplace is null");
            return (Criteria) this;
        }

        public Criteria andCollectionplaceIsNotNull() {
            addCriterion("collectionplace is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionplaceEqualTo(String value) {
            addCriterion("collectionplace =", value, "collectionplace");
            return (Criteria) this;
        }

        public Criteria andCollectionplaceNotEqualTo(String value) {
            addCriterion("collectionplace <>", value, "collectionplace");
            return (Criteria) this;
        }

        public Criteria andCollectionplaceGreaterThan(String value) {
            addCriterion("collectionplace >", value, "collectionplace");
            return (Criteria) this;
        }

        public Criteria andCollectionplaceGreaterThanOrEqualTo(String value) {
            addCriterion("collectionplace >=", value, "collectionplace");
            return (Criteria) this;
        }

        public Criteria andCollectionplaceLessThan(String value) {
            addCriterion("collectionplace <", value, "collectionplace");
            return (Criteria) this;
        }

        public Criteria andCollectionplaceLessThanOrEqualTo(String value) {
            addCriterion("collectionplace <=", value, "collectionplace");
            return (Criteria) this;
        }

        public Criteria andCollectionplaceLike(String value) {
            addCriterion("collectionplace like", value, "collectionplace");
            return (Criteria) this;
        }

        public Criteria andCollectionplaceNotLike(String value) {
            addCriterion("collectionplace not like", value, "collectionplace");
            return (Criteria) this;
        }

        public Criteria andCollectionplaceIn(List<String> values) {
            addCriterion("collectionplace in", values, "collectionplace");
            return (Criteria) this;
        }

        public Criteria andCollectionplaceNotIn(List<String> values) {
            addCriterion("collectionplace not in", values, "collectionplace");
            return (Criteria) this;
        }

        public Criteria andCollectionplaceBetween(String value1, String value2) {
            addCriterion("collectionplace between", value1, value2, "collectionplace");
            return (Criteria) this;
        }

        public Criteria andCollectionplaceNotBetween(String value1, String value2) {
            addCriterion("collectionplace not between", value1, value2, "collectionplace");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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