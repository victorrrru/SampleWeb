package cn.sample.domain.loan.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CreditApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CreditApplyExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCaIdIsNull() {
            addCriterion("ca_id is null");
            return (Criteria) this;
        }

        public Criteria andCaIdIsNotNull() {
            addCriterion("ca_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaIdEqualTo(Integer value) {
            addCriterion("ca_id =", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotEqualTo(Integer value) {
            addCriterion("ca_id <>", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdGreaterThan(Integer value) {
            addCriterion("ca_id >", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ca_id >=", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdLessThan(Integer value) {
            addCriterion("ca_id <", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdLessThanOrEqualTo(Integer value) {
            addCriterion("ca_id <=", value, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdIn(List<Integer> values) {
            addCriterion("ca_id in", values, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotIn(List<Integer> values) {
            addCriterion("ca_id not in", values, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdBetween(Integer value1, Integer value2) {
            addCriterion("ca_id between", value1, value2, "caId");
            return (Criteria) this;
        }

        public Criteria andCaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ca_id not between", value1, value2, "caId");
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

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andCoupleCardIsNull() {
            addCriterion("couple_card is null");
            return (Criteria) this;
        }

        public Criteria andCoupleCardIsNotNull() {
            addCriterion("couple_card is not null");
            return (Criteria) this;
        }

        public Criteria andCoupleCardEqualTo(String value) {
            addCriterion("couple_card =", value, "coupleCard");
            return (Criteria) this;
        }

        public Criteria andCoupleCardNotEqualTo(String value) {
            addCriterion("couple_card <>", value, "coupleCard");
            return (Criteria) this;
        }

        public Criteria andCoupleCardGreaterThan(String value) {
            addCriterion("couple_card >", value, "coupleCard");
            return (Criteria) this;
        }

        public Criteria andCoupleCardGreaterThanOrEqualTo(String value) {
            addCriterion("couple_card >=", value, "coupleCard");
            return (Criteria) this;
        }

        public Criteria andCoupleCardLessThan(String value) {
            addCriterion("couple_card <", value, "coupleCard");
            return (Criteria) this;
        }

        public Criteria andCoupleCardLessThanOrEqualTo(String value) {
            addCriterion("couple_card <=", value, "coupleCard");
            return (Criteria) this;
        }

        public Criteria andCoupleCardLike(String value) {
            addCriterion("couple_card like", value, "coupleCard");
            return (Criteria) this;
        }

        public Criteria andCoupleCardNotLike(String value) {
            addCriterion("couple_card not like", value, "coupleCard");
            return (Criteria) this;
        }

        public Criteria andCoupleCardIn(List<String> values) {
            addCriterion("couple_card in", values, "coupleCard");
            return (Criteria) this;
        }

        public Criteria andCoupleCardNotIn(List<String> values) {
            addCriterion("couple_card not in", values, "coupleCard");
            return (Criteria) this;
        }

        public Criteria andCoupleCardBetween(String value1, String value2) {
            addCriterion("couple_card between", value1, value2, "coupleCard");
            return (Criteria) this;
        }

        public Criteria andCoupleCardNotBetween(String value1, String value2) {
            addCriterion("couple_card not between", value1, value2, "coupleCard");
            return (Criteria) this;
        }

        public Criteria andCoupleMobileIsNull() {
            addCriterion("couple_mobile is null");
            return (Criteria) this;
        }

        public Criteria andCoupleMobileIsNotNull() {
            addCriterion("couple_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andCoupleMobileEqualTo(String value) {
            addCriterion("couple_mobile =", value, "coupleMobile");
            return (Criteria) this;
        }

        public Criteria andCoupleMobileNotEqualTo(String value) {
            addCriterion("couple_mobile <>", value, "coupleMobile");
            return (Criteria) this;
        }

        public Criteria andCoupleMobileGreaterThan(String value) {
            addCriterion("couple_mobile >", value, "coupleMobile");
            return (Criteria) this;
        }

        public Criteria andCoupleMobileGreaterThanOrEqualTo(String value) {
            addCriterion("couple_mobile >=", value, "coupleMobile");
            return (Criteria) this;
        }

        public Criteria andCoupleMobileLessThan(String value) {
            addCriterion("couple_mobile <", value, "coupleMobile");
            return (Criteria) this;
        }

        public Criteria andCoupleMobileLessThanOrEqualTo(String value) {
            addCriterion("couple_mobile <=", value, "coupleMobile");
            return (Criteria) this;
        }

        public Criteria andCoupleMobileLike(String value) {
            addCriterion("couple_mobile like", value, "coupleMobile");
            return (Criteria) this;
        }

        public Criteria andCoupleMobileNotLike(String value) {
            addCriterion("couple_mobile not like", value, "coupleMobile");
            return (Criteria) this;
        }

        public Criteria andCoupleMobileIn(List<String> values) {
            addCriterion("couple_mobile in", values, "coupleMobile");
            return (Criteria) this;
        }

        public Criteria andCoupleMobileNotIn(List<String> values) {
            addCriterion("couple_mobile not in", values, "coupleMobile");
            return (Criteria) this;
        }

        public Criteria andCoupleMobileBetween(String value1, String value2) {
            addCriterion("couple_mobile between", value1, value2, "coupleMobile");
            return (Criteria) this;
        }

        public Criteria andCoupleMobileNotBetween(String value1, String value2) {
            addCriterion("couple_mobile not between", value1, value2, "coupleMobile");
            return (Criteria) this;
        }

        public Criteria andCoupleNameIsNull() {
            addCriterion("couple_name is null");
            return (Criteria) this;
        }

        public Criteria andCoupleNameIsNotNull() {
            addCriterion("couple_name is not null");
            return (Criteria) this;
        }

        public Criteria andCoupleNameEqualTo(String value) {
            addCriterion("couple_name =", value, "coupleName");
            return (Criteria) this;
        }

        public Criteria andCoupleNameNotEqualTo(String value) {
            addCriterion("couple_name <>", value, "coupleName");
            return (Criteria) this;
        }

        public Criteria andCoupleNameGreaterThan(String value) {
            addCriterion("couple_name >", value, "coupleName");
            return (Criteria) this;
        }

        public Criteria andCoupleNameGreaterThanOrEqualTo(String value) {
            addCriterion("couple_name >=", value, "coupleName");
            return (Criteria) this;
        }

        public Criteria andCoupleNameLessThan(String value) {
            addCriterion("couple_name <", value, "coupleName");
            return (Criteria) this;
        }

        public Criteria andCoupleNameLessThanOrEqualTo(String value) {
            addCriterion("couple_name <=", value, "coupleName");
            return (Criteria) this;
        }

        public Criteria andCoupleNameLike(String value) {
            addCriterion("couple_name like", value, "coupleName");
            return (Criteria) this;
        }

        public Criteria andCoupleNameNotLike(String value) {
            addCriterion("couple_name not like", value, "coupleName");
            return (Criteria) this;
        }

        public Criteria andCoupleNameIn(List<String> values) {
            addCriterion("couple_name in", values, "coupleName");
            return (Criteria) this;
        }

        public Criteria andCoupleNameNotIn(List<String> values) {
            addCriterion("couple_name not in", values, "coupleName");
            return (Criteria) this;
        }

        public Criteria andCoupleNameBetween(String value1, String value2) {
            addCriterion("couple_name between", value1, value2, "coupleName");
            return (Criteria) this;
        }

        public Criteria andCoupleNameNotBetween(String value1, String value2) {
            addCriterion("couple_name not between", value1, value2, "coupleName");
            return (Criteria) this;
        }

        public Criteria andCoupleEducationIsNull() {
            addCriterion("couple_education is null");
            return (Criteria) this;
        }

        public Criteria andCoupleEducationIsNotNull() {
            addCriterion("couple_education is not null");
            return (Criteria) this;
        }

        public Criteria andCoupleEducationEqualTo(Byte value) {
            addCriterion("couple_education =", value, "coupleEducation");
            return (Criteria) this;
        }

        public Criteria andCoupleEducationNotEqualTo(Byte value) {
            addCriterion("couple_education <>", value, "coupleEducation");
            return (Criteria) this;
        }

        public Criteria andCoupleEducationGreaterThan(Byte value) {
            addCriterion("couple_education >", value, "coupleEducation");
            return (Criteria) this;
        }

        public Criteria andCoupleEducationGreaterThanOrEqualTo(Byte value) {
            addCriterion("couple_education >=", value, "coupleEducation");
            return (Criteria) this;
        }

        public Criteria andCoupleEducationLessThan(Byte value) {
            addCriterion("couple_education <", value, "coupleEducation");
            return (Criteria) this;
        }

        public Criteria andCoupleEducationLessThanOrEqualTo(Byte value) {
            addCriterion("couple_education <=", value, "coupleEducation");
            return (Criteria) this;
        }

        public Criteria andCoupleEducationIn(List<Byte> values) {
            addCriterion("couple_education in", values, "coupleEducation");
            return (Criteria) this;
        }

        public Criteria andCoupleEducationNotIn(List<Byte> values) {
            addCriterion("couple_education not in", values, "coupleEducation");
            return (Criteria) this;
        }

        public Criteria andCoupleEducationBetween(Byte value1, Byte value2) {
            addCriterion("couple_education between", value1, value2, "coupleEducation");
            return (Criteria) this;
        }

        public Criteria andCoupleEducationNotBetween(Byte value1, Byte value2) {
            addCriterion("couple_education not between", value1, value2, "coupleEducation");
            return (Criteria) this;
        }

        public Criteria andCoupleJobIsNull() {
            addCriterion("couple_job is null");
            return (Criteria) this;
        }

        public Criteria andCoupleJobIsNotNull() {
            addCriterion("couple_job is not null");
            return (Criteria) this;
        }

        public Criteria andCoupleJobEqualTo(Byte value) {
            addCriterion("couple_job =", value, "coupleJob");
            return (Criteria) this;
        }

        public Criteria andCoupleJobNotEqualTo(Byte value) {
            addCriterion("couple_job <>", value, "coupleJob");
            return (Criteria) this;
        }

        public Criteria andCoupleJobGreaterThan(Byte value) {
            addCriterion("couple_job >", value, "coupleJob");
            return (Criteria) this;
        }

        public Criteria andCoupleJobGreaterThanOrEqualTo(Byte value) {
            addCriterion("couple_job >=", value, "coupleJob");
            return (Criteria) this;
        }

        public Criteria andCoupleJobLessThan(Byte value) {
            addCriterion("couple_job <", value, "coupleJob");
            return (Criteria) this;
        }

        public Criteria andCoupleJobLessThanOrEqualTo(Byte value) {
            addCriterion("couple_job <=", value, "coupleJob");
            return (Criteria) this;
        }

        public Criteria andCoupleJobIn(List<Byte> values) {
            addCriterion("couple_job in", values, "coupleJob");
            return (Criteria) this;
        }

        public Criteria andCoupleJobNotIn(List<Byte> values) {
            addCriterion("couple_job not in", values, "coupleJob");
            return (Criteria) this;
        }

        public Criteria andCoupleJobBetween(Byte value1, Byte value2) {
            addCriterion("couple_job between", value1, value2, "coupleJob");
            return (Criteria) this;
        }

        public Criteria andCoupleJobNotBetween(Byte value1, Byte value2) {
            addCriterion("couple_job not between", value1, value2, "coupleJob");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andOriginTypeIsNull() {
            addCriterion("origin_type is null");
            return (Criteria) this;
        }

        public Criteria andOriginTypeIsNotNull() {
            addCriterion("origin_type is not null");
            return (Criteria) this;
        }

        public Criteria andOriginTypeEqualTo(Byte value) {
            addCriterion("origin_type =", value, "originType");
            return (Criteria) this;
        }

        public Criteria andOriginTypeNotEqualTo(Byte value) {
            addCriterion("origin_type <>", value, "originType");
            return (Criteria) this;
        }

        public Criteria andOriginTypeGreaterThan(Byte value) {
            addCriterion("origin_type >", value, "originType");
            return (Criteria) this;
        }

        public Criteria andOriginTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("origin_type >=", value, "originType");
            return (Criteria) this;
        }

        public Criteria andOriginTypeLessThan(Byte value) {
            addCriterion("origin_type <", value, "originType");
            return (Criteria) this;
        }

        public Criteria andOriginTypeLessThanOrEqualTo(Byte value) {
            addCriterion("origin_type <=", value, "originType");
            return (Criteria) this;
        }

        public Criteria andOriginTypeIn(List<Byte> values) {
            addCriterion("origin_type in", values, "originType");
            return (Criteria) this;
        }

        public Criteria andOriginTypeNotIn(List<Byte> values) {
            addCriterion("origin_type not in", values, "originType");
            return (Criteria) this;
        }

        public Criteria andOriginTypeBetween(Byte value1, Byte value2) {
            addCriterion("origin_type between", value1, value2, "originType");
            return (Criteria) this;
        }

        public Criteria andOriginTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("origin_type not between", value1, value2, "originType");
            return (Criteria) this;
        }

        public Criteria andDomicileProvinceIsNull() {
            addCriterion("domicile_province is null");
            return (Criteria) this;
        }

        public Criteria andDomicileProvinceIsNotNull() {
            addCriterion("domicile_province is not null");
            return (Criteria) this;
        }

        public Criteria andDomicileProvinceEqualTo(String value) {
            addCriterion("domicile_province =", value, "domicileProvince");
            return (Criteria) this;
        }

        public Criteria andDomicileProvinceNotEqualTo(String value) {
            addCriterion("domicile_province <>", value, "domicileProvince");
            return (Criteria) this;
        }

        public Criteria andDomicileProvinceGreaterThan(String value) {
            addCriterion("domicile_province >", value, "domicileProvince");
            return (Criteria) this;
        }

        public Criteria andDomicileProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("domicile_province >=", value, "domicileProvince");
            return (Criteria) this;
        }

        public Criteria andDomicileProvinceLessThan(String value) {
            addCriterion("domicile_province <", value, "domicileProvince");
            return (Criteria) this;
        }

        public Criteria andDomicileProvinceLessThanOrEqualTo(String value) {
            addCriterion("domicile_province <=", value, "domicileProvince");
            return (Criteria) this;
        }

        public Criteria andDomicileProvinceLike(String value) {
            addCriterion("domicile_province like", value, "domicileProvince");
            return (Criteria) this;
        }

        public Criteria andDomicileProvinceNotLike(String value) {
            addCriterion("domicile_province not like", value, "domicileProvince");
            return (Criteria) this;
        }

        public Criteria andDomicileProvinceIn(List<String> values) {
            addCriterion("domicile_province in", values, "domicileProvince");
            return (Criteria) this;
        }

        public Criteria andDomicileProvinceNotIn(List<String> values) {
            addCriterion("domicile_province not in", values, "domicileProvince");
            return (Criteria) this;
        }

        public Criteria andDomicileProvinceBetween(String value1, String value2) {
            addCriterion("domicile_province between", value1, value2, "domicileProvince");
            return (Criteria) this;
        }

        public Criteria andDomicileProvinceNotBetween(String value1, String value2) {
            addCriterion("domicile_province not between", value1, value2, "domicileProvince");
            return (Criteria) this;
        }

        public Criteria andDomicileDetailIsNull() {
            addCriterion("domicile_detail is null");
            return (Criteria) this;
        }

        public Criteria andDomicileDetailIsNotNull() {
            addCriterion("domicile_detail is not null");
            return (Criteria) this;
        }

        public Criteria andDomicileDetailEqualTo(String value) {
            addCriterion("domicile_detail =", value, "domicileDetail");
            return (Criteria) this;
        }

        public Criteria andDomicileDetailNotEqualTo(String value) {
            addCriterion("domicile_detail <>", value, "domicileDetail");
            return (Criteria) this;
        }

        public Criteria andDomicileDetailGreaterThan(String value) {
            addCriterion("domicile_detail >", value, "domicileDetail");
            return (Criteria) this;
        }

        public Criteria andDomicileDetailGreaterThanOrEqualTo(String value) {
            addCriterion("domicile_detail >=", value, "domicileDetail");
            return (Criteria) this;
        }

        public Criteria andDomicileDetailLessThan(String value) {
            addCriterion("domicile_detail <", value, "domicileDetail");
            return (Criteria) this;
        }

        public Criteria andDomicileDetailLessThanOrEqualTo(String value) {
            addCriterion("domicile_detail <=", value, "domicileDetail");
            return (Criteria) this;
        }

        public Criteria andDomicileDetailLike(String value) {
            addCriterion("domicile_detail like", value, "domicileDetail");
            return (Criteria) this;
        }

        public Criteria andDomicileDetailNotLike(String value) {
            addCriterion("domicile_detail not like", value, "domicileDetail");
            return (Criteria) this;
        }

        public Criteria andDomicileDetailIn(List<String> values) {
            addCriterion("domicile_detail in", values, "domicileDetail");
            return (Criteria) this;
        }

        public Criteria andDomicileDetailNotIn(List<String> values) {
            addCriterion("domicile_detail not in", values, "domicileDetail");
            return (Criteria) this;
        }

        public Criteria andDomicileDetailBetween(String value1, String value2) {
            addCriterion("domicile_detail between", value1, value2, "domicileDetail");
            return (Criteria) this;
        }

        public Criteria andDomicileDetailNotBetween(String value1, String value2) {
            addCriterion("domicile_detail not between", value1, value2, "domicileDetail");
            return (Criteria) this;
        }

        public Criteria andDomicileTimeIsNull() {
            addCriterion("domicile_time is null");
            return (Criteria) this;
        }

        public Criteria andDomicileTimeIsNotNull() {
            addCriterion("domicile_time is not null");
            return (Criteria) this;
        }

        public Criteria andDomicileTimeEqualTo(Byte value) {
            addCriterion("domicile_time =", value, "domicileTime");
            return (Criteria) this;
        }

        public Criteria andDomicileTimeNotEqualTo(Byte value) {
            addCriterion("domicile_time <>", value, "domicileTime");
            return (Criteria) this;
        }

        public Criteria andDomicileTimeGreaterThan(Byte value) {
            addCriterion("domicile_time >", value, "domicileTime");
            return (Criteria) this;
        }

        public Criteria andDomicileTimeGreaterThanOrEqualTo(Byte value) {
            addCriterion("domicile_time >=", value, "domicileTime");
            return (Criteria) this;
        }

        public Criteria andDomicileTimeLessThan(Byte value) {
            addCriterion("domicile_time <", value, "domicileTime");
            return (Criteria) this;
        }

        public Criteria andDomicileTimeLessThanOrEqualTo(Byte value) {
            addCriterion("domicile_time <=", value, "domicileTime");
            return (Criteria) this;
        }

        public Criteria andDomicileTimeIn(List<Byte> values) {
            addCriterion("domicile_time in", values, "domicileTime");
            return (Criteria) this;
        }

        public Criteria andDomicileTimeNotIn(List<Byte> values) {
            addCriterion("domicile_time not in", values, "domicileTime");
            return (Criteria) this;
        }

        public Criteria andDomicileTimeBetween(Byte value1, Byte value2) {
            addCriterion("domicile_time between", value1, value2, "domicileTime");
            return (Criteria) this;
        }

        public Criteria andDomicileTimeNotBetween(Byte value1, Byte value2) {
            addCriterion("domicile_time not between", value1, value2, "domicileTime");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Byte value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Byte value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Byte value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Byte value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Byte value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Byte value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Byte> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Byte> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Byte value1, Byte value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Byte value1, Byte value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andHighEduStarttimeIsNull() {
            addCriterion("high_edu_starttime is null");
            return (Criteria) this;
        }

        public Criteria andHighEduStarttimeIsNotNull() {
            addCriterion("high_edu_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andHighEduStarttimeEqualTo(Date value) {
            addCriterion("high_edu_starttime =", value, "highEduStarttime");
            return (Criteria) this;
        }

        public Criteria andHighEduStarttimeNotEqualTo(Date value) {
            addCriterion("high_edu_starttime <>", value, "highEduStarttime");
            return (Criteria) this;
        }

        public Criteria andHighEduStarttimeGreaterThan(Date value) {
            addCriterion("high_edu_starttime >", value, "highEduStarttime");
            return (Criteria) this;
        }

        public Criteria andHighEduStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("high_edu_starttime >=", value, "highEduStarttime");
            return (Criteria) this;
        }

        public Criteria andHighEduStarttimeLessThan(Date value) {
            addCriterion("high_edu_starttime <", value, "highEduStarttime");
            return (Criteria) this;
        }

        public Criteria andHighEduStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("high_edu_starttime <=", value, "highEduStarttime");
            return (Criteria) this;
        }

        public Criteria andHighEduStarttimeIn(List<Date> values) {
            addCriterion("high_edu_starttime in", values, "highEduStarttime");
            return (Criteria) this;
        }

        public Criteria andHighEduStarttimeNotIn(List<Date> values) {
            addCriterion("high_edu_starttime not in", values, "highEduStarttime");
            return (Criteria) this;
        }

        public Criteria andHighEduStarttimeBetween(Date value1, Date value2) {
            addCriterion("high_edu_starttime between", value1, value2, "highEduStarttime");
            return (Criteria) this;
        }

        public Criteria andHighEduStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("high_edu_starttime not between", value1, value2, "highEduStarttime");
            return (Criteria) this;
        }

        public Criteria andHighEduEndtimeIsNull() {
            addCriterion("high_edu_endtime is null");
            return (Criteria) this;
        }

        public Criteria andHighEduEndtimeIsNotNull() {
            addCriterion("high_edu_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andHighEduEndtimeEqualTo(Date value) {
            addCriterion("high_edu_endtime =", value, "highEduEndtime");
            return (Criteria) this;
        }

        public Criteria andHighEduEndtimeNotEqualTo(Date value) {
            addCriterion("high_edu_endtime <>", value, "highEduEndtime");
            return (Criteria) this;
        }

        public Criteria andHighEduEndtimeGreaterThan(Date value) {
            addCriterion("high_edu_endtime >", value, "highEduEndtime");
            return (Criteria) this;
        }

        public Criteria andHighEduEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("high_edu_endtime >=", value, "highEduEndtime");
            return (Criteria) this;
        }

        public Criteria andHighEduEndtimeLessThan(Date value) {
            addCriterion("high_edu_endtime <", value, "highEduEndtime");
            return (Criteria) this;
        }

        public Criteria andHighEduEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("high_edu_endtime <=", value, "highEduEndtime");
            return (Criteria) this;
        }

        public Criteria andHighEduEndtimeIn(List<Date> values) {
            addCriterion("high_edu_endtime in", values, "highEduEndtime");
            return (Criteria) this;
        }

        public Criteria andHighEduEndtimeNotIn(List<Date> values) {
            addCriterion("high_edu_endtime not in", values, "highEduEndtime");
            return (Criteria) this;
        }

        public Criteria andHighEduEndtimeBetween(Date value1, Date value2) {
            addCriterion("high_edu_endtime between", value1, value2, "highEduEndtime");
            return (Criteria) this;
        }

        public Criteria andHighEduEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("high_edu_endtime not between", value1, value2, "highEduEndtime");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andComBusTimeLengthIsNull() {
            addCriterion("com_bus_time_length is null");
            return (Criteria) this;
        }

        public Criteria andComBusTimeLengthIsNotNull() {
            addCriterion("com_bus_time_length is not null");
            return (Criteria) this;
        }

        public Criteria andComBusTimeLengthEqualTo(Short value) {
            addCriterion("com_bus_time_length =", value, "comBusTimeLength");
            return (Criteria) this;
        }

        public Criteria andComBusTimeLengthNotEqualTo(Short value) {
            addCriterion("com_bus_time_length <>", value, "comBusTimeLength");
            return (Criteria) this;
        }

        public Criteria andComBusTimeLengthGreaterThan(Short value) {
            addCriterion("com_bus_time_length >", value, "comBusTimeLength");
            return (Criteria) this;
        }

        public Criteria andComBusTimeLengthGreaterThanOrEqualTo(Short value) {
            addCriterion("com_bus_time_length >=", value, "comBusTimeLength");
            return (Criteria) this;
        }

        public Criteria andComBusTimeLengthLessThan(Short value) {
            addCriterion("com_bus_time_length <", value, "comBusTimeLength");
            return (Criteria) this;
        }

        public Criteria andComBusTimeLengthLessThanOrEqualTo(Short value) {
            addCriterion("com_bus_time_length <=", value, "comBusTimeLength");
            return (Criteria) this;
        }

        public Criteria andComBusTimeLengthIn(List<Short> values) {
            addCriterion("com_bus_time_length in", values, "comBusTimeLength");
            return (Criteria) this;
        }

        public Criteria andComBusTimeLengthNotIn(List<Short> values) {
            addCriterion("com_bus_time_length not in", values, "comBusTimeLength");
            return (Criteria) this;
        }

        public Criteria andComBusTimeLengthBetween(Short value1, Short value2) {
            addCriterion("com_bus_time_length between", value1, value2, "comBusTimeLength");
            return (Criteria) this;
        }

        public Criteria andComBusTimeLengthNotBetween(Short value1, Short value2) {
            addCriterion("com_bus_time_length not between", value1, value2, "comBusTimeLength");
            return (Criteria) this;
        }

        public Criteria andIsCompanyFivehunIsNull() {
            addCriterion("is_company_fivehun is null");
            return (Criteria) this;
        }

        public Criteria andIsCompanyFivehunIsNotNull() {
            addCriterion("is_company_fivehun is not null");
            return (Criteria) this;
        }

        public Criteria andIsCompanyFivehunEqualTo(Byte value) {
            addCriterion("is_company_fivehun =", value, "isCompanyFivehun");
            return (Criteria) this;
        }

        public Criteria andIsCompanyFivehunNotEqualTo(Byte value) {
            addCriterion("is_company_fivehun <>", value, "isCompanyFivehun");
            return (Criteria) this;
        }

        public Criteria andIsCompanyFivehunGreaterThan(Byte value) {
            addCriterion("is_company_fivehun >", value, "isCompanyFivehun");
            return (Criteria) this;
        }

        public Criteria andIsCompanyFivehunGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_company_fivehun >=", value, "isCompanyFivehun");
            return (Criteria) this;
        }

        public Criteria andIsCompanyFivehunLessThan(Byte value) {
            addCriterion("is_company_fivehun <", value, "isCompanyFivehun");
            return (Criteria) this;
        }

        public Criteria andIsCompanyFivehunLessThanOrEqualTo(Byte value) {
            addCriterion("is_company_fivehun <=", value, "isCompanyFivehun");
            return (Criteria) this;
        }

        public Criteria andIsCompanyFivehunIn(List<Byte> values) {
            addCriterion("is_company_fivehun in", values, "isCompanyFivehun");
            return (Criteria) this;
        }

        public Criteria andIsCompanyFivehunNotIn(List<Byte> values) {
            addCriterion("is_company_fivehun not in", values, "isCompanyFivehun");
            return (Criteria) this;
        }

        public Criteria andIsCompanyFivehunBetween(Byte value1, Byte value2) {
            addCriterion("is_company_fivehun between", value1, value2, "isCompanyFivehun");
            return (Criteria) this;
        }

        public Criteria andIsCompanyFivehunNotBetween(Byte value1, Byte value2) {
            addCriterion("is_company_fivehun not between", value1, value2, "isCompanyFivehun");
            return (Criteria) this;
        }

        public Criteria andIsAllowContactIsNull() {
            addCriterion("is_allow_contact is null");
            return (Criteria) this;
        }

        public Criteria andIsAllowContactIsNotNull() {
            addCriterion("is_allow_contact is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllowContactEqualTo(Byte value) {
            addCriterion("is_allow_contact =", value, "isAllowContact");
            return (Criteria) this;
        }

        public Criteria andIsAllowContactNotEqualTo(Byte value) {
            addCriterion("is_allow_contact <>", value, "isAllowContact");
            return (Criteria) this;
        }

        public Criteria andIsAllowContactGreaterThan(Byte value) {
            addCriterion("is_allow_contact >", value, "isAllowContact");
            return (Criteria) this;
        }

        public Criteria andIsAllowContactGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_allow_contact >=", value, "isAllowContact");
            return (Criteria) this;
        }

        public Criteria andIsAllowContactLessThan(Byte value) {
            addCriterion("is_allow_contact <", value, "isAllowContact");
            return (Criteria) this;
        }

        public Criteria andIsAllowContactLessThanOrEqualTo(Byte value) {
            addCriterion("is_allow_contact <=", value, "isAllowContact");
            return (Criteria) this;
        }

        public Criteria andIsAllowContactIn(List<Byte> values) {
            addCriterion("is_allow_contact in", values, "isAllowContact");
            return (Criteria) this;
        }

        public Criteria andIsAllowContactNotIn(List<Byte> values) {
            addCriterion("is_allow_contact not in", values, "isAllowContact");
            return (Criteria) this;
        }

        public Criteria andIsAllowContactBetween(Byte value1, Byte value2) {
            addCriterion("is_allow_contact between", value1, value2, "isAllowContact");
            return (Criteria) this;
        }

        public Criteria andIsAllowContactNotBetween(Byte value1, Byte value2) {
            addCriterion("is_allow_contact not between", value1, value2, "isAllowContact");
            return (Criteria) this;
        }

        public Criteria andIsAllowRecordIsNull() {
            addCriterion("is_allow_record is null");
            return (Criteria) this;
        }

        public Criteria andIsAllowRecordIsNotNull() {
            addCriterion("is_allow_record is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllowRecordEqualTo(Byte value) {
            addCriterion("is_allow_record =", value, "isAllowRecord");
            return (Criteria) this;
        }

        public Criteria andIsAllowRecordNotEqualTo(Byte value) {
            addCriterion("is_allow_record <>", value, "isAllowRecord");
            return (Criteria) this;
        }

        public Criteria andIsAllowRecordGreaterThan(Byte value) {
            addCriterion("is_allow_record >", value, "isAllowRecord");
            return (Criteria) this;
        }

        public Criteria andIsAllowRecordGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_allow_record >=", value, "isAllowRecord");
            return (Criteria) this;
        }

        public Criteria andIsAllowRecordLessThan(Byte value) {
            addCriterion("is_allow_record <", value, "isAllowRecord");
            return (Criteria) this;
        }

        public Criteria andIsAllowRecordLessThanOrEqualTo(Byte value) {
            addCriterion("is_allow_record <=", value, "isAllowRecord");
            return (Criteria) this;
        }

        public Criteria andIsAllowRecordIn(List<Byte> values) {
            addCriterion("is_allow_record in", values, "isAllowRecord");
            return (Criteria) this;
        }

        public Criteria andIsAllowRecordNotIn(List<Byte> values) {
            addCriterion("is_allow_record not in", values, "isAllowRecord");
            return (Criteria) this;
        }

        public Criteria andIsAllowRecordBetween(Byte value1, Byte value2) {
            addCriterion("is_allow_record between", value1, value2, "isAllowRecord");
            return (Criteria) this;
        }

        public Criteria andIsAllowRecordNotBetween(Byte value1, Byte value2) {
            addCriterion("is_allow_record not between", value1, value2, "isAllowRecord");
            return (Criteria) this;
        }

        public Criteria andIsAllowMessageIsNull() {
            addCriterion("is_allow_message is null");
            return (Criteria) this;
        }

        public Criteria andIsAllowMessageIsNotNull() {
            addCriterion("is_allow_message is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllowMessageEqualTo(Byte value) {
            addCriterion("is_allow_message =", value, "isAllowMessage");
            return (Criteria) this;
        }

        public Criteria andIsAllowMessageNotEqualTo(Byte value) {
            addCriterion("is_allow_message <>", value, "isAllowMessage");
            return (Criteria) this;
        }

        public Criteria andIsAllowMessageGreaterThan(Byte value) {
            addCriterion("is_allow_message >", value, "isAllowMessage");
            return (Criteria) this;
        }

        public Criteria andIsAllowMessageGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_allow_message >=", value, "isAllowMessage");
            return (Criteria) this;
        }

        public Criteria andIsAllowMessageLessThan(Byte value) {
            addCriterion("is_allow_message <", value, "isAllowMessage");
            return (Criteria) this;
        }

        public Criteria andIsAllowMessageLessThanOrEqualTo(Byte value) {
            addCriterion("is_allow_message <=", value, "isAllowMessage");
            return (Criteria) this;
        }

        public Criteria andIsAllowMessageIn(List<Byte> values) {
            addCriterion("is_allow_message in", values, "isAllowMessage");
            return (Criteria) this;
        }

        public Criteria andIsAllowMessageNotIn(List<Byte> values) {
            addCriterion("is_allow_message not in", values, "isAllowMessage");
            return (Criteria) this;
        }

        public Criteria andIsAllowMessageBetween(Byte value1, Byte value2) {
            addCriterion("is_allow_message between", value1, value2, "isAllowMessage");
            return (Criteria) this;
        }

        public Criteria andIsAllowMessageNotBetween(Byte value1, Byte value2) {
            addCriterion("is_allow_message not between", value1, value2, "isAllowMessage");
            return (Criteria) this;
        }

        public Criteria andIsAllowLocationIsNull() {
            addCriterion("is_allow_location is null");
            return (Criteria) this;
        }

        public Criteria andIsAllowLocationIsNotNull() {
            addCriterion("is_allow_location is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllowLocationEqualTo(Byte value) {
            addCriterion("is_allow_location =", value, "isAllowLocation");
            return (Criteria) this;
        }

        public Criteria andIsAllowLocationNotEqualTo(Byte value) {
            addCriterion("is_allow_location <>", value, "isAllowLocation");
            return (Criteria) this;
        }

        public Criteria andIsAllowLocationGreaterThan(Byte value) {
            addCriterion("is_allow_location >", value, "isAllowLocation");
            return (Criteria) this;
        }

        public Criteria andIsAllowLocationGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_allow_location >=", value, "isAllowLocation");
            return (Criteria) this;
        }

        public Criteria andIsAllowLocationLessThan(Byte value) {
            addCriterion("is_allow_location <", value, "isAllowLocation");
            return (Criteria) this;
        }

        public Criteria andIsAllowLocationLessThanOrEqualTo(Byte value) {
            addCriterion("is_allow_location <=", value, "isAllowLocation");
            return (Criteria) this;
        }

        public Criteria andIsAllowLocationIn(List<Byte> values) {
            addCriterion("is_allow_location in", values, "isAllowLocation");
            return (Criteria) this;
        }

        public Criteria andIsAllowLocationNotIn(List<Byte> values) {
            addCriterion("is_allow_location not in", values, "isAllowLocation");
            return (Criteria) this;
        }

        public Criteria andIsAllowLocationBetween(Byte value1, Byte value2) {
            addCriterion("is_allow_location between", value1, value2, "isAllowLocation");
            return (Criteria) this;
        }

        public Criteria andIsAllowLocationNotBetween(Byte value1, Byte value2) {
            addCriterion("is_allow_location not between", value1, value2, "isAllowLocation");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(Byte value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(Byte value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(Byte value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(Byte value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(Byte value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(Byte value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<Byte> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<Byte> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(Byte value1, Byte value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(Byte value1, Byte value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIsNull() {
            addCriterion("work_place is null");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIsNotNull() {
            addCriterion("work_place is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceEqualTo(String value) {
            addCriterion("work_place =", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotEqualTo(String value) {
            addCriterion("work_place <>", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceGreaterThan(String value) {
            addCriterion("work_place >", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("work_place >=", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLessThan(String value) {
            addCriterion("work_place <", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLessThanOrEqualTo(String value) {
            addCriterion("work_place <=", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLike(String value) {
            addCriterion("work_place like", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotLike(String value) {
            addCriterion("work_place not like", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIn(List<String> values) {
            addCriterion("work_place in", values, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotIn(List<String> values) {
            addCriterion("work_place not in", values, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceBetween(String value1, String value2) {
            addCriterion("work_place between", value1, value2, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotBetween(String value1, String value2) {
            addCriterion("work_place not between", value1, value2, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIsNull() {
            addCriterion("work_experience is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIsNotNull() {
            addCriterion("work_experience is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceEqualTo(String value) {
            addCriterion("work_experience =", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotEqualTo(String value) {
            addCriterion("work_experience <>", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceGreaterThan(String value) {
            addCriterion("work_experience >", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("work_experience >=", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceLessThan(String value) {
            addCriterion("work_experience <", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceLessThanOrEqualTo(String value) {
            addCriterion("work_experience <=", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceLike(String value) {
            addCriterion("work_experience like", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotLike(String value) {
            addCriterion("work_experience not like", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIn(List<String> values) {
            addCriterion("work_experience in", values, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotIn(List<String> values) {
            addCriterion("work_experience not in", values, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceBetween(String value1, String value2) {
            addCriterion("work_experience between", value1, value2, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotBetween(String value1, String value2) {
            addCriterion("work_experience not between", value1, value2, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWantedLimitIsNull() {
            addCriterion("wanted_limit is null");
            return (Criteria) this;
        }

        public Criteria andWantedLimitIsNotNull() {
            addCriterion("wanted_limit is not null");
            return (Criteria) this;
        }

        public Criteria andWantedLimitEqualTo(Integer value) {
            addCriterion("wanted_limit =", value, "wantedLimit");
            return (Criteria) this;
        }

        public Criteria andWantedLimitNotEqualTo(Integer value) {
            addCriterion("wanted_limit <>", value, "wantedLimit");
            return (Criteria) this;
        }

        public Criteria andWantedLimitGreaterThan(Integer value) {
            addCriterion("wanted_limit >", value, "wantedLimit");
            return (Criteria) this;
        }

        public Criteria andWantedLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("wanted_limit >=", value, "wantedLimit");
            return (Criteria) this;
        }

        public Criteria andWantedLimitLessThan(Integer value) {
            addCriterion("wanted_limit <", value, "wantedLimit");
            return (Criteria) this;
        }

        public Criteria andWantedLimitLessThanOrEqualTo(Integer value) {
            addCriterion("wanted_limit <=", value, "wantedLimit");
            return (Criteria) this;
        }

        public Criteria andWantedLimitIn(List<Integer> values) {
            addCriterion("wanted_limit in", values, "wantedLimit");
            return (Criteria) this;
        }

        public Criteria andWantedLimitNotIn(List<Integer> values) {
            addCriterion("wanted_limit not in", values, "wantedLimit");
            return (Criteria) this;
        }

        public Criteria andWantedLimitBetween(Integer value1, Integer value2) {
            addCriterion("wanted_limit between", value1, value2, "wantedLimit");
            return (Criteria) this;
        }

        public Criteria andWantedLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("wanted_limit not between", value1, value2, "wantedLimit");
            return (Criteria) this;
        }

        public Criteria andWantedPeriodIsNull() {
            addCriterion("wanted_period is null");
            return (Criteria) this;
        }

        public Criteria andWantedPeriodIsNotNull() {
            addCriterion("wanted_period is not null");
            return (Criteria) this;
        }

        public Criteria andWantedPeriodEqualTo(Byte value) {
            addCriterion("wanted_period =", value, "wantedPeriod");
            return (Criteria) this;
        }

        public Criteria andWantedPeriodNotEqualTo(Byte value) {
            addCriterion("wanted_period <>", value, "wantedPeriod");
            return (Criteria) this;
        }

        public Criteria andWantedPeriodGreaterThan(Byte value) {
            addCriterion("wanted_period >", value, "wantedPeriod");
            return (Criteria) this;
        }

        public Criteria andWantedPeriodGreaterThanOrEqualTo(Byte value) {
            addCriterion("wanted_period >=", value, "wantedPeriod");
            return (Criteria) this;
        }

        public Criteria andWantedPeriodLessThan(Byte value) {
            addCriterion("wanted_period <", value, "wantedPeriod");
            return (Criteria) this;
        }

        public Criteria andWantedPeriodLessThanOrEqualTo(Byte value) {
            addCriterion("wanted_period <=", value, "wantedPeriod");
            return (Criteria) this;
        }

        public Criteria andWantedPeriodIn(List<Byte> values) {
            addCriterion("wanted_period in", values, "wantedPeriod");
            return (Criteria) this;
        }

        public Criteria andWantedPeriodNotIn(List<Byte> values) {
            addCriterion("wanted_period not in", values, "wantedPeriod");
            return (Criteria) this;
        }

        public Criteria andWantedPeriodBetween(Byte value1, Byte value2) {
            addCriterion("wanted_period between", value1, value2, "wantedPeriod");
            return (Criteria) this;
        }

        public Criteria andWantedPeriodNotBetween(Byte value1, Byte value2) {
            addCriterion("wanted_period not between", value1, value2, "wantedPeriod");
            return (Criteria) this;
        }

        public Criteria andWantedRepayDayIsNull() {
            addCriterion("wanted_repay_day is null");
            return (Criteria) this;
        }

        public Criteria andWantedRepayDayIsNotNull() {
            addCriterion("wanted_repay_day is not null");
            return (Criteria) this;
        }

        public Criteria andWantedRepayDayEqualTo(Byte value) {
            addCriterion("wanted_repay_day =", value, "wantedRepayDay");
            return (Criteria) this;
        }

        public Criteria andWantedRepayDayNotEqualTo(Byte value) {
            addCriterion("wanted_repay_day <>", value, "wantedRepayDay");
            return (Criteria) this;
        }

        public Criteria andWantedRepayDayGreaterThan(Byte value) {
            addCriterion("wanted_repay_day >", value, "wantedRepayDay");
            return (Criteria) this;
        }

        public Criteria andWantedRepayDayGreaterThanOrEqualTo(Byte value) {
            addCriterion("wanted_repay_day >=", value, "wantedRepayDay");
            return (Criteria) this;
        }

        public Criteria andWantedRepayDayLessThan(Byte value) {
            addCriterion("wanted_repay_day <", value, "wantedRepayDay");
            return (Criteria) this;
        }

        public Criteria andWantedRepayDayLessThanOrEqualTo(Byte value) {
            addCriterion("wanted_repay_day <=", value, "wantedRepayDay");
            return (Criteria) this;
        }

        public Criteria andWantedRepayDayIn(List<Byte> values) {
            addCriterion("wanted_repay_day in", values, "wantedRepayDay");
            return (Criteria) this;
        }

        public Criteria andWantedRepayDayNotIn(List<Byte> values) {
            addCriterion("wanted_repay_day not in", values, "wantedRepayDay");
            return (Criteria) this;
        }

        public Criteria andWantedRepayDayBetween(Byte value1, Byte value2) {
            addCriterion("wanted_repay_day between", value1, value2, "wantedRepayDay");
            return (Criteria) this;
        }

        public Criteria andWantedRepayDayNotBetween(Byte value1, Byte value2) {
            addCriterion("wanted_repay_day not between", value1, value2, "wantedRepayDay");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNull() {
            addCriterion("marriage is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNotNull() {
            addCriterion("marriage is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageEqualTo(Byte value) {
            addCriterion("marriage =", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotEqualTo(Byte value) {
            addCriterion("marriage <>", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThan(Byte value) {
            addCriterion("marriage >", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThanOrEqualTo(Byte value) {
            addCriterion("marriage >=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThan(Byte value) {
            addCriterion("marriage <", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThanOrEqualTo(Byte value) {
            addCriterion("marriage <=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageIn(List<Byte> values) {
            addCriterion("marriage in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotIn(List<Byte> values) {
            addCriterion("marriage not in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageBetween(Byte value1, Byte value2) {
            addCriterion("marriage between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotBetween(Byte value1, Byte value2) {
            addCriterion("marriage not between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andChildAmountIsNull() {
            addCriterion("child_amount is null");
            return (Criteria) this;
        }

        public Criteria andChildAmountIsNotNull() {
            addCriterion("child_amount is not null");
            return (Criteria) this;
        }

        public Criteria andChildAmountEqualTo(Byte value) {
            addCriterion("child_amount =", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountNotEqualTo(Byte value) {
            addCriterion("child_amount <>", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountGreaterThan(Byte value) {
            addCriterion("child_amount >", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountGreaterThanOrEqualTo(Byte value) {
            addCriterion("child_amount >=", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountLessThan(Byte value) {
            addCriterion("child_amount <", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountLessThanOrEqualTo(Byte value) {
            addCriterion("child_amount <=", value, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountIn(List<Byte> values) {
            addCriterion("child_amount in", values, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountNotIn(List<Byte> values) {
            addCriterion("child_amount not in", values, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountBetween(Byte value1, Byte value2) {
            addCriterion("child_amount between", value1, value2, "childAmount");
            return (Criteria) this;
        }

        public Criteria andChildAmountNotBetween(Byte value1, Byte value2) {
            addCriterion("child_amount not between", value1, value2, "childAmount");
            return (Criteria) this;
        }

        public Criteria andFamilyAmountIsNull() {
            addCriterion("family_amount is null");
            return (Criteria) this;
        }

        public Criteria andFamilyAmountIsNotNull() {
            addCriterion("family_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyAmountEqualTo(Byte value) {
            addCriterion("family_amount =", value, "familyAmount");
            return (Criteria) this;
        }

        public Criteria andFamilyAmountNotEqualTo(Byte value) {
            addCriterion("family_amount <>", value, "familyAmount");
            return (Criteria) this;
        }

        public Criteria andFamilyAmountGreaterThan(Byte value) {
            addCriterion("family_amount >", value, "familyAmount");
            return (Criteria) this;
        }

        public Criteria andFamilyAmountGreaterThanOrEqualTo(Byte value) {
            addCriterion("family_amount >=", value, "familyAmount");
            return (Criteria) this;
        }

        public Criteria andFamilyAmountLessThan(Byte value) {
            addCriterion("family_amount <", value, "familyAmount");
            return (Criteria) this;
        }

        public Criteria andFamilyAmountLessThanOrEqualTo(Byte value) {
            addCriterion("family_amount <=", value, "familyAmount");
            return (Criteria) this;
        }

        public Criteria andFamilyAmountIn(List<Byte> values) {
            addCriterion("family_amount in", values, "familyAmount");
            return (Criteria) this;
        }

        public Criteria andFamilyAmountNotIn(List<Byte> values) {
            addCriterion("family_amount not in", values, "familyAmount");
            return (Criteria) this;
        }

        public Criteria andFamilyAmountBetween(Byte value1, Byte value2) {
            addCriterion("family_amount between", value1, value2, "familyAmount");
            return (Criteria) this;
        }

        public Criteria andFamilyAmountNotBetween(Byte value1, Byte value2) {
            addCriterion("family_amount not between", value1, value2, "familyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andYearPayIsNull() {
            addCriterion("year_pay is null");
            return (Criteria) this;
        }

        public Criteria andYearPayIsNotNull() {
            addCriterion("year_pay is not null");
            return (Criteria) this;
        }

        public Criteria andYearPayEqualTo(BigDecimal value) {
            addCriterion("year_pay =", value, "yearPay");
            return (Criteria) this;
        }

        public Criteria andYearPayNotEqualTo(BigDecimal value) {
            addCriterion("year_pay <>", value, "yearPay");
            return (Criteria) this;
        }

        public Criteria andYearPayGreaterThan(BigDecimal value) {
            addCriterion("year_pay >", value, "yearPay");
            return (Criteria) this;
        }

        public Criteria andYearPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("year_pay >=", value, "yearPay");
            return (Criteria) this;
        }

        public Criteria andYearPayLessThan(BigDecimal value) {
            addCriterion("year_pay <", value, "yearPay");
            return (Criteria) this;
        }

        public Criteria andYearPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("year_pay <=", value, "yearPay");
            return (Criteria) this;
        }

        public Criteria andYearPayIn(List<BigDecimal> values) {
            addCriterion("year_pay in", values, "yearPay");
            return (Criteria) this;
        }

        public Criteria andYearPayNotIn(List<BigDecimal> values) {
            addCriterion("year_pay not in", values, "yearPay");
            return (Criteria) this;
        }

        public Criteria andYearPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("year_pay between", value1, value2, "yearPay");
            return (Criteria) this;
        }

        public Criteria andYearPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("year_pay not between", value1, value2, "yearPay");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqAgeIsNull() {
            addCriterion("qq_age is null");
            return (Criteria) this;
        }

        public Criteria andQqAgeIsNotNull() {
            addCriterion("qq_age is not null");
            return (Criteria) this;
        }

        public Criteria andQqAgeEqualTo(Short value) {
            addCriterion("qq_age =", value, "qqAge");
            return (Criteria) this;
        }

        public Criteria andQqAgeNotEqualTo(Short value) {
            addCriterion("qq_age <>", value, "qqAge");
            return (Criteria) this;
        }

        public Criteria andQqAgeGreaterThan(Short value) {
            addCriterion("qq_age >", value, "qqAge");
            return (Criteria) this;
        }

        public Criteria andQqAgeGreaterThanOrEqualTo(Short value) {
            addCriterion("qq_age >=", value, "qqAge");
            return (Criteria) this;
        }

        public Criteria andQqAgeLessThan(Short value) {
            addCriterion("qq_age <", value, "qqAge");
            return (Criteria) this;
        }

        public Criteria andQqAgeLessThanOrEqualTo(Short value) {
            addCriterion("qq_age <=", value, "qqAge");
            return (Criteria) this;
        }

        public Criteria andQqAgeIn(List<Short> values) {
            addCriterion("qq_age in", values, "qqAge");
            return (Criteria) this;
        }

        public Criteria andQqAgeNotIn(List<Short> values) {
            addCriterion("qq_age not in", values, "qqAge");
            return (Criteria) this;
        }

        public Criteria andQqAgeBetween(Short value1, Short value2) {
            addCriterion("qq_age between", value1, value2, "qqAge");
            return (Criteria) this;
        }

        public Criteria andQqAgeNotBetween(Short value1, Short value2) {
            addCriterion("qq_age not between", value1, value2, "qqAge");
            return (Criteria) this;
        }

        public Criteria andWxAgeIsNull() {
            addCriterion("wx_age is null");
            return (Criteria) this;
        }

        public Criteria andWxAgeIsNotNull() {
            addCriterion("wx_age is not null");
            return (Criteria) this;
        }

        public Criteria andWxAgeEqualTo(Short value) {
            addCriterion("wx_age =", value, "wxAge");
            return (Criteria) this;
        }

        public Criteria andWxAgeNotEqualTo(Short value) {
            addCriterion("wx_age <>", value, "wxAge");
            return (Criteria) this;
        }

        public Criteria andWxAgeGreaterThan(Short value) {
            addCriterion("wx_age >", value, "wxAge");
            return (Criteria) this;
        }

        public Criteria andWxAgeGreaterThanOrEqualTo(Short value) {
            addCriterion("wx_age >=", value, "wxAge");
            return (Criteria) this;
        }

        public Criteria andWxAgeLessThan(Short value) {
            addCriterion("wx_age <", value, "wxAge");
            return (Criteria) this;
        }

        public Criteria andWxAgeLessThanOrEqualTo(Short value) {
            addCriterion("wx_age <=", value, "wxAge");
            return (Criteria) this;
        }

        public Criteria andWxAgeIn(List<Short> values) {
            addCriterion("wx_age in", values, "wxAge");
            return (Criteria) this;
        }

        public Criteria andWxAgeNotIn(List<Short> values) {
            addCriterion("wx_age not in", values, "wxAge");
            return (Criteria) this;
        }

        public Criteria andWxAgeBetween(Short value1, Short value2) {
            addCriterion("wx_age between", value1, value2, "wxAge");
            return (Criteria) this;
        }

        public Criteria andWxAgeNotBetween(Short value1, Short value2) {
            addCriterion("wx_age not between", value1, value2, "wxAge");
            return (Criteria) this;
        }

        public Criteria andWxIsNull() {
            addCriterion("wx is null");
            return (Criteria) this;
        }

        public Criteria andWxIsNotNull() {
            addCriterion("wx is not null");
            return (Criteria) this;
        }

        public Criteria andWxEqualTo(String value) {
            addCriterion("wx =", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotEqualTo(String value) {
            addCriterion("wx <>", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxGreaterThan(String value) {
            addCriterion("wx >", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxGreaterThanOrEqualTo(String value) {
            addCriterion("wx >=", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxLessThan(String value) {
            addCriterion("wx <", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxLessThanOrEqualTo(String value) {
            addCriterion("wx <=", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxLike(String value) {
            addCriterion("wx like", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotLike(String value) {
            addCriterion("wx not like", value, "wx");
            return (Criteria) this;
        }

        public Criteria andWxIn(List<String> values) {
            addCriterion("wx in", values, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotIn(List<String> values) {
            addCriterion("wx not in", values, "wx");
            return (Criteria) this;
        }

        public Criteria andWxBetween(String value1, String value2) {
            addCriterion("wx between", value1, value2, "wx");
            return (Criteria) this;
        }

        public Criteria andWxNotBetween(String value1, String value2) {
            addCriterion("wx not between", value1, value2, "wx");
            return (Criteria) this;
        }

        public Criteria andFengkongStateIsNull() {
            addCriterion("fengkong_state is null");
            return (Criteria) this;
        }

        public Criteria andFengkongStateIsNotNull() {
            addCriterion("fengkong_state is not null");
            return (Criteria) this;
        }

        public Criteria andFengkongStateEqualTo(Byte value) {
            addCriterion("fengkong_state =", value, "fengkongState");
            return (Criteria) this;
        }

        public Criteria andFengkongStateNotEqualTo(Byte value) {
            addCriterion("fengkong_state <>", value, "fengkongState");
            return (Criteria) this;
        }

        public Criteria andFengkongStateGreaterThan(Byte value) {
            addCriterion("fengkong_state >", value, "fengkongState");
            return (Criteria) this;
        }

        public Criteria andFengkongStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("fengkong_state >=", value, "fengkongState");
            return (Criteria) this;
        }

        public Criteria andFengkongStateLessThan(Byte value) {
            addCriterion("fengkong_state <", value, "fengkongState");
            return (Criteria) this;
        }

        public Criteria andFengkongStateLessThanOrEqualTo(Byte value) {
            addCriterion("fengkong_state <=", value, "fengkongState");
            return (Criteria) this;
        }

        public Criteria andFengkongStateIn(List<Byte> values) {
            addCriterion("fengkong_state in", values, "fengkongState");
            return (Criteria) this;
        }

        public Criteria andFengkongStateNotIn(List<Byte> values) {
            addCriterion("fengkong_state not in", values, "fengkongState");
            return (Criteria) this;
        }

        public Criteria andFengkongStateBetween(Byte value1, Byte value2) {
            addCriterion("fengkong_state between", value1, value2, "fengkongState");
            return (Criteria) this;
        }

        public Criteria andFengkongStateNotBetween(Byte value1, Byte value2) {
            addCriterion("fengkong_state not between", value1, value2, "fengkongState");
            return (Criteria) this;
        }

        public Criteria andApplyStateIsNull() {
            addCriterion("apply_state is null");
            return (Criteria) this;
        }

        public Criteria andApplyStateIsNotNull() {
            addCriterion("apply_state is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStateEqualTo(Byte value) {
            addCriterion("apply_state =", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotEqualTo(Byte value) {
            addCriterion("apply_state <>", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateGreaterThan(Byte value) {
            addCriterion("apply_state >", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("apply_state >=", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateLessThan(Byte value) {
            addCriterion("apply_state <", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateLessThanOrEqualTo(Byte value) {
            addCriterion("apply_state <=", value, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateIn(List<Byte> values) {
            addCriterion("apply_state in", values, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotIn(List<Byte> values) {
            addCriterion("apply_state not in", values, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateBetween(Byte value1, Byte value2) {
            addCriterion("apply_state between", value1, value2, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStateNotBetween(Byte value1, Byte value2) {
            addCriterion("apply_state not between", value1, value2, "applyState");
            return (Criteria) this;
        }

        public Criteria andApplyStepIsNull() {
            addCriterion("apply_step is null");
            return (Criteria) this;
        }

        public Criteria andApplyStepIsNotNull() {
            addCriterion("apply_step is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStepEqualTo(Byte value) {
            addCriterion("apply_step =", value, "applyStep");
            return (Criteria) this;
        }

        public Criteria andApplyStepNotEqualTo(Byte value) {
            addCriterion("apply_step <>", value, "applyStep");
            return (Criteria) this;
        }

        public Criteria andApplyStepGreaterThan(Byte value) {
            addCriterion("apply_step >", value, "applyStep");
            return (Criteria) this;
        }

        public Criteria andApplyStepGreaterThanOrEqualTo(Byte value) {
            addCriterion("apply_step >=", value, "applyStep");
            return (Criteria) this;
        }

        public Criteria andApplyStepLessThan(Byte value) {
            addCriterion("apply_step <", value, "applyStep");
            return (Criteria) this;
        }

        public Criteria andApplyStepLessThanOrEqualTo(Byte value) {
            addCriterion("apply_step <=", value, "applyStep");
            return (Criteria) this;
        }

        public Criteria andApplyStepIn(List<Byte> values) {
            addCriterion("apply_step in", values, "applyStep");
            return (Criteria) this;
        }

        public Criteria andApplyStepNotIn(List<Byte> values) {
            addCriterion("apply_step not in", values, "applyStep");
            return (Criteria) this;
        }

        public Criteria andApplyStepBetween(Byte value1, Byte value2) {
            addCriterion("apply_step between", value1, value2, "applyStep");
            return (Criteria) this;
        }

        public Criteria andApplyStepNotBetween(Byte value1, Byte value2) {
            addCriterion("apply_step not between", value1, value2, "applyStep");
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

        public Criteria andBuyTypeIsNull() {
            addCriterion("buy_type is null");
            return (Criteria) this;
        }

        public Criteria andBuyTypeIsNotNull() {
            addCriterion("buy_type is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTypeEqualTo(Byte value) {
            addCriterion("buy_type =", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeNotEqualTo(Byte value) {
            addCriterion("buy_type <>", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeGreaterThan(Byte value) {
            addCriterion("buy_type >", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("buy_type >=", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeLessThan(Byte value) {
            addCriterion("buy_type <", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeLessThanOrEqualTo(Byte value) {
            addCriterion("buy_type <=", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeIn(List<Byte> values) {
            addCriterion("buy_type in", values, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeNotIn(List<Byte> values) {
            addCriterion("buy_type not in", values, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeBetween(Byte value1, Byte value2) {
            addCriterion("buy_type between", value1, value2, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("buy_type not between", value1, value2, "buyType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNull() {
            addCriterion("house_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("house_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(Byte value) {
            addCriterion("house_type =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(Byte value) {
            addCriterion("house_type <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(Byte value) {
            addCriterion("house_type >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("house_type >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(Byte value) {
            addCriterion("house_type <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(Byte value) {
            addCriterion("house_type <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<Byte> values) {
            addCriterion("house_type in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<Byte> values) {
            addCriterion("house_type not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(Byte value1, Byte value2) {
            addCriterion("house_type between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("house_type not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseCatyIsNull() {
            addCriterion("house_caty is null");
            return (Criteria) this;
        }

        public Criteria andHouseCatyIsNotNull() {
            addCriterion("house_caty is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCatyEqualTo(Byte value) {
            addCriterion("house_caty =", value, "houseCaty");
            return (Criteria) this;
        }

        public Criteria andHouseCatyNotEqualTo(Byte value) {
            addCriterion("house_caty <>", value, "houseCaty");
            return (Criteria) this;
        }

        public Criteria andHouseCatyGreaterThan(Byte value) {
            addCriterion("house_caty >", value, "houseCaty");
            return (Criteria) this;
        }

        public Criteria andHouseCatyGreaterThanOrEqualTo(Byte value) {
            addCriterion("house_caty >=", value, "houseCaty");
            return (Criteria) this;
        }

        public Criteria andHouseCatyLessThan(Byte value) {
            addCriterion("house_caty <", value, "houseCaty");
            return (Criteria) this;
        }

        public Criteria andHouseCatyLessThanOrEqualTo(Byte value) {
            addCriterion("house_caty <=", value, "houseCaty");
            return (Criteria) this;
        }

        public Criteria andHouseCatyIn(List<Byte> values) {
            addCriterion("house_caty in", values, "houseCaty");
            return (Criteria) this;
        }

        public Criteria andHouseCatyNotIn(List<Byte> values) {
            addCriterion("house_caty not in", values, "houseCaty");
            return (Criteria) this;
        }

        public Criteria andHouseCatyBetween(Byte value1, Byte value2) {
            addCriterion("house_caty between", value1, value2, "houseCaty");
            return (Criteria) this;
        }

        public Criteria andHouseCatyNotBetween(Byte value1, Byte value2) {
            addCriterion("house_caty not between", value1, value2, "houseCaty");
            return (Criteria) this;
        }

        public Criteria andHouseBigIsNull() {
            addCriterion("house_big is null");
            return (Criteria) this;
        }

        public Criteria andHouseBigIsNotNull() {
            addCriterion("house_big is not null");
            return (Criteria) this;
        }

        public Criteria andHouseBigEqualTo(Short value) {
            addCriterion("house_big =", value, "houseBig");
            return (Criteria) this;
        }

        public Criteria andHouseBigNotEqualTo(Short value) {
            addCriterion("house_big <>", value, "houseBig");
            return (Criteria) this;
        }

        public Criteria andHouseBigGreaterThan(Short value) {
            addCriterion("house_big >", value, "houseBig");
            return (Criteria) this;
        }

        public Criteria andHouseBigGreaterThanOrEqualTo(Short value) {
            addCriterion("house_big >=", value, "houseBig");
            return (Criteria) this;
        }

        public Criteria andHouseBigLessThan(Short value) {
            addCriterion("house_big <", value, "houseBig");
            return (Criteria) this;
        }

        public Criteria andHouseBigLessThanOrEqualTo(Short value) {
            addCriterion("house_big <=", value, "houseBig");
            return (Criteria) this;
        }

        public Criteria andHouseBigIn(List<Short> values) {
            addCriterion("house_big in", values, "houseBig");
            return (Criteria) this;
        }

        public Criteria andHouseBigNotIn(List<Short> values) {
            addCriterion("house_big not in", values, "houseBig");
            return (Criteria) this;
        }

        public Criteria andHouseBigBetween(Short value1, Short value2) {
            addCriterion("house_big between", value1, value2, "houseBig");
            return (Criteria) this;
        }

        public Criteria andHouseBigNotBetween(Short value1, Short value2) {
            addCriterion("house_big not between", value1, value2, "houseBig");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(BigDecimal value) {
            addCriterion("loan_amount =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(BigDecimal value) {
            addCriterion("loan_amount <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(BigDecimal value) {
            addCriterion("loan_amount >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(BigDecimal value) {
            addCriterion("loan_amount <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<BigDecimal> values) {
            addCriterion("loan_amount in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<BigDecimal> values) {
            addCriterion("loan_amount not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(BigDecimal value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(BigDecimal value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(BigDecimal value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(BigDecimal value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<BigDecimal> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<BigDecimal> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIsNull() {
            addCriterion("social_security is null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIsNotNull() {
            addCriterion("social_security is not null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityEqualTo(Byte value) {
            addCriterion("social_security =", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityNotEqualTo(Byte value) {
            addCriterion("social_security <>", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityGreaterThan(Byte value) {
            addCriterion("social_security >", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityGreaterThanOrEqualTo(Byte value) {
            addCriterion("social_security >=", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityLessThan(Byte value) {
            addCriterion("social_security <", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityLessThanOrEqualTo(Byte value) {
            addCriterion("social_security <=", value, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIn(List<Byte> values) {
            addCriterion("social_security in", values, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityNotIn(List<Byte> values) {
            addCriterion("social_security not in", values, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityBetween(Byte value1, Byte value2) {
            addCriterion("social_security between", value1, value2, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityNotBetween(Byte value1, Byte value2) {
            addCriterion("social_security not between", value1, value2, "socialSecurity");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundIsNull() {
            addCriterion("accumulation_fund is null");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundIsNotNull() {
            addCriterion("accumulation_fund is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundEqualTo(Byte value) {
            addCriterion("accumulation_fund =", value, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundNotEqualTo(Byte value) {
            addCriterion("accumulation_fund <>", value, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundGreaterThan(Byte value) {
            addCriterion("accumulation_fund >", value, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundGreaterThanOrEqualTo(Byte value) {
            addCriterion("accumulation_fund >=", value, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundLessThan(Byte value) {
            addCriterion("accumulation_fund <", value, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundLessThanOrEqualTo(Byte value) {
            addCriterion("accumulation_fund <=", value, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundIn(List<Byte> values) {
            addCriterion("accumulation_fund in", values, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundNotIn(List<Byte> values) {
            addCriterion("accumulation_fund not in", values, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundBetween(Byte value1, Byte value2) {
            addCriterion("accumulation_fund between", value1, value2, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andAccumulationFundNotBetween(Byte value1, Byte value2) {
            addCriterion("accumulation_fund not between", value1, value2, "accumulationFund");
            return (Criteria) this;
        }

        public Criteria andJingdongQutoIsNull() {
            addCriterion("jingdong_quto is null");
            return (Criteria) this;
        }

        public Criteria andJingdongQutoIsNotNull() {
            addCriterion("jingdong_quto is not null");
            return (Criteria) this;
        }

        public Criteria andJingdongQutoEqualTo(BigDecimal value) {
            addCriterion("jingdong_quto =", value, "jingdongQuto");
            return (Criteria) this;
        }

        public Criteria andJingdongQutoNotEqualTo(BigDecimal value) {
            addCriterion("jingdong_quto <>", value, "jingdongQuto");
            return (Criteria) this;
        }

        public Criteria andJingdongQutoGreaterThan(BigDecimal value) {
            addCriterion("jingdong_quto >", value, "jingdongQuto");
            return (Criteria) this;
        }

        public Criteria andJingdongQutoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("jingdong_quto >=", value, "jingdongQuto");
            return (Criteria) this;
        }

        public Criteria andJingdongQutoLessThan(BigDecimal value) {
            addCriterion("jingdong_quto <", value, "jingdongQuto");
            return (Criteria) this;
        }

        public Criteria andJingdongQutoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("jingdong_quto <=", value, "jingdongQuto");
            return (Criteria) this;
        }

        public Criteria andJingdongQutoIn(List<BigDecimal> values) {
            addCriterion("jingdong_quto in", values, "jingdongQuto");
            return (Criteria) this;
        }

        public Criteria andJingdongQutoNotIn(List<BigDecimal> values) {
            addCriterion("jingdong_quto not in", values, "jingdongQuto");
            return (Criteria) this;
        }

        public Criteria andJingdongQutoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jingdong_quto between", value1, value2, "jingdongQuto");
            return (Criteria) this;
        }

        public Criteria andJingdongQutoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jingdong_quto not between", value1, value2, "jingdongQuto");
            return (Criteria) this;
        }

        public Criteria andMayijiebQutoIsNull() {
            addCriterion("mayijieb_quto is null");
            return (Criteria) this;
        }

        public Criteria andMayijiebQutoIsNotNull() {
            addCriterion("mayijieb_quto is not null");
            return (Criteria) this;
        }

        public Criteria andMayijiebQutoEqualTo(BigDecimal value) {
            addCriterion("mayijieb_quto =", value, "mayijiebQuto");
            return (Criteria) this;
        }

        public Criteria andMayijiebQutoNotEqualTo(BigDecimal value) {
            addCriterion("mayijieb_quto <>", value, "mayijiebQuto");
            return (Criteria) this;
        }

        public Criteria andMayijiebQutoGreaterThan(BigDecimal value) {
            addCriterion("mayijieb_quto >", value, "mayijiebQuto");
            return (Criteria) this;
        }

        public Criteria andMayijiebQutoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mayijieb_quto >=", value, "mayijiebQuto");
            return (Criteria) this;
        }

        public Criteria andMayijiebQutoLessThan(BigDecimal value) {
            addCriterion("mayijieb_quto <", value, "mayijiebQuto");
            return (Criteria) this;
        }

        public Criteria andMayijiebQutoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mayijieb_quto <=", value, "mayijiebQuto");
            return (Criteria) this;
        }

        public Criteria andMayijiebQutoIn(List<BigDecimal> values) {
            addCriterion("mayijieb_quto in", values, "mayijiebQuto");
            return (Criteria) this;
        }

        public Criteria andMayijiebQutoNotIn(List<BigDecimal> values) {
            addCriterion("mayijieb_quto not in", values, "mayijiebQuto");
            return (Criteria) this;
        }

        public Criteria andMayijiebQutoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mayijieb_quto between", value1, value2, "mayijiebQuto");
            return (Criteria) this;
        }

        public Criteria andMayijiebQutoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mayijieb_quto not between", value1, value2, "mayijiebQuto");
            return (Criteria) this;
        }

        public Criteria andHuabeiQutoIsNull() {
            addCriterion("huabei_quto is null");
            return (Criteria) this;
        }

        public Criteria andHuabeiQutoIsNotNull() {
            addCriterion("huabei_quto is not null");
            return (Criteria) this;
        }

        public Criteria andHuabeiQutoEqualTo(BigDecimal value) {
            addCriterion("huabei_quto =", value, "huabeiQuto");
            return (Criteria) this;
        }

        public Criteria andHuabeiQutoNotEqualTo(BigDecimal value) {
            addCriterion("huabei_quto <>", value, "huabeiQuto");
            return (Criteria) this;
        }

        public Criteria andHuabeiQutoGreaterThan(BigDecimal value) {
            addCriterion("huabei_quto >", value, "huabeiQuto");
            return (Criteria) this;
        }

        public Criteria andHuabeiQutoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("huabei_quto >=", value, "huabeiQuto");
            return (Criteria) this;
        }

        public Criteria andHuabeiQutoLessThan(BigDecimal value) {
            addCriterion("huabei_quto <", value, "huabeiQuto");
            return (Criteria) this;
        }

        public Criteria andHuabeiQutoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("huabei_quto <=", value, "huabeiQuto");
            return (Criteria) this;
        }

        public Criteria andHuabeiQutoIn(List<BigDecimal> values) {
            addCriterion("huabei_quto in", values, "huabeiQuto");
            return (Criteria) this;
        }

        public Criteria andHuabeiQutoNotIn(List<BigDecimal> values) {
            addCriterion("huabei_quto not in", values, "huabeiQuto");
            return (Criteria) this;
        }

        public Criteria andHuabeiQutoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("huabei_quto between", value1, value2, "huabeiQuto");
            return (Criteria) this;
        }

        public Criteria andHuabeiQutoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("huabei_quto not between", value1, value2, "huabeiQuto");
            return (Criteria) this;
        }

        public Criteria andDebitIsNull() {
            addCriterion("debit is null");
            return (Criteria) this;
        }

        public Criteria andDebitIsNotNull() {
            addCriterion("debit is not null");
            return (Criteria) this;
        }

        public Criteria andDebitEqualTo(BigDecimal value) {
            addCriterion("debit =", value, "debit");
            return (Criteria) this;
        }

        public Criteria andDebitNotEqualTo(BigDecimal value) {
            addCriterion("debit <>", value, "debit");
            return (Criteria) this;
        }

        public Criteria andDebitGreaterThan(BigDecimal value) {
            addCriterion("debit >", value, "debit");
            return (Criteria) this;
        }

        public Criteria andDebitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("debit >=", value, "debit");
            return (Criteria) this;
        }

        public Criteria andDebitLessThan(BigDecimal value) {
            addCriterion("debit <", value, "debit");
            return (Criteria) this;
        }

        public Criteria andDebitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("debit <=", value, "debit");
            return (Criteria) this;
        }

        public Criteria andDebitIn(List<BigDecimal> values) {
            addCriterion("debit in", values, "debit");
            return (Criteria) this;
        }

        public Criteria andDebitNotIn(List<BigDecimal> values) {
            addCriterion("debit not in", values, "debit");
            return (Criteria) this;
        }

        public Criteria andDebitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("debit between", value1, value2, "debit");
            return (Criteria) this;
        }

        public Criteria andDebitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("debit not between", value1, value2, "debit");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNull() {
            addCriterion("car_number is null");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNotNull() {
            addCriterion("car_number is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumberEqualTo(String value) {
            addCriterion("car_number =", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotEqualTo(String value) {
            addCriterion("car_number <>", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThan(String value) {
            addCriterion("car_number >", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThanOrEqualTo(String value) {
            addCriterion("car_number >=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThan(String value) {
            addCriterion("car_number <", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThanOrEqualTo(String value) {
            addCriterion("car_number <=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLike(String value) {
            addCriterion("car_number like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotLike(String value) {
            addCriterion("car_number not like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberIn(List<String> values) {
            addCriterion("car_number in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotIn(List<String> values) {
            addCriterion("car_number not in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberBetween(String value1, String value2) {
            addCriterion("car_number between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotBetween(String value1, String value2) {
            addCriterion("car_number not between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNull() {
            addCriterion("car_brand is null");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNotNull() {
            addCriterion("car_brand is not null");
            return (Criteria) this;
        }

        public Criteria andCarBrandEqualTo(String value) {
            addCriterion("car_brand =", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotEqualTo(String value) {
            addCriterion("car_brand <>", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThan(String value) {
            addCriterion("car_brand >", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThanOrEqualTo(String value) {
            addCriterion("car_brand >=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThan(String value) {
            addCriterion("car_brand <", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThanOrEqualTo(String value) {
            addCriterion("car_brand <=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLike(String value) {
            addCriterion("car_brand like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotLike(String value) {
            addCriterion("car_brand not like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandIn(List<String> values) {
            addCriterion("car_brand in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotIn(List<String> values) {
            addCriterion("car_brand not in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandBetween(String value1, String value2) {
            addCriterion("car_brand between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotBetween(String value1, String value2) {
            addCriterion("car_brand not between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarLisenceIsNull() {
            addCriterion("car_lisence is null");
            return (Criteria) this;
        }

        public Criteria andCarLisenceIsNotNull() {
            addCriterion("car_lisence is not null");
            return (Criteria) this;
        }

        public Criteria andCarLisenceEqualTo(String value) {
            addCriterion("car_lisence =", value, "carLisence");
            return (Criteria) this;
        }

        public Criteria andCarLisenceNotEqualTo(String value) {
            addCriterion("car_lisence <>", value, "carLisence");
            return (Criteria) this;
        }

        public Criteria andCarLisenceGreaterThan(String value) {
            addCriterion("car_lisence >", value, "carLisence");
            return (Criteria) this;
        }

        public Criteria andCarLisenceGreaterThanOrEqualTo(String value) {
            addCriterion("car_lisence >=", value, "carLisence");
            return (Criteria) this;
        }

        public Criteria andCarLisenceLessThan(String value) {
            addCriterion("car_lisence <", value, "carLisence");
            return (Criteria) this;
        }

        public Criteria andCarLisenceLessThanOrEqualTo(String value) {
            addCriterion("car_lisence <=", value, "carLisence");
            return (Criteria) this;
        }

        public Criteria andCarLisenceLike(String value) {
            addCriterion("car_lisence like", value, "carLisence");
            return (Criteria) this;
        }

        public Criteria andCarLisenceNotLike(String value) {
            addCriterion("car_lisence not like", value, "carLisence");
            return (Criteria) this;
        }

        public Criteria andCarLisenceIn(List<String> values) {
            addCriterion("car_lisence in", values, "carLisence");
            return (Criteria) this;
        }

        public Criteria andCarLisenceNotIn(List<String> values) {
            addCriterion("car_lisence not in", values, "carLisence");
            return (Criteria) this;
        }

        public Criteria andCarLisenceBetween(String value1, String value2) {
            addCriterion("car_lisence between", value1, value2, "carLisence");
            return (Criteria) this;
        }

        public Criteria andCarLisenceNotBetween(String value1, String value2) {
            addCriterion("car_lisence not between", value1, value2, "carLisence");
            return (Criteria) this;
        }

        public Criteria andCarPropertyIsNull() {
            addCriterion("car_property is null");
            return (Criteria) this;
        }

        public Criteria andCarPropertyIsNotNull() {
            addCriterion("car_property is not null");
            return (Criteria) this;
        }

        public Criteria andCarPropertyEqualTo(Byte value) {
            addCriterion("car_property =", value, "carProperty");
            return (Criteria) this;
        }

        public Criteria andCarPropertyNotEqualTo(Byte value) {
            addCriterion("car_property <>", value, "carProperty");
            return (Criteria) this;
        }

        public Criteria andCarPropertyGreaterThan(Byte value) {
            addCriterion("car_property >", value, "carProperty");
            return (Criteria) this;
        }

        public Criteria andCarPropertyGreaterThanOrEqualTo(Byte value) {
            addCriterion("car_property >=", value, "carProperty");
            return (Criteria) this;
        }

        public Criteria andCarPropertyLessThan(Byte value) {
            addCriterion("car_property <", value, "carProperty");
            return (Criteria) this;
        }

        public Criteria andCarPropertyLessThanOrEqualTo(Byte value) {
            addCriterion("car_property <=", value, "carProperty");
            return (Criteria) this;
        }

        public Criteria andCarPropertyIn(List<Byte> values) {
            addCriterion("car_property in", values, "carProperty");
            return (Criteria) this;
        }

        public Criteria andCarPropertyNotIn(List<Byte> values) {
            addCriterion("car_property not in", values, "carProperty");
            return (Criteria) this;
        }

        public Criteria andCarPropertyBetween(Byte value1, Byte value2) {
            addCriterion("car_property between", value1, value2, "carProperty");
            return (Criteria) this;
        }

        public Criteria andCarPropertyNotBetween(Byte value1, Byte value2) {
            addCriterion("car_property not between", value1, value2, "carProperty");
            return (Criteria) this;
        }

        public Criteria andCarDrivenIsNull() {
            addCriterion("car_driven is null");
            return (Criteria) this;
        }

        public Criteria andCarDrivenIsNotNull() {
            addCriterion("car_driven is not null");
            return (Criteria) this;
        }

        public Criteria andCarDrivenEqualTo(Byte value) {
            addCriterion("car_driven =", value, "carDriven");
            return (Criteria) this;
        }

        public Criteria andCarDrivenNotEqualTo(Byte value) {
            addCriterion("car_driven <>", value, "carDriven");
            return (Criteria) this;
        }

        public Criteria andCarDrivenGreaterThan(Byte value) {
            addCriterion("car_driven >", value, "carDriven");
            return (Criteria) this;
        }

        public Criteria andCarDrivenGreaterThanOrEqualTo(Byte value) {
            addCriterion("car_driven >=", value, "carDriven");
            return (Criteria) this;
        }

        public Criteria andCarDrivenLessThan(Byte value) {
            addCriterion("car_driven <", value, "carDriven");
            return (Criteria) this;
        }

        public Criteria andCarDrivenLessThanOrEqualTo(Byte value) {
            addCriterion("car_driven <=", value, "carDriven");
            return (Criteria) this;
        }

        public Criteria andCarDrivenIn(List<Byte> values) {
            addCriterion("car_driven in", values, "carDriven");
            return (Criteria) this;
        }

        public Criteria andCarDrivenNotIn(List<Byte> values) {
            addCriterion("car_driven not in", values, "carDriven");
            return (Criteria) this;
        }

        public Criteria andCarDrivenBetween(Byte value1, Byte value2) {
            addCriterion("car_driven between", value1, value2, "carDriven");
            return (Criteria) this;
        }

        public Criteria andCarDrivenNotBetween(Byte value1, Byte value2) {
            addCriterion("car_driven not between", value1, value2, "carDriven");
            return (Criteria) this;
        }

        public Criteria andCarOwnerIsNull() {
            addCriterion("car_owner is null");
            return (Criteria) this;
        }

        public Criteria andCarOwnerIsNotNull() {
            addCriterion("car_owner is not null");
            return (Criteria) this;
        }

        public Criteria andCarOwnerEqualTo(String value) {
            addCriterion("car_owner =", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerNotEqualTo(String value) {
            addCriterion("car_owner <>", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerGreaterThan(String value) {
            addCriterion("car_owner >", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("car_owner >=", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerLessThan(String value) {
            addCriterion("car_owner <", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerLessThanOrEqualTo(String value) {
            addCriterion("car_owner <=", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerLike(String value) {
            addCriterion("car_owner like", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerNotLike(String value) {
            addCriterion("car_owner not like", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerIn(List<String> values) {
            addCriterion("car_owner in", values, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerNotIn(List<String> values) {
            addCriterion("car_owner not in", values, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerBetween(String value1, String value2) {
            addCriterion("car_owner between", value1, value2, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerNotBetween(String value1, String value2) {
            addCriterion("car_owner not between", value1, value2, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarCodeIsNull() {
            addCriterion("car_code is null");
            return (Criteria) this;
        }

        public Criteria andCarCodeIsNotNull() {
            addCriterion("car_code is not null");
            return (Criteria) this;
        }

        public Criteria andCarCodeEqualTo(String value) {
            addCriterion("car_code =", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotEqualTo(String value) {
            addCriterion("car_code <>", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeGreaterThan(String value) {
            addCriterion("car_code >", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("car_code >=", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeLessThan(String value) {
            addCriterion("car_code <", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeLessThanOrEqualTo(String value) {
            addCriterion("car_code <=", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeLike(String value) {
            addCriterion("car_code like", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotLike(String value) {
            addCriterion("car_code not like", value, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeIn(List<String> values) {
            addCriterion("car_code in", values, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotIn(List<String> values) {
            addCriterion("car_code not in", values, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeBetween(String value1, String value2) {
            addCriterion("car_code between", value1, value2, "carCode");
            return (Criteria) this;
        }

        public Criteria andCarCodeNotBetween(String value1, String value2) {
            addCriterion("car_code not between", value1, value2, "carCode");
            return (Criteria) this;
        }

        public Criteria andBuyDateIsNull() {
            addCriterion("buy_date is null");
            return (Criteria) this;
        }

        public Criteria andBuyDateIsNotNull() {
            addCriterion("buy_date is not null");
            return (Criteria) this;
        }

        public Criteria andBuyDateEqualTo(Date value) {
            addCriterion("buy_date =", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotEqualTo(Date value) {
            addCriterion("buy_date <>", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateGreaterThan(Date value) {
            addCriterion("buy_date >", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("buy_date >=", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateLessThan(Date value) {
            addCriterion("buy_date <", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateLessThanOrEqualTo(Date value) {
            addCriterion("buy_date <=", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateIn(List<Date> values) {
            addCriterion("buy_date in", values, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotIn(List<Date> values) {
            addCriterion("buy_date not in", values, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateBetween(Date value1, Date value2) {
            addCriterion("buy_date between", value1, value2, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotBetween(Date value1, Date value2) {
            addCriterion("buy_date not between", value1, value2, "buyDate");
            return (Criteria) this;
        }

        public Criteria andCountsIsNull() {
            addCriterion("counts is null");
            return (Criteria) this;
        }

        public Criteria andCountsIsNotNull() {
            addCriterion("counts is not null");
            return (Criteria) this;
        }

        public Criteria andCountsEqualTo(Short value) {
            addCriterion("counts =", value, "counts");
            return (Criteria) this;
        }

        public Criteria andCountsNotEqualTo(Short value) {
            addCriterion("counts <>", value, "counts");
            return (Criteria) this;
        }

        public Criteria andCountsGreaterThan(Short value) {
            addCriterion("counts >", value, "counts");
            return (Criteria) this;
        }

        public Criteria andCountsGreaterThanOrEqualTo(Short value) {
            addCriterion("counts >=", value, "counts");
            return (Criteria) this;
        }

        public Criteria andCountsLessThan(Short value) {
            addCriterion("counts <", value, "counts");
            return (Criteria) this;
        }

        public Criteria andCountsLessThanOrEqualTo(Short value) {
            addCriterion("counts <=", value, "counts");
            return (Criteria) this;
        }

        public Criteria andCountsIn(List<Short> values) {
            addCriterion("counts in", values, "counts");
            return (Criteria) this;
        }

        public Criteria andCountsNotIn(List<Short> values) {
            addCriterion("counts not in", values, "counts");
            return (Criteria) this;
        }

        public Criteria andCountsBetween(Short value1, Short value2) {
            addCriterion("counts between", value1, value2, "counts");
            return (Criteria) this;
        }

        public Criteria andCountsNotBetween(Short value1, Short value2) {
            addCriterion("counts not between", value1, value2, "counts");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceAmountIsNull() {
            addCriterion("car_insurance_amount is null");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceAmountIsNotNull() {
            addCriterion("car_insurance_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceAmountEqualTo(BigDecimal value) {
            addCriterion("car_insurance_amount =", value, "carInsuranceAmount");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceAmountNotEqualTo(BigDecimal value) {
            addCriterion("car_insurance_amount <>", value, "carInsuranceAmount");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceAmountGreaterThan(BigDecimal value) {
            addCriterion("car_insurance_amount >", value, "carInsuranceAmount");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("car_insurance_amount >=", value, "carInsuranceAmount");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceAmountLessThan(BigDecimal value) {
            addCriterion("car_insurance_amount <", value, "carInsuranceAmount");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("car_insurance_amount <=", value, "carInsuranceAmount");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceAmountIn(List<BigDecimal> values) {
            addCriterion("car_insurance_amount in", values, "carInsuranceAmount");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceAmountNotIn(List<BigDecimal> values) {
            addCriterion("car_insurance_amount not in", values, "carInsuranceAmount");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("car_insurance_amount between", value1, value2, "carInsuranceAmount");
            return (Criteria) this;
        }

        public Criteria andCarInsuranceAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("car_insurance_amount not between", value1, value2, "carInsuranceAmount");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("native_place is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("native_place is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("native_place =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("native_place <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("native_place >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("native_place >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("native_place <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("native_place <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("native_place like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("native_place not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("native_place in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("native_place not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("native_place between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("native_place not between", value1, value2, "nativePlace");
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