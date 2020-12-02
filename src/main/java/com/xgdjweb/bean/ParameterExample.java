package com.xgdjweb.bean;

import java.util.ArrayList;
import java.util.List;

public class ParameterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParameterExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIcpIsNull() {
            addCriterion("icp is null");
            return (Criteria) this;
        }

        public Criteria andIcpIsNotNull() {
            addCriterion("icp is not null");
            return (Criteria) this;
        }

        public Criteria andIcpEqualTo(String value) {
            addCriterion("icp =", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpNotEqualTo(String value) {
            addCriterion("icp <>", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpGreaterThan(String value) {
            addCriterion("icp >", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpGreaterThanOrEqualTo(String value) {
            addCriterion("icp >=", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpLessThan(String value) {
            addCriterion("icp <", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpLessThanOrEqualTo(String value) {
            addCriterion("icp <=", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpLike(String value) {
            addCriterion("icp like", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpNotLike(String value) {
            addCriterion("icp not like", value, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpIn(List<String> values) {
            addCriterion("icp in", values, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpNotIn(List<String> values) {
            addCriterion("icp not in", values, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpBetween(String value1, String value2) {
            addCriterion("icp between", value1, value2, "icp");
            return (Criteria) this;
        }

        public Criteria andIcpNotBetween(String value1, String value2) {
            addCriterion("icp not between", value1, value2, "icp");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNull() {
            addCriterion("shopname is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("shopname is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("shopname =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("shopname <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("shopname >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("shopname >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("shopname <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("shopname <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("shopname like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("shopname not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("shopname in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("shopname not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("shopname between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("shopname not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("appid is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("appid is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("appid =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("appid <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("appid >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("appid >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("appid <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("appid <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("appid like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("appid not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("appid in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("appid not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("appid between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("appid not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNull() {
            addCriterion("appsecret is null");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNotNull() {
            addCriterion("appsecret is not null");
            return (Criteria) this;
        }

        public Criteria andAppsecretEqualTo(String value) {
            addCriterion("appsecret =", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotEqualTo(String value) {
            addCriterion("appsecret <>", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThan(String value) {
            addCriterion("appsecret >", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThanOrEqualTo(String value) {
            addCriterion("appsecret >=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThan(String value) {
            addCriterion("appsecret <", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThanOrEqualTo(String value) {
            addCriterion("appsecret <=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLike(String value) {
            addCriterion("appsecret like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotLike(String value) {
            addCriterion("appsecret not like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretIn(List<String> values) {
            addCriterion("appsecret in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotIn(List<String> values) {
            addCriterion("appsecret not in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretBetween(String value1, String value2) {
            addCriterion("appsecret between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotBetween(String value1, String value2) {
            addCriterion("appsecret not between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andBasetokenIsNull() {
            addCriterion("basetoken is null");
            return (Criteria) this;
        }

        public Criteria andBasetokenIsNotNull() {
            addCriterion("basetoken is not null");
            return (Criteria) this;
        }

        public Criteria andBasetokenEqualTo(String value) {
            addCriterion("basetoken =", value, "basetoken");
            return (Criteria) this;
        }

        public Criteria andBasetokenNotEqualTo(String value) {
            addCriterion("basetoken <>", value, "basetoken");
            return (Criteria) this;
        }

        public Criteria andBasetokenGreaterThan(String value) {
            addCriterion("basetoken >", value, "basetoken");
            return (Criteria) this;
        }

        public Criteria andBasetokenGreaterThanOrEqualTo(String value) {
            addCriterion("basetoken >=", value, "basetoken");
            return (Criteria) this;
        }

        public Criteria andBasetokenLessThan(String value) {
            addCriterion("basetoken <", value, "basetoken");
            return (Criteria) this;
        }

        public Criteria andBasetokenLessThanOrEqualTo(String value) {
            addCriterion("basetoken <=", value, "basetoken");
            return (Criteria) this;
        }

        public Criteria andBasetokenLike(String value) {
            addCriterion("basetoken like", value, "basetoken");
            return (Criteria) this;
        }

        public Criteria andBasetokenNotLike(String value) {
            addCriterion("basetoken not like", value, "basetoken");
            return (Criteria) this;
        }

        public Criteria andBasetokenIn(List<String> values) {
            addCriterion("basetoken in", values, "basetoken");
            return (Criteria) this;
        }

        public Criteria andBasetokenNotIn(List<String> values) {
            addCriterion("basetoken not in", values, "basetoken");
            return (Criteria) this;
        }

        public Criteria andBasetokenBetween(String value1, String value2) {
            addCriterion("basetoken between", value1, value2, "basetoken");
            return (Criteria) this;
        }

        public Criteria andBasetokenNotBetween(String value1, String value2) {
            addCriterion("basetoken not between", value1, value2, "basetoken");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopid is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopid is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Integer value) {
            addCriterion("shopid =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Integer value) {
            addCriterion("shopid <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Integer value) {
            addCriterion("shopid >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopid >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Integer value) {
            addCriterion("shopid <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Integer value) {
            addCriterion("shopid <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Integer> values) {
            addCriterion("shopid in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Integer> values) {
            addCriterion("shopid not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Integer value1, Integer value2) {
            addCriterion("shopid between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Integer value1, Integer value2) {
            addCriterion("shopid not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopkeyIsNull() {
            addCriterion("shopkey is null");
            return (Criteria) this;
        }

        public Criteria andShopkeyIsNotNull() {
            addCriterion("shopkey is not null");
            return (Criteria) this;
        }

        public Criteria andShopkeyEqualTo(String value) {
            addCriterion("shopkey =", value, "shopkey");
            return (Criteria) this;
        }

        public Criteria andShopkeyNotEqualTo(String value) {
            addCriterion("shopkey <>", value, "shopkey");
            return (Criteria) this;
        }

        public Criteria andShopkeyGreaterThan(String value) {
            addCriterion("shopkey >", value, "shopkey");
            return (Criteria) this;
        }

        public Criteria andShopkeyGreaterThanOrEqualTo(String value) {
            addCriterion("shopkey >=", value, "shopkey");
            return (Criteria) this;
        }

        public Criteria andShopkeyLessThan(String value) {
            addCriterion("shopkey <", value, "shopkey");
            return (Criteria) this;
        }

        public Criteria andShopkeyLessThanOrEqualTo(String value) {
            addCriterion("shopkey <=", value, "shopkey");
            return (Criteria) this;
        }

        public Criteria andShopkeyLike(String value) {
            addCriterion("shopkey like", value, "shopkey");
            return (Criteria) this;
        }

        public Criteria andShopkeyNotLike(String value) {
            addCriterion("shopkey not like", value, "shopkey");
            return (Criteria) this;
        }

        public Criteria andShopkeyIn(List<String> values) {
            addCriterion("shopkey in", values, "shopkey");
            return (Criteria) this;
        }

        public Criteria andShopkeyNotIn(List<String> values) {
            addCriterion("shopkey not in", values, "shopkey");
            return (Criteria) this;
        }

        public Criteria andShopkeyBetween(String value1, String value2) {
            addCriterion("shopkey between", value1, value2, "shopkey");
            return (Criteria) this;
        }

        public Criteria andShopkeyNotBetween(String value1, String value2) {
            addCriterion("shopkey not between", value1, value2, "shopkey");
            return (Criteria) this;
        }

        public Criteria andDistributionimgIsNull() {
            addCriterion("distributionimg is null");
            return (Criteria) this;
        }

        public Criteria andDistributionimgIsNotNull() {
            addCriterion("distributionimg is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionimgEqualTo(String value) {
            addCriterion("distributionimg =", value, "distributionimg");
            return (Criteria) this;
        }

        public Criteria andDistributionimgNotEqualTo(String value) {
            addCriterion("distributionimg <>", value, "distributionimg");
            return (Criteria) this;
        }

        public Criteria andDistributionimgGreaterThan(String value) {
            addCriterion("distributionimg >", value, "distributionimg");
            return (Criteria) this;
        }

        public Criteria andDistributionimgGreaterThanOrEqualTo(String value) {
            addCriterion("distributionimg >=", value, "distributionimg");
            return (Criteria) this;
        }

        public Criteria andDistributionimgLessThan(String value) {
            addCriterion("distributionimg <", value, "distributionimg");
            return (Criteria) this;
        }

        public Criteria andDistributionimgLessThanOrEqualTo(String value) {
            addCriterion("distributionimg <=", value, "distributionimg");
            return (Criteria) this;
        }

        public Criteria andDistributionimgLike(String value) {
            addCriterion("distributionimg like", value, "distributionimg");
            return (Criteria) this;
        }

        public Criteria andDistributionimgNotLike(String value) {
            addCriterion("distributionimg not like", value, "distributionimg");
            return (Criteria) this;
        }

        public Criteria andDistributionimgIn(List<String> values) {
            addCriterion("distributionimg in", values, "distributionimg");
            return (Criteria) this;
        }

        public Criteria andDistributionimgNotIn(List<String> values) {
            addCriterion("distributionimg not in", values, "distributionimg");
            return (Criteria) this;
        }

        public Criteria andDistributionimgBetween(String value1, String value2) {
            addCriterion("distributionimg between", value1, value2, "distributionimg");
            return (Criteria) this;
        }

        public Criteria andDistributionimgNotBetween(String value1, String value2) {
            addCriterion("distributionimg not between", value1, value2, "distributionimg");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andOfficialIsNull() {
            addCriterion("official is null");
            return (Criteria) this;
        }

        public Criteria andOfficialIsNotNull() {
            addCriterion("official is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialEqualTo(String value) {
            addCriterion("official =", value, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialNotEqualTo(String value) {
            addCriterion("official <>", value, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialGreaterThan(String value) {
            addCriterion("official >", value, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialGreaterThanOrEqualTo(String value) {
            addCriterion("official >=", value, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialLessThan(String value) {
            addCriterion("official <", value, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialLessThanOrEqualTo(String value) {
            addCriterion("official <=", value, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialLike(String value) {
            addCriterion("official like", value, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialNotLike(String value) {
            addCriterion("official not like", value, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialIn(List<String> values) {
            addCriterion("official in", values, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialNotIn(List<String> values) {
            addCriterion("official not in", values, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialBetween(String value1, String value2) {
            addCriterion("official between", value1, value2, "official");
            return (Criteria) this;
        }

        public Criteria andOfficialNotBetween(String value1, String value2) {
            addCriterion("official not between", value1, value2, "official");
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