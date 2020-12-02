package com.xgdjweb.bean;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLeftnameIsNull() {
            addCriterion("leftname is null");
            return (Criteria) this;
        }

        public Criteria andLeftnameIsNotNull() {
            addCriterion("leftname is not null");
            return (Criteria) this;
        }

        public Criteria andLeftnameEqualTo(String value) {
            addCriterion("leftname =", value, "leftname");
            return (Criteria) this;
        }

        public Criteria andLeftnameNotEqualTo(String value) {
            addCriterion("leftname <>", value, "leftname");
            return (Criteria) this;
        }

        public Criteria andLeftnameGreaterThan(String value) {
            addCriterion("leftname >", value, "leftname");
            return (Criteria) this;
        }

        public Criteria andLeftnameGreaterThanOrEqualTo(String value) {
            addCriterion("leftname >=", value, "leftname");
            return (Criteria) this;
        }

        public Criteria andLeftnameLessThan(String value) {
            addCriterion("leftname <", value, "leftname");
            return (Criteria) this;
        }

        public Criteria andLeftnameLessThanOrEqualTo(String value) {
            addCriterion("leftname <=", value, "leftname");
            return (Criteria) this;
        }

        public Criteria andLeftnameLike(String value) {
            addCriterion("leftname like", value, "leftname");
            return (Criteria) this;
        }

        public Criteria andLeftnameNotLike(String value) {
            addCriterion("leftname not like", value, "leftname");
            return (Criteria) this;
        }

        public Criteria andLeftnameIn(List<String> values) {
            addCriterion("leftname in", values, "leftname");
            return (Criteria) this;
        }

        public Criteria andLeftnameNotIn(List<String> values) {
            addCriterion("leftname not in", values, "leftname");
            return (Criteria) this;
        }

        public Criteria andLeftnameBetween(String value1, String value2) {
            addCriterion("leftname between", value1, value2, "leftname");
            return (Criteria) this;
        }

        public Criteria andLeftnameNotBetween(String value1, String value2) {
            addCriterion("leftname not between", value1, value2, "leftname");
            return (Criteria) this;
        }

        public Criteria andLefturlIsNull() {
            addCriterion("lefturl is null");
            return (Criteria) this;
        }

        public Criteria andLefturlIsNotNull() {
            addCriterion("lefturl is not null");
            return (Criteria) this;
        }

        public Criteria andLefturlEqualTo(String value) {
            addCriterion("lefturl =", value, "lefturl");
            return (Criteria) this;
        }

        public Criteria andLefturlNotEqualTo(String value) {
            addCriterion("lefturl <>", value, "lefturl");
            return (Criteria) this;
        }

        public Criteria andLefturlGreaterThan(String value) {
            addCriterion("lefturl >", value, "lefturl");
            return (Criteria) this;
        }

        public Criteria andLefturlGreaterThanOrEqualTo(String value) {
            addCriterion("lefturl >=", value, "lefturl");
            return (Criteria) this;
        }

        public Criteria andLefturlLessThan(String value) {
            addCriterion("lefturl <", value, "lefturl");
            return (Criteria) this;
        }

        public Criteria andLefturlLessThanOrEqualTo(String value) {
            addCriterion("lefturl <=", value, "lefturl");
            return (Criteria) this;
        }

        public Criteria andLefturlLike(String value) {
            addCriterion("lefturl like", value, "lefturl");
            return (Criteria) this;
        }

        public Criteria andLefturlNotLike(String value) {
            addCriterion("lefturl not like", value, "lefturl");
            return (Criteria) this;
        }

        public Criteria andLefturlIn(List<String> values) {
            addCriterion("lefturl in", values, "lefturl");
            return (Criteria) this;
        }

        public Criteria andLefturlNotIn(List<String> values) {
            addCriterion("lefturl not in", values, "lefturl");
            return (Criteria) this;
        }

        public Criteria andLefturlBetween(String value1, String value2) {
            addCriterion("lefturl between", value1, value2, "lefturl");
            return (Criteria) this;
        }

        public Criteria andLefturlNotBetween(String value1, String value2) {
            addCriterion("lefturl not between", value1, value2, "lefturl");
            return (Criteria) this;
        }

        public Criteria andLeftonenameIsNull() {
            addCriterion("leftonename is null");
            return (Criteria) this;
        }

        public Criteria andLeftonenameIsNotNull() {
            addCriterion("leftonename is not null");
            return (Criteria) this;
        }

        public Criteria andLeftonenameEqualTo(String value) {
            addCriterion("leftonename =", value, "leftonename");
            return (Criteria) this;
        }

        public Criteria andLeftonenameNotEqualTo(String value) {
            addCriterion("leftonename <>", value, "leftonename");
            return (Criteria) this;
        }

        public Criteria andLeftonenameGreaterThan(String value) {
            addCriterion("leftonename >", value, "leftonename");
            return (Criteria) this;
        }

        public Criteria andLeftonenameGreaterThanOrEqualTo(String value) {
            addCriterion("leftonename >=", value, "leftonename");
            return (Criteria) this;
        }

        public Criteria andLeftonenameLessThan(String value) {
            addCriterion("leftonename <", value, "leftonename");
            return (Criteria) this;
        }

        public Criteria andLeftonenameLessThanOrEqualTo(String value) {
            addCriterion("leftonename <=", value, "leftonename");
            return (Criteria) this;
        }

        public Criteria andLeftonenameLike(String value) {
            addCriterion("leftonename like", value, "leftonename");
            return (Criteria) this;
        }

        public Criteria andLeftonenameNotLike(String value) {
            addCriterion("leftonename not like", value, "leftonename");
            return (Criteria) this;
        }

        public Criteria andLeftonenameIn(List<String> values) {
            addCriterion("leftonename in", values, "leftonename");
            return (Criteria) this;
        }

        public Criteria andLeftonenameNotIn(List<String> values) {
            addCriterion("leftonename not in", values, "leftonename");
            return (Criteria) this;
        }

        public Criteria andLeftonenameBetween(String value1, String value2) {
            addCriterion("leftonename between", value1, value2, "leftonename");
            return (Criteria) this;
        }

        public Criteria andLeftonenameNotBetween(String value1, String value2) {
            addCriterion("leftonename not between", value1, value2, "leftonename");
            return (Criteria) this;
        }

        public Criteria andLeftoneurlIsNull() {
            addCriterion("leftoneurl is null");
            return (Criteria) this;
        }

        public Criteria andLeftoneurlIsNotNull() {
            addCriterion("leftoneurl is not null");
            return (Criteria) this;
        }

        public Criteria andLeftoneurlEqualTo(String value) {
            addCriterion("leftoneurl =", value, "leftoneurl");
            return (Criteria) this;
        }

        public Criteria andLeftoneurlNotEqualTo(String value) {
            addCriterion("leftoneurl <>", value, "leftoneurl");
            return (Criteria) this;
        }

        public Criteria andLeftoneurlGreaterThan(String value) {
            addCriterion("leftoneurl >", value, "leftoneurl");
            return (Criteria) this;
        }

        public Criteria andLeftoneurlGreaterThanOrEqualTo(String value) {
            addCriterion("leftoneurl >=", value, "leftoneurl");
            return (Criteria) this;
        }

        public Criteria andLeftoneurlLessThan(String value) {
            addCriterion("leftoneurl <", value, "leftoneurl");
            return (Criteria) this;
        }

        public Criteria andLeftoneurlLessThanOrEqualTo(String value) {
            addCriterion("leftoneurl <=", value, "leftoneurl");
            return (Criteria) this;
        }

        public Criteria andLeftoneurlLike(String value) {
            addCriterion("leftoneurl like", value, "leftoneurl");
            return (Criteria) this;
        }

        public Criteria andLeftoneurlNotLike(String value) {
            addCriterion("leftoneurl not like", value, "leftoneurl");
            return (Criteria) this;
        }

        public Criteria andLeftoneurlIn(List<String> values) {
            addCriterion("leftoneurl in", values, "leftoneurl");
            return (Criteria) this;
        }

        public Criteria andLeftoneurlNotIn(List<String> values) {
            addCriterion("leftoneurl not in", values, "leftoneurl");
            return (Criteria) this;
        }

        public Criteria andLeftoneurlBetween(String value1, String value2) {
            addCriterion("leftoneurl between", value1, value2, "leftoneurl");
            return (Criteria) this;
        }

        public Criteria andLeftoneurlNotBetween(String value1, String value2) {
            addCriterion("leftoneurl not between", value1, value2, "leftoneurl");
            return (Criteria) this;
        }

        public Criteria andLefttwonameIsNull() {
            addCriterion("lefttwoname is null");
            return (Criteria) this;
        }

        public Criteria andLefttwonameIsNotNull() {
            addCriterion("lefttwoname is not null");
            return (Criteria) this;
        }

        public Criteria andLefttwonameEqualTo(String value) {
            addCriterion("lefttwoname =", value, "lefttwoname");
            return (Criteria) this;
        }

        public Criteria andLefttwonameNotEqualTo(String value) {
            addCriterion("lefttwoname <>", value, "lefttwoname");
            return (Criteria) this;
        }

        public Criteria andLefttwonameGreaterThan(String value) {
            addCriterion("lefttwoname >", value, "lefttwoname");
            return (Criteria) this;
        }

        public Criteria andLefttwonameGreaterThanOrEqualTo(String value) {
            addCriterion("lefttwoname >=", value, "lefttwoname");
            return (Criteria) this;
        }

        public Criteria andLefttwonameLessThan(String value) {
            addCriterion("lefttwoname <", value, "lefttwoname");
            return (Criteria) this;
        }

        public Criteria andLefttwonameLessThanOrEqualTo(String value) {
            addCriterion("lefttwoname <=", value, "lefttwoname");
            return (Criteria) this;
        }

        public Criteria andLefttwonameLike(String value) {
            addCriterion("lefttwoname like", value, "lefttwoname");
            return (Criteria) this;
        }

        public Criteria andLefttwonameNotLike(String value) {
            addCriterion("lefttwoname not like", value, "lefttwoname");
            return (Criteria) this;
        }

        public Criteria andLefttwonameIn(List<String> values) {
            addCriterion("lefttwoname in", values, "lefttwoname");
            return (Criteria) this;
        }

        public Criteria andLefttwonameNotIn(List<String> values) {
            addCriterion("lefttwoname not in", values, "lefttwoname");
            return (Criteria) this;
        }

        public Criteria andLefttwonameBetween(String value1, String value2) {
            addCriterion("lefttwoname between", value1, value2, "lefttwoname");
            return (Criteria) this;
        }

        public Criteria andLefttwonameNotBetween(String value1, String value2) {
            addCriterion("lefttwoname not between", value1, value2, "lefttwoname");
            return (Criteria) this;
        }

        public Criteria andLefttwourlIsNull() {
            addCriterion("lefttwourl is null");
            return (Criteria) this;
        }

        public Criteria andLefttwourlIsNotNull() {
            addCriterion("lefttwourl is not null");
            return (Criteria) this;
        }

        public Criteria andLefttwourlEqualTo(String value) {
            addCriterion("lefttwourl =", value, "lefttwourl");
            return (Criteria) this;
        }

        public Criteria andLefttwourlNotEqualTo(String value) {
            addCriterion("lefttwourl <>", value, "lefttwourl");
            return (Criteria) this;
        }

        public Criteria andLefttwourlGreaterThan(String value) {
            addCriterion("lefttwourl >", value, "lefttwourl");
            return (Criteria) this;
        }

        public Criteria andLefttwourlGreaterThanOrEqualTo(String value) {
            addCriterion("lefttwourl >=", value, "lefttwourl");
            return (Criteria) this;
        }

        public Criteria andLefttwourlLessThan(String value) {
            addCriterion("lefttwourl <", value, "lefttwourl");
            return (Criteria) this;
        }

        public Criteria andLefttwourlLessThanOrEqualTo(String value) {
            addCriterion("lefttwourl <=", value, "lefttwourl");
            return (Criteria) this;
        }

        public Criteria andLefttwourlLike(String value) {
            addCriterion("lefttwourl like", value, "lefttwourl");
            return (Criteria) this;
        }

        public Criteria andLefttwourlNotLike(String value) {
            addCriterion("lefttwourl not like", value, "lefttwourl");
            return (Criteria) this;
        }

        public Criteria andLefttwourlIn(List<String> values) {
            addCriterion("lefttwourl in", values, "lefttwourl");
            return (Criteria) this;
        }

        public Criteria andLefttwourlNotIn(List<String> values) {
            addCriterion("lefttwourl not in", values, "lefttwourl");
            return (Criteria) this;
        }

        public Criteria andLefttwourlBetween(String value1, String value2) {
            addCriterion("lefttwourl between", value1, value2, "lefttwourl");
            return (Criteria) this;
        }

        public Criteria andLefttwourlNotBetween(String value1, String value2) {
            addCriterion("lefttwourl not between", value1, value2, "lefttwourl");
            return (Criteria) this;
        }

        public Criteria andLeftthreenameIsNull() {
            addCriterion("leftthreename is null");
            return (Criteria) this;
        }

        public Criteria andLeftthreenameIsNotNull() {
            addCriterion("leftthreename is not null");
            return (Criteria) this;
        }

        public Criteria andLeftthreenameEqualTo(String value) {
            addCriterion("leftthreename =", value, "leftthreename");
            return (Criteria) this;
        }

        public Criteria andLeftthreenameNotEqualTo(String value) {
            addCriterion("leftthreename <>", value, "leftthreename");
            return (Criteria) this;
        }

        public Criteria andLeftthreenameGreaterThan(String value) {
            addCriterion("leftthreename >", value, "leftthreename");
            return (Criteria) this;
        }

        public Criteria andLeftthreenameGreaterThanOrEqualTo(String value) {
            addCriterion("leftthreename >=", value, "leftthreename");
            return (Criteria) this;
        }

        public Criteria andLeftthreenameLessThan(String value) {
            addCriterion("leftthreename <", value, "leftthreename");
            return (Criteria) this;
        }

        public Criteria andLeftthreenameLessThanOrEqualTo(String value) {
            addCriterion("leftthreename <=", value, "leftthreename");
            return (Criteria) this;
        }

        public Criteria andLeftthreenameLike(String value) {
            addCriterion("leftthreename like", value, "leftthreename");
            return (Criteria) this;
        }

        public Criteria andLeftthreenameNotLike(String value) {
            addCriterion("leftthreename not like", value, "leftthreename");
            return (Criteria) this;
        }

        public Criteria andLeftthreenameIn(List<String> values) {
            addCriterion("leftthreename in", values, "leftthreename");
            return (Criteria) this;
        }

        public Criteria andLeftthreenameNotIn(List<String> values) {
            addCriterion("leftthreename not in", values, "leftthreename");
            return (Criteria) this;
        }

        public Criteria andLeftthreenameBetween(String value1, String value2) {
            addCriterion("leftthreename between", value1, value2, "leftthreename");
            return (Criteria) this;
        }

        public Criteria andLeftthreenameNotBetween(String value1, String value2) {
            addCriterion("leftthreename not between", value1, value2, "leftthreename");
            return (Criteria) this;
        }

        public Criteria andLeftthreeurlIsNull() {
            addCriterion("leftthreeurl is null");
            return (Criteria) this;
        }

        public Criteria andLeftthreeurlIsNotNull() {
            addCriterion("leftthreeurl is not null");
            return (Criteria) this;
        }

        public Criteria andLeftthreeurlEqualTo(String value) {
            addCriterion("leftthreeurl =", value, "leftthreeurl");
            return (Criteria) this;
        }

        public Criteria andLeftthreeurlNotEqualTo(String value) {
            addCriterion("leftthreeurl <>", value, "leftthreeurl");
            return (Criteria) this;
        }

        public Criteria andLeftthreeurlGreaterThan(String value) {
            addCriterion("leftthreeurl >", value, "leftthreeurl");
            return (Criteria) this;
        }

        public Criteria andLeftthreeurlGreaterThanOrEqualTo(String value) {
            addCriterion("leftthreeurl >=", value, "leftthreeurl");
            return (Criteria) this;
        }

        public Criteria andLeftthreeurlLessThan(String value) {
            addCriterion("leftthreeurl <", value, "leftthreeurl");
            return (Criteria) this;
        }

        public Criteria andLeftthreeurlLessThanOrEqualTo(String value) {
            addCriterion("leftthreeurl <=", value, "leftthreeurl");
            return (Criteria) this;
        }

        public Criteria andLeftthreeurlLike(String value) {
            addCriterion("leftthreeurl like", value, "leftthreeurl");
            return (Criteria) this;
        }

        public Criteria andLeftthreeurlNotLike(String value) {
            addCriterion("leftthreeurl not like", value, "leftthreeurl");
            return (Criteria) this;
        }

        public Criteria andLeftthreeurlIn(List<String> values) {
            addCriterion("leftthreeurl in", values, "leftthreeurl");
            return (Criteria) this;
        }

        public Criteria andLeftthreeurlNotIn(List<String> values) {
            addCriterion("leftthreeurl not in", values, "leftthreeurl");
            return (Criteria) this;
        }

        public Criteria andLeftthreeurlBetween(String value1, String value2) {
            addCriterion("leftthreeurl between", value1, value2, "leftthreeurl");
            return (Criteria) this;
        }

        public Criteria andLeftthreeurlNotBetween(String value1, String value2) {
            addCriterion("leftthreeurl not between", value1, value2, "leftthreeurl");
            return (Criteria) this;
        }

        public Criteria andLeftfournameIsNull() {
            addCriterion("leftfourname is null");
            return (Criteria) this;
        }

        public Criteria andLeftfournameIsNotNull() {
            addCriterion("leftfourname is not null");
            return (Criteria) this;
        }

        public Criteria andLeftfournameEqualTo(String value) {
            addCriterion("leftfourname =", value, "leftfourname");
            return (Criteria) this;
        }

        public Criteria andLeftfournameNotEqualTo(String value) {
            addCriterion("leftfourname <>", value, "leftfourname");
            return (Criteria) this;
        }

        public Criteria andLeftfournameGreaterThan(String value) {
            addCriterion("leftfourname >", value, "leftfourname");
            return (Criteria) this;
        }

        public Criteria andLeftfournameGreaterThanOrEqualTo(String value) {
            addCriterion("leftfourname >=", value, "leftfourname");
            return (Criteria) this;
        }

        public Criteria andLeftfournameLessThan(String value) {
            addCriterion("leftfourname <", value, "leftfourname");
            return (Criteria) this;
        }

        public Criteria andLeftfournameLessThanOrEqualTo(String value) {
            addCriterion("leftfourname <=", value, "leftfourname");
            return (Criteria) this;
        }

        public Criteria andLeftfournameLike(String value) {
            addCriterion("leftfourname like", value, "leftfourname");
            return (Criteria) this;
        }

        public Criteria andLeftfournameNotLike(String value) {
            addCriterion("leftfourname not like", value, "leftfourname");
            return (Criteria) this;
        }

        public Criteria andLeftfournameIn(List<String> values) {
            addCriterion("leftfourname in", values, "leftfourname");
            return (Criteria) this;
        }

        public Criteria andLeftfournameNotIn(List<String> values) {
            addCriterion("leftfourname not in", values, "leftfourname");
            return (Criteria) this;
        }

        public Criteria andLeftfournameBetween(String value1, String value2) {
            addCriterion("leftfourname between", value1, value2, "leftfourname");
            return (Criteria) this;
        }

        public Criteria andLeftfournameNotBetween(String value1, String value2) {
            addCriterion("leftfourname not between", value1, value2, "leftfourname");
            return (Criteria) this;
        }

        public Criteria andLeftfoururlIsNull() {
            addCriterion("leftfoururl is null");
            return (Criteria) this;
        }

        public Criteria andLeftfoururlIsNotNull() {
            addCriterion("leftfoururl is not null");
            return (Criteria) this;
        }

        public Criteria andLeftfoururlEqualTo(String value) {
            addCriterion("leftfoururl =", value, "leftfoururl");
            return (Criteria) this;
        }

        public Criteria andLeftfoururlNotEqualTo(String value) {
            addCriterion("leftfoururl <>", value, "leftfoururl");
            return (Criteria) this;
        }

        public Criteria andLeftfoururlGreaterThan(String value) {
            addCriterion("leftfoururl >", value, "leftfoururl");
            return (Criteria) this;
        }

        public Criteria andLeftfoururlGreaterThanOrEqualTo(String value) {
            addCriterion("leftfoururl >=", value, "leftfoururl");
            return (Criteria) this;
        }

        public Criteria andLeftfoururlLessThan(String value) {
            addCriterion("leftfoururl <", value, "leftfoururl");
            return (Criteria) this;
        }

        public Criteria andLeftfoururlLessThanOrEqualTo(String value) {
            addCriterion("leftfoururl <=", value, "leftfoururl");
            return (Criteria) this;
        }

        public Criteria andLeftfoururlLike(String value) {
            addCriterion("leftfoururl like", value, "leftfoururl");
            return (Criteria) this;
        }

        public Criteria andLeftfoururlNotLike(String value) {
            addCriterion("leftfoururl not like", value, "leftfoururl");
            return (Criteria) this;
        }

        public Criteria andLeftfoururlIn(List<String> values) {
            addCriterion("leftfoururl in", values, "leftfoururl");
            return (Criteria) this;
        }

        public Criteria andLeftfoururlNotIn(List<String> values) {
            addCriterion("leftfoururl not in", values, "leftfoururl");
            return (Criteria) this;
        }

        public Criteria andLeftfoururlBetween(String value1, String value2) {
            addCriterion("leftfoururl between", value1, value2, "leftfoururl");
            return (Criteria) this;
        }

        public Criteria andLeftfoururlNotBetween(String value1, String value2) {
            addCriterion("leftfoururl not between", value1, value2, "leftfoururl");
            return (Criteria) this;
        }

        public Criteria andLeftfivenameIsNull() {
            addCriterion("leftfivename is null");
            return (Criteria) this;
        }

        public Criteria andLeftfivenameIsNotNull() {
            addCriterion("leftfivename is not null");
            return (Criteria) this;
        }

        public Criteria andLeftfivenameEqualTo(String value) {
            addCriterion("leftfivename =", value, "leftfivename");
            return (Criteria) this;
        }

        public Criteria andLeftfivenameNotEqualTo(String value) {
            addCriterion("leftfivename <>", value, "leftfivename");
            return (Criteria) this;
        }

        public Criteria andLeftfivenameGreaterThan(String value) {
            addCriterion("leftfivename >", value, "leftfivename");
            return (Criteria) this;
        }

        public Criteria andLeftfivenameGreaterThanOrEqualTo(String value) {
            addCriterion("leftfivename >=", value, "leftfivename");
            return (Criteria) this;
        }

        public Criteria andLeftfivenameLessThan(String value) {
            addCriterion("leftfivename <", value, "leftfivename");
            return (Criteria) this;
        }

        public Criteria andLeftfivenameLessThanOrEqualTo(String value) {
            addCriterion("leftfivename <=", value, "leftfivename");
            return (Criteria) this;
        }

        public Criteria andLeftfivenameLike(String value) {
            addCriterion("leftfivename like", value, "leftfivename");
            return (Criteria) this;
        }

        public Criteria andLeftfivenameNotLike(String value) {
            addCriterion("leftfivename not like", value, "leftfivename");
            return (Criteria) this;
        }

        public Criteria andLeftfivenameIn(List<String> values) {
            addCriterion("leftfivename in", values, "leftfivename");
            return (Criteria) this;
        }

        public Criteria andLeftfivenameNotIn(List<String> values) {
            addCriterion("leftfivename not in", values, "leftfivename");
            return (Criteria) this;
        }

        public Criteria andLeftfivenameBetween(String value1, String value2) {
            addCriterion("leftfivename between", value1, value2, "leftfivename");
            return (Criteria) this;
        }

        public Criteria andLeftfivenameNotBetween(String value1, String value2) {
            addCriterion("leftfivename not between", value1, value2, "leftfivename");
            return (Criteria) this;
        }

        public Criteria andLeftfiveurlIsNull() {
            addCriterion("leftfiveurl is null");
            return (Criteria) this;
        }

        public Criteria andLeftfiveurlIsNotNull() {
            addCriterion("leftfiveurl is not null");
            return (Criteria) this;
        }

        public Criteria andLeftfiveurlEqualTo(String value) {
            addCriterion("leftfiveurl =", value, "leftfiveurl");
            return (Criteria) this;
        }

        public Criteria andLeftfiveurlNotEqualTo(String value) {
            addCriterion("leftfiveurl <>", value, "leftfiveurl");
            return (Criteria) this;
        }

        public Criteria andLeftfiveurlGreaterThan(String value) {
            addCriterion("leftfiveurl >", value, "leftfiveurl");
            return (Criteria) this;
        }

        public Criteria andLeftfiveurlGreaterThanOrEqualTo(String value) {
            addCriterion("leftfiveurl >=", value, "leftfiveurl");
            return (Criteria) this;
        }

        public Criteria andLeftfiveurlLessThan(String value) {
            addCriterion("leftfiveurl <", value, "leftfiveurl");
            return (Criteria) this;
        }

        public Criteria andLeftfiveurlLessThanOrEqualTo(String value) {
            addCriterion("leftfiveurl <=", value, "leftfiveurl");
            return (Criteria) this;
        }

        public Criteria andLeftfiveurlLike(String value) {
            addCriterion("leftfiveurl like", value, "leftfiveurl");
            return (Criteria) this;
        }

        public Criteria andLeftfiveurlNotLike(String value) {
            addCriterion("leftfiveurl not like", value, "leftfiveurl");
            return (Criteria) this;
        }

        public Criteria andLeftfiveurlIn(List<String> values) {
            addCriterion("leftfiveurl in", values, "leftfiveurl");
            return (Criteria) this;
        }

        public Criteria andLeftfiveurlNotIn(List<String> values) {
            addCriterion("leftfiveurl not in", values, "leftfiveurl");
            return (Criteria) this;
        }

        public Criteria andLeftfiveurlBetween(String value1, String value2) {
            addCriterion("leftfiveurl between", value1, value2, "leftfiveurl");
            return (Criteria) this;
        }

        public Criteria andLeftfiveurlNotBetween(String value1, String value2) {
            addCriterion("leftfiveurl not between", value1, value2, "leftfiveurl");
            return (Criteria) this;
        }

        public Criteria andCenternameIsNull() {
            addCriterion("centername is null");
            return (Criteria) this;
        }

        public Criteria andCenternameIsNotNull() {
            addCriterion("centername is not null");
            return (Criteria) this;
        }

        public Criteria andCenternameEqualTo(String value) {
            addCriterion("centername =", value, "centername");
            return (Criteria) this;
        }

        public Criteria andCenternameNotEqualTo(String value) {
            addCriterion("centername <>", value, "centername");
            return (Criteria) this;
        }

        public Criteria andCenternameGreaterThan(String value) {
            addCriterion("centername >", value, "centername");
            return (Criteria) this;
        }

        public Criteria andCenternameGreaterThanOrEqualTo(String value) {
            addCriterion("centername >=", value, "centername");
            return (Criteria) this;
        }

        public Criteria andCenternameLessThan(String value) {
            addCriterion("centername <", value, "centername");
            return (Criteria) this;
        }

        public Criteria andCenternameLessThanOrEqualTo(String value) {
            addCriterion("centername <=", value, "centername");
            return (Criteria) this;
        }

        public Criteria andCenternameLike(String value) {
            addCriterion("centername like", value, "centername");
            return (Criteria) this;
        }

        public Criteria andCenternameNotLike(String value) {
            addCriterion("centername not like", value, "centername");
            return (Criteria) this;
        }

        public Criteria andCenternameIn(List<String> values) {
            addCriterion("centername in", values, "centername");
            return (Criteria) this;
        }

        public Criteria andCenternameNotIn(List<String> values) {
            addCriterion("centername not in", values, "centername");
            return (Criteria) this;
        }

        public Criteria andCenternameBetween(String value1, String value2) {
            addCriterion("centername between", value1, value2, "centername");
            return (Criteria) this;
        }

        public Criteria andCenternameNotBetween(String value1, String value2) {
            addCriterion("centername not between", value1, value2, "centername");
            return (Criteria) this;
        }

        public Criteria andCenterurlIsNull() {
            addCriterion("centerurl is null");
            return (Criteria) this;
        }

        public Criteria andCenterurlIsNotNull() {
            addCriterion("centerurl is not null");
            return (Criteria) this;
        }

        public Criteria andCenterurlEqualTo(String value) {
            addCriterion("centerurl =", value, "centerurl");
            return (Criteria) this;
        }

        public Criteria andCenterurlNotEqualTo(String value) {
            addCriterion("centerurl <>", value, "centerurl");
            return (Criteria) this;
        }

        public Criteria andCenterurlGreaterThan(String value) {
            addCriterion("centerurl >", value, "centerurl");
            return (Criteria) this;
        }

        public Criteria andCenterurlGreaterThanOrEqualTo(String value) {
            addCriterion("centerurl >=", value, "centerurl");
            return (Criteria) this;
        }

        public Criteria andCenterurlLessThan(String value) {
            addCriterion("centerurl <", value, "centerurl");
            return (Criteria) this;
        }

        public Criteria andCenterurlLessThanOrEqualTo(String value) {
            addCriterion("centerurl <=", value, "centerurl");
            return (Criteria) this;
        }

        public Criteria andCenterurlLike(String value) {
            addCriterion("centerurl like", value, "centerurl");
            return (Criteria) this;
        }

        public Criteria andCenterurlNotLike(String value) {
            addCriterion("centerurl not like", value, "centerurl");
            return (Criteria) this;
        }

        public Criteria andCenterurlIn(List<String> values) {
            addCriterion("centerurl in", values, "centerurl");
            return (Criteria) this;
        }

        public Criteria andCenterurlNotIn(List<String> values) {
            addCriterion("centerurl not in", values, "centerurl");
            return (Criteria) this;
        }

        public Criteria andCenterurlBetween(String value1, String value2) {
            addCriterion("centerurl between", value1, value2, "centerurl");
            return (Criteria) this;
        }

        public Criteria andCenterurlNotBetween(String value1, String value2) {
            addCriterion("centerurl not between", value1, value2, "centerurl");
            return (Criteria) this;
        }

        public Criteria andCenteronenameIsNull() {
            addCriterion("centeronename is null");
            return (Criteria) this;
        }

        public Criteria andCenteronenameIsNotNull() {
            addCriterion("centeronename is not null");
            return (Criteria) this;
        }

        public Criteria andCenteronenameEqualTo(String value) {
            addCriterion("centeronename =", value, "centeronename");
            return (Criteria) this;
        }

        public Criteria andCenteronenameNotEqualTo(String value) {
            addCriterion("centeronename <>", value, "centeronename");
            return (Criteria) this;
        }

        public Criteria andCenteronenameGreaterThan(String value) {
            addCriterion("centeronename >", value, "centeronename");
            return (Criteria) this;
        }

        public Criteria andCenteronenameGreaterThanOrEqualTo(String value) {
            addCriterion("centeronename >=", value, "centeronename");
            return (Criteria) this;
        }

        public Criteria andCenteronenameLessThan(String value) {
            addCriterion("centeronename <", value, "centeronename");
            return (Criteria) this;
        }

        public Criteria andCenteronenameLessThanOrEqualTo(String value) {
            addCriterion("centeronename <=", value, "centeronename");
            return (Criteria) this;
        }

        public Criteria andCenteronenameLike(String value) {
            addCriterion("centeronename like", value, "centeronename");
            return (Criteria) this;
        }

        public Criteria andCenteronenameNotLike(String value) {
            addCriterion("centeronename not like", value, "centeronename");
            return (Criteria) this;
        }

        public Criteria andCenteronenameIn(List<String> values) {
            addCriterion("centeronename in", values, "centeronename");
            return (Criteria) this;
        }

        public Criteria andCenteronenameNotIn(List<String> values) {
            addCriterion("centeronename not in", values, "centeronename");
            return (Criteria) this;
        }

        public Criteria andCenteronenameBetween(String value1, String value2) {
            addCriterion("centeronename between", value1, value2, "centeronename");
            return (Criteria) this;
        }

        public Criteria andCenteronenameNotBetween(String value1, String value2) {
            addCriterion("centeronename not between", value1, value2, "centeronename");
            return (Criteria) this;
        }

        public Criteria andCenteroneurlIsNull() {
            addCriterion("centeroneurl is null");
            return (Criteria) this;
        }

        public Criteria andCenteroneurlIsNotNull() {
            addCriterion("centeroneurl is not null");
            return (Criteria) this;
        }

        public Criteria andCenteroneurlEqualTo(String value) {
            addCriterion("centeroneurl =", value, "centeroneurl");
            return (Criteria) this;
        }

        public Criteria andCenteroneurlNotEqualTo(String value) {
            addCriterion("centeroneurl <>", value, "centeroneurl");
            return (Criteria) this;
        }

        public Criteria andCenteroneurlGreaterThan(String value) {
            addCriterion("centeroneurl >", value, "centeroneurl");
            return (Criteria) this;
        }

        public Criteria andCenteroneurlGreaterThanOrEqualTo(String value) {
            addCriterion("centeroneurl >=", value, "centeroneurl");
            return (Criteria) this;
        }

        public Criteria andCenteroneurlLessThan(String value) {
            addCriterion("centeroneurl <", value, "centeroneurl");
            return (Criteria) this;
        }

        public Criteria andCenteroneurlLessThanOrEqualTo(String value) {
            addCriterion("centeroneurl <=", value, "centeroneurl");
            return (Criteria) this;
        }

        public Criteria andCenteroneurlLike(String value) {
            addCriterion("centeroneurl like", value, "centeroneurl");
            return (Criteria) this;
        }

        public Criteria andCenteroneurlNotLike(String value) {
            addCriterion("centeroneurl not like", value, "centeroneurl");
            return (Criteria) this;
        }

        public Criteria andCenteroneurlIn(List<String> values) {
            addCriterion("centeroneurl in", values, "centeroneurl");
            return (Criteria) this;
        }

        public Criteria andCenteroneurlNotIn(List<String> values) {
            addCriterion("centeroneurl not in", values, "centeroneurl");
            return (Criteria) this;
        }

        public Criteria andCenteroneurlBetween(String value1, String value2) {
            addCriterion("centeroneurl between", value1, value2, "centeroneurl");
            return (Criteria) this;
        }

        public Criteria andCenteroneurlNotBetween(String value1, String value2) {
            addCriterion("centeroneurl not between", value1, value2, "centeroneurl");
            return (Criteria) this;
        }

        public Criteria andCentertwonameIsNull() {
            addCriterion("centertwoname is null");
            return (Criteria) this;
        }

        public Criteria andCentertwonameIsNotNull() {
            addCriterion("centertwoname is not null");
            return (Criteria) this;
        }

        public Criteria andCentertwonameEqualTo(String value) {
            addCriterion("centertwoname =", value, "centertwoname");
            return (Criteria) this;
        }

        public Criteria andCentertwonameNotEqualTo(String value) {
            addCriterion("centertwoname <>", value, "centertwoname");
            return (Criteria) this;
        }

        public Criteria andCentertwonameGreaterThan(String value) {
            addCriterion("centertwoname >", value, "centertwoname");
            return (Criteria) this;
        }

        public Criteria andCentertwonameGreaterThanOrEqualTo(String value) {
            addCriterion("centertwoname >=", value, "centertwoname");
            return (Criteria) this;
        }

        public Criteria andCentertwonameLessThan(String value) {
            addCriterion("centertwoname <", value, "centertwoname");
            return (Criteria) this;
        }

        public Criteria andCentertwonameLessThanOrEqualTo(String value) {
            addCriterion("centertwoname <=", value, "centertwoname");
            return (Criteria) this;
        }

        public Criteria andCentertwonameLike(String value) {
            addCriterion("centertwoname like", value, "centertwoname");
            return (Criteria) this;
        }

        public Criteria andCentertwonameNotLike(String value) {
            addCriterion("centertwoname not like", value, "centertwoname");
            return (Criteria) this;
        }

        public Criteria andCentertwonameIn(List<String> values) {
            addCriterion("centertwoname in", values, "centertwoname");
            return (Criteria) this;
        }

        public Criteria andCentertwonameNotIn(List<String> values) {
            addCriterion("centertwoname not in", values, "centertwoname");
            return (Criteria) this;
        }

        public Criteria andCentertwonameBetween(String value1, String value2) {
            addCriterion("centertwoname between", value1, value2, "centertwoname");
            return (Criteria) this;
        }

        public Criteria andCentertwonameNotBetween(String value1, String value2) {
            addCriterion("centertwoname not between", value1, value2, "centertwoname");
            return (Criteria) this;
        }

        public Criteria andCentertwourlIsNull() {
            addCriterion("centertwourl is null");
            return (Criteria) this;
        }

        public Criteria andCentertwourlIsNotNull() {
            addCriterion("centertwourl is not null");
            return (Criteria) this;
        }

        public Criteria andCentertwourlEqualTo(String value) {
            addCriterion("centertwourl =", value, "centertwourl");
            return (Criteria) this;
        }

        public Criteria andCentertwourlNotEqualTo(String value) {
            addCriterion("centertwourl <>", value, "centertwourl");
            return (Criteria) this;
        }

        public Criteria andCentertwourlGreaterThan(String value) {
            addCriterion("centertwourl >", value, "centertwourl");
            return (Criteria) this;
        }

        public Criteria andCentertwourlGreaterThanOrEqualTo(String value) {
            addCriterion("centertwourl >=", value, "centertwourl");
            return (Criteria) this;
        }

        public Criteria andCentertwourlLessThan(String value) {
            addCriterion("centertwourl <", value, "centertwourl");
            return (Criteria) this;
        }

        public Criteria andCentertwourlLessThanOrEqualTo(String value) {
            addCriterion("centertwourl <=", value, "centertwourl");
            return (Criteria) this;
        }

        public Criteria andCentertwourlLike(String value) {
            addCriterion("centertwourl like", value, "centertwourl");
            return (Criteria) this;
        }

        public Criteria andCentertwourlNotLike(String value) {
            addCriterion("centertwourl not like", value, "centertwourl");
            return (Criteria) this;
        }

        public Criteria andCentertwourlIn(List<String> values) {
            addCriterion("centertwourl in", values, "centertwourl");
            return (Criteria) this;
        }

        public Criteria andCentertwourlNotIn(List<String> values) {
            addCriterion("centertwourl not in", values, "centertwourl");
            return (Criteria) this;
        }

        public Criteria andCentertwourlBetween(String value1, String value2) {
            addCriterion("centertwourl between", value1, value2, "centertwourl");
            return (Criteria) this;
        }

        public Criteria andCentertwourlNotBetween(String value1, String value2) {
            addCriterion("centertwourl not between", value1, value2, "centertwourl");
            return (Criteria) this;
        }

        public Criteria andCenterthreenameIsNull() {
            addCriterion("centerthreename is null");
            return (Criteria) this;
        }

        public Criteria andCenterthreenameIsNotNull() {
            addCriterion("centerthreename is not null");
            return (Criteria) this;
        }

        public Criteria andCenterthreenameEqualTo(String value) {
            addCriterion("centerthreename =", value, "centerthreename");
            return (Criteria) this;
        }

        public Criteria andCenterthreenameNotEqualTo(String value) {
            addCriterion("centerthreename <>", value, "centerthreename");
            return (Criteria) this;
        }

        public Criteria andCenterthreenameGreaterThan(String value) {
            addCriterion("centerthreename >", value, "centerthreename");
            return (Criteria) this;
        }

        public Criteria andCenterthreenameGreaterThanOrEqualTo(String value) {
            addCriterion("centerthreename >=", value, "centerthreename");
            return (Criteria) this;
        }

        public Criteria andCenterthreenameLessThan(String value) {
            addCriterion("centerthreename <", value, "centerthreename");
            return (Criteria) this;
        }

        public Criteria andCenterthreenameLessThanOrEqualTo(String value) {
            addCriterion("centerthreename <=", value, "centerthreename");
            return (Criteria) this;
        }

        public Criteria andCenterthreenameLike(String value) {
            addCriterion("centerthreename like", value, "centerthreename");
            return (Criteria) this;
        }

        public Criteria andCenterthreenameNotLike(String value) {
            addCriterion("centerthreename not like", value, "centerthreename");
            return (Criteria) this;
        }

        public Criteria andCenterthreenameIn(List<String> values) {
            addCriterion("centerthreename in", values, "centerthreename");
            return (Criteria) this;
        }

        public Criteria andCenterthreenameNotIn(List<String> values) {
            addCriterion("centerthreename not in", values, "centerthreename");
            return (Criteria) this;
        }

        public Criteria andCenterthreenameBetween(String value1, String value2) {
            addCriterion("centerthreename between", value1, value2, "centerthreename");
            return (Criteria) this;
        }

        public Criteria andCenterthreenameNotBetween(String value1, String value2) {
            addCriterion("centerthreename not between", value1, value2, "centerthreename");
            return (Criteria) this;
        }

        public Criteria andCenterthreeurlIsNull() {
            addCriterion("centerthreeurl is null");
            return (Criteria) this;
        }

        public Criteria andCenterthreeurlIsNotNull() {
            addCriterion("centerthreeurl is not null");
            return (Criteria) this;
        }

        public Criteria andCenterthreeurlEqualTo(String value) {
            addCriterion("centerthreeurl =", value, "centerthreeurl");
            return (Criteria) this;
        }

        public Criteria andCenterthreeurlNotEqualTo(String value) {
            addCriterion("centerthreeurl <>", value, "centerthreeurl");
            return (Criteria) this;
        }

        public Criteria andCenterthreeurlGreaterThan(String value) {
            addCriterion("centerthreeurl >", value, "centerthreeurl");
            return (Criteria) this;
        }

        public Criteria andCenterthreeurlGreaterThanOrEqualTo(String value) {
            addCriterion("centerthreeurl >=", value, "centerthreeurl");
            return (Criteria) this;
        }

        public Criteria andCenterthreeurlLessThan(String value) {
            addCriterion("centerthreeurl <", value, "centerthreeurl");
            return (Criteria) this;
        }

        public Criteria andCenterthreeurlLessThanOrEqualTo(String value) {
            addCriterion("centerthreeurl <=", value, "centerthreeurl");
            return (Criteria) this;
        }

        public Criteria andCenterthreeurlLike(String value) {
            addCriterion("centerthreeurl like", value, "centerthreeurl");
            return (Criteria) this;
        }

        public Criteria andCenterthreeurlNotLike(String value) {
            addCriterion("centerthreeurl not like", value, "centerthreeurl");
            return (Criteria) this;
        }

        public Criteria andCenterthreeurlIn(List<String> values) {
            addCriterion("centerthreeurl in", values, "centerthreeurl");
            return (Criteria) this;
        }

        public Criteria andCenterthreeurlNotIn(List<String> values) {
            addCriterion("centerthreeurl not in", values, "centerthreeurl");
            return (Criteria) this;
        }

        public Criteria andCenterthreeurlBetween(String value1, String value2) {
            addCriterion("centerthreeurl between", value1, value2, "centerthreeurl");
            return (Criteria) this;
        }

        public Criteria andCenterthreeurlNotBetween(String value1, String value2) {
            addCriterion("centerthreeurl not between", value1, value2, "centerthreeurl");
            return (Criteria) this;
        }

        public Criteria andCenterfournameIsNull() {
            addCriterion("centerfourname is null");
            return (Criteria) this;
        }

        public Criteria andCenterfournameIsNotNull() {
            addCriterion("centerfourname is not null");
            return (Criteria) this;
        }

        public Criteria andCenterfournameEqualTo(String value) {
            addCriterion("centerfourname =", value, "centerfourname");
            return (Criteria) this;
        }

        public Criteria andCenterfournameNotEqualTo(String value) {
            addCriterion("centerfourname <>", value, "centerfourname");
            return (Criteria) this;
        }

        public Criteria andCenterfournameGreaterThan(String value) {
            addCriterion("centerfourname >", value, "centerfourname");
            return (Criteria) this;
        }

        public Criteria andCenterfournameGreaterThanOrEqualTo(String value) {
            addCriterion("centerfourname >=", value, "centerfourname");
            return (Criteria) this;
        }

        public Criteria andCenterfournameLessThan(String value) {
            addCriterion("centerfourname <", value, "centerfourname");
            return (Criteria) this;
        }

        public Criteria andCenterfournameLessThanOrEqualTo(String value) {
            addCriterion("centerfourname <=", value, "centerfourname");
            return (Criteria) this;
        }

        public Criteria andCenterfournameLike(String value) {
            addCriterion("centerfourname like", value, "centerfourname");
            return (Criteria) this;
        }

        public Criteria andCenterfournameNotLike(String value) {
            addCriterion("centerfourname not like", value, "centerfourname");
            return (Criteria) this;
        }

        public Criteria andCenterfournameIn(List<String> values) {
            addCriterion("centerfourname in", values, "centerfourname");
            return (Criteria) this;
        }

        public Criteria andCenterfournameNotIn(List<String> values) {
            addCriterion("centerfourname not in", values, "centerfourname");
            return (Criteria) this;
        }

        public Criteria andCenterfournameBetween(String value1, String value2) {
            addCriterion("centerfourname between", value1, value2, "centerfourname");
            return (Criteria) this;
        }

        public Criteria andCenterfournameNotBetween(String value1, String value2) {
            addCriterion("centerfourname not between", value1, value2, "centerfourname");
            return (Criteria) this;
        }

        public Criteria andCenterfoururlIsNull() {
            addCriterion("centerfoururl is null");
            return (Criteria) this;
        }

        public Criteria andCenterfoururlIsNotNull() {
            addCriterion("centerfoururl is not null");
            return (Criteria) this;
        }

        public Criteria andCenterfoururlEqualTo(String value) {
            addCriterion("centerfoururl =", value, "centerfoururl");
            return (Criteria) this;
        }

        public Criteria andCenterfoururlNotEqualTo(String value) {
            addCriterion("centerfoururl <>", value, "centerfoururl");
            return (Criteria) this;
        }

        public Criteria andCenterfoururlGreaterThan(String value) {
            addCriterion("centerfoururl >", value, "centerfoururl");
            return (Criteria) this;
        }

        public Criteria andCenterfoururlGreaterThanOrEqualTo(String value) {
            addCriterion("centerfoururl >=", value, "centerfoururl");
            return (Criteria) this;
        }

        public Criteria andCenterfoururlLessThan(String value) {
            addCriterion("centerfoururl <", value, "centerfoururl");
            return (Criteria) this;
        }

        public Criteria andCenterfoururlLessThanOrEqualTo(String value) {
            addCriterion("centerfoururl <=", value, "centerfoururl");
            return (Criteria) this;
        }

        public Criteria andCenterfoururlLike(String value) {
            addCriterion("centerfoururl like", value, "centerfoururl");
            return (Criteria) this;
        }

        public Criteria andCenterfoururlNotLike(String value) {
            addCriterion("centerfoururl not like", value, "centerfoururl");
            return (Criteria) this;
        }

        public Criteria andCenterfoururlIn(List<String> values) {
            addCriterion("centerfoururl in", values, "centerfoururl");
            return (Criteria) this;
        }

        public Criteria andCenterfoururlNotIn(List<String> values) {
            addCriterion("centerfoururl not in", values, "centerfoururl");
            return (Criteria) this;
        }

        public Criteria andCenterfoururlBetween(String value1, String value2) {
            addCriterion("centerfoururl between", value1, value2, "centerfoururl");
            return (Criteria) this;
        }

        public Criteria andCenterfoururlNotBetween(String value1, String value2) {
            addCriterion("centerfoururl not between", value1, value2, "centerfoururl");
            return (Criteria) this;
        }

        public Criteria andCenterfivenameIsNull() {
            addCriterion("centerfivename is null");
            return (Criteria) this;
        }

        public Criteria andCenterfivenameIsNotNull() {
            addCriterion("centerfivename is not null");
            return (Criteria) this;
        }

        public Criteria andCenterfivenameEqualTo(String value) {
            addCriterion("centerfivename =", value, "centerfivename");
            return (Criteria) this;
        }

        public Criteria andCenterfivenameNotEqualTo(String value) {
            addCriterion("centerfivename <>", value, "centerfivename");
            return (Criteria) this;
        }

        public Criteria andCenterfivenameGreaterThan(String value) {
            addCriterion("centerfivename >", value, "centerfivename");
            return (Criteria) this;
        }

        public Criteria andCenterfivenameGreaterThanOrEqualTo(String value) {
            addCriterion("centerfivename >=", value, "centerfivename");
            return (Criteria) this;
        }

        public Criteria andCenterfivenameLessThan(String value) {
            addCriterion("centerfivename <", value, "centerfivename");
            return (Criteria) this;
        }

        public Criteria andCenterfivenameLessThanOrEqualTo(String value) {
            addCriterion("centerfivename <=", value, "centerfivename");
            return (Criteria) this;
        }

        public Criteria andCenterfivenameLike(String value) {
            addCriterion("centerfivename like", value, "centerfivename");
            return (Criteria) this;
        }

        public Criteria andCenterfivenameNotLike(String value) {
            addCriterion("centerfivename not like", value, "centerfivename");
            return (Criteria) this;
        }

        public Criteria andCenterfivenameIn(List<String> values) {
            addCriterion("centerfivename in", values, "centerfivename");
            return (Criteria) this;
        }

        public Criteria andCenterfivenameNotIn(List<String> values) {
            addCriterion("centerfivename not in", values, "centerfivename");
            return (Criteria) this;
        }

        public Criteria andCenterfivenameBetween(String value1, String value2) {
            addCriterion("centerfivename between", value1, value2, "centerfivename");
            return (Criteria) this;
        }

        public Criteria andCenterfivenameNotBetween(String value1, String value2) {
            addCriterion("centerfivename not between", value1, value2, "centerfivename");
            return (Criteria) this;
        }

        public Criteria andCenterfiveurlIsNull() {
            addCriterion("centerfiveurl is null");
            return (Criteria) this;
        }

        public Criteria andCenterfiveurlIsNotNull() {
            addCriterion("centerfiveurl is not null");
            return (Criteria) this;
        }

        public Criteria andCenterfiveurlEqualTo(String value) {
            addCriterion("centerfiveurl =", value, "centerfiveurl");
            return (Criteria) this;
        }

        public Criteria andCenterfiveurlNotEqualTo(String value) {
            addCriterion("centerfiveurl <>", value, "centerfiveurl");
            return (Criteria) this;
        }

        public Criteria andCenterfiveurlGreaterThan(String value) {
            addCriterion("centerfiveurl >", value, "centerfiveurl");
            return (Criteria) this;
        }

        public Criteria andCenterfiveurlGreaterThanOrEqualTo(String value) {
            addCriterion("centerfiveurl >=", value, "centerfiveurl");
            return (Criteria) this;
        }

        public Criteria andCenterfiveurlLessThan(String value) {
            addCriterion("centerfiveurl <", value, "centerfiveurl");
            return (Criteria) this;
        }

        public Criteria andCenterfiveurlLessThanOrEqualTo(String value) {
            addCriterion("centerfiveurl <=", value, "centerfiveurl");
            return (Criteria) this;
        }

        public Criteria andCenterfiveurlLike(String value) {
            addCriterion("centerfiveurl like", value, "centerfiveurl");
            return (Criteria) this;
        }

        public Criteria andCenterfiveurlNotLike(String value) {
            addCriterion("centerfiveurl not like", value, "centerfiveurl");
            return (Criteria) this;
        }

        public Criteria andCenterfiveurlIn(List<String> values) {
            addCriterion("centerfiveurl in", values, "centerfiveurl");
            return (Criteria) this;
        }

        public Criteria andCenterfiveurlNotIn(List<String> values) {
            addCriterion("centerfiveurl not in", values, "centerfiveurl");
            return (Criteria) this;
        }

        public Criteria andCenterfiveurlBetween(String value1, String value2) {
            addCriterion("centerfiveurl between", value1, value2, "centerfiveurl");
            return (Criteria) this;
        }

        public Criteria andCenterfiveurlNotBetween(String value1, String value2) {
            addCriterion("centerfiveurl not between", value1, value2, "centerfiveurl");
            return (Criteria) this;
        }

        public Criteria andRightnameIsNull() {
            addCriterion("rightname is null");
            return (Criteria) this;
        }

        public Criteria andRightnameIsNotNull() {
            addCriterion("rightname is not null");
            return (Criteria) this;
        }

        public Criteria andRightnameEqualTo(String value) {
            addCriterion("rightname =", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotEqualTo(String value) {
            addCriterion("rightname <>", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameGreaterThan(String value) {
            addCriterion("rightname >", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameGreaterThanOrEqualTo(String value) {
            addCriterion("rightname >=", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameLessThan(String value) {
            addCriterion("rightname <", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameLessThanOrEqualTo(String value) {
            addCriterion("rightname <=", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameLike(String value) {
            addCriterion("rightname like", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotLike(String value) {
            addCriterion("rightname not like", value, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameIn(List<String> values) {
            addCriterion("rightname in", values, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotIn(List<String> values) {
            addCriterion("rightname not in", values, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameBetween(String value1, String value2) {
            addCriterion("rightname between", value1, value2, "rightname");
            return (Criteria) this;
        }

        public Criteria andRightnameNotBetween(String value1, String value2) {
            addCriterion("rightname not between", value1, value2, "rightname");
            return (Criteria) this;
        }

        public Criteria andRighturlIsNull() {
            addCriterion("righturl is null");
            return (Criteria) this;
        }

        public Criteria andRighturlIsNotNull() {
            addCriterion("righturl is not null");
            return (Criteria) this;
        }

        public Criteria andRighturlEqualTo(String value) {
            addCriterion("righturl =", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlNotEqualTo(String value) {
            addCriterion("righturl <>", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlGreaterThan(String value) {
            addCriterion("righturl >", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlGreaterThanOrEqualTo(String value) {
            addCriterion("righturl >=", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlLessThan(String value) {
            addCriterion("righturl <", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlLessThanOrEqualTo(String value) {
            addCriterion("righturl <=", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlLike(String value) {
            addCriterion("righturl like", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlNotLike(String value) {
            addCriterion("righturl not like", value, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlIn(List<String> values) {
            addCriterion("righturl in", values, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlNotIn(List<String> values) {
            addCriterion("righturl not in", values, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlBetween(String value1, String value2) {
            addCriterion("righturl between", value1, value2, "righturl");
            return (Criteria) this;
        }

        public Criteria andRighturlNotBetween(String value1, String value2) {
            addCriterion("righturl not between", value1, value2, "righturl");
            return (Criteria) this;
        }

        public Criteria andRightonenameIsNull() {
            addCriterion("rightonename is null");
            return (Criteria) this;
        }

        public Criteria andRightonenameIsNotNull() {
            addCriterion("rightonename is not null");
            return (Criteria) this;
        }

        public Criteria andRightonenameEqualTo(String value) {
            addCriterion("rightonename =", value, "rightonename");
            return (Criteria) this;
        }

        public Criteria andRightonenameNotEqualTo(String value) {
            addCriterion("rightonename <>", value, "rightonename");
            return (Criteria) this;
        }

        public Criteria andRightonenameGreaterThan(String value) {
            addCriterion("rightonename >", value, "rightonename");
            return (Criteria) this;
        }

        public Criteria andRightonenameGreaterThanOrEqualTo(String value) {
            addCriterion("rightonename >=", value, "rightonename");
            return (Criteria) this;
        }

        public Criteria andRightonenameLessThan(String value) {
            addCriterion("rightonename <", value, "rightonename");
            return (Criteria) this;
        }

        public Criteria andRightonenameLessThanOrEqualTo(String value) {
            addCriterion("rightonename <=", value, "rightonename");
            return (Criteria) this;
        }

        public Criteria andRightonenameLike(String value) {
            addCriterion("rightonename like", value, "rightonename");
            return (Criteria) this;
        }

        public Criteria andRightonenameNotLike(String value) {
            addCriterion("rightonename not like", value, "rightonename");
            return (Criteria) this;
        }

        public Criteria andRightonenameIn(List<String> values) {
            addCriterion("rightonename in", values, "rightonename");
            return (Criteria) this;
        }

        public Criteria andRightonenameNotIn(List<String> values) {
            addCriterion("rightonename not in", values, "rightonename");
            return (Criteria) this;
        }

        public Criteria andRightonenameBetween(String value1, String value2) {
            addCriterion("rightonename between", value1, value2, "rightonename");
            return (Criteria) this;
        }

        public Criteria andRightonenameNotBetween(String value1, String value2) {
            addCriterion("rightonename not between", value1, value2, "rightonename");
            return (Criteria) this;
        }

        public Criteria andRightoneurlIsNull() {
            addCriterion("rightoneurl is null");
            return (Criteria) this;
        }

        public Criteria andRightoneurlIsNotNull() {
            addCriterion("rightoneurl is not null");
            return (Criteria) this;
        }

        public Criteria andRightoneurlEqualTo(String value) {
            addCriterion("rightoneurl =", value, "rightoneurl");
            return (Criteria) this;
        }

        public Criteria andRightoneurlNotEqualTo(String value) {
            addCriterion("rightoneurl <>", value, "rightoneurl");
            return (Criteria) this;
        }

        public Criteria andRightoneurlGreaterThan(String value) {
            addCriterion("rightoneurl >", value, "rightoneurl");
            return (Criteria) this;
        }

        public Criteria andRightoneurlGreaterThanOrEqualTo(String value) {
            addCriterion("rightoneurl >=", value, "rightoneurl");
            return (Criteria) this;
        }

        public Criteria andRightoneurlLessThan(String value) {
            addCriterion("rightoneurl <", value, "rightoneurl");
            return (Criteria) this;
        }

        public Criteria andRightoneurlLessThanOrEqualTo(String value) {
            addCriterion("rightoneurl <=", value, "rightoneurl");
            return (Criteria) this;
        }

        public Criteria andRightoneurlLike(String value) {
            addCriterion("rightoneurl like", value, "rightoneurl");
            return (Criteria) this;
        }

        public Criteria andRightoneurlNotLike(String value) {
            addCriterion("rightoneurl not like", value, "rightoneurl");
            return (Criteria) this;
        }

        public Criteria andRightoneurlIn(List<String> values) {
            addCriterion("rightoneurl in", values, "rightoneurl");
            return (Criteria) this;
        }

        public Criteria andRightoneurlNotIn(List<String> values) {
            addCriterion("rightoneurl not in", values, "rightoneurl");
            return (Criteria) this;
        }

        public Criteria andRightoneurlBetween(String value1, String value2) {
            addCriterion("rightoneurl between", value1, value2, "rightoneurl");
            return (Criteria) this;
        }

        public Criteria andRightoneurlNotBetween(String value1, String value2) {
            addCriterion("rightoneurl not between", value1, value2, "rightoneurl");
            return (Criteria) this;
        }

        public Criteria andRighttwonameIsNull() {
            addCriterion("righttwoname is null");
            return (Criteria) this;
        }

        public Criteria andRighttwonameIsNotNull() {
            addCriterion("righttwoname is not null");
            return (Criteria) this;
        }

        public Criteria andRighttwonameEqualTo(String value) {
            addCriterion("righttwoname =", value, "righttwoname");
            return (Criteria) this;
        }

        public Criteria andRighttwonameNotEqualTo(String value) {
            addCriterion("righttwoname <>", value, "righttwoname");
            return (Criteria) this;
        }

        public Criteria andRighttwonameGreaterThan(String value) {
            addCriterion("righttwoname >", value, "righttwoname");
            return (Criteria) this;
        }

        public Criteria andRighttwonameGreaterThanOrEqualTo(String value) {
            addCriterion("righttwoname >=", value, "righttwoname");
            return (Criteria) this;
        }

        public Criteria andRighttwonameLessThan(String value) {
            addCriterion("righttwoname <", value, "righttwoname");
            return (Criteria) this;
        }

        public Criteria andRighttwonameLessThanOrEqualTo(String value) {
            addCriterion("righttwoname <=", value, "righttwoname");
            return (Criteria) this;
        }

        public Criteria andRighttwonameLike(String value) {
            addCriterion("righttwoname like", value, "righttwoname");
            return (Criteria) this;
        }

        public Criteria andRighttwonameNotLike(String value) {
            addCriterion("righttwoname not like", value, "righttwoname");
            return (Criteria) this;
        }

        public Criteria andRighttwonameIn(List<String> values) {
            addCriterion("righttwoname in", values, "righttwoname");
            return (Criteria) this;
        }

        public Criteria andRighttwonameNotIn(List<String> values) {
            addCriterion("righttwoname not in", values, "righttwoname");
            return (Criteria) this;
        }

        public Criteria andRighttwonameBetween(String value1, String value2) {
            addCriterion("righttwoname between", value1, value2, "righttwoname");
            return (Criteria) this;
        }

        public Criteria andRighttwonameNotBetween(String value1, String value2) {
            addCriterion("righttwoname not between", value1, value2, "righttwoname");
            return (Criteria) this;
        }

        public Criteria andRighttwourlIsNull() {
            addCriterion("righttwourl is null");
            return (Criteria) this;
        }

        public Criteria andRighttwourlIsNotNull() {
            addCriterion("righttwourl is not null");
            return (Criteria) this;
        }

        public Criteria andRighttwourlEqualTo(String value) {
            addCriterion("righttwourl =", value, "righttwourl");
            return (Criteria) this;
        }

        public Criteria andRighttwourlNotEqualTo(String value) {
            addCriterion("righttwourl <>", value, "righttwourl");
            return (Criteria) this;
        }

        public Criteria andRighttwourlGreaterThan(String value) {
            addCriterion("righttwourl >", value, "righttwourl");
            return (Criteria) this;
        }

        public Criteria andRighttwourlGreaterThanOrEqualTo(String value) {
            addCriterion("righttwourl >=", value, "righttwourl");
            return (Criteria) this;
        }

        public Criteria andRighttwourlLessThan(String value) {
            addCriterion("righttwourl <", value, "righttwourl");
            return (Criteria) this;
        }

        public Criteria andRighttwourlLessThanOrEqualTo(String value) {
            addCriterion("righttwourl <=", value, "righttwourl");
            return (Criteria) this;
        }

        public Criteria andRighttwourlLike(String value) {
            addCriterion("righttwourl like", value, "righttwourl");
            return (Criteria) this;
        }

        public Criteria andRighttwourlNotLike(String value) {
            addCriterion("righttwourl not like", value, "righttwourl");
            return (Criteria) this;
        }

        public Criteria andRighttwourlIn(List<String> values) {
            addCriterion("righttwourl in", values, "righttwourl");
            return (Criteria) this;
        }

        public Criteria andRighttwourlNotIn(List<String> values) {
            addCriterion("righttwourl not in", values, "righttwourl");
            return (Criteria) this;
        }

        public Criteria andRighttwourlBetween(String value1, String value2) {
            addCriterion("righttwourl between", value1, value2, "righttwourl");
            return (Criteria) this;
        }

        public Criteria andRighttwourlNotBetween(String value1, String value2) {
            addCriterion("righttwourl not between", value1, value2, "righttwourl");
            return (Criteria) this;
        }

        public Criteria andRightthreenameIsNull() {
            addCriterion("rightthreename is null");
            return (Criteria) this;
        }

        public Criteria andRightthreenameIsNotNull() {
            addCriterion("rightthreename is not null");
            return (Criteria) this;
        }

        public Criteria andRightthreenameEqualTo(String value) {
            addCriterion("rightthreename =", value, "rightthreename");
            return (Criteria) this;
        }

        public Criteria andRightthreenameNotEqualTo(String value) {
            addCriterion("rightthreename <>", value, "rightthreename");
            return (Criteria) this;
        }

        public Criteria andRightthreenameGreaterThan(String value) {
            addCriterion("rightthreename >", value, "rightthreename");
            return (Criteria) this;
        }

        public Criteria andRightthreenameGreaterThanOrEqualTo(String value) {
            addCriterion("rightthreename >=", value, "rightthreename");
            return (Criteria) this;
        }

        public Criteria andRightthreenameLessThan(String value) {
            addCriterion("rightthreename <", value, "rightthreename");
            return (Criteria) this;
        }

        public Criteria andRightthreenameLessThanOrEqualTo(String value) {
            addCriterion("rightthreename <=", value, "rightthreename");
            return (Criteria) this;
        }

        public Criteria andRightthreenameLike(String value) {
            addCriterion("rightthreename like", value, "rightthreename");
            return (Criteria) this;
        }

        public Criteria andRightthreenameNotLike(String value) {
            addCriterion("rightthreename not like", value, "rightthreename");
            return (Criteria) this;
        }

        public Criteria andRightthreenameIn(List<String> values) {
            addCriterion("rightthreename in", values, "rightthreename");
            return (Criteria) this;
        }

        public Criteria andRightthreenameNotIn(List<String> values) {
            addCriterion("rightthreename not in", values, "rightthreename");
            return (Criteria) this;
        }

        public Criteria andRightthreenameBetween(String value1, String value2) {
            addCriterion("rightthreename between", value1, value2, "rightthreename");
            return (Criteria) this;
        }

        public Criteria andRightthreenameNotBetween(String value1, String value2) {
            addCriterion("rightthreename not between", value1, value2, "rightthreename");
            return (Criteria) this;
        }

        public Criteria andRightthreeurlIsNull() {
            addCriterion("rightthreeurl is null");
            return (Criteria) this;
        }

        public Criteria andRightthreeurlIsNotNull() {
            addCriterion("rightthreeurl is not null");
            return (Criteria) this;
        }

        public Criteria andRightthreeurlEqualTo(String value) {
            addCriterion("rightthreeurl =", value, "rightthreeurl");
            return (Criteria) this;
        }

        public Criteria andRightthreeurlNotEqualTo(String value) {
            addCriterion("rightthreeurl <>", value, "rightthreeurl");
            return (Criteria) this;
        }

        public Criteria andRightthreeurlGreaterThan(String value) {
            addCriterion("rightthreeurl >", value, "rightthreeurl");
            return (Criteria) this;
        }

        public Criteria andRightthreeurlGreaterThanOrEqualTo(String value) {
            addCriterion("rightthreeurl >=", value, "rightthreeurl");
            return (Criteria) this;
        }

        public Criteria andRightthreeurlLessThan(String value) {
            addCriterion("rightthreeurl <", value, "rightthreeurl");
            return (Criteria) this;
        }

        public Criteria andRightthreeurlLessThanOrEqualTo(String value) {
            addCriterion("rightthreeurl <=", value, "rightthreeurl");
            return (Criteria) this;
        }

        public Criteria andRightthreeurlLike(String value) {
            addCriterion("rightthreeurl like", value, "rightthreeurl");
            return (Criteria) this;
        }

        public Criteria andRightthreeurlNotLike(String value) {
            addCriterion("rightthreeurl not like", value, "rightthreeurl");
            return (Criteria) this;
        }

        public Criteria andRightthreeurlIn(List<String> values) {
            addCriterion("rightthreeurl in", values, "rightthreeurl");
            return (Criteria) this;
        }

        public Criteria andRightthreeurlNotIn(List<String> values) {
            addCriterion("rightthreeurl not in", values, "rightthreeurl");
            return (Criteria) this;
        }

        public Criteria andRightthreeurlBetween(String value1, String value2) {
            addCriterion("rightthreeurl between", value1, value2, "rightthreeurl");
            return (Criteria) this;
        }

        public Criteria andRightthreeurlNotBetween(String value1, String value2) {
            addCriterion("rightthreeurl not between", value1, value2, "rightthreeurl");
            return (Criteria) this;
        }

        public Criteria andRightfournameIsNull() {
            addCriterion("rightfourname is null");
            return (Criteria) this;
        }

        public Criteria andRightfournameIsNotNull() {
            addCriterion("rightfourname is not null");
            return (Criteria) this;
        }

        public Criteria andRightfournameEqualTo(String value) {
            addCriterion("rightfourname =", value, "rightfourname");
            return (Criteria) this;
        }

        public Criteria andRightfournameNotEqualTo(String value) {
            addCriterion("rightfourname <>", value, "rightfourname");
            return (Criteria) this;
        }

        public Criteria andRightfournameGreaterThan(String value) {
            addCriterion("rightfourname >", value, "rightfourname");
            return (Criteria) this;
        }

        public Criteria andRightfournameGreaterThanOrEqualTo(String value) {
            addCriterion("rightfourname >=", value, "rightfourname");
            return (Criteria) this;
        }

        public Criteria andRightfournameLessThan(String value) {
            addCriterion("rightfourname <", value, "rightfourname");
            return (Criteria) this;
        }

        public Criteria andRightfournameLessThanOrEqualTo(String value) {
            addCriterion("rightfourname <=", value, "rightfourname");
            return (Criteria) this;
        }

        public Criteria andRightfournameLike(String value) {
            addCriterion("rightfourname like", value, "rightfourname");
            return (Criteria) this;
        }

        public Criteria andRightfournameNotLike(String value) {
            addCriterion("rightfourname not like", value, "rightfourname");
            return (Criteria) this;
        }

        public Criteria andRightfournameIn(List<String> values) {
            addCriterion("rightfourname in", values, "rightfourname");
            return (Criteria) this;
        }

        public Criteria andRightfournameNotIn(List<String> values) {
            addCriterion("rightfourname not in", values, "rightfourname");
            return (Criteria) this;
        }

        public Criteria andRightfournameBetween(String value1, String value2) {
            addCriterion("rightfourname between", value1, value2, "rightfourname");
            return (Criteria) this;
        }

        public Criteria andRightfournameNotBetween(String value1, String value2) {
            addCriterion("rightfourname not between", value1, value2, "rightfourname");
            return (Criteria) this;
        }

        public Criteria andRightfoururlIsNull() {
            addCriterion("rightfoururl is null");
            return (Criteria) this;
        }

        public Criteria andRightfoururlIsNotNull() {
            addCriterion("rightfoururl is not null");
            return (Criteria) this;
        }

        public Criteria andRightfoururlEqualTo(String value) {
            addCriterion("rightfoururl =", value, "rightfoururl");
            return (Criteria) this;
        }

        public Criteria andRightfoururlNotEqualTo(String value) {
            addCriterion("rightfoururl <>", value, "rightfoururl");
            return (Criteria) this;
        }

        public Criteria andRightfoururlGreaterThan(String value) {
            addCriterion("rightfoururl >", value, "rightfoururl");
            return (Criteria) this;
        }

        public Criteria andRightfoururlGreaterThanOrEqualTo(String value) {
            addCriterion("rightfoururl >=", value, "rightfoururl");
            return (Criteria) this;
        }

        public Criteria andRightfoururlLessThan(String value) {
            addCriterion("rightfoururl <", value, "rightfoururl");
            return (Criteria) this;
        }

        public Criteria andRightfoururlLessThanOrEqualTo(String value) {
            addCriterion("rightfoururl <=", value, "rightfoururl");
            return (Criteria) this;
        }

        public Criteria andRightfoururlLike(String value) {
            addCriterion("rightfoururl like", value, "rightfoururl");
            return (Criteria) this;
        }

        public Criteria andRightfoururlNotLike(String value) {
            addCriterion("rightfoururl not like", value, "rightfoururl");
            return (Criteria) this;
        }

        public Criteria andRightfoururlIn(List<String> values) {
            addCriterion("rightfoururl in", values, "rightfoururl");
            return (Criteria) this;
        }

        public Criteria andRightfoururlNotIn(List<String> values) {
            addCriterion("rightfoururl not in", values, "rightfoururl");
            return (Criteria) this;
        }

        public Criteria andRightfoururlBetween(String value1, String value2) {
            addCriterion("rightfoururl between", value1, value2, "rightfoururl");
            return (Criteria) this;
        }

        public Criteria andRightfoururlNotBetween(String value1, String value2) {
            addCriterion("rightfoururl not between", value1, value2, "rightfoururl");
            return (Criteria) this;
        }

        public Criteria andRightfivenameIsNull() {
            addCriterion("rightfivename is null");
            return (Criteria) this;
        }

        public Criteria andRightfivenameIsNotNull() {
            addCriterion("rightfivename is not null");
            return (Criteria) this;
        }

        public Criteria andRightfivenameEqualTo(String value) {
            addCriterion("rightfivename =", value, "rightfivename");
            return (Criteria) this;
        }

        public Criteria andRightfivenameNotEqualTo(String value) {
            addCriterion("rightfivename <>", value, "rightfivename");
            return (Criteria) this;
        }

        public Criteria andRightfivenameGreaterThan(String value) {
            addCriterion("rightfivename >", value, "rightfivename");
            return (Criteria) this;
        }

        public Criteria andRightfivenameGreaterThanOrEqualTo(String value) {
            addCriterion("rightfivename >=", value, "rightfivename");
            return (Criteria) this;
        }

        public Criteria andRightfivenameLessThan(String value) {
            addCriterion("rightfivename <", value, "rightfivename");
            return (Criteria) this;
        }

        public Criteria andRightfivenameLessThanOrEqualTo(String value) {
            addCriterion("rightfivename <=", value, "rightfivename");
            return (Criteria) this;
        }

        public Criteria andRightfivenameLike(String value) {
            addCriterion("rightfivename like", value, "rightfivename");
            return (Criteria) this;
        }

        public Criteria andRightfivenameNotLike(String value) {
            addCriterion("rightfivename not like", value, "rightfivename");
            return (Criteria) this;
        }

        public Criteria andRightfivenameIn(List<String> values) {
            addCriterion("rightfivename in", values, "rightfivename");
            return (Criteria) this;
        }

        public Criteria andRightfivenameNotIn(List<String> values) {
            addCriterion("rightfivename not in", values, "rightfivename");
            return (Criteria) this;
        }

        public Criteria andRightfivenameBetween(String value1, String value2) {
            addCriterion("rightfivename between", value1, value2, "rightfivename");
            return (Criteria) this;
        }

        public Criteria andRightfivenameNotBetween(String value1, String value2) {
            addCriterion("rightfivename not between", value1, value2, "rightfivename");
            return (Criteria) this;
        }

        public Criteria andRightfiveurlIsNull() {
            addCriterion("rightfiveurl is null");
            return (Criteria) this;
        }

        public Criteria andRightfiveurlIsNotNull() {
            addCriterion("rightfiveurl is not null");
            return (Criteria) this;
        }

        public Criteria andRightfiveurlEqualTo(String value) {
            addCriterion("rightfiveurl =", value, "rightfiveurl");
            return (Criteria) this;
        }

        public Criteria andRightfiveurlNotEqualTo(String value) {
            addCriterion("rightfiveurl <>", value, "rightfiveurl");
            return (Criteria) this;
        }

        public Criteria andRightfiveurlGreaterThan(String value) {
            addCriterion("rightfiveurl >", value, "rightfiveurl");
            return (Criteria) this;
        }

        public Criteria andRightfiveurlGreaterThanOrEqualTo(String value) {
            addCriterion("rightfiveurl >=", value, "rightfiveurl");
            return (Criteria) this;
        }

        public Criteria andRightfiveurlLessThan(String value) {
            addCriterion("rightfiveurl <", value, "rightfiveurl");
            return (Criteria) this;
        }

        public Criteria andRightfiveurlLessThanOrEqualTo(String value) {
            addCriterion("rightfiveurl <=", value, "rightfiveurl");
            return (Criteria) this;
        }

        public Criteria andRightfiveurlLike(String value) {
            addCriterion("rightfiveurl like", value, "rightfiveurl");
            return (Criteria) this;
        }

        public Criteria andRightfiveurlNotLike(String value) {
            addCriterion("rightfiveurl not like", value, "rightfiveurl");
            return (Criteria) this;
        }

        public Criteria andRightfiveurlIn(List<String> values) {
            addCriterion("rightfiveurl in", values, "rightfiveurl");
            return (Criteria) this;
        }

        public Criteria andRightfiveurlNotIn(List<String> values) {
            addCriterion("rightfiveurl not in", values, "rightfiveurl");
            return (Criteria) this;
        }

        public Criteria andRightfiveurlBetween(String value1, String value2) {
            addCriterion("rightfiveurl between", value1, value2, "rightfiveurl");
            return (Criteria) this;
        }

        public Criteria andRightfiveurlNotBetween(String value1, String value2) {
            addCriterion("rightfiveurl not between", value1, value2, "rightfiveurl");
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