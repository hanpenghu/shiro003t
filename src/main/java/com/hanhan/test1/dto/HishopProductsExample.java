package com.hanhan.test1.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HishopProductsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HishopProductsExample() {
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

        public Criteria andProductidIsNull() {
            addCriterion("ProductId is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("ProductId is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("ProductId =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("ProductId <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("ProductId >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductId >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("ProductId <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("ProductId <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("ProductId in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("ProductId not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("ProductId between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductId not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("CategoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("CategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("CategoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("CategoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("CategoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CategoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("CategoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("CategoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("CategoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("CategoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("CategoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("CategoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("TypeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("TypeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("TypeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("TypeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("TypeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TypeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("TypeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("TypeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("TypeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("TypeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("TypeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("TypeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("ProductName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("ProductName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("ProductName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("ProductName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("ProductName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProductName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("ProductName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("ProductName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("ProductName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("ProductName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("ProductName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("ProductName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("ProductName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("ProductName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductcodeIsNull() {
            addCriterion("ProductCode is null");
            return (Criteria) this;
        }

        public Criteria andProductcodeIsNotNull() {
            addCriterion("ProductCode is not null");
            return (Criteria) this;
        }

        public Criteria andProductcodeEqualTo(String value) {
            addCriterion("ProductCode =", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotEqualTo(String value) {
            addCriterion("ProductCode <>", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThan(String value) {
            addCriterion("ProductCode >", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ProductCode >=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThan(String value) {
            addCriterion("ProductCode <", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThanOrEqualTo(String value) {
            addCriterion("ProductCode <=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLike(String value) {
            addCriterion("ProductCode like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotLike(String value) {
            addCriterion("ProductCode not like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeIn(List<String> values) {
            addCriterion("ProductCode in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotIn(List<String> values) {
            addCriterion("ProductCode not in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeBetween(String value1, String value2) {
            addCriterion("ProductCode between", value1, value2, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotBetween(String value1, String value2) {
            addCriterion("ProductCode not between", value1, value2, "productcode");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionIsNull() {
            addCriterion("ShortDescription is null");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionIsNotNull() {
            addCriterion("ShortDescription is not null");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionEqualTo(String value) {
            addCriterion("ShortDescription =", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionNotEqualTo(String value) {
            addCriterion("ShortDescription <>", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionGreaterThan(String value) {
            addCriterion("ShortDescription >", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ShortDescription >=", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionLessThan(String value) {
            addCriterion("ShortDescription <", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionLessThanOrEqualTo(String value) {
            addCriterion("ShortDescription <=", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionLike(String value) {
            addCriterion("ShortDescription like", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionNotLike(String value) {
            addCriterion("ShortDescription not like", value, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionIn(List<String> values) {
            addCriterion("ShortDescription in", values, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionNotIn(List<String> values) {
            addCriterion("ShortDescription not in", values, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionBetween(String value1, String value2) {
            addCriterion("ShortDescription between", value1, value2, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andShortdescriptionNotBetween(String value1, String value2) {
            addCriterion("ShortDescription not between", value1, value2, "shortdescription");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("Unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("Unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("Unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("Unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("Unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("Unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("Unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("Unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("Unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("Unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("Unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("Unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("Unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("Unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andMobbiledescriptionIsNull() {
            addCriterion("MobbileDescription is null");
            return (Criteria) this;
        }

        public Criteria andMobbiledescriptionIsNotNull() {
            addCriterion("MobbileDescription is not null");
            return (Criteria) this;
        }

        public Criteria andMobbiledescriptionEqualTo(String value) {
            addCriterion("MobbileDescription =", value, "mobbiledescription");
            return (Criteria) this;
        }

        public Criteria andMobbiledescriptionNotEqualTo(String value) {
            addCriterion("MobbileDescription <>", value, "mobbiledescription");
            return (Criteria) this;
        }

        public Criteria andMobbiledescriptionGreaterThan(String value) {
            addCriterion("MobbileDescription >", value, "mobbiledescription");
            return (Criteria) this;
        }

        public Criteria andMobbiledescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("MobbileDescription >=", value, "mobbiledescription");
            return (Criteria) this;
        }

        public Criteria andMobbiledescriptionLessThan(String value) {
            addCriterion("MobbileDescription <", value, "mobbiledescription");
            return (Criteria) this;
        }

        public Criteria andMobbiledescriptionLessThanOrEqualTo(String value) {
            addCriterion("MobbileDescription <=", value, "mobbiledescription");
            return (Criteria) this;
        }

        public Criteria andMobbiledescriptionLike(String value) {
            addCriterion("MobbileDescription like", value, "mobbiledescription");
            return (Criteria) this;
        }

        public Criteria andMobbiledescriptionNotLike(String value) {
            addCriterion("MobbileDescription not like", value, "mobbiledescription");
            return (Criteria) this;
        }

        public Criteria andMobbiledescriptionIn(List<String> values) {
            addCriterion("MobbileDescription in", values, "mobbiledescription");
            return (Criteria) this;
        }

        public Criteria andMobbiledescriptionNotIn(List<String> values) {
            addCriterion("MobbileDescription not in", values, "mobbiledescription");
            return (Criteria) this;
        }

        public Criteria andMobbiledescriptionBetween(String value1, String value2) {
            addCriterion("MobbileDescription between", value1, value2, "mobbiledescription");
            return (Criteria) this;
        }

        public Criteria andMobbiledescriptionNotBetween(String value1, String value2) {
            addCriterion("MobbileDescription not between", value1, value2, "mobbiledescription");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionIsNull() {
            addCriterion("Meta_Description is null");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionIsNotNull() {
            addCriterion("Meta_Description is not null");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionEqualTo(String value) {
            addCriterion("Meta_Description =", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotEqualTo(String value) {
            addCriterion("Meta_Description <>", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionGreaterThan(String value) {
            addCriterion("Meta_Description >", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Meta_Description >=", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionLessThan(String value) {
            addCriterion("Meta_Description <", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Meta_Description <=", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionLike(String value) {
            addCriterion("Meta_Description like", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotLike(String value) {
            addCriterion("Meta_Description not like", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionIn(List<String> values) {
            addCriterion("Meta_Description in", values, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotIn(List<String> values) {
            addCriterion("Meta_Description not in", values, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionBetween(String value1, String value2) {
            addCriterion("Meta_Description between", value1, value2, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotBetween(String value1, String value2) {
            addCriterion("Meta_Description not between", value1, value2, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsIsNull() {
            addCriterion("Meta_Keywords is null");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsIsNotNull() {
            addCriterion("Meta_Keywords is not null");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsEqualTo(String value) {
            addCriterion("Meta_Keywords =", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotEqualTo(String value) {
            addCriterion("Meta_Keywords <>", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsGreaterThan(String value) {
            addCriterion("Meta_Keywords >", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("Meta_Keywords >=", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsLessThan(String value) {
            addCriterion("Meta_Keywords <", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsLessThanOrEqualTo(String value) {
            addCriterion("Meta_Keywords <=", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsLike(String value) {
            addCriterion("Meta_Keywords like", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotLike(String value) {
            addCriterion("Meta_Keywords not like", value, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsIn(List<String> values) {
            addCriterion("Meta_Keywords in", values, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotIn(List<String> values) {
            addCriterion("Meta_Keywords not in", values, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsBetween(String value1, String value2) {
            addCriterion("Meta_Keywords between", value1, value2, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordsNotBetween(String value1, String value2) {
            addCriterion("Meta_Keywords not between", value1, value2, "metaKeywords");
            return (Criteria) this;
        }

        public Criteria andSalestatusIsNull() {
            addCriterion("SaleStatus is null");
            return (Criteria) this;
        }

        public Criteria andSalestatusIsNotNull() {
            addCriterion("SaleStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSalestatusEqualTo(Integer value) {
            addCriterion("SaleStatus =", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotEqualTo(Integer value) {
            addCriterion("SaleStatus <>", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusGreaterThan(Integer value) {
            addCriterion("SaleStatus >", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("SaleStatus >=", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLessThan(Integer value) {
            addCriterion("SaleStatus <", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusLessThanOrEqualTo(Integer value) {
            addCriterion("SaleStatus <=", value, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusIn(List<Integer> values) {
            addCriterion("SaleStatus in", values, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotIn(List<Integer> values) {
            addCriterion("SaleStatus not in", values, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusBetween(Integer value1, Integer value2) {
            addCriterion("SaleStatus between", value1, value2, "salestatus");
            return (Criteria) this;
        }

        public Criteria andSalestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("SaleStatus not between", value1, value2, "salestatus");
            return (Criteria) this;
        }

        public Criteria andAddeddateIsNull() {
            addCriterion("AddedDate is null");
            return (Criteria) this;
        }

        public Criteria andAddeddateIsNotNull() {
            addCriterion("AddedDate is not null");
            return (Criteria) this;
        }

        public Criteria andAddeddateEqualTo(Date value) {
            addCriterion("AddedDate =", value, "addeddate");
            return (Criteria) this;
        }

        public Criteria andAddeddateNotEqualTo(Date value) {
            addCriterion("AddedDate <>", value, "addeddate");
            return (Criteria) this;
        }

        public Criteria andAddeddateGreaterThan(Date value) {
            addCriterion("AddedDate >", value, "addeddate");
            return (Criteria) this;
        }

        public Criteria andAddeddateGreaterThanOrEqualTo(Date value) {
            addCriterion("AddedDate >=", value, "addeddate");
            return (Criteria) this;
        }

        public Criteria andAddeddateLessThan(Date value) {
            addCriterion("AddedDate <", value, "addeddate");
            return (Criteria) this;
        }

        public Criteria andAddeddateLessThanOrEqualTo(Date value) {
            addCriterion("AddedDate <=", value, "addeddate");
            return (Criteria) this;
        }

        public Criteria andAddeddateIn(List<Date> values) {
            addCriterion("AddedDate in", values, "addeddate");
            return (Criteria) this;
        }

        public Criteria andAddeddateNotIn(List<Date> values) {
            addCriterion("AddedDate not in", values, "addeddate");
            return (Criteria) this;
        }

        public Criteria andAddeddateBetween(Date value1, Date value2) {
            addCriterion("AddedDate between", value1, value2, "addeddate");
            return (Criteria) this;
        }

        public Criteria andAddeddateNotBetween(Date value1, Date value2) {
            addCriterion("AddedDate not between", value1, value2, "addeddate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("UpdateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UpdateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("UpdateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("UpdateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("UpdateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("UpdateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("UpdateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("UpdateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("UpdateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("UpdateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("UpdateDate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andVisticountsIsNull() {
            addCriterion("VistiCounts is null");
            return (Criteria) this;
        }

        public Criteria andVisticountsIsNotNull() {
            addCriterion("VistiCounts is not null");
            return (Criteria) this;
        }

        public Criteria andVisticountsEqualTo(Integer value) {
            addCriterion("VistiCounts =", value, "visticounts");
            return (Criteria) this;
        }

        public Criteria andVisticountsNotEqualTo(Integer value) {
            addCriterion("VistiCounts <>", value, "visticounts");
            return (Criteria) this;
        }

        public Criteria andVisticountsGreaterThan(Integer value) {
            addCriterion("VistiCounts >", value, "visticounts");
            return (Criteria) this;
        }

        public Criteria andVisticountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("VistiCounts >=", value, "visticounts");
            return (Criteria) this;
        }

        public Criteria andVisticountsLessThan(Integer value) {
            addCriterion("VistiCounts <", value, "visticounts");
            return (Criteria) this;
        }

        public Criteria andVisticountsLessThanOrEqualTo(Integer value) {
            addCriterion("VistiCounts <=", value, "visticounts");
            return (Criteria) this;
        }

        public Criteria andVisticountsIn(List<Integer> values) {
            addCriterion("VistiCounts in", values, "visticounts");
            return (Criteria) this;
        }

        public Criteria andVisticountsNotIn(List<Integer> values) {
            addCriterion("VistiCounts not in", values, "visticounts");
            return (Criteria) this;
        }

        public Criteria andVisticountsBetween(Integer value1, Integer value2) {
            addCriterion("VistiCounts between", value1, value2, "visticounts");
            return (Criteria) this;
        }

        public Criteria andVisticountsNotBetween(Integer value1, Integer value2) {
            addCriterion("VistiCounts not between", value1, value2, "visticounts");
            return (Criteria) this;
        }

        public Criteria andSalecountsIsNull() {
            addCriterion("SaleCounts is null");
            return (Criteria) this;
        }

        public Criteria andSalecountsIsNotNull() {
            addCriterion("SaleCounts is not null");
            return (Criteria) this;
        }

        public Criteria andSalecountsEqualTo(Integer value) {
            addCriterion("SaleCounts =", value, "salecounts");
            return (Criteria) this;
        }

        public Criteria andSalecountsNotEqualTo(Integer value) {
            addCriterion("SaleCounts <>", value, "salecounts");
            return (Criteria) this;
        }

        public Criteria andSalecountsGreaterThan(Integer value) {
            addCriterion("SaleCounts >", value, "salecounts");
            return (Criteria) this;
        }

        public Criteria andSalecountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("SaleCounts >=", value, "salecounts");
            return (Criteria) this;
        }

        public Criteria andSalecountsLessThan(Integer value) {
            addCriterion("SaleCounts <", value, "salecounts");
            return (Criteria) this;
        }

        public Criteria andSalecountsLessThanOrEqualTo(Integer value) {
            addCriterion("SaleCounts <=", value, "salecounts");
            return (Criteria) this;
        }

        public Criteria andSalecountsIn(List<Integer> values) {
            addCriterion("SaleCounts in", values, "salecounts");
            return (Criteria) this;
        }

        public Criteria andSalecountsNotIn(List<Integer> values) {
            addCriterion("SaleCounts not in", values, "salecounts");
            return (Criteria) this;
        }

        public Criteria andSalecountsBetween(Integer value1, Integer value2) {
            addCriterion("SaleCounts between", value1, value2, "salecounts");
            return (Criteria) this;
        }

        public Criteria andSalecountsNotBetween(Integer value1, Integer value2) {
            addCriterion("SaleCounts not between", value1, value2, "salecounts");
            return (Criteria) this;
        }

        public Criteria andShowsalecountsIsNull() {
            addCriterion("ShowSaleCounts is null");
            return (Criteria) this;
        }

        public Criteria andShowsalecountsIsNotNull() {
            addCriterion("ShowSaleCounts is not null");
            return (Criteria) this;
        }

        public Criteria andShowsalecountsEqualTo(Integer value) {
            addCriterion("ShowSaleCounts =", value, "showsalecounts");
            return (Criteria) this;
        }

        public Criteria andShowsalecountsNotEqualTo(Integer value) {
            addCriterion("ShowSaleCounts <>", value, "showsalecounts");
            return (Criteria) this;
        }

        public Criteria andShowsalecountsGreaterThan(Integer value) {
            addCriterion("ShowSaleCounts >", value, "showsalecounts");
            return (Criteria) this;
        }

        public Criteria andShowsalecountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShowSaleCounts >=", value, "showsalecounts");
            return (Criteria) this;
        }

        public Criteria andShowsalecountsLessThan(Integer value) {
            addCriterion("ShowSaleCounts <", value, "showsalecounts");
            return (Criteria) this;
        }

        public Criteria andShowsalecountsLessThanOrEqualTo(Integer value) {
            addCriterion("ShowSaleCounts <=", value, "showsalecounts");
            return (Criteria) this;
        }

        public Criteria andShowsalecountsIn(List<Integer> values) {
            addCriterion("ShowSaleCounts in", values, "showsalecounts");
            return (Criteria) this;
        }

        public Criteria andShowsalecountsNotIn(List<Integer> values) {
            addCriterion("ShowSaleCounts not in", values, "showsalecounts");
            return (Criteria) this;
        }

        public Criteria andShowsalecountsBetween(Integer value1, Integer value2) {
            addCriterion("ShowSaleCounts between", value1, value2, "showsalecounts");
            return (Criteria) this;
        }

        public Criteria andShowsalecountsNotBetween(Integer value1, Integer value2) {
            addCriterion("ShowSaleCounts not between", value1, value2, "showsalecounts");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceIsNull() {
            addCriterion("DisplaySequence is null");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceIsNotNull() {
            addCriterion("DisplaySequence is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceEqualTo(Integer value) {
            addCriterion("DisplaySequence =", value, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceNotEqualTo(Integer value) {
            addCriterion("DisplaySequence <>", value, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceGreaterThan(Integer value) {
            addCriterion("DisplaySequence >", value, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("DisplaySequence >=", value, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceLessThan(Integer value) {
            addCriterion("DisplaySequence <", value, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceLessThanOrEqualTo(Integer value) {
            addCriterion("DisplaySequence <=", value, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceIn(List<Integer> values) {
            addCriterion("DisplaySequence in", values, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceNotIn(List<Integer> values) {
            addCriterion("DisplaySequence not in", values, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceBetween(Integer value1, Integer value2) {
            addCriterion("DisplaySequence between", value1, value2, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andDisplaysequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("DisplaySequence not between", value1, value2, "displaysequence");
            return (Criteria) this;
        }

        public Criteria andImageurl1IsNull() {
            addCriterion("ImageUrl1 is null");
            return (Criteria) this;
        }

        public Criteria andImageurl1IsNotNull() {
            addCriterion("ImageUrl1 is not null");
            return (Criteria) this;
        }

        public Criteria andImageurl1EqualTo(String value) {
            addCriterion("ImageUrl1 =", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1NotEqualTo(String value) {
            addCriterion("ImageUrl1 <>", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1GreaterThan(String value) {
            addCriterion("ImageUrl1 >", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1GreaterThanOrEqualTo(String value) {
            addCriterion("ImageUrl1 >=", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1LessThan(String value) {
            addCriterion("ImageUrl1 <", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1LessThanOrEqualTo(String value) {
            addCriterion("ImageUrl1 <=", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1Like(String value) {
            addCriterion("ImageUrl1 like", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1NotLike(String value) {
            addCriterion("ImageUrl1 not like", value, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1In(List<String> values) {
            addCriterion("ImageUrl1 in", values, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1NotIn(List<String> values) {
            addCriterion("ImageUrl1 not in", values, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1Between(String value1, String value2) {
            addCriterion("ImageUrl1 between", value1, value2, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl1NotBetween(String value1, String value2) {
            addCriterion("ImageUrl1 not between", value1, value2, "imageurl1");
            return (Criteria) this;
        }

        public Criteria andImageurl2IsNull() {
            addCriterion("ImageUrl2 is null");
            return (Criteria) this;
        }

        public Criteria andImageurl2IsNotNull() {
            addCriterion("ImageUrl2 is not null");
            return (Criteria) this;
        }

        public Criteria andImageurl2EqualTo(String value) {
            addCriterion("ImageUrl2 =", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2NotEqualTo(String value) {
            addCriterion("ImageUrl2 <>", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2GreaterThan(String value) {
            addCriterion("ImageUrl2 >", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2GreaterThanOrEqualTo(String value) {
            addCriterion("ImageUrl2 >=", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2LessThan(String value) {
            addCriterion("ImageUrl2 <", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2LessThanOrEqualTo(String value) {
            addCriterion("ImageUrl2 <=", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2Like(String value) {
            addCriterion("ImageUrl2 like", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2NotLike(String value) {
            addCriterion("ImageUrl2 not like", value, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2In(List<String> values) {
            addCriterion("ImageUrl2 in", values, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2NotIn(List<String> values) {
            addCriterion("ImageUrl2 not in", values, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2Between(String value1, String value2) {
            addCriterion("ImageUrl2 between", value1, value2, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl2NotBetween(String value1, String value2) {
            addCriterion("ImageUrl2 not between", value1, value2, "imageurl2");
            return (Criteria) this;
        }

        public Criteria andImageurl3IsNull() {
            addCriterion("ImageUrl3 is null");
            return (Criteria) this;
        }

        public Criteria andImageurl3IsNotNull() {
            addCriterion("ImageUrl3 is not null");
            return (Criteria) this;
        }

        public Criteria andImageurl3EqualTo(String value) {
            addCriterion("ImageUrl3 =", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3NotEqualTo(String value) {
            addCriterion("ImageUrl3 <>", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3GreaterThan(String value) {
            addCriterion("ImageUrl3 >", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3GreaterThanOrEqualTo(String value) {
            addCriterion("ImageUrl3 >=", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3LessThan(String value) {
            addCriterion("ImageUrl3 <", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3LessThanOrEqualTo(String value) {
            addCriterion("ImageUrl3 <=", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3Like(String value) {
            addCriterion("ImageUrl3 like", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3NotLike(String value) {
            addCriterion("ImageUrl3 not like", value, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3In(List<String> values) {
            addCriterion("ImageUrl3 in", values, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3NotIn(List<String> values) {
            addCriterion("ImageUrl3 not in", values, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3Between(String value1, String value2) {
            addCriterion("ImageUrl3 between", value1, value2, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl3NotBetween(String value1, String value2) {
            addCriterion("ImageUrl3 not between", value1, value2, "imageurl3");
            return (Criteria) this;
        }

        public Criteria andImageurl4IsNull() {
            addCriterion("ImageUrl4 is null");
            return (Criteria) this;
        }

        public Criteria andImageurl4IsNotNull() {
            addCriterion("ImageUrl4 is not null");
            return (Criteria) this;
        }

        public Criteria andImageurl4EqualTo(String value) {
            addCriterion("ImageUrl4 =", value, "imageurl4");
            return (Criteria) this;
        }

        public Criteria andImageurl4NotEqualTo(String value) {
            addCriterion("ImageUrl4 <>", value, "imageurl4");
            return (Criteria) this;
        }

        public Criteria andImageurl4GreaterThan(String value) {
            addCriterion("ImageUrl4 >", value, "imageurl4");
            return (Criteria) this;
        }

        public Criteria andImageurl4GreaterThanOrEqualTo(String value) {
            addCriterion("ImageUrl4 >=", value, "imageurl4");
            return (Criteria) this;
        }

        public Criteria andImageurl4LessThan(String value) {
            addCriterion("ImageUrl4 <", value, "imageurl4");
            return (Criteria) this;
        }

        public Criteria andImageurl4LessThanOrEqualTo(String value) {
            addCriterion("ImageUrl4 <=", value, "imageurl4");
            return (Criteria) this;
        }

        public Criteria andImageurl4Like(String value) {
            addCriterion("ImageUrl4 like", value, "imageurl4");
            return (Criteria) this;
        }

        public Criteria andImageurl4NotLike(String value) {
            addCriterion("ImageUrl4 not like", value, "imageurl4");
            return (Criteria) this;
        }

        public Criteria andImageurl4In(List<String> values) {
            addCriterion("ImageUrl4 in", values, "imageurl4");
            return (Criteria) this;
        }

        public Criteria andImageurl4NotIn(List<String> values) {
            addCriterion("ImageUrl4 not in", values, "imageurl4");
            return (Criteria) this;
        }

        public Criteria andImageurl4Between(String value1, String value2) {
            addCriterion("ImageUrl4 between", value1, value2, "imageurl4");
            return (Criteria) this;
        }

        public Criteria andImageurl4NotBetween(String value1, String value2) {
            addCriterion("ImageUrl4 not between", value1, value2, "imageurl4");
            return (Criteria) this;
        }

        public Criteria andImageurl5IsNull() {
            addCriterion("ImageUrl5 is null");
            return (Criteria) this;
        }

        public Criteria andImageurl5IsNotNull() {
            addCriterion("ImageUrl5 is not null");
            return (Criteria) this;
        }

        public Criteria andImageurl5EqualTo(String value) {
            addCriterion("ImageUrl5 =", value, "imageurl5");
            return (Criteria) this;
        }

        public Criteria andImageurl5NotEqualTo(String value) {
            addCriterion("ImageUrl5 <>", value, "imageurl5");
            return (Criteria) this;
        }

        public Criteria andImageurl5GreaterThan(String value) {
            addCriterion("ImageUrl5 >", value, "imageurl5");
            return (Criteria) this;
        }

        public Criteria andImageurl5GreaterThanOrEqualTo(String value) {
            addCriterion("ImageUrl5 >=", value, "imageurl5");
            return (Criteria) this;
        }

        public Criteria andImageurl5LessThan(String value) {
            addCriterion("ImageUrl5 <", value, "imageurl5");
            return (Criteria) this;
        }

        public Criteria andImageurl5LessThanOrEqualTo(String value) {
            addCriterion("ImageUrl5 <=", value, "imageurl5");
            return (Criteria) this;
        }

        public Criteria andImageurl5Like(String value) {
            addCriterion("ImageUrl5 like", value, "imageurl5");
            return (Criteria) this;
        }

        public Criteria andImageurl5NotLike(String value) {
            addCriterion("ImageUrl5 not like", value, "imageurl5");
            return (Criteria) this;
        }

        public Criteria andImageurl5In(List<String> values) {
            addCriterion("ImageUrl5 in", values, "imageurl5");
            return (Criteria) this;
        }

        public Criteria andImageurl5NotIn(List<String> values) {
            addCriterion("ImageUrl5 not in", values, "imageurl5");
            return (Criteria) this;
        }

        public Criteria andImageurl5Between(String value1, String value2) {
            addCriterion("ImageUrl5 between", value1, value2, "imageurl5");
            return (Criteria) this;
        }

        public Criteria andImageurl5NotBetween(String value1, String value2) {
            addCriterion("ImageUrl5 not between", value1, value2, "imageurl5");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl40IsNull() {
            addCriterion("ThumbnailUrl40 is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl40IsNotNull() {
            addCriterion("ThumbnailUrl40 is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl40EqualTo(String value) {
            addCriterion("ThumbnailUrl40 =", value, "thumbnailurl40");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl40NotEqualTo(String value) {
            addCriterion("ThumbnailUrl40 <>", value, "thumbnailurl40");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl40GreaterThan(String value) {
            addCriterion("ThumbnailUrl40 >", value, "thumbnailurl40");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl40GreaterThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl40 >=", value, "thumbnailurl40");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl40LessThan(String value) {
            addCriterion("ThumbnailUrl40 <", value, "thumbnailurl40");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl40LessThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl40 <=", value, "thumbnailurl40");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl40Like(String value) {
            addCriterion("ThumbnailUrl40 like", value, "thumbnailurl40");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl40NotLike(String value) {
            addCriterion("ThumbnailUrl40 not like", value, "thumbnailurl40");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl40In(List<String> values) {
            addCriterion("ThumbnailUrl40 in", values, "thumbnailurl40");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl40NotIn(List<String> values) {
            addCriterion("ThumbnailUrl40 not in", values, "thumbnailurl40");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl40Between(String value1, String value2) {
            addCriterion("ThumbnailUrl40 between", value1, value2, "thumbnailurl40");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl40NotBetween(String value1, String value2) {
            addCriterion("ThumbnailUrl40 not between", value1, value2, "thumbnailurl40");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl60IsNull() {
            addCriterion("ThumbnailUrl60 is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl60IsNotNull() {
            addCriterion("ThumbnailUrl60 is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl60EqualTo(String value) {
            addCriterion("ThumbnailUrl60 =", value, "thumbnailurl60");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl60NotEqualTo(String value) {
            addCriterion("ThumbnailUrl60 <>", value, "thumbnailurl60");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl60GreaterThan(String value) {
            addCriterion("ThumbnailUrl60 >", value, "thumbnailurl60");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl60GreaterThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl60 >=", value, "thumbnailurl60");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl60LessThan(String value) {
            addCriterion("ThumbnailUrl60 <", value, "thumbnailurl60");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl60LessThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl60 <=", value, "thumbnailurl60");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl60Like(String value) {
            addCriterion("ThumbnailUrl60 like", value, "thumbnailurl60");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl60NotLike(String value) {
            addCriterion("ThumbnailUrl60 not like", value, "thumbnailurl60");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl60In(List<String> values) {
            addCriterion("ThumbnailUrl60 in", values, "thumbnailurl60");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl60NotIn(List<String> values) {
            addCriterion("ThumbnailUrl60 not in", values, "thumbnailurl60");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl60Between(String value1, String value2) {
            addCriterion("ThumbnailUrl60 between", value1, value2, "thumbnailurl60");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl60NotBetween(String value1, String value2) {
            addCriterion("ThumbnailUrl60 not between", value1, value2, "thumbnailurl60");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl100IsNull() {
            addCriterion("ThumbnailUrl100 is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl100IsNotNull() {
            addCriterion("ThumbnailUrl100 is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl100EqualTo(String value) {
            addCriterion("ThumbnailUrl100 =", value, "thumbnailurl100");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl100NotEqualTo(String value) {
            addCriterion("ThumbnailUrl100 <>", value, "thumbnailurl100");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl100GreaterThan(String value) {
            addCriterion("ThumbnailUrl100 >", value, "thumbnailurl100");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl100GreaterThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl100 >=", value, "thumbnailurl100");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl100LessThan(String value) {
            addCriterion("ThumbnailUrl100 <", value, "thumbnailurl100");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl100LessThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl100 <=", value, "thumbnailurl100");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl100Like(String value) {
            addCriterion("ThumbnailUrl100 like", value, "thumbnailurl100");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl100NotLike(String value) {
            addCriterion("ThumbnailUrl100 not like", value, "thumbnailurl100");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl100In(List<String> values) {
            addCriterion("ThumbnailUrl100 in", values, "thumbnailurl100");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl100NotIn(List<String> values) {
            addCriterion("ThumbnailUrl100 not in", values, "thumbnailurl100");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl100Between(String value1, String value2) {
            addCriterion("ThumbnailUrl100 between", value1, value2, "thumbnailurl100");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl100NotBetween(String value1, String value2) {
            addCriterion("ThumbnailUrl100 not between", value1, value2, "thumbnailurl100");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl160IsNull() {
            addCriterion("ThumbnailUrl160 is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl160IsNotNull() {
            addCriterion("ThumbnailUrl160 is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl160EqualTo(String value) {
            addCriterion("ThumbnailUrl160 =", value, "thumbnailurl160");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl160NotEqualTo(String value) {
            addCriterion("ThumbnailUrl160 <>", value, "thumbnailurl160");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl160GreaterThan(String value) {
            addCriterion("ThumbnailUrl160 >", value, "thumbnailurl160");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl160GreaterThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl160 >=", value, "thumbnailurl160");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl160LessThan(String value) {
            addCriterion("ThumbnailUrl160 <", value, "thumbnailurl160");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl160LessThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl160 <=", value, "thumbnailurl160");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl160Like(String value) {
            addCriterion("ThumbnailUrl160 like", value, "thumbnailurl160");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl160NotLike(String value) {
            addCriterion("ThumbnailUrl160 not like", value, "thumbnailurl160");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl160In(List<String> values) {
            addCriterion("ThumbnailUrl160 in", values, "thumbnailurl160");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl160NotIn(List<String> values) {
            addCriterion("ThumbnailUrl160 not in", values, "thumbnailurl160");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl160Between(String value1, String value2) {
            addCriterion("ThumbnailUrl160 between", value1, value2, "thumbnailurl160");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl160NotBetween(String value1, String value2) {
            addCriterion("ThumbnailUrl160 not between", value1, value2, "thumbnailurl160");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl180IsNull() {
            addCriterion("ThumbnailUrl180 is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl180IsNotNull() {
            addCriterion("ThumbnailUrl180 is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl180EqualTo(String value) {
            addCriterion("ThumbnailUrl180 =", value, "thumbnailurl180");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl180NotEqualTo(String value) {
            addCriterion("ThumbnailUrl180 <>", value, "thumbnailurl180");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl180GreaterThan(String value) {
            addCriterion("ThumbnailUrl180 >", value, "thumbnailurl180");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl180GreaterThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl180 >=", value, "thumbnailurl180");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl180LessThan(String value) {
            addCriterion("ThumbnailUrl180 <", value, "thumbnailurl180");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl180LessThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl180 <=", value, "thumbnailurl180");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl180Like(String value) {
            addCriterion("ThumbnailUrl180 like", value, "thumbnailurl180");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl180NotLike(String value) {
            addCriterion("ThumbnailUrl180 not like", value, "thumbnailurl180");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl180In(List<String> values) {
            addCriterion("ThumbnailUrl180 in", values, "thumbnailurl180");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl180NotIn(List<String> values) {
            addCriterion("ThumbnailUrl180 not in", values, "thumbnailurl180");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl180Between(String value1, String value2) {
            addCriterion("ThumbnailUrl180 between", value1, value2, "thumbnailurl180");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl180NotBetween(String value1, String value2) {
            addCriterion("ThumbnailUrl180 not between", value1, value2, "thumbnailurl180");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl220IsNull() {
            addCriterion("ThumbnailUrl220 is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl220IsNotNull() {
            addCriterion("ThumbnailUrl220 is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl220EqualTo(String value) {
            addCriterion("ThumbnailUrl220 =", value, "thumbnailurl220");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl220NotEqualTo(String value) {
            addCriterion("ThumbnailUrl220 <>", value, "thumbnailurl220");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl220GreaterThan(String value) {
            addCriterion("ThumbnailUrl220 >", value, "thumbnailurl220");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl220GreaterThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl220 >=", value, "thumbnailurl220");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl220LessThan(String value) {
            addCriterion("ThumbnailUrl220 <", value, "thumbnailurl220");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl220LessThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl220 <=", value, "thumbnailurl220");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl220Like(String value) {
            addCriterion("ThumbnailUrl220 like", value, "thumbnailurl220");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl220NotLike(String value) {
            addCriterion("ThumbnailUrl220 not like", value, "thumbnailurl220");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl220In(List<String> values) {
            addCriterion("ThumbnailUrl220 in", values, "thumbnailurl220");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl220NotIn(List<String> values) {
            addCriterion("ThumbnailUrl220 not in", values, "thumbnailurl220");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl220Between(String value1, String value2) {
            addCriterion("ThumbnailUrl220 between", value1, value2, "thumbnailurl220");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl220NotBetween(String value1, String value2) {
            addCriterion("ThumbnailUrl220 not between", value1, value2, "thumbnailurl220");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl310IsNull() {
            addCriterion("ThumbnailUrl310 is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl310IsNotNull() {
            addCriterion("ThumbnailUrl310 is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl310EqualTo(String value) {
            addCriterion("ThumbnailUrl310 =", value, "thumbnailurl310");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl310NotEqualTo(String value) {
            addCriterion("ThumbnailUrl310 <>", value, "thumbnailurl310");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl310GreaterThan(String value) {
            addCriterion("ThumbnailUrl310 >", value, "thumbnailurl310");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl310GreaterThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl310 >=", value, "thumbnailurl310");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl310LessThan(String value) {
            addCriterion("ThumbnailUrl310 <", value, "thumbnailurl310");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl310LessThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl310 <=", value, "thumbnailurl310");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl310Like(String value) {
            addCriterion("ThumbnailUrl310 like", value, "thumbnailurl310");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl310NotLike(String value) {
            addCriterion("ThumbnailUrl310 not like", value, "thumbnailurl310");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl310In(List<String> values) {
            addCriterion("ThumbnailUrl310 in", values, "thumbnailurl310");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl310NotIn(List<String> values) {
            addCriterion("ThumbnailUrl310 not in", values, "thumbnailurl310");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl310Between(String value1, String value2) {
            addCriterion("ThumbnailUrl310 between", value1, value2, "thumbnailurl310");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl310NotBetween(String value1, String value2) {
            addCriterion("ThumbnailUrl310 not between", value1, value2, "thumbnailurl310");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl410IsNull() {
            addCriterion("ThumbnailUrl410 is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl410IsNotNull() {
            addCriterion("ThumbnailUrl410 is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl410EqualTo(String value) {
            addCriterion("ThumbnailUrl410 =", value, "thumbnailurl410");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl410NotEqualTo(String value) {
            addCriterion("ThumbnailUrl410 <>", value, "thumbnailurl410");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl410GreaterThan(String value) {
            addCriterion("ThumbnailUrl410 >", value, "thumbnailurl410");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl410GreaterThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl410 >=", value, "thumbnailurl410");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl410LessThan(String value) {
            addCriterion("ThumbnailUrl410 <", value, "thumbnailurl410");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl410LessThanOrEqualTo(String value) {
            addCriterion("ThumbnailUrl410 <=", value, "thumbnailurl410");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl410Like(String value) {
            addCriterion("ThumbnailUrl410 like", value, "thumbnailurl410");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl410NotLike(String value) {
            addCriterion("ThumbnailUrl410 not like", value, "thumbnailurl410");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl410In(List<String> values) {
            addCriterion("ThumbnailUrl410 in", values, "thumbnailurl410");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl410NotIn(List<String> values) {
            addCriterion("ThumbnailUrl410 not in", values, "thumbnailurl410");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl410Between(String value1, String value2) {
            addCriterion("ThumbnailUrl410 between", value1, value2, "thumbnailurl410");
            return (Criteria) this;
        }

        public Criteria andThumbnailurl410NotBetween(String value1, String value2) {
            addCriterion("ThumbnailUrl410 not between", value1, value2, "thumbnailurl410");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNull() {
            addCriterion("MarketPrice is null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIsNotNull() {
            addCriterion("MarketPrice is not null");
            return (Criteria) this;
        }

        public Criteria andMarketpriceEqualTo(BigDecimal value) {
            addCriterion("MarketPrice =", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotEqualTo(BigDecimal value) {
            addCriterion("MarketPrice <>", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThan(BigDecimal value) {
            addCriterion("MarketPrice >", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MarketPrice >=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThan(BigDecimal value) {
            addCriterion("MarketPrice <", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MarketPrice <=", value, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceIn(List<BigDecimal> values) {
            addCriterion("MarketPrice in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotIn(List<BigDecimal> values) {
            addCriterion("MarketPrice not in", values, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MarketPrice between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andMarketpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MarketPrice not between", value1, value2, "marketprice");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNull() {
            addCriterion("BrandId is null");
            return (Criteria) this;
        }

        public Criteria andBrandidIsNotNull() {
            addCriterion("BrandId is not null");
            return (Criteria) this;
        }

        public Criteria andBrandidEqualTo(Integer value) {
            addCriterion("BrandId =", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotEqualTo(Integer value) {
            addCriterion("BrandId <>", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThan(Integer value) {
            addCriterion("BrandId >", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BrandId >=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThan(Integer value) {
            addCriterion("BrandId <", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidLessThanOrEqualTo(Integer value) {
            addCriterion("BrandId <=", value, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidIn(List<Integer> values) {
            addCriterion("BrandId in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotIn(List<Integer> values) {
            addCriterion("BrandId not in", values, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidBetween(Integer value1, Integer value2) {
            addCriterion("BrandId between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andBrandidNotBetween(Integer value1, Integer value2) {
            addCriterion("BrandId not between", value1, value2, "brandid");
            return (Criteria) this;
        }

        public Criteria andMaincategorypathIsNull() {
            addCriterion("MainCategoryPath is null");
            return (Criteria) this;
        }

        public Criteria andMaincategorypathIsNotNull() {
            addCriterion("MainCategoryPath is not null");
            return (Criteria) this;
        }

        public Criteria andMaincategorypathEqualTo(String value) {
            addCriterion("MainCategoryPath =", value, "maincategorypath");
            return (Criteria) this;
        }

        public Criteria andMaincategorypathNotEqualTo(String value) {
            addCriterion("MainCategoryPath <>", value, "maincategorypath");
            return (Criteria) this;
        }

        public Criteria andMaincategorypathGreaterThan(String value) {
            addCriterion("MainCategoryPath >", value, "maincategorypath");
            return (Criteria) this;
        }

        public Criteria andMaincategorypathGreaterThanOrEqualTo(String value) {
            addCriterion("MainCategoryPath >=", value, "maincategorypath");
            return (Criteria) this;
        }

        public Criteria andMaincategorypathLessThan(String value) {
            addCriterion("MainCategoryPath <", value, "maincategorypath");
            return (Criteria) this;
        }

        public Criteria andMaincategorypathLessThanOrEqualTo(String value) {
            addCriterion("MainCategoryPath <=", value, "maincategorypath");
            return (Criteria) this;
        }

        public Criteria andMaincategorypathLike(String value) {
            addCriterion("MainCategoryPath like", value, "maincategorypath");
            return (Criteria) this;
        }

        public Criteria andMaincategorypathNotLike(String value) {
            addCriterion("MainCategoryPath not like", value, "maincategorypath");
            return (Criteria) this;
        }

        public Criteria andMaincategorypathIn(List<String> values) {
            addCriterion("MainCategoryPath in", values, "maincategorypath");
            return (Criteria) this;
        }

        public Criteria andMaincategorypathNotIn(List<String> values) {
            addCriterion("MainCategoryPath not in", values, "maincategorypath");
            return (Criteria) this;
        }

        public Criteria andMaincategorypathBetween(String value1, String value2) {
            addCriterion("MainCategoryPath between", value1, value2, "maincategorypath");
            return (Criteria) this;
        }

        public Criteria andMaincategorypathNotBetween(String value1, String value2) {
            addCriterion("MainCategoryPath not between", value1, value2, "maincategorypath");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypathIsNull() {
            addCriterion("ExtendCategoryPath is null");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypathIsNotNull() {
            addCriterion("ExtendCategoryPath is not null");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypathEqualTo(String value) {
            addCriterion("ExtendCategoryPath =", value, "extendcategorypath");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypathNotEqualTo(String value) {
            addCriterion("ExtendCategoryPath <>", value, "extendcategorypath");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypathGreaterThan(String value) {
            addCriterion("ExtendCategoryPath >", value, "extendcategorypath");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypathGreaterThanOrEqualTo(String value) {
            addCriterion("ExtendCategoryPath >=", value, "extendcategorypath");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypathLessThan(String value) {
            addCriterion("ExtendCategoryPath <", value, "extendcategorypath");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypathLessThanOrEqualTo(String value) {
            addCriterion("ExtendCategoryPath <=", value, "extendcategorypath");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypathLike(String value) {
            addCriterion("ExtendCategoryPath like", value, "extendcategorypath");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypathNotLike(String value) {
            addCriterion("ExtendCategoryPath not like", value, "extendcategorypath");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypathIn(List<String> values) {
            addCriterion("ExtendCategoryPath in", values, "extendcategorypath");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypathNotIn(List<String> values) {
            addCriterion("ExtendCategoryPath not in", values, "extendcategorypath");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypathBetween(String value1, String value2) {
            addCriterion("ExtendCategoryPath between", value1, value2, "extendcategorypath");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypathNotBetween(String value1, String value2) {
            addCriterion("ExtendCategoryPath not between", value1, value2, "extendcategorypath");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath1IsNull() {
            addCriterion("ExtendCategoryPath1 is null");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath1IsNotNull() {
            addCriterion("ExtendCategoryPath1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath1EqualTo(String value) {
            addCriterion("ExtendCategoryPath1 =", value, "extendcategorypath1");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath1NotEqualTo(String value) {
            addCriterion("ExtendCategoryPath1 <>", value, "extendcategorypath1");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath1GreaterThan(String value) {
            addCriterion("ExtendCategoryPath1 >", value, "extendcategorypath1");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath1GreaterThanOrEqualTo(String value) {
            addCriterion("ExtendCategoryPath1 >=", value, "extendcategorypath1");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath1LessThan(String value) {
            addCriterion("ExtendCategoryPath1 <", value, "extendcategorypath1");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath1LessThanOrEqualTo(String value) {
            addCriterion("ExtendCategoryPath1 <=", value, "extendcategorypath1");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath1Like(String value) {
            addCriterion("ExtendCategoryPath1 like", value, "extendcategorypath1");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath1NotLike(String value) {
            addCriterion("ExtendCategoryPath1 not like", value, "extendcategorypath1");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath1In(List<String> values) {
            addCriterion("ExtendCategoryPath1 in", values, "extendcategorypath1");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath1NotIn(List<String> values) {
            addCriterion("ExtendCategoryPath1 not in", values, "extendcategorypath1");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath1Between(String value1, String value2) {
            addCriterion("ExtendCategoryPath1 between", value1, value2, "extendcategorypath1");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath1NotBetween(String value1, String value2) {
            addCriterion("ExtendCategoryPath1 not between", value1, value2, "extendcategorypath1");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath2IsNull() {
            addCriterion("ExtendCategoryPath2 is null");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath2IsNotNull() {
            addCriterion("ExtendCategoryPath2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath2EqualTo(String value) {
            addCriterion("ExtendCategoryPath2 =", value, "extendcategorypath2");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath2NotEqualTo(String value) {
            addCriterion("ExtendCategoryPath2 <>", value, "extendcategorypath2");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath2GreaterThan(String value) {
            addCriterion("ExtendCategoryPath2 >", value, "extendcategorypath2");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath2GreaterThanOrEqualTo(String value) {
            addCriterion("ExtendCategoryPath2 >=", value, "extendcategorypath2");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath2LessThan(String value) {
            addCriterion("ExtendCategoryPath2 <", value, "extendcategorypath2");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath2LessThanOrEqualTo(String value) {
            addCriterion("ExtendCategoryPath2 <=", value, "extendcategorypath2");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath2Like(String value) {
            addCriterion("ExtendCategoryPath2 like", value, "extendcategorypath2");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath2NotLike(String value) {
            addCriterion("ExtendCategoryPath2 not like", value, "extendcategorypath2");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath2In(List<String> values) {
            addCriterion("ExtendCategoryPath2 in", values, "extendcategorypath2");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath2NotIn(List<String> values) {
            addCriterion("ExtendCategoryPath2 not in", values, "extendcategorypath2");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath2Between(String value1, String value2) {
            addCriterion("ExtendCategoryPath2 between", value1, value2, "extendcategorypath2");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath2NotBetween(String value1, String value2) {
            addCriterion("ExtendCategoryPath2 not between", value1, value2, "extendcategorypath2");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath3IsNull() {
            addCriterion("ExtendCategoryPath3 is null");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath3IsNotNull() {
            addCriterion("ExtendCategoryPath3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath3EqualTo(String value) {
            addCriterion("ExtendCategoryPath3 =", value, "extendcategorypath3");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath3NotEqualTo(String value) {
            addCriterion("ExtendCategoryPath3 <>", value, "extendcategorypath3");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath3GreaterThan(String value) {
            addCriterion("ExtendCategoryPath3 >", value, "extendcategorypath3");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath3GreaterThanOrEqualTo(String value) {
            addCriterion("ExtendCategoryPath3 >=", value, "extendcategorypath3");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath3LessThan(String value) {
            addCriterion("ExtendCategoryPath3 <", value, "extendcategorypath3");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath3LessThanOrEqualTo(String value) {
            addCriterion("ExtendCategoryPath3 <=", value, "extendcategorypath3");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath3Like(String value) {
            addCriterion("ExtendCategoryPath3 like", value, "extendcategorypath3");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath3NotLike(String value) {
            addCriterion("ExtendCategoryPath3 not like", value, "extendcategorypath3");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath3In(List<String> values) {
            addCriterion("ExtendCategoryPath3 in", values, "extendcategorypath3");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath3NotIn(List<String> values) {
            addCriterion("ExtendCategoryPath3 not in", values, "extendcategorypath3");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath3Between(String value1, String value2) {
            addCriterion("ExtendCategoryPath3 between", value1, value2, "extendcategorypath3");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath3NotBetween(String value1, String value2) {
            addCriterion("ExtendCategoryPath3 not between", value1, value2, "extendcategorypath3");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath4IsNull() {
            addCriterion("ExtendCategoryPath4 is null");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath4IsNotNull() {
            addCriterion("ExtendCategoryPath4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath4EqualTo(String value) {
            addCriterion("ExtendCategoryPath4 =", value, "extendcategorypath4");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath4NotEqualTo(String value) {
            addCriterion("ExtendCategoryPath4 <>", value, "extendcategorypath4");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath4GreaterThan(String value) {
            addCriterion("ExtendCategoryPath4 >", value, "extendcategorypath4");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath4GreaterThanOrEqualTo(String value) {
            addCriterion("ExtendCategoryPath4 >=", value, "extendcategorypath4");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath4LessThan(String value) {
            addCriterion("ExtendCategoryPath4 <", value, "extendcategorypath4");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath4LessThanOrEqualTo(String value) {
            addCriterion("ExtendCategoryPath4 <=", value, "extendcategorypath4");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath4Like(String value) {
            addCriterion("ExtendCategoryPath4 like", value, "extendcategorypath4");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath4NotLike(String value) {
            addCriterion("ExtendCategoryPath4 not like", value, "extendcategorypath4");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath4In(List<String> values) {
            addCriterion("ExtendCategoryPath4 in", values, "extendcategorypath4");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath4NotIn(List<String> values) {
            addCriterion("ExtendCategoryPath4 not in", values, "extendcategorypath4");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath4Between(String value1, String value2) {
            addCriterion("ExtendCategoryPath4 between", value1, value2, "extendcategorypath4");
            return (Criteria) this;
        }

        public Criteria andExtendcategorypath4NotBetween(String value1, String value2) {
            addCriterion("ExtendCategoryPath4 not between", value1, value2, "extendcategorypath4");
            return (Criteria) this;
        }

        public Criteria andHasskuIsNull() {
            addCriterion("HasSKU is null");
            return (Criteria) this;
        }

        public Criteria andHasskuIsNotNull() {
            addCriterion("HasSKU is not null");
            return (Criteria) this;
        }

        public Criteria andHasskuEqualTo(Boolean value) {
            addCriterion("HasSKU =", value, "hassku");
            return (Criteria) this;
        }

        public Criteria andHasskuNotEqualTo(Boolean value) {
            addCriterion("HasSKU <>", value, "hassku");
            return (Criteria) this;
        }

        public Criteria andHasskuGreaterThan(Boolean value) {
            addCriterion("HasSKU >", value, "hassku");
            return (Criteria) this;
        }

        public Criteria andHasskuGreaterThanOrEqualTo(Boolean value) {
            addCriterion("HasSKU >=", value, "hassku");
            return (Criteria) this;
        }

        public Criteria andHasskuLessThan(Boolean value) {
            addCriterion("HasSKU <", value, "hassku");
            return (Criteria) this;
        }

        public Criteria andHasskuLessThanOrEqualTo(Boolean value) {
            addCriterion("HasSKU <=", value, "hassku");
            return (Criteria) this;
        }

        public Criteria andHasskuIn(List<Boolean> values) {
            addCriterion("HasSKU in", values, "hassku");
            return (Criteria) this;
        }

        public Criteria andHasskuNotIn(List<Boolean> values) {
            addCriterion("HasSKU not in", values, "hassku");
            return (Criteria) this;
        }

        public Criteria andHasskuBetween(Boolean value1, Boolean value2) {
            addCriterion("HasSKU between", value1, value2, "hassku");
            return (Criteria) this;
        }

        public Criteria andHasskuNotBetween(Boolean value1, Boolean value2) {
            addCriterion("HasSKU not between", value1, value2, "hassku");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingIsNull() {
            addCriterion("IsfreeShipping is null");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingIsNotNull() {
            addCriterion("IsfreeShipping is not null");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingEqualTo(Boolean value) {
            addCriterion("IsfreeShipping =", value, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingNotEqualTo(Boolean value) {
            addCriterion("IsfreeShipping <>", value, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingGreaterThan(Boolean value) {
            addCriterion("IsfreeShipping >", value, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsfreeShipping >=", value, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingLessThan(Boolean value) {
            addCriterion("IsfreeShipping <", value, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingLessThanOrEqualTo(Boolean value) {
            addCriterion("IsfreeShipping <=", value, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingIn(List<Boolean> values) {
            addCriterion("IsfreeShipping in", values, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingNotIn(List<Boolean> values) {
            addCriterion("IsfreeShipping not in", values, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingBetween(Boolean value1, Boolean value2) {
            addCriterion("IsfreeShipping between", value1, value2, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andIsfreeshippingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsfreeShipping not between", value1, value2, "isfreeshipping");
            return (Criteria) this;
        }

        public Criteria andTaobaoproductidIsNull() {
            addCriterion("TaobaoProductId is null");
            return (Criteria) this;
        }

        public Criteria andTaobaoproductidIsNotNull() {
            addCriterion("TaobaoProductId is not null");
            return (Criteria) this;
        }

        public Criteria andTaobaoproductidEqualTo(Long value) {
            addCriterion("TaobaoProductId =", value, "taobaoproductid");
            return (Criteria) this;
        }

        public Criteria andTaobaoproductidNotEqualTo(Long value) {
            addCriterion("TaobaoProductId <>", value, "taobaoproductid");
            return (Criteria) this;
        }

        public Criteria andTaobaoproductidGreaterThan(Long value) {
            addCriterion("TaobaoProductId >", value, "taobaoproductid");
            return (Criteria) this;
        }

        public Criteria andTaobaoproductidGreaterThanOrEqualTo(Long value) {
            addCriterion("TaobaoProductId >=", value, "taobaoproductid");
            return (Criteria) this;
        }

        public Criteria andTaobaoproductidLessThan(Long value) {
            addCriterion("TaobaoProductId <", value, "taobaoproductid");
            return (Criteria) this;
        }

        public Criteria andTaobaoproductidLessThanOrEqualTo(Long value) {
            addCriterion("TaobaoProductId <=", value, "taobaoproductid");
            return (Criteria) this;
        }

        public Criteria andTaobaoproductidIn(List<Long> values) {
            addCriterion("TaobaoProductId in", values, "taobaoproductid");
            return (Criteria) this;
        }

        public Criteria andTaobaoproductidNotIn(List<Long> values) {
            addCriterion("TaobaoProductId not in", values, "taobaoproductid");
            return (Criteria) this;
        }

        public Criteria andTaobaoproductidBetween(Long value1, Long value2) {
            addCriterion("TaobaoProductId between", value1, value2, "taobaoproductid");
            return (Criteria) this;
        }

        public Criteria andTaobaoproductidNotBetween(Long value1, Long value2) {
            addCriterion("TaobaoProductId not between", value1, value2, "taobaoproductid");
            return (Criteria) this;
        }

        public Criteria andReferraldeductIsNull() {
            addCriterion("ReferralDeduct is null");
            return (Criteria) this;
        }

        public Criteria andReferraldeductIsNotNull() {
            addCriterion("ReferralDeduct is not null");
            return (Criteria) this;
        }

        public Criteria andReferraldeductEqualTo(BigDecimal value) {
            addCriterion("ReferralDeduct =", value, "referraldeduct");
            return (Criteria) this;
        }

        public Criteria andReferraldeductNotEqualTo(BigDecimal value) {
            addCriterion("ReferralDeduct <>", value, "referraldeduct");
            return (Criteria) this;
        }

        public Criteria andReferraldeductGreaterThan(BigDecimal value) {
            addCriterion("ReferralDeduct >", value, "referraldeduct");
            return (Criteria) this;
        }

        public Criteria andReferraldeductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ReferralDeduct >=", value, "referraldeduct");
            return (Criteria) this;
        }

        public Criteria andReferraldeductLessThan(BigDecimal value) {
            addCriterion("ReferralDeduct <", value, "referraldeduct");
            return (Criteria) this;
        }

        public Criteria andReferraldeductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ReferralDeduct <=", value, "referraldeduct");
            return (Criteria) this;
        }

        public Criteria andReferraldeductIn(List<BigDecimal> values) {
            addCriterion("ReferralDeduct in", values, "referraldeduct");
            return (Criteria) this;
        }

        public Criteria andReferraldeductNotIn(List<BigDecimal> values) {
            addCriterion("ReferralDeduct not in", values, "referraldeduct");
            return (Criteria) this;
        }

        public Criteria andReferraldeductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReferralDeduct between", value1, value2, "referraldeduct");
            return (Criteria) this;
        }

        public Criteria andReferraldeductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ReferralDeduct not between", value1, value2, "referraldeduct");
            return (Criteria) this;
        }

        public Criteria andSubmemberdeductIsNull() {
            addCriterion("SubMemberDeduct is null");
            return (Criteria) this;
        }

        public Criteria andSubmemberdeductIsNotNull() {
            addCriterion("SubMemberDeduct is not null");
            return (Criteria) this;
        }

        public Criteria andSubmemberdeductEqualTo(BigDecimal value) {
            addCriterion("SubMemberDeduct =", value, "submemberdeduct");
            return (Criteria) this;
        }

        public Criteria andSubmemberdeductNotEqualTo(BigDecimal value) {
            addCriterion("SubMemberDeduct <>", value, "submemberdeduct");
            return (Criteria) this;
        }

        public Criteria andSubmemberdeductGreaterThan(BigDecimal value) {
            addCriterion("SubMemberDeduct >", value, "submemberdeduct");
            return (Criteria) this;
        }

        public Criteria andSubmemberdeductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SubMemberDeduct >=", value, "submemberdeduct");
            return (Criteria) this;
        }

        public Criteria andSubmemberdeductLessThan(BigDecimal value) {
            addCriterion("SubMemberDeduct <", value, "submemberdeduct");
            return (Criteria) this;
        }

        public Criteria andSubmemberdeductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SubMemberDeduct <=", value, "submemberdeduct");
            return (Criteria) this;
        }

        public Criteria andSubmemberdeductIn(List<BigDecimal> values) {
            addCriterion("SubMemberDeduct in", values, "submemberdeduct");
            return (Criteria) this;
        }

        public Criteria andSubmemberdeductNotIn(List<BigDecimal> values) {
            addCriterion("SubMemberDeduct not in", values, "submemberdeduct");
            return (Criteria) this;
        }

        public Criteria andSubmemberdeductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SubMemberDeduct between", value1, value2, "submemberdeduct");
            return (Criteria) this;
        }

        public Criteria andSubmemberdeductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SubMemberDeduct not between", value1, value2, "submemberdeduct");
            return (Criteria) this;
        }

        public Criteria andSubreferraldeductIsNull() {
            addCriterion("SubReferralDeduct is null");
            return (Criteria) this;
        }

        public Criteria andSubreferraldeductIsNotNull() {
            addCriterion("SubReferralDeduct is not null");
            return (Criteria) this;
        }

        public Criteria andSubreferraldeductEqualTo(BigDecimal value) {
            addCriterion("SubReferralDeduct =", value, "subreferraldeduct");
            return (Criteria) this;
        }

        public Criteria andSubreferraldeductNotEqualTo(BigDecimal value) {
            addCriterion("SubReferralDeduct <>", value, "subreferraldeduct");
            return (Criteria) this;
        }

        public Criteria andSubreferraldeductGreaterThan(BigDecimal value) {
            addCriterion("SubReferralDeduct >", value, "subreferraldeduct");
            return (Criteria) this;
        }

        public Criteria andSubreferraldeductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SubReferralDeduct >=", value, "subreferraldeduct");
            return (Criteria) this;
        }

        public Criteria andSubreferraldeductLessThan(BigDecimal value) {
            addCriterion("SubReferralDeduct <", value, "subreferraldeduct");
            return (Criteria) this;
        }

        public Criteria andSubreferraldeductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SubReferralDeduct <=", value, "subreferraldeduct");
            return (Criteria) this;
        }

        public Criteria andSubreferraldeductIn(List<BigDecimal> values) {
            addCriterion("SubReferralDeduct in", values, "subreferraldeduct");
            return (Criteria) this;
        }

        public Criteria andSubreferraldeductNotIn(List<BigDecimal> values) {
            addCriterion("SubReferralDeduct not in", values, "subreferraldeduct");
            return (Criteria) this;
        }

        public Criteria andSubreferraldeductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SubReferralDeduct between", value1, value2, "subreferraldeduct");
            return (Criteria) this;
        }

        public Criteria andSubreferraldeductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SubReferralDeduct not between", value1, value2, "subreferraldeduct");
            return (Criteria) this;
        }

        public Criteria andShippingtemplateidIsNull() {
            addCriterion("ShippingTemplateId is null");
            return (Criteria) this;
        }

        public Criteria andShippingtemplateidIsNotNull() {
            addCriterion("ShippingTemplateId is not null");
            return (Criteria) this;
        }

        public Criteria andShippingtemplateidEqualTo(Integer value) {
            addCriterion("ShippingTemplateId =", value, "shippingtemplateid");
            return (Criteria) this;
        }

        public Criteria andShippingtemplateidNotEqualTo(Integer value) {
            addCriterion("ShippingTemplateId <>", value, "shippingtemplateid");
            return (Criteria) this;
        }

        public Criteria andShippingtemplateidGreaterThan(Integer value) {
            addCriterion("ShippingTemplateId >", value, "shippingtemplateid");
            return (Criteria) this;
        }

        public Criteria andShippingtemplateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShippingTemplateId >=", value, "shippingtemplateid");
            return (Criteria) this;
        }

        public Criteria andShippingtemplateidLessThan(Integer value) {
            addCriterion("ShippingTemplateId <", value, "shippingtemplateid");
            return (Criteria) this;
        }

        public Criteria andShippingtemplateidLessThanOrEqualTo(Integer value) {
            addCriterion("ShippingTemplateId <=", value, "shippingtemplateid");
            return (Criteria) this;
        }

        public Criteria andShippingtemplateidIn(List<Integer> values) {
            addCriterion("ShippingTemplateId in", values, "shippingtemplateid");
            return (Criteria) this;
        }

        public Criteria andShippingtemplateidNotIn(List<Integer> values) {
            addCriterion("ShippingTemplateId not in", values, "shippingtemplateid");
            return (Criteria) this;
        }

        public Criteria andShippingtemplateidBetween(Integer value1, Integer value2) {
            addCriterion("ShippingTemplateId between", value1, value2, "shippingtemplateid");
            return (Criteria) this;
        }

        public Criteria andShippingtemplateidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShippingTemplateId not between", value1, value2, "shippingtemplateid");
            return (Criteria) this;
        }

        public Criteria andSecondleveldeductIsNull() {
            addCriterion("SecondLevelDeduct is null");
            return (Criteria) this;
        }

        public Criteria andSecondleveldeductIsNotNull() {
            addCriterion("SecondLevelDeduct is not null");
            return (Criteria) this;
        }

        public Criteria andSecondleveldeductEqualTo(BigDecimal value) {
            addCriterion("SecondLevelDeduct =", value, "secondleveldeduct");
            return (Criteria) this;
        }

        public Criteria andSecondleveldeductNotEqualTo(BigDecimal value) {
            addCriterion("SecondLevelDeduct <>", value, "secondleveldeduct");
            return (Criteria) this;
        }

        public Criteria andSecondleveldeductGreaterThan(BigDecimal value) {
            addCriterion("SecondLevelDeduct >", value, "secondleveldeduct");
            return (Criteria) this;
        }

        public Criteria andSecondleveldeductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SecondLevelDeduct >=", value, "secondleveldeduct");
            return (Criteria) this;
        }

        public Criteria andSecondleveldeductLessThan(BigDecimal value) {
            addCriterion("SecondLevelDeduct <", value, "secondleveldeduct");
            return (Criteria) this;
        }

        public Criteria andSecondleveldeductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SecondLevelDeduct <=", value, "secondleveldeduct");
            return (Criteria) this;
        }

        public Criteria andSecondleveldeductIn(List<BigDecimal> values) {
            addCriterion("SecondLevelDeduct in", values, "secondleveldeduct");
            return (Criteria) this;
        }

        public Criteria andSecondleveldeductNotIn(List<BigDecimal> values) {
            addCriterion("SecondLevelDeduct not in", values, "secondleveldeduct");
            return (Criteria) this;
        }

        public Criteria andSecondleveldeductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SecondLevelDeduct between", value1, value2, "secondleveldeduct");
            return (Criteria) this;
        }

        public Criteria andSecondleveldeductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SecondLevelDeduct not between", value1, value2, "secondleveldeduct");
            return (Criteria) this;
        }

        public Criteria andThreeleveldeductIsNull() {
            addCriterion("ThreeLevelDeduct is null");
            return (Criteria) this;
        }

        public Criteria andThreeleveldeductIsNotNull() {
            addCriterion("ThreeLevelDeduct is not null");
            return (Criteria) this;
        }

        public Criteria andThreeleveldeductEqualTo(BigDecimal value) {
            addCriterion("ThreeLevelDeduct =", value, "threeleveldeduct");
            return (Criteria) this;
        }

        public Criteria andThreeleveldeductNotEqualTo(BigDecimal value) {
            addCriterion("ThreeLevelDeduct <>", value, "threeleveldeduct");
            return (Criteria) this;
        }

        public Criteria andThreeleveldeductGreaterThan(BigDecimal value) {
            addCriterion("ThreeLevelDeduct >", value, "threeleveldeduct");
            return (Criteria) this;
        }

        public Criteria andThreeleveldeductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ThreeLevelDeduct >=", value, "threeleveldeduct");
            return (Criteria) this;
        }

        public Criteria andThreeleveldeductLessThan(BigDecimal value) {
            addCriterion("ThreeLevelDeduct <", value, "threeleveldeduct");
            return (Criteria) this;
        }

        public Criteria andThreeleveldeductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ThreeLevelDeduct <=", value, "threeleveldeduct");
            return (Criteria) this;
        }

        public Criteria andThreeleveldeductIn(List<BigDecimal> values) {
            addCriterion("ThreeLevelDeduct in", values, "threeleveldeduct");
            return (Criteria) this;
        }

        public Criteria andThreeleveldeductNotIn(List<BigDecimal> values) {
            addCriterion("ThreeLevelDeduct not in", values, "threeleveldeduct");
            return (Criteria) this;
        }

        public Criteria andThreeleveldeductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ThreeLevelDeduct between", value1, value2, "threeleveldeduct");
            return (Criteria) this;
        }

        public Criteria andThreeleveldeductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ThreeLevelDeduct not between", value1, value2, "threeleveldeduct");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNull() {
            addCriterion("SupplierId is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("SupplierId is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(Integer value) {
            addCriterion("SupplierId =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(Integer value) {
            addCriterion("SupplierId <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(Integer value) {
            addCriterion("SupplierId >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(Integer value) {
            addCriterion("SupplierId >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(Integer value) {
            addCriterion("SupplierId <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(Integer value) {
            addCriterion("SupplierId <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<Integer> values) {
            addCriterion("SupplierId in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<Integer> values) {
            addCriterion("SupplierId not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(Integer value1, Integer value2) {
            addCriterion("SupplierId between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(Integer value1, Integer value2) {
            addCriterion("SupplierId not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNull() {
            addCriterion("AuditStatus is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNotNull() {
            addCriterion("AuditStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusEqualTo(Byte value) {
            addCriterion("AuditStatus =", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotEqualTo(Byte value) {
            addCriterion("AuditStatus <>", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThan(Byte value) {
            addCriterion("AuditStatus >", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("AuditStatus >=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThan(Byte value) {
            addCriterion("AuditStatus <", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThanOrEqualTo(Byte value) {
            addCriterion("AuditStatus <=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIn(List<Byte> values) {
            addCriterion("AuditStatus in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotIn(List<Byte> values) {
            addCriterion("AuditStatus not in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusBetween(Byte value1, Byte value2) {
            addCriterion("AuditStatus between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("AuditStatus not between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditresonIsNull() {
            addCriterion("AuditReson is null");
            return (Criteria) this;
        }

        public Criteria andAuditresonIsNotNull() {
            addCriterion("AuditReson is not null");
            return (Criteria) this;
        }

        public Criteria andAuditresonEqualTo(String value) {
            addCriterion("AuditReson =", value, "auditreson");
            return (Criteria) this;
        }

        public Criteria andAuditresonNotEqualTo(String value) {
            addCriterion("AuditReson <>", value, "auditreson");
            return (Criteria) this;
        }

        public Criteria andAuditresonGreaterThan(String value) {
            addCriterion("AuditReson >", value, "auditreson");
            return (Criteria) this;
        }

        public Criteria andAuditresonGreaterThanOrEqualTo(String value) {
            addCriterion("AuditReson >=", value, "auditreson");
            return (Criteria) this;
        }

        public Criteria andAuditresonLessThan(String value) {
            addCriterion("AuditReson <", value, "auditreson");
            return (Criteria) this;
        }

        public Criteria andAuditresonLessThanOrEqualTo(String value) {
            addCriterion("AuditReson <=", value, "auditreson");
            return (Criteria) this;
        }

        public Criteria andAuditresonLike(String value) {
            addCriterion("AuditReson like", value, "auditreson");
            return (Criteria) this;
        }

        public Criteria andAuditresonNotLike(String value) {
            addCriterion("AuditReson not like", value, "auditreson");
            return (Criteria) this;
        }

        public Criteria andAuditresonIn(List<String> values) {
            addCriterion("AuditReson in", values, "auditreson");
            return (Criteria) this;
        }

        public Criteria andAuditresonNotIn(List<String> values) {
            addCriterion("AuditReson not in", values, "auditreson");
            return (Criteria) this;
        }

        public Criteria andAuditresonBetween(String value1, String value2) {
            addCriterion("AuditReson between", value1, value2, "auditreson");
            return (Criteria) this;
        }

        public Criteria andAuditresonNotBetween(String value1, String value2) {
            addCriterion("AuditReson not between", value1, value2, "auditreson");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("Volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("Volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(BigDecimal value) {
            addCriterion("Volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(BigDecimal value) {
            addCriterion("Volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(BigDecimal value) {
            addCriterion("Volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(BigDecimal value) {
            addCriterion("Volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<BigDecimal> values) {
            addCriterion("Volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<BigDecimal> values) {
            addCriterion("Volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNull() {
            addCriterion("TenantID is null");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNotNull() {
            addCriterion("TenantID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantidEqualTo(Integer value) {
            addCriterion("TenantID =", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotEqualTo(Integer value) {
            addCriterion("TenantID <>", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThan(Integer value) {
            addCriterion("TenantID >", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TenantID >=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThan(Integer value) {
            addCriterion("TenantID <", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThanOrEqualTo(Integer value) {
            addCriterion("TenantID <=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidIn(List<Integer> values) {
            addCriterion("TenantID in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotIn(List<Integer> values) {
            addCriterion("TenantID not in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidBetween(Integer value1, Integer value2) {
            addCriterion("TenantID between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotBetween(Integer value1, Integer value2) {
            addCriterion("TenantID not between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andGuidIsNull() {
            addCriterion("guid is null");
            return (Criteria) this;
        }

        public Criteria andGuidIsNotNull() {
            addCriterion("guid is not null");
            return (Criteria) this;
        }

        public Criteria andGuidEqualTo(String value) {
            addCriterion("guid =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotEqualTo(String value) {
            addCriterion("guid <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThan(String value) {
            addCriterion("guid >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThanOrEqualTo(String value) {
            addCriterion("guid >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThan(String value) {
            addCriterion("guid <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThanOrEqualTo(String value) {
            addCriterion("guid <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLike(String value) {
            addCriterion("guid like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotLike(String value) {
            addCriterion("guid not like", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidIn(List<String> values) {
            addCriterion("guid in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotIn(List<String> values) {
            addCriterion("guid not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidBetween(String value1, String value2) {
            addCriterion("guid between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotBetween(String value1, String value2) {
            addCriterion("guid not between", value1, value2, "guid");
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