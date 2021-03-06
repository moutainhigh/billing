package com.ai.baas.abm.dao.mapper.bo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class AmcResBookCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public AmcResBookCriteria() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andBookIdIsNull() {
            addCriterion("BOOK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("BOOK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Long value) {
            addCriterion("BOOK_ID =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Long value) {
            addCriterion("BOOK_ID <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Long value) {
            addCriterion("BOOK_ID >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BOOK_ID >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Long value) {
            addCriterion("BOOK_ID <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Long value) {
            addCriterion("BOOK_ID <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Long> values) {
            addCriterion("BOOK_ID in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Long> values) {
            addCriterion("BOOK_ID not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Long value1, Long value2) {
            addCriterion("BOOK_ID between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Long value1, Long value2) {
            addCriterion("BOOK_ID not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("TENANT_ID like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNull() {
            addCriterion("OWNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("OWNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(Long value) {
            addCriterion("OWNER_ID =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(Long value) {
            addCriterion("OWNER_ID <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(Long value) {
            addCriterion("OWNER_ID >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OWNER_ID >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(Long value) {
            addCriterion("OWNER_ID <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(Long value) {
            addCriterion("OWNER_ID <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<Long> values) {
            addCriterion("OWNER_ID in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<Long> values) {
            addCriterion("OWNER_ID not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(Long value1, Long value2) {
            addCriterion("OWNER_ID between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(Long value1, Long value2) {
            addCriterion("OWNER_ID not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIsNull() {
            addCriterion("OWNER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIsNotNull() {
            addCriterion("OWNER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeEqualTo(Integer value) {
            addCriterion("OWNER_TYPE =", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotEqualTo(Integer value) {
            addCriterion("OWNER_TYPE <>", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeGreaterThan(Integer value) {
            addCriterion("OWNER_TYPE >", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OWNER_TYPE >=", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLessThan(Integer value) {
            addCriterion("OWNER_TYPE <", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("OWNER_TYPE <=", value, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIn(List<Integer> values) {
            addCriterion("OWNER_TYPE in", values, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotIn(List<Integer> values) {
            addCriterion("OWNER_TYPE not in", values, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeBetween(Integer value1, Integer value2) {
            addCriterion("OWNER_TYPE between", value1, value2, "ownerType");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("OWNER_TYPE not between", value1, value2, "ownerType");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("SUBJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("SUBJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(String value) {
            addCriterion("SUBJECT_ID =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(String value) {
            addCriterion("SUBJECT_ID <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(String value) {
            addCriterion("SUBJECT_ID >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT_ID >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(String value) {
            addCriterion("SUBJECT_ID <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT_ID <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLike(String value) {
            addCriterion("SUBJECT_ID like", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotLike(String value) {
            addCriterion("SUBJECT_ID not like", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<String> values) {
            addCriterion("SUBJECT_ID in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<String> values) {
            addCriterion("SUBJECT_ID not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(String value1, String value2) {
            addCriterion("SUBJECT_ID between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(String value1, String value2) {
            addCriterion("SUBJECT_ID not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("GOODS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("GOODS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("GOODS_TYPE =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("GOODS_TYPE <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("GOODS_TYPE >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_TYPE >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("GOODS_TYPE <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("GOODS_TYPE <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("GOODS_TYPE like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("GOODS_TYPE not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("GOODS_TYPE in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("GOODS_TYPE not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("GOODS_TYPE between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("GOODS_TYPE not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNull() {
            addCriterion("RESOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("RESOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeEqualTo(Integer value) {
            addCriterion("RESOURCE_TYPE =", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotEqualTo(Integer value) {
            addCriterion("RESOURCE_TYPE <>", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThan(Integer value) {
            addCriterion("RESOURCE_TYPE >", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESOURCE_TYPE >=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThan(Integer value) {
            addCriterion("RESOURCE_TYPE <", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("RESOURCE_TYPE <=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIn(List<Integer> values) {
            addCriterion("RESOURCE_TYPE in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotIn(List<Integer> values) {
            addCriterion("RESOURCE_TYPE not in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("RESOURCE_TYPE between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("RESOURCE_TYPE not between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeIsNull() {
            addCriterion("EFFECT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEffectTimeIsNotNull() {
            addCriterion("EFFECT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEffectTimeEqualTo(Timestamp value) {
            addCriterion("EFFECT_TIME =", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeNotEqualTo(Timestamp value) {
            addCriterion("EFFECT_TIME <>", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeGreaterThan(Timestamp value) {
            addCriterion("EFFECT_TIME >", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("EFFECT_TIME >=", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeLessThan(Timestamp value) {
            addCriterion("EFFECT_TIME <", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("EFFECT_TIME <=", value, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeIn(List<Timestamp> values) {
            addCriterion("EFFECT_TIME in", values, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeNotIn(List<Timestamp> values) {
            addCriterion("EFFECT_TIME not in", values, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("EFFECT_TIME between", value1, value2, "effectTime");
            return (Criteria) this;
        }

        public Criteria andEffectTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("EFFECT_TIME not between", value1, value2, "effectTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("EXPIRE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("EXPIRE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Timestamp value) {
            addCriterion("EXPIRE_TIME =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Timestamp value) {
            addCriterion("EXPIRE_TIME <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Timestamp value) {
            addCriterion("EXPIRE_TIME >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("EXPIRE_TIME >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Timestamp value) {
            addCriterion("EXPIRE_TIME <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("EXPIRE_TIME <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Timestamp> values) {
            addCriterion("EXPIRE_TIME in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Timestamp> values) {
            addCriterion("EXPIRE_TIME not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("EXPIRE_TIME between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("EXPIRE_TIME not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("TOTAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("TOTAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMOUNT <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("TOTAL_AMOUNT in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_AMOUNT not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_AMOUNT between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_AMOUNT not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andDeductAmountIsNull() {
            addCriterion("DEDUCT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDeductAmountIsNotNull() {
            addCriterion("DEDUCT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDeductAmountEqualTo(BigDecimal value) {
            addCriterion("DEDUCT_AMOUNT =", value, "deductAmount");
            return (Criteria) this;
        }

        public Criteria andDeductAmountNotEqualTo(BigDecimal value) {
            addCriterion("DEDUCT_AMOUNT <>", value, "deductAmount");
            return (Criteria) this;
        }

        public Criteria andDeductAmountGreaterThan(BigDecimal value) {
            addCriterion("DEDUCT_AMOUNT >", value, "deductAmount");
            return (Criteria) this;
        }

        public Criteria andDeductAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEDUCT_AMOUNT >=", value, "deductAmount");
            return (Criteria) this;
        }

        public Criteria andDeductAmountLessThan(BigDecimal value) {
            addCriterion("DEDUCT_AMOUNT <", value, "deductAmount");
            return (Criteria) this;
        }

        public Criteria andDeductAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEDUCT_AMOUNT <=", value, "deductAmount");
            return (Criteria) this;
        }

        public Criteria andDeductAmountIn(List<BigDecimal> values) {
            addCriterion("DEDUCT_AMOUNT in", values, "deductAmount");
            return (Criteria) this;
        }

        public Criteria andDeductAmountNotIn(List<BigDecimal> values) {
            addCriterion("DEDUCT_AMOUNT not in", values, "deductAmount");
            return (Criteria) this;
        }

        public Criteria andDeductAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEDUCT_AMOUNT between", value1, value2, "deductAmount");
            return (Criteria) this;
        }

        public Criteria andDeductAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEDUCT_AMOUNT not between", value1, value2, "deductAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountIsNull() {
            addCriterion("PRESENT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPresentAmountIsNotNull() {
            addCriterion("PRESENT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPresentAmountEqualTo(BigDecimal value) {
            addCriterion("PRESENT_AMOUNT =", value, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountNotEqualTo(BigDecimal value) {
            addCriterion("PRESENT_AMOUNT <>", value, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountGreaterThan(BigDecimal value) {
            addCriterion("PRESENT_AMOUNT >", value, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRESENT_AMOUNT >=", value, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountLessThan(BigDecimal value) {
            addCriterion("PRESENT_AMOUNT <", value, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRESENT_AMOUNT <=", value, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountIn(List<BigDecimal> values) {
            addCriterion("PRESENT_AMOUNT in", values, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountNotIn(List<BigDecimal> values) {
            addCriterion("PRESENT_AMOUNT not in", values, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRESENT_AMOUNT between", value1, value2, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andPresentAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRESENT_AMOUNT not between", value1, value2, "presentAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountIsNull() {
            addCriterion("EXCHANGE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountIsNotNull() {
            addCriterion("EXCHANGE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_AMOUNT =", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNotEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_AMOUNT <>", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountGreaterThan(BigDecimal value) {
            addCriterion("EXCHANGE_AMOUNT >", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_AMOUNT >=", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountLessThan(BigDecimal value) {
            addCriterion("EXCHANGE_AMOUNT <", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHANGE_AMOUNT <=", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountIn(List<BigDecimal> values) {
            addCriterion("EXCHANGE_AMOUNT in", values, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNotIn(List<BigDecimal> values) {
            addCriterion("EXCHANGE_AMOUNT not in", values, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGE_AMOUNT between", value1, value2, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHANGE_AMOUNT not between", value1, value2, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andBookStatusIsNull() {
            addCriterion("BOOK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andBookStatusIsNotNull() {
            addCriterion("BOOK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBookStatusEqualTo(String value) {
            addCriterion("BOOK_STATUS =", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusNotEqualTo(String value) {
            addCriterion("BOOK_STATUS <>", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusGreaterThan(String value) {
            addCriterion("BOOK_STATUS >", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BOOK_STATUS >=", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusLessThan(String value) {
            addCriterion("BOOK_STATUS <", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusLessThanOrEqualTo(String value) {
            addCriterion("BOOK_STATUS <=", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusLike(String value) {
            addCriterion("BOOK_STATUS like", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusNotLike(String value) {
            addCriterion("BOOK_STATUS not like", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusIn(List<String> values) {
            addCriterion("BOOK_STATUS in", values, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusNotIn(List<String> values) {
            addCriterion("BOOK_STATUS not in", values, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusBetween(String value1, String value2) {
            addCriterion("BOOK_STATUS between", value1, value2, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusNotBetween(String value1, String value2) {
            addCriterion("BOOK_STATUS not between", value1, value2, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andAllowPresentIsNull() {
            addCriterion("ALLOW_PRESENT is null");
            return (Criteria) this;
        }

        public Criteria andAllowPresentIsNotNull() {
            addCriterion("ALLOW_PRESENT is not null");
            return (Criteria) this;
        }

        public Criteria andAllowPresentEqualTo(Integer value) {
            addCriterion("ALLOW_PRESENT =", value, "allowPresent");
            return (Criteria) this;
        }

        public Criteria andAllowPresentNotEqualTo(Integer value) {
            addCriterion("ALLOW_PRESENT <>", value, "allowPresent");
            return (Criteria) this;
        }

        public Criteria andAllowPresentGreaterThan(Integer value) {
            addCriterion("ALLOW_PRESENT >", value, "allowPresent");
            return (Criteria) this;
        }

        public Criteria andAllowPresentGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALLOW_PRESENT >=", value, "allowPresent");
            return (Criteria) this;
        }

        public Criteria andAllowPresentLessThan(Integer value) {
            addCriterion("ALLOW_PRESENT <", value, "allowPresent");
            return (Criteria) this;
        }

        public Criteria andAllowPresentLessThanOrEqualTo(Integer value) {
            addCriterion("ALLOW_PRESENT <=", value, "allowPresent");
            return (Criteria) this;
        }

        public Criteria andAllowPresentIn(List<Integer> values) {
            addCriterion("ALLOW_PRESENT in", values, "allowPresent");
            return (Criteria) this;
        }

        public Criteria andAllowPresentNotIn(List<Integer> values) {
            addCriterion("ALLOW_PRESENT not in", values, "allowPresent");
            return (Criteria) this;
        }

        public Criteria andAllowPresentBetween(Integer value1, Integer value2) {
            addCriterion("ALLOW_PRESENT between", value1, value2, "allowPresent");
            return (Criteria) this;
        }

        public Criteria andAllowPresentNotBetween(Integer value1, Integer value2) {
            addCriterion("ALLOW_PRESENT not between", value1, value2, "allowPresent");
            return (Criteria) this;
        }

        public Criteria andAllowConvertIsNull() {
            addCriterion("ALLOW_CONVERT is null");
            return (Criteria) this;
        }

        public Criteria andAllowConvertIsNotNull() {
            addCriterion("ALLOW_CONVERT is not null");
            return (Criteria) this;
        }

        public Criteria andAllowConvertEqualTo(Integer value) {
            addCriterion("ALLOW_CONVERT =", value, "allowConvert");
            return (Criteria) this;
        }

        public Criteria andAllowConvertNotEqualTo(Integer value) {
            addCriterion("ALLOW_CONVERT <>", value, "allowConvert");
            return (Criteria) this;
        }

        public Criteria andAllowConvertGreaterThan(Integer value) {
            addCriterion("ALLOW_CONVERT >", value, "allowConvert");
            return (Criteria) this;
        }

        public Criteria andAllowConvertGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALLOW_CONVERT >=", value, "allowConvert");
            return (Criteria) this;
        }

        public Criteria andAllowConvertLessThan(Integer value) {
            addCriterion("ALLOW_CONVERT <", value, "allowConvert");
            return (Criteria) this;
        }

        public Criteria andAllowConvertLessThanOrEqualTo(Integer value) {
            addCriterion("ALLOW_CONVERT <=", value, "allowConvert");
            return (Criteria) this;
        }

        public Criteria andAllowConvertIn(List<Integer> values) {
            addCriterion("ALLOW_CONVERT in", values, "allowConvert");
            return (Criteria) this;
        }

        public Criteria andAllowConvertNotIn(List<Integer> values) {
            addCriterion("ALLOW_CONVERT not in", values, "allowConvert");
            return (Criteria) this;
        }

        public Criteria andAllowConvertBetween(Integer value1, Integer value2) {
            addCriterion("ALLOW_CONVERT between", value1, value2, "allowConvert");
            return (Criteria) this;
        }

        public Criteria andAllowConvertNotBetween(Integer value1, Integer value2) {
            addCriterion("ALLOW_CONVERT not between", value1, value2, "allowConvert");
            return (Criteria) this;
        }

        public Criteria andAllowClearIsNull() {
            addCriterion("ALLOW_CLEAR is null");
            return (Criteria) this;
        }

        public Criteria andAllowClearIsNotNull() {
            addCriterion("ALLOW_CLEAR is not null");
            return (Criteria) this;
        }

        public Criteria andAllowClearEqualTo(Integer value) {
            addCriterion("ALLOW_CLEAR =", value, "allowClear");
            return (Criteria) this;
        }

        public Criteria andAllowClearNotEqualTo(Integer value) {
            addCriterion("ALLOW_CLEAR <>", value, "allowClear");
            return (Criteria) this;
        }

        public Criteria andAllowClearGreaterThan(Integer value) {
            addCriterion("ALLOW_CLEAR >", value, "allowClear");
            return (Criteria) this;
        }

        public Criteria andAllowClearGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALLOW_CLEAR >=", value, "allowClear");
            return (Criteria) this;
        }

        public Criteria andAllowClearLessThan(Integer value) {
            addCriterion("ALLOW_CLEAR <", value, "allowClear");
            return (Criteria) this;
        }

        public Criteria andAllowClearLessThanOrEqualTo(Integer value) {
            addCriterion("ALLOW_CLEAR <=", value, "allowClear");
            return (Criteria) this;
        }

        public Criteria andAllowClearIn(List<Integer> values) {
            addCriterion("ALLOW_CLEAR in", values, "allowClear");
            return (Criteria) this;
        }

        public Criteria andAllowClearNotIn(List<Integer> values) {
            addCriterion("ALLOW_CLEAR not in", values, "allowClear");
            return (Criteria) this;
        }

        public Criteria andAllowClearBetween(Integer value1, Integer value2) {
            addCriterion("ALLOW_CLEAR between", value1, value2, "allowClear");
            return (Criteria) this;
        }

        public Criteria andAllowClearNotBetween(Integer value1, Integer value2) {
            addCriterion("ALLOW_CLEAR not between", value1, value2, "allowClear");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("SOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("SOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(Integer value) {
            addCriterion("SOURCE_TYPE =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(Integer value) {
            addCriterion("SOURCE_TYPE <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(Integer value) {
            addCriterion("SOURCE_TYPE >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOURCE_TYPE >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(Integer value) {
            addCriterion("SOURCE_TYPE <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("SOURCE_TYPE <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<Integer> values) {
            addCriterion("SOURCE_TYPE in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<Integer> values) {
            addCriterion("SOURCE_TYPE not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("SOURCE_TYPE between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SOURCE_TYPE not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNull() {
            addCriterion("SOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSourceIdIsNotNull() {
            addCriterion("SOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceIdEqualTo(String value) {
            addCriterion("SOURCE_ID =", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotEqualTo(String value) {
            addCriterion("SOURCE_ID <>", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThan(String value) {
            addCriterion("SOURCE_ID >", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_ID >=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThan(String value) {
            addCriterion("SOURCE_ID <", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_ID <=", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdLike(String value) {
            addCriterion("SOURCE_ID like", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotLike(String value) {
            addCriterion("SOURCE_ID not like", value, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdIn(List<String> values) {
            addCriterion("SOURCE_ID in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotIn(List<String> values) {
            addCriterion("SOURCE_ID not in", values, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdBetween(String value1, String value2) {
            addCriterion("SOURCE_ID between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andSourceIdNotBetween(String value1, String value2) {
            addCriterion("SOURCE_ID not between", value1, value2, "sourceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("BALANCE =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("BALANCE <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("BALANCE >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("BALANCE <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("BALANCE in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("BALANCE not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andAcctMonthIsNull() {
            addCriterion("ACCT_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andAcctMonthIsNotNull() {
            addCriterion("ACCT_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andAcctMonthEqualTo(String value) {
            addCriterion("ACCT_MONTH =", value, "acctMonth");
            return (Criteria) this;
        }

        public Criteria andAcctMonthNotEqualTo(String value) {
            addCriterion("ACCT_MONTH <>", value, "acctMonth");
            return (Criteria) this;
        }

        public Criteria andAcctMonthGreaterThan(String value) {
            addCriterion("ACCT_MONTH >", value, "acctMonth");
            return (Criteria) this;
        }

        public Criteria andAcctMonthGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_MONTH >=", value, "acctMonth");
            return (Criteria) this;
        }

        public Criteria andAcctMonthLessThan(String value) {
            addCriterion("ACCT_MONTH <", value, "acctMonth");
            return (Criteria) this;
        }

        public Criteria andAcctMonthLessThanOrEqualTo(String value) {
            addCriterion("ACCT_MONTH <=", value, "acctMonth");
            return (Criteria) this;
        }

        public Criteria andAcctMonthLike(String value) {
            addCriterion("ACCT_MONTH like", value, "acctMonth");
            return (Criteria) this;
        }

        public Criteria andAcctMonthNotLike(String value) {
            addCriterion("ACCT_MONTH not like", value, "acctMonth");
            return (Criteria) this;
        }

        public Criteria andAcctMonthIn(List<String> values) {
            addCriterion("ACCT_MONTH in", values, "acctMonth");
            return (Criteria) this;
        }

        public Criteria andAcctMonthNotIn(List<String> values) {
            addCriterion("ACCT_MONTH not in", values, "acctMonth");
            return (Criteria) this;
        }

        public Criteria andAcctMonthBetween(String value1, String value2) {
            addCriterion("ACCT_MONTH between", value1, value2, "acctMonth");
            return (Criteria) this;
        }

        public Criteria andAcctMonthNotBetween(String value1, String value2) {
            addCriterion("ACCT_MONTH not between", value1, value2, "acctMonth");
            return (Criteria) this;
        }

        public Criteria andUseVersionIsNull() {
            addCriterion("USE_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andUseVersionIsNotNull() {
            addCriterion("USE_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andUseVersionEqualTo(Long value) {
            addCriterion("USE_VERSION =", value, "useVersion");
            return (Criteria) this;
        }

        public Criteria andUseVersionNotEqualTo(Long value) {
            addCriterion("USE_VERSION <>", value, "useVersion");
            return (Criteria) this;
        }

        public Criteria andUseVersionGreaterThan(Long value) {
            addCriterion("USE_VERSION >", value, "useVersion");
            return (Criteria) this;
        }

        public Criteria andUseVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("USE_VERSION >=", value, "useVersion");
            return (Criteria) this;
        }

        public Criteria andUseVersionLessThan(Long value) {
            addCriterion("USE_VERSION <", value, "useVersion");
            return (Criteria) this;
        }

        public Criteria andUseVersionLessThanOrEqualTo(Long value) {
            addCriterion("USE_VERSION <=", value, "useVersion");
            return (Criteria) this;
        }

        public Criteria andUseVersionIn(List<Long> values) {
            addCriterion("USE_VERSION in", values, "useVersion");
            return (Criteria) this;
        }

        public Criteria andUseVersionNotIn(List<Long> values) {
            addCriterion("USE_VERSION not in", values, "useVersion");
            return (Criteria) this;
        }

        public Criteria andUseVersionBetween(Long value1, Long value2) {
            addCriterion("USE_VERSION between", value1, value2, "useVersion");
            return (Criteria) this;
        }

        public Criteria andUseVersionNotBetween(Long value1, Long value2) {
            addCriterion("USE_VERSION not between", value1, value2, "useVersion");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("LAST_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("LAST_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Timestamp value) {
            addCriterion("LAST_UPDATE_TIME =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Timestamp value) {
            addCriterion("LAST_UPDATE_TIME <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Timestamp value) {
            addCriterion("LAST_UPDATE_TIME >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("LAST_UPDATE_TIME >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Timestamp value) {
            addCriterion("LAST_UPDATE_TIME <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("LAST_UPDATE_TIME <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Timestamp> values) {
            addCriterion("LAST_UPDATE_TIME in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Timestamp> values) {
            addCriterion("LAST_UPDATE_TIME not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("LAST_UPDATE_TIME between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("LAST_UPDATE_TIME not between", value1, value2, "lastUpdateTime");
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