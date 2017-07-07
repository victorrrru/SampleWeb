package cn.sample.member.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BankCardExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andBcidIsNull() {
            addCriterion("bcid is null");
            return (Criteria) this;
        }

        public Criteria andBcidIsNotNull() {
            addCriterion("bcid is not null");
            return (Criteria) this;
        }

        public Criteria andBcidEqualTo(Integer value) {
            addCriterion("bcid =", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidNotEqualTo(Integer value) {
            addCriterion("bcid <>", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidGreaterThan(Integer value) {
            addCriterion("bcid >", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bcid >=", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidLessThan(Integer value) {
            addCriterion("bcid <", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidLessThanOrEqualTo(Integer value) {
            addCriterion("bcid <=", value, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidIn(List<Integer> values) {
            addCriterion("bcid in", values, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidNotIn(List<Integer> values) {
            addCriterion("bcid not in", values, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidBetween(Integer value1, Integer value2) {
            addCriterion("bcid between", value1, value2, "bcid");
            return (Criteria) this;
        }

        public Criteria andBcidNotBetween(Integer value1, Integer value2) {
            addCriterion("bcid not between", value1, value2, "bcid");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andCardholderIsNull() {
            addCriterion("cardholder is null");
            return (Criteria) this;
        }

        public Criteria andCardholderIsNotNull() {
            addCriterion("cardholder is not null");
            return (Criteria) this;
        }

        public Criteria andCardholderEqualTo(String value) {
            addCriterion("cardholder =", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderNotEqualTo(String value) {
            addCriterion("cardholder <>", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderGreaterThan(String value) {
            addCriterion("cardholder >", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderGreaterThanOrEqualTo(String value) {
            addCriterion("cardholder >=", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderLessThan(String value) {
            addCriterion("cardholder <", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderLessThanOrEqualTo(String value) {
            addCriterion("cardholder <=", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderLike(String value) {
            addCriterion("cardholder like", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderNotLike(String value) {
            addCriterion("cardholder not like", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderIn(List<String> values) {
            addCriterion("cardholder in", values, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderNotIn(List<String> values) {
            addCriterion("cardholder not in", values, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderBetween(String value1, String value2) {
            addCriterion("cardholder between", value1, value2, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderNotBetween(String value1, String value2) {
            addCriterion("cardholder not between", value1, value2, "cardholder");
            return (Criteria) this;
        }

        public Criteria andBankcardnoIsNull() {
            addCriterion("bankcardno is null");
            return (Criteria) this;
        }

        public Criteria andBankcardnoIsNotNull() {
            addCriterion("bankcardno is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardnoEqualTo(String value) {
            addCriterion("bankcardno =", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotEqualTo(String value) {
            addCriterion("bankcardno <>", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoGreaterThan(String value) {
            addCriterion("bankcardno >", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("bankcardno >=", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoLessThan(String value) {
            addCriterion("bankcardno <", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoLessThanOrEqualTo(String value) {
            addCriterion("bankcardno <=", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoLike(String value) {
            addCriterion("bankcardno like", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotLike(String value) {
            addCriterion("bankcardno not like", value, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoIn(List<String> values) {
            addCriterion("bankcardno in", values, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotIn(List<String> values) {
            addCriterion("bankcardno not in", values, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoBetween(String value1, String value2) {
            addCriterion("bankcardno between", value1, value2, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andBankcardnoNotBetween(String value1, String value2) {
            addCriterion("bankcardno not between", value1, value2, "bankcardno");
            return (Criteria) this;
        }

        public Criteria andCollectingbankIsNull() {
            addCriterion("collectingbank is null");
            return (Criteria) this;
        }

        public Criteria andCollectingbankIsNotNull() {
            addCriterion("collectingbank is not null");
            return (Criteria) this;
        }

        public Criteria andCollectingbankEqualTo(String value) {
            addCriterion("collectingbank =", value, "collectingbank");
            return (Criteria) this;
        }

        public Criteria andCollectingbankNotEqualTo(String value) {
            addCriterion("collectingbank <>", value, "collectingbank");
            return (Criteria) this;
        }

        public Criteria andCollectingbankGreaterThan(String value) {
            addCriterion("collectingbank >", value, "collectingbank");
            return (Criteria) this;
        }

        public Criteria andCollectingbankGreaterThanOrEqualTo(String value) {
            addCriterion("collectingbank >=", value, "collectingbank");
            return (Criteria) this;
        }

        public Criteria andCollectingbankLessThan(String value) {
            addCriterion("collectingbank <", value, "collectingbank");
            return (Criteria) this;
        }

        public Criteria andCollectingbankLessThanOrEqualTo(String value) {
            addCriterion("collectingbank <=", value, "collectingbank");
            return (Criteria) this;
        }

        public Criteria andCollectingbankLike(String value) {
            addCriterion("collectingbank like", value, "collectingbank");
            return (Criteria) this;
        }

        public Criteria andCollectingbankNotLike(String value) {
            addCriterion("collectingbank not like", value, "collectingbank");
            return (Criteria) this;
        }

        public Criteria andCollectingbankIn(List<String> values) {
            addCriterion("collectingbank in", values, "collectingbank");
            return (Criteria) this;
        }

        public Criteria andCollectingbankNotIn(List<String> values) {
            addCriterion("collectingbank not in", values, "collectingbank");
            return (Criteria) this;
        }

        public Criteria andCollectingbankBetween(String value1, String value2) {
            addCriterion("collectingbank between", value1, value2, "collectingbank");
            return (Criteria) this;
        }

        public Criteria andCollectingbankNotBetween(String value1, String value2) {
            addCriterion("collectingbank not between", value1, value2, "collectingbank");
            return (Criteria) this;
        }

        public Criteria andReservedmobilenoIsNull() {
            addCriterion("reservedmobileno is null");
            return (Criteria) this;
        }

        public Criteria andReservedmobilenoIsNotNull() {
            addCriterion("reservedmobileno is not null");
            return (Criteria) this;
        }

        public Criteria andReservedmobilenoEqualTo(String value) {
            addCriterion("reservedmobileno =", value, "reservedmobileno");
            return (Criteria) this;
        }

        public Criteria andReservedmobilenoNotEqualTo(String value) {
            addCriterion("reservedmobileno <>", value, "reservedmobileno");
            return (Criteria) this;
        }

        public Criteria andReservedmobilenoGreaterThan(String value) {
            addCriterion("reservedmobileno >", value, "reservedmobileno");
            return (Criteria) this;
        }

        public Criteria andReservedmobilenoGreaterThanOrEqualTo(String value) {
            addCriterion("reservedmobileno >=", value, "reservedmobileno");
            return (Criteria) this;
        }

        public Criteria andReservedmobilenoLessThan(String value) {
            addCriterion("reservedmobileno <", value, "reservedmobileno");
            return (Criteria) this;
        }

        public Criteria andReservedmobilenoLessThanOrEqualTo(String value) {
            addCriterion("reservedmobileno <=", value, "reservedmobileno");
            return (Criteria) this;
        }

        public Criteria andReservedmobilenoLike(String value) {
            addCriterion("reservedmobileno like", value, "reservedmobileno");
            return (Criteria) this;
        }

        public Criteria andReservedmobilenoNotLike(String value) {
            addCriterion("reservedmobileno not like", value, "reservedmobileno");
            return (Criteria) this;
        }

        public Criteria andReservedmobilenoIn(List<String> values) {
            addCriterion("reservedmobileno in", values, "reservedmobileno");
            return (Criteria) this;
        }

        public Criteria andReservedmobilenoNotIn(List<String> values) {
            addCriterion("reservedmobileno not in", values, "reservedmobileno");
            return (Criteria) this;
        }

        public Criteria andReservedmobilenoBetween(String value1, String value2) {
            addCriterion("reservedmobileno between", value1, value2, "reservedmobileno");
            return (Criteria) this;
        }

        public Criteria andReservedmobilenoNotBetween(String value1, String value2) {
            addCriterion("reservedmobileno not between", value1, value2, "reservedmobileno");
            return (Criteria) this;
        }

        public Criteria andDefaultcollectingbankIsNull() {
            addCriterion("defaultcollectingbank is null");
            return (Criteria) this;
        }

        public Criteria andDefaultcollectingbankIsNotNull() {
            addCriterion("defaultcollectingbank is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultcollectingbankEqualTo(Byte value) {
            addCriterion("defaultcollectingbank =", value, "defaultcollectingbank");
            return (Criteria) this;
        }

        public Criteria andDefaultcollectingbankNotEqualTo(Byte value) {
            addCriterion("defaultcollectingbank <>", value, "defaultcollectingbank");
            return (Criteria) this;
        }

        public Criteria andDefaultcollectingbankGreaterThan(Byte value) {
            addCriterion("defaultcollectingbank >", value, "defaultcollectingbank");
            return (Criteria) this;
        }

        public Criteria andDefaultcollectingbankGreaterThanOrEqualTo(Byte value) {
            addCriterion("defaultcollectingbank >=", value, "defaultcollectingbank");
            return (Criteria) this;
        }

        public Criteria andDefaultcollectingbankLessThan(Byte value) {
            addCriterion("defaultcollectingbank <", value, "defaultcollectingbank");
            return (Criteria) this;
        }

        public Criteria andDefaultcollectingbankLessThanOrEqualTo(Byte value) {
            addCriterion("defaultcollectingbank <=", value, "defaultcollectingbank");
            return (Criteria) this;
        }

        public Criteria andDefaultcollectingbankIn(List<Byte> values) {
            addCriterion("defaultcollectingbank in", values, "defaultcollectingbank");
            return (Criteria) this;
        }

        public Criteria andDefaultcollectingbankNotIn(List<Byte> values) {
            addCriterion("defaultcollectingbank not in", values, "defaultcollectingbank");
            return (Criteria) this;
        }

        public Criteria andDefaultcollectingbankBetween(Byte value1, Byte value2) {
            addCriterion("defaultcollectingbank between", value1, value2, "defaultcollectingbank");
            return (Criteria) this;
        }

        public Criteria andDefaultcollectingbankNotBetween(Byte value1, Byte value2) {
            addCriterion("defaultcollectingbank not between", value1, value2, "defaultcollectingbank");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDefaultrefundbankIsNull() {
            addCriterion("defaultrefundbank is null");
            return (Criteria) this;
        }

        public Criteria andDefaultrefundbankIsNotNull() {
            addCriterion("defaultrefundbank is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultrefundbankEqualTo(Byte value) {
            addCriterion("defaultrefundbank =", value, "defaultrefundbank");
            return (Criteria) this;
        }

        public Criteria andDefaultrefundbankNotEqualTo(Byte value) {
            addCriterion("defaultrefundbank <>", value, "defaultrefundbank");
            return (Criteria) this;
        }

        public Criteria andDefaultrefundbankGreaterThan(Byte value) {
            addCriterion("defaultrefundbank >", value, "defaultrefundbank");
            return (Criteria) this;
        }

        public Criteria andDefaultrefundbankGreaterThanOrEqualTo(Byte value) {
            addCriterion("defaultrefundbank >=", value, "defaultrefundbank");
            return (Criteria) this;
        }

        public Criteria andDefaultrefundbankLessThan(Byte value) {
            addCriterion("defaultrefundbank <", value, "defaultrefundbank");
            return (Criteria) this;
        }

        public Criteria andDefaultrefundbankLessThanOrEqualTo(Byte value) {
            addCriterion("defaultrefundbank <=", value, "defaultrefundbank");
            return (Criteria) this;
        }

        public Criteria andDefaultrefundbankIn(List<Byte> values) {
            addCriterion("defaultrefundbank in", values, "defaultrefundbank");
            return (Criteria) this;
        }

        public Criteria andDefaultrefundbankNotIn(List<Byte> values) {
            addCriterion("defaultrefundbank not in", values, "defaultrefundbank");
            return (Criteria) this;
        }

        public Criteria andDefaultrefundbankBetween(Byte value1, Byte value2) {
            addCriterion("defaultrefundbank between", value1, value2, "defaultrefundbank");
            return (Criteria) this;
        }

        public Criteria andDefaultrefundbankNotBetween(Byte value1, Byte value2) {
            addCriterion("defaultrefundbank not between", value1, value2, "defaultrefundbank");
            return (Criteria) this;
        }

        public Criteria andDefaultbankIsNull() {
            addCriterion("defaultbank is null");
            return (Criteria) this;
        }

        public Criteria andDefaultbankIsNotNull() {
            addCriterion("defaultbank is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultbankEqualTo(Byte value) {
            addCriterion("defaultbank =", value, "defaultbank");
            return (Criteria) this;
        }

        public Criteria andDefaultbankNotEqualTo(Byte value) {
            addCriterion("defaultbank <>", value, "defaultbank");
            return (Criteria) this;
        }

        public Criteria andDefaultbankGreaterThan(Byte value) {
            addCriterion("defaultbank >", value, "defaultbank");
            return (Criteria) this;
        }

        public Criteria andDefaultbankGreaterThanOrEqualTo(Byte value) {
            addCriterion("defaultbank >=", value, "defaultbank");
            return (Criteria) this;
        }

        public Criteria andDefaultbankLessThan(Byte value) {
            addCriterion("defaultbank <", value, "defaultbank");
            return (Criteria) this;
        }

        public Criteria andDefaultbankLessThanOrEqualTo(Byte value) {
            addCriterion("defaultbank <=", value, "defaultbank");
            return (Criteria) this;
        }

        public Criteria andDefaultbankIn(List<Byte> values) {
            addCriterion("defaultbank in", values, "defaultbank");
            return (Criteria) this;
        }

        public Criteria andDefaultbankNotIn(List<Byte> values) {
            addCriterion("defaultbank not in", values, "defaultbank");
            return (Criteria) this;
        }

        public Criteria andDefaultbankBetween(Byte value1, Byte value2) {
            addCriterion("defaultbank between", value1, value2, "defaultbank");
            return (Criteria) this;
        }

        public Criteria andDefaultbankNotBetween(Byte value1, Byte value2) {
            addCriterion("defaultbank not between", value1, value2, "defaultbank");
            return (Criteria) this;
        }

        public Criteria andCreatedonIsNull() {
            addCriterion("createdon is null");
            return (Criteria) this;
        }

        public Criteria andCreatedonIsNotNull() {
            addCriterion("createdon is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedonEqualTo(Date value) {
            addCriterion("createdon =", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotEqualTo(Date value) {
            addCriterion("createdon <>", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonGreaterThan(Date value) {
            addCriterion("createdon >", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonGreaterThanOrEqualTo(Date value) {
            addCriterion("createdon >=", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonLessThan(Date value) {
            addCriterion("createdon <", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonLessThanOrEqualTo(Date value) {
            addCriterion("createdon <=", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonIn(List<Date> values) {
            addCriterion("createdon in", values, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotIn(List<Date> values) {
            addCriterion("createdon not in", values, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonBetween(Date value1, Date value2) {
            addCriterion("createdon between", value1, value2, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotBetween(Date value1, Date value2) {
            addCriterion("createdon not between", value1, value2, "createdon");
            return (Criteria) this;
        }
    }

    /**
     */
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