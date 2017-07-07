package cn.sample.member.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MemberExample() {
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

        public Criteria andMemidIsNull() {
            addCriterion("memid is null");
            return (Criteria) this;
        }

        public Criteria andMemidIsNotNull() {
            addCriterion("memid is not null");
            return (Criteria) this;
        }

        public Criteria andMemidEqualTo(Integer value) {
            addCriterion("memid =", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidNotEqualTo(Integer value) {
            addCriterion("memid <>", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidGreaterThan(Integer value) {
            addCriterion("memid >", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("memid >=", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidLessThan(Integer value) {
            addCriterion("memid <", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidLessThanOrEqualTo(Integer value) {
            addCriterion("memid <=", value, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidIn(List<Integer> values) {
            addCriterion("memid in", values, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidNotIn(List<Integer> values) {
            addCriterion("memid not in", values, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidBetween(Integer value1, Integer value2) {
            addCriterion("memid between", value1, value2, "memid");
            return (Criteria) this;
        }

        public Criteria andMemidNotBetween(Integer value1, Integer value2) {
            addCriterion("memid not between", value1, value2, "memid");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNull() {
            addCriterion("level_id is null");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNotNull() {
            addCriterion("level_id is not null");
            return (Criteria) this;
        }

        public Criteria andLevelIdEqualTo(Short value) {
            addCriterion("level_id =", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotEqualTo(Short value) {
            addCriterion("level_id <>", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThan(Short value) {
            addCriterion("level_id >", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThanOrEqualTo(Short value) {
            addCriterion("level_id >=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThan(Short value) {
            addCriterion("level_id <", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThanOrEqualTo(Short value) {
            addCriterion("level_id <=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdIn(List<Short> values) {
            addCriterion("level_id in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotIn(List<Short> values) {
            addCriterion("level_id not in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdBetween(Short value1, Short value2) {
            addCriterion("level_id between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotBetween(Short value1, Short value2) {
            addCriterion("level_id not between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andPdlLevelIdIsNull() {
            addCriterion("pdl_level_id is null");
            return (Criteria) this;
        }

        public Criteria andPdlLevelIdIsNotNull() {
            addCriterion("pdl_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andPdlLevelIdEqualTo(Short value) {
            addCriterion("pdl_level_id =", value, "pdlLevelId");
            return (Criteria) this;
        }

        public Criteria andPdlLevelIdNotEqualTo(Short value) {
            addCriterion("pdl_level_id <>", value, "pdlLevelId");
            return (Criteria) this;
        }

        public Criteria andPdlLevelIdGreaterThan(Short value) {
            addCriterion("pdl_level_id >", value, "pdlLevelId");
            return (Criteria) this;
        }

        public Criteria andPdlLevelIdGreaterThanOrEqualTo(Short value) {
            addCriterion("pdl_level_id >=", value, "pdlLevelId");
            return (Criteria) this;
        }

        public Criteria andPdlLevelIdLessThan(Short value) {
            addCriterion("pdl_level_id <", value, "pdlLevelId");
            return (Criteria) this;
        }

        public Criteria andPdlLevelIdLessThanOrEqualTo(Short value) {
            addCriterion("pdl_level_id <=", value, "pdlLevelId");
            return (Criteria) this;
        }

        public Criteria andPdlLevelIdIn(List<Short> values) {
            addCriterion("pdl_level_id in", values, "pdlLevelId");
            return (Criteria) this;
        }

        public Criteria andPdlLevelIdNotIn(List<Short> values) {
            addCriterion("pdl_level_id not in", values, "pdlLevelId");
            return (Criteria) this;
        }

        public Criteria andPdlLevelIdBetween(Short value1, Short value2) {
            addCriterion("pdl_level_id between", value1, value2, "pdlLevelId");
            return (Criteria) this;
        }

        public Criteria andPdlLevelIdNotBetween(Short value1, Short value2) {
            addCriterion("pdl_level_id not between", value1, value2, "pdlLevelId");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNull() {
            addCriterion("mobileno is null");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNotNull() {
            addCriterion("mobileno is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenoEqualTo(String value) {
            addCriterion("mobileno =", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotEqualTo(String value) {
            addCriterion("mobileno <>", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThan(String value) {
            addCriterion("mobileno >", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThanOrEqualTo(String value) {
            addCriterion("mobileno >=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThan(String value) {
            addCriterion("mobileno <", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThanOrEqualTo(String value) {
            addCriterion("mobileno <=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLike(String value) {
            addCriterion("mobileno like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotLike(String value) {
            addCriterion("mobileno not like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoIn(List<String> values) {
            addCriterion("mobileno in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotIn(List<String> values) {
            addCriterion("mobileno not in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoBetween(String value1, String value2) {
            addCriterion("mobileno between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotBetween(String value1, String value2) {
            addCriterion("mobileno not between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andLoginpswIsNull() {
            addCriterion("loginpsw is null");
            return (Criteria) this;
        }

        public Criteria andLoginpswIsNotNull() {
            addCriterion("loginpsw is not null");
            return (Criteria) this;
        }

        public Criteria andLoginpswEqualTo(String value) {
            addCriterion("loginpsw =", value, "loginpsw");
            return (Criteria) this;
        }

        public Criteria andLoginpswNotEqualTo(String value) {
            addCriterion("loginpsw <>", value, "loginpsw");
            return (Criteria) this;
        }

        public Criteria andLoginpswGreaterThan(String value) {
            addCriterion("loginpsw >", value, "loginpsw");
            return (Criteria) this;
        }

        public Criteria andLoginpswGreaterThanOrEqualTo(String value) {
            addCriterion("loginpsw >=", value, "loginpsw");
            return (Criteria) this;
        }

        public Criteria andLoginpswLessThan(String value) {
            addCriterion("loginpsw <", value, "loginpsw");
            return (Criteria) this;
        }

        public Criteria andLoginpswLessThanOrEqualTo(String value) {
            addCriterion("loginpsw <=", value, "loginpsw");
            return (Criteria) this;
        }

        public Criteria andLoginpswLike(String value) {
            addCriterion("loginpsw like", value, "loginpsw");
            return (Criteria) this;
        }

        public Criteria andLoginpswNotLike(String value) {
            addCriterion("loginpsw not like", value, "loginpsw");
            return (Criteria) this;
        }

        public Criteria andLoginpswIn(List<String> values) {
            addCriterion("loginpsw in", values, "loginpsw");
            return (Criteria) this;
        }

        public Criteria andLoginpswNotIn(List<String> values) {
            addCriterion("loginpsw not in", values, "loginpsw");
            return (Criteria) this;
        }

        public Criteria andLoginpswBetween(String value1, String value2) {
            addCriterion("loginpsw between", value1, value2, "loginpsw");
            return (Criteria) this;
        }

        public Criteria andLoginpswNotBetween(String value1, String value2) {
            addCriterion("loginpsw not between", value1, value2, "loginpsw");
            return (Criteria) this;
        }

        public Criteria andBqsOpenIdIsNull() {
            addCriterion("bqs_open_id is null");
            return (Criteria) this;
        }

        public Criteria andBqsOpenIdIsNotNull() {
            addCriterion("bqs_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andBqsOpenIdEqualTo(String value) {
            addCriterion("bqs_open_id =", value, "bqsOpenId");
            return (Criteria) this;
        }

        public Criteria andBqsOpenIdNotEqualTo(String value) {
            addCriterion("bqs_open_id <>", value, "bqsOpenId");
            return (Criteria) this;
        }

        public Criteria andBqsOpenIdGreaterThan(String value) {
            addCriterion("bqs_open_id >", value, "bqsOpenId");
            return (Criteria) this;
        }

        public Criteria andBqsOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("bqs_open_id >=", value, "bqsOpenId");
            return (Criteria) this;
        }

        public Criteria andBqsOpenIdLessThan(String value) {
            addCriterion("bqs_open_id <", value, "bqsOpenId");
            return (Criteria) this;
        }

        public Criteria andBqsOpenIdLessThanOrEqualTo(String value) {
            addCriterion("bqs_open_id <=", value, "bqsOpenId");
            return (Criteria) this;
        }

        public Criteria andBqsOpenIdLike(String value) {
            addCriterion("bqs_open_id like", value, "bqsOpenId");
            return (Criteria) this;
        }

        public Criteria andBqsOpenIdNotLike(String value) {
            addCriterion("bqs_open_id not like", value, "bqsOpenId");
            return (Criteria) this;
        }

        public Criteria andBqsOpenIdIn(List<String> values) {
            addCriterion("bqs_open_id in", values, "bqsOpenId");
            return (Criteria) this;
        }

        public Criteria andBqsOpenIdNotIn(List<String> values) {
            addCriterion("bqs_open_id not in", values, "bqsOpenId");
            return (Criteria) this;
        }

        public Criteria andBqsOpenIdBetween(String value1, String value2) {
            addCriterion("bqs_open_id between", value1, value2, "bqsOpenId");
            return (Criteria) this;
        }

        public Criteria andBqsOpenIdNotBetween(String value1, String value2) {
            addCriterion("bqs_open_id not between", value1, value2, "bqsOpenId");
            return (Criteria) this;
        }

        public Criteria andTradingpswIsNull() {
            addCriterion("tradingpsw is null");
            return (Criteria) this;
        }

        public Criteria andTradingpswIsNotNull() {
            addCriterion("tradingpsw is not null");
            return (Criteria) this;
        }

        public Criteria andTradingpswEqualTo(String value) {
            addCriterion("tradingpsw =", value, "tradingpsw");
            return (Criteria) this;
        }

        public Criteria andTradingpswNotEqualTo(String value) {
            addCriterion("tradingpsw <>", value, "tradingpsw");
            return (Criteria) this;
        }

        public Criteria andTradingpswGreaterThan(String value) {
            addCriterion("tradingpsw >", value, "tradingpsw");
            return (Criteria) this;
        }

        public Criteria andTradingpswGreaterThanOrEqualTo(String value) {
            addCriterion("tradingpsw >=", value, "tradingpsw");
            return (Criteria) this;
        }

        public Criteria andTradingpswLessThan(String value) {
            addCriterion("tradingpsw <", value, "tradingpsw");
            return (Criteria) this;
        }

        public Criteria andTradingpswLessThanOrEqualTo(String value) {
            addCriterion("tradingpsw <=", value, "tradingpsw");
            return (Criteria) this;
        }

        public Criteria andTradingpswLike(String value) {
            addCriterion("tradingpsw like", value, "tradingpsw");
            return (Criteria) this;
        }

        public Criteria andTradingpswNotLike(String value) {
            addCriterion("tradingpsw not like", value, "tradingpsw");
            return (Criteria) this;
        }

        public Criteria andTradingpswIn(List<String> values) {
            addCriterion("tradingpsw in", values, "tradingpsw");
            return (Criteria) this;
        }

        public Criteria andTradingpswNotIn(List<String> values) {
            addCriterion("tradingpsw not in", values, "tradingpsw");
            return (Criteria) this;
        }

        public Criteria andTradingpswBetween(String value1, String value2) {
            addCriterion("tradingpsw between", value1, value2, "tradingpsw");
            return (Criteria) this;
        }

        public Criteria andTradingpswNotBetween(String value1, String value2) {
            addCriterion("tradingpsw not between", value1, value2, "tradingpsw");
            return (Criteria) this;
        }

        public Criteria andInvitecodeIsNull() {
            addCriterion("invitecode is null");
            return (Criteria) this;
        }

        public Criteria andInvitecodeIsNotNull() {
            addCriterion("invitecode is not null");
            return (Criteria) this;
        }

        public Criteria andInvitecodeEqualTo(String value) {
            addCriterion("invitecode =", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotEqualTo(String value) {
            addCriterion("invitecode <>", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeGreaterThan(String value) {
            addCriterion("invitecode >", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeGreaterThanOrEqualTo(String value) {
            addCriterion("invitecode >=", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeLessThan(String value) {
            addCriterion("invitecode <", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeLessThanOrEqualTo(String value) {
            addCriterion("invitecode <=", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeLike(String value) {
            addCriterion("invitecode like", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotLike(String value) {
            addCriterion("invitecode not like", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeIn(List<String> values) {
            addCriterion("invitecode in", values, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotIn(List<String> values) {
            addCriterion("invitecode not in", values, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeBetween(String value1, String value2) {
            addCriterion("invitecode between", value1, value2, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotBetween(String value1, String value2) {
            addCriterion("invitecode not between", value1, value2, "invitecode");
            return (Criteria) this;
        }

        public Criteria andMyInvitecodeIsNull() {
            addCriterion("my_invitecode is null");
            return (Criteria) this;
        }

        public Criteria andMyInvitecodeIsNotNull() {
            addCriterion("my_invitecode is not null");
            return (Criteria) this;
        }

        public Criteria andMyInvitecodeEqualTo(String value) {
            addCriterion("my_invitecode =", value, "myInvitecode");
            return (Criteria) this;
        }

        public Criteria andMyInvitecodeNotEqualTo(String value) {
            addCriterion("my_invitecode <>", value, "myInvitecode");
            return (Criteria) this;
        }

        public Criteria andMyInvitecodeGreaterThan(String value) {
            addCriterion("my_invitecode >", value, "myInvitecode");
            return (Criteria) this;
        }

        public Criteria andMyInvitecodeGreaterThanOrEqualTo(String value) {
            addCriterion("my_invitecode >=", value, "myInvitecode");
            return (Criteria) this;
        }

        public Criteria andMyInvitecodeLessThan(String value) {
            addCriterion("my_invitecode <", value, "myInvitecode");
            return (Criteria) this;
        }

        public Criteria andMyInvitecodeLessThanOrEqualTo(String value) {
            addCriterion("my_invitecode <=", value, "myInvitecode");
            return (Criteria) this;
        }

        public Criteria andMyInvitecodeLike(String value) {
            addCriterion("my_invitecode like", value, "myInvitecode");
            return (Criteria) this;
        }

        public Criteria andMyInvitecodeNotLike(String value) {
            addCriterion("my_invitecode not like", value, "myInvitecode");
            return (Criteria) this;
        }

        public Criteria andMyInvitecodeIn(List<String> values) {
            addCriterion("my_invitecode in", values, "myInvitecode");
            return (Criteria) this;
        }

        public Criteria andMyInvitecodeNotIn(List<String> values) {
            addCriterion("my_invitecode not in", values, "myInvitecode");
            return (Criteria) this;
        }

        public Criteria andMyInvitecodeBetween(String value1, String value2) {
            addCriterion("my_invitecode between", value1, value2, "myInvitecode");
            return (Criteria) this;
        }

        public Criteria andMyInvitecodeNotBetween(String value1, String value2) {
            addCriterion("my_invitecode not between", value1, value2, "myInvitecode");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNull() {
            addCriterion("idcardno is null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNotNull() {
            addCriterion("idcardno is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoEqualTo(String value) {
            addCriterion("idcardno =", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotEqualTo(String value) {
            addCriterion("idcardno <>", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThan(String value) {
            addCriterion("idcardno >", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("idcardno >=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThan(String value) {
            addCriterion("idcardno <", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThanOrEqualTo(String value) {
            addCriterion("idcardno <=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLike(String value) {
            addCriterion("idcardno like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotLike(String value) {
            addCriterion("idcardno not like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIn(List<String> values) {
            addCriterion("idcardno in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotIn(List<String> values) {
            addCriterion("idcardno not in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoBetween(String value1, String value2) {
            addCriterion("idcardno between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotBetween(String value1, String value2) {
            addCriterion("idcardno not between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andLongtimecityIsNull() {
            addCriterion("longtimecity is null");
            return (Criteria) this;
        }

        public Criteria andLongtimecityIsNotNull() {
            addCriterion("longtimecity is not null");
            return (Criteria) this;
        }

        public Criteria andLongtimecityEqualTo(String value) {
            addCriterion("longtimecity =", value, "longtimecity");
            return (Criteria) this;
        }

        public Criteria andLongtimecityNotEqualTo(String value) {
            addCriterion("longtimecity <>", value, "longtimecity");
            return (Criteria) this;
        }

        public Criteria andLongtimecityGreaterThan(String value) {
            addCriterion("longtimecity >", value, "longtimecity");
            return (Criteria) this;
        }

        public Criteria andLongtimecityGreaterThanOrEqualTo(String value) {
            addCriterion("longtimecity >=", value, "longtimecity");
            return (Criteria) this;
        }

        public Criteria andLongtimecityLessThan(String value) {
            addCriterion("longtimecity <", value, "longtimecity");
            return (Criteria) this;
        }

        public Criteria andLongtimecityLessThanOrEqualTo(String value) {
            addCriterion("longtimecity <=", value, "longtimecity");
            return (Criteria) this;
        }

        public Criteria andLongtimecityLike(String value) {
            addCriterion("longtimecity like", value, "longtimecity");
            return (Criteria) this;
        }

        public Criteria andLongtimecityNotLike(String value) {
            addCriterion("longtimecity not like", value, "longtimecity");
            return (Criteria) this;
        }

        public Criteria andLongtimecityIn(List<String> values) {
            addCriterion("longtimecity in", values, "longtimecity");
            return (Criteria) this;
        }

        public Criteria andLongtimecityNotIn(List<String> values) {
            addCriterion("longtimecity not in", values, "longtimecity");
            return (Criteria) this;
        }

        public Criteria andLongtimecityBetween(String value1, String value2) {
            addCriterion("longtimecity between", value1, value2, "longtimecity");
            return (Criteria) this;
        }

        public Criteria andLongtimecityNotBetween(String value1, String value2) {
            addCriterion("longtimecity not between", value1, value2, "longtimecity");
            return (Criteria) this;
        }

        public Criteria andDetailaddrIsNull() {
            addCriterion("detailaddr is null");
            return (Criteria) this;
        }

        public Criteria andDetailaddrIsNotNull() {
            addCriterion("detailaddr is not null");
            return (Criteria) this;
        }

        public Criteria andDetailaddrEqualTo(String value) {
            addCriterion("detailaddr =", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrNotEqualTo(String value) {
            addCriterion("detailaddr <>", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrGreaterThan(String value) {
            addCriterion("detailaddr >", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrGreaterThanOrEqualTo(String value) {
            addCriterion("detailaddr >=", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrLessThan(String value) {
            addCriterion("detailaddr <", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrLessThanOrEqualTo(String value) {
            addCriterion("detailaddr <=", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrLike(String value) {
            addCriterion("detailaddr like", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrNotLike(String value) {
            addCriterion("detailaddr not like", value, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrIn(List<String> values) {
            addCriterion("detailaddr in", values, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrNotIn(List<String> values) {
            addCriterion("detailaddr not in", values, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrBetween(String value1, String value2) {
            addCriterion("detailaddr between", value1, value2, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andDetailaddrNotBetween(String value1, String value2) {
            addCriterion("detailaddr not between", value1, value2, "detailaddr");
            return (Criteria) this;
        }

        public Criteria andLeveleducationIsNull() {
            addCriterion("leveleducation is null");
            return (Criteria) this;
        }

        public Criteria andLeveleducationIsNotNull() {
            addCriterion("leveleducation is not null");
            return (Criteria) this;
        }

        public Criteria andLeveleducationEqualTo(String value) {
            addCriterion("leveleducation =", value, "leveleducation");
            return (Criteria) this;
        }

        public Criteria andLeveleducationNotEqualTo(String value) {
            addCriterion("leveleducation <>", value, "leveleducation");
            return (Criteria) this;
        }

        public Criteria andLeveleducationGreaterThan(String value) {
            addCriterion("leveleducation >", value, "leveleducation");
            return (Criteria) this;
        }

        public Criteria andLeveleducationGreaterThanOrEqualTo(String value) {
            addCriterion("leveleducation >=", value, "leveleducation");
            return (Criteria) this;
        }

        public Criteria andLeveleducationLessThan(String value) {
            addCriterion("leveleducation <", value, "leveleducation");
            return (Criteria) this;
        }

        public Criteria andLeveleducationLessThanOrEqualTo(String value) {
            addCriterion("leveleducation <=", value, "leveleducation");
            return (Criteria) this;
        }

        public Criteria andLeveleducationLike(String value) {
            addCriterion("leveleducation like", value, "leveleducation");
            return (Criteria) this;
        }

        public Criteria andLeveleducationNotLike(String value) {
            addCriterion("leveleducation not like", value, "leveleducation");
            return (Criteria) this;
        }

        public Criteria andLeveleducationIn(List<String> values) {
            addCriterion("leveleducation in", values, "leveleducation");
            return (Criteria) this;
        }

        public Criteria andLeveleducationNotIn(List<String> values) {
            addCriterion("leveleducation not in", values, "leveleducation");
            return (Criteria) this;
        }

        public Criteria andLeveleducationBetween(String value1, String value2) {
            addCriterion("leveleducation between", value1, value2, "leveleducation");
            return (Criteria) this;
        }

        public Criteria andLeveleducationNotBetween(String value1, String value2) {
            addCriterion("leveleducation not between", value1, value2, "leveleducation");
            return (Criteria) this;
        }

        public Criteria andFamilyincomeIsNull() {
            addCriterion("familyincome is null");
            return (Criteria) this;
        }

        public Criteria andFamilyincomeIsNotNull() {
            addCriterion("familyincome is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyincomeEqualTo(BigDecimal value) {
            addCriterion("familyincome =", value, "familyincome");
            return (Criteria) this;
        }

        public Criteria andFamilyincomeNotEqualTo(BigDecimal value) {
            addCriterion("familyincome <>", value, "familyincome");
            return (Criteria) this;
        }

        public Criteria andFamilyincomeGreaterThan(BigDecimal value) {
            addCriterion("familyincome >", value, "familyincome");
            return (Criteria) this;
        }

        public Criteria andFamilyincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("familyincome >=", value, "familyincome");
            return (Criteria) this;
        }

        public Criteria andFamilyincomeLessThan(BigDecimal value) {
            addCriterion("familyincome <", value, "familyincome");
            return (Criteria) this;
        }

        public Criteria andFamilyincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("familyincome <=", value, "familyincome");
            return (Criteria) this;
        }

        public Criteria andFamilyincomeIn(List<BigDecimal> values) {
            addCriterion("familyincome in", values, "familyincome");
            return (Criteria) this;
        }

        public Criteria andFamilyincomeNotIn(List<BigDecimal> values) {
            addCriterion("familyincome not in", values, "familyincome");
            return (Criteria) this;
        }

        public Criteria andFamilyincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("familyincome between", value1, value2, "familyincome");
            return (Criteria) this;
        }

        public Criteria andFamilyincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("familyincome not between", value1, value2, "familyincome");
            return (Criteria) this;
        }

        public Criteria andUnitnatureIsNull() {
            addCriterion("unitnature is null");
            return (Criteria) this;
        }

        public Criteria andUnitnatureIsNotNull() {
            addCriterion("unitnature is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnatureEqualTo(String value) {
            addCriterion("unitnature =", value, "unitnature");
            return (Criteria) this;
        }

        public Criteria andUnitnatureNotEqualTo(String value) {
            addCriterion("unitnature <>", value, "unitnature");
            return (Criteria) this;
        }

        public Criteria andUnitnatureGreaterThan(String value) {
            addCriterion("unitnature >", value, "unitnature");
            return (Criteria) this;
        }

        public Criteria andUnitnatureGreaterThanOrEqualTo(String value) {
            addCriterion("unitnature >=", value, "unitnature");
            return (Criteria) this;
        }

        public Criteria andUnitnatureLessThan(String value) {
            addCriterion("unitnature <", value, "unitnature");
            return (Criteria) this;
        }

        public Criteria andUnitnatureLessThanOrEqualTo(String value) {
            addCriterion("unitnature <=", value, "unitnature");
            return (Criteria) this;
        }

        public Criteria andUnitnatureLike(String value) {
            addCriterion("unitnature like", value, "unitnature");
            return (Criteria) this;
        }

        public Criteria andUnitnatureNotLike(String value) {
            addCriterion("unitnature not like", value, "unitnature");
            return (Criteria) this;
        }

        public Criteria andUnitnatureIn(List<String> values) {
            addCriterion("unitnature in", values, "unitnature");
            return (Criteria) this;
        }

        public Criteria andUnitnatureNotIn(List<String> values) {
            addCriterion("unitnature not in", values, "unitnature");
            return (Criteria) this;
        }

        public Criteria andUnitnatureBetween(String value1, String value2) {
            addCriterion("unitnature between", value1, value2, "unitnature");
            return (Criteria) this;
        }

        public Criteria andUnitnatureNotBetween(String value1, String value2) {
            addCriterion("unitnature not between", value1, value2, "unitnature");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNull() {
            addCriterion("unitname is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("unitname is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("unitname =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("unitname <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("unitname >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("unitname >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("unitname <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("unitname <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("unitname like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("unitname not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("unitname in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("unitname not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("unitname between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("unitname not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
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

        public Criteria andHavejobtimeIsNull() {
            addCriterion("havejobtime is null");
            return (Criteria) this;
        }

        public Criteria andHavejobtimeIsNotNull() {
            addCriterion("havejobtime is not null");
            return (Criteria) this;
        }

        public Criteria andHavejobtimeEqualTo(Date value) {
            addCriterion("havejobtime =", value, "havejobtime");
            return (Criteria) this;
        }

        public Criteria andHavejobtimeNotEqualTo(Date value) {
            addCriterion("havejobtime <>", value, "havejobtime");
            return (Criteria) this;
        }

        public Criteria andHavejobtimeGreaterThan(Date value) {
            addCriterion("havejobtime >", value, "havejobtime");
            return (Criteria) this;
        }

        public Criteria andHavejobtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("havejobtime >=", value, "havejobtime");
            return (Criteria) this;
        }

        public Criteria andHavejobtimeLessThan(Date value) {
            addCriterion("havejobtime <", value, "havejobtime");
            return (Criteria) this;
        }

        public Criteria andHavejobtimeLessThanOrEqualTo(Date value) {
            addCriterion("havejobtime <=", value, "havejobtime");
            return (Criteria) this;
        }

        public Criteria andHavejobtimeIn(List<Date> values) {
            addCriterion("havejobtime in", values, "havejobtime");
            return (Criteria) this;
        }

        public Criteria andHavejobtimeNotIn(List<Date> values) {
            addCriterion("havejobtime not in", values, "havejobtime");
            return (Criteria) this;
        }

        public Criteria andHavejobtimeBetween(Date value1, Date value2) {
            addCriterion("havejobtime between", value1, value2, "havejobtime");
            return (Criteria) this;
        }

        public Criteria andHavejobtimeNotBetween(Date value1, Date value2) {
            addCriterion("havejobtime not between", value1, value2, "havejobtime");
            return (Criteria) this;
        }

        public Criteria andNowunitinductiontimeIsNull() {
            addCriterion("nowunitinductiontime is null");
            return (Criteria) this;
        }

        public Criteria andNowunitinductiontimeIsNotNull() {
            addCriterion("nowunitinductiontime is not null");
            return (Criteria) this;
        }

        public Criteria andNowunitinductiontimeEqualTo(Date value) {
            addCriterion("nowunitinductiontime =", value, "nowunitinductiontime");
            return (Criteria) this;
        }

        public Criteria andNowunitinductiontimeNotEqualTo(Date value) {
            addCriterion("nowunitinductiontime <>", value, "nowunitinductiontime");
            return (Criteria) this;
        }

        public Criteria andNowunitinductiontimeGreaterThan(Date value) {
            addCriterion("nowunitinductiontime >", value, "nowunitinductiontime");
            return (Criteria) this;
        }

        public Criteria andNowunitinductiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nowunitinductiontime >=", value, "nowunitinductiontime");
            return (Criteria) this;
        }

        public Criteria andNowunitinductiontimeLessThan(Date value) {
            addCriterion("nowunitinductiontime <", value, "nowunitinductiontime");
            return (Criteria) this;
        }

        public Criteria andNowunitinductiontimeLessThanOrEqualTo(Date value) {
            addCriterion("nowunitinductiontime <=", value, "nowunitinductiontime");
            return (Criteria) this;
        }

        public Criteria andNowunitinductiontimeIn(List<Date> values) {
            addCriterion("nowunitinductiontime in", values, "nowunitinductiontime");
            return (Criteria) this;
        }

        public Criteria andNowunitinductiontimeNotIn(List<Date> values) {
            addCriterion("nowunitinductiontime not in", values, "nowunitinductiontime");
            return (Criteria) this;
        }

        public Criteria andNowunitinductiontimeBetween(Date value1, Date value2) {
            addCriterion("nowunitinductiontime between", value1, value2, "nowunitinductiontime");
            return (Criteria) this;
        }

        public Criteria andNowunitinductiontimeNotBetween(Date value1, Date value2) {
            addCriterion("nowunitinductiontime not between", value1, value2, "nowunitinductiontime");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNull() {
            addCriterion("maritalstatus is null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNotNull() {
            addCriterion("maritalstatus is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusEqualTo(Byte value) {
            addCriterion("maritalstatus =", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotEqualTo(Byte value) {
            addCriterion("maritalstatus <>", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThan(Byte value) {
            addCriterion("maritalstatus >", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("maritalstatus >=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThan(Byte value) {
            addCriterion("maritalstatus <", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThanOrEqualTo(Byte value) {
            addCriterion("maritalstatus <=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIn(List<Byte> values) {
            addCriterion("maritalstatus in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotIn(List<Byte> values) {
            addCriterion("maritalstatus not in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusBetween(Byte value1, Byte value2) {
            addCriterion("maritalstatus between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("maritalstatus not between", value1, value2, "maritalstatus");
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

        public Criteria andOriginPalceIsNull() {
            addCriterion("origin_palce is null");
            return (Criteria) this;
        }

        public Criteria andOriginPalceIsNotNull() {
            addCriterion("origin_palce is not null");
            return (Criteria) this;
        }

        public Criteria andOriginPalceEqualTo(String value) {
            addCriterion("origin_palce =", value, "originPalce");
            return (Criteria) this;
        }

        public Criteria andOriginPalceNotEqualTo(String value) {
            addCriterion("origin_palce <>", value, "originPalce");
            return (Criteria) this;
        }

        public Criteria andOriginPalceGreaterThan(String value) {
            addCriterion("origin_palce >", value, "originPalce");
            return (Criteria) this;
        }

        public Criteria andOriginPalceGreaterThanOrEqualTo(String value) {
            addCriterion("origin_palce >=", value, "originPalce");
            return (Criteria) this;
        }

        public Criteria andOriginPalceLessThan(String value) {
            addCriterion("origin_palce <", value, "originPalce");
            return (Criteria) this;
        }

        public Criteria andOriginPalceLessThanOrEqualTo(String value) {
            addCriterion("origin_palce <=", value, "originPalce");
            return (Criteria) this;
        }

        public Criteria andOriginPalceLike(String value) {
            addCriterion("origin_palce like", value, "originPalce");
            return (Criteria) this;
        }

        public Criteria andOriginPalceNotLike(String value) {
            addCriterion("origin_palce not like", value, "originPalce");
            return (Criteria) this;
        }

        public Criteria andOriginPalceIn(List<String> values) {
            addCriterion("origin_palce in", values, "originPalce");
            return (Criteria) this;
        }

        public Criteria andOriginPalceNotIn(List<String> values) {
            addCriterion("origin_palce not in", values, "originPalce");
            return (Criteria) this;
        }

        public Criteria andOriginPalceBetween(String value1, String value2) {
            addCriterion("origin_palce between", value1, value2, "originPalce");
            return (Criteria) this;
        }

        public Criteria andOriginPalceNotBetween(String value1, String value2) {
            addCriterion("origin_palce not between", value1, value2, "originPalce");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNull() {
            addCriterion("is_enable is null");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNotNull() {
            addCriterion("is_enable is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnableEqualTo(Byte value) {
            addCriterion("is_enable =", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotEqualTo(Byte value) {
            addCriterion("is_enable <>", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThan(Byte value) {
            addCriterion("is_enable >", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_enable >=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThan(Byte value) {
            addCriterion("is_enable <", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThanOrEqualTo(Byte value) {
            addCriterion("is_enable <=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableIn(List<Byte> values) {
            addCriterion("is_enable in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotIn(List<Byte> values) {
            addCriterion("is_enable not in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableBetween(Byte value1, Byte value2) {
            addCriterion("is_enable between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotBetween(Byte value1, Byte value2) {
            addCriterion("is_enable not between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andChildrennumberIsNull() {
            addCriterion("childrennumber is null");
            return (Criteria) this;
        }

        public Criteria andChildrennumberIsNotNull() {
            addCriterion("childrennumber is not null");
            return (Criteria) this;
        }

        public Criteria andChildrennumberEqualTo(Short value) {
            addCriterion("childrennumber =", value, "childrennumber");
            return (Criteria) this;
        }

        public Criteria andChildrennumberNotEqualTo(Short value) {
            addCriterion("childrennumber <>", value, "childrennumber");
            return (Criteria) this;
        }

        public Criteria andChildrennumberGreaterThan(Short value) {
            addCriterion("childrennumber >", value, "childrennumber");
            return (Criteria) this;
        }

        public Criteria andChildrennumberGreaterThanOrEqualTo(Short value) {
            addCriterion("childrennumber >=", value, "childrennumber");
            return (Criteria) this;
        }

        public Criteria andChildrennumberLessThan(Short value) {
            addCriterion("childrennumber <", value, "childrennumber");
            return (Criteria) this;
        }

        public Criteria andChildrennumberLessThanOrEqualTo(Short value) {
            addCriterion("childrennumber <=", value, "childrennumber");
            return (Criteria) this;
        }

        public Criteria andChildrennumberIn(List<Short> values) {
            addCriterion("childrennumber in", values, "childrennumber");
            return (Criteria) this;
        }

        public Criteria andChildrennumberNotIn(List<Short> values) {
            addCriterion("childrennumber not in", values, "childrennumber");
            return (Criteria) this;
        }

        public Criteria andChildrennumberBetween(Short value1, Short value2) {
            addCriterion("childrennumber between", value1, value2, "childrennumber");
            return (Criteria) this;
        }

        public Criteria andChildrennumberNotBetween(Short value1, Short value2) {
            addCriterion("childrennumber not between", value1, value2, "childrennumber");
            return (Criteria) this;
        }

        public Criteria andMobilephonebrandIsNull() {
            addCriterion("mobilephonebrand is null");
            return (Criteria) this;
        }

        public Criteria andMobilephonebrandIsNotNull() {
            addCriterion("mobilephonebrand is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephonebrandEqualTo(String value) {
            addCriterion("mobilephonebrand =", value, "mobilephonebrand");
            return (Criteria) this;
        }

        public Criteria andMobilephonebrandNotEqualTo(String value) {
            addCriterion("mobilephonebrand <>", value, "mobilephonebrand");
            return (Criteria) this;
        }

        public Criteria andMobilephonebrandGreaterThan(String value) {
            addCriterion("mobilephonebrand >", value, "mobilephonebrand");
            return (Criteria) this;
        }

        public Criteria andMobilephonebrandGreaterThanOrEqualTo(String value) {
            addCriterion("mobilephonebrand >=", value, "mobilephonebrand");
            return (Criteria) this;
        }

        public Criteria andMobilephonebrandLessThan(String value) {
            addCriterion("mobilephonebrand <", value, "mobilephonebrand");
            return (Criteria) this;
        }

        public Criteria andMobilephonebrandLessThanOrEqualTo(String value) {
            addCriterion("mobilephonebrand <=", value, "mobilephonebrand");
            return (Criteria) this;
        }

        public Criteria andMobilephonebrandLike(String value) {
            addCriterion("mobilephonebrand like", value, "mobilephonebrand");
            return (Criteria) this;
        }

        public Criteria andMobilephonebrandNotLike(String value) {
            addCriterion("mobilephonebrand not like", value, "mobilephonebrand");
            return (Criteria) this;
        }

        public Criteria andMobilephonebrandIn(List<String> values) {
            addCriterion("mobilephonebrand in", values, "mobilephonebrand");
            return (Criteria) this;
        }

        public Criteria andMobilephonebrandNotIn(List<String> values) {
            addCriterion("mobilephonebrand not in", values, "mobilephonebrand");
            return (Criteria) this;
        }

        public Criteria andMobilephonebrandBetween(String value1, String value2) {
            addCriterion("mobilephonebrand between", value1, value2, "mobilephonebrand");
            return (Criteria) this;
        }

        public Criteria andMobilephonebrandNotBetween(String value1, String value2) {
            addCriterion("mobilephonebrand not between", value1, value2, "mobilephonebrand");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkman not between", value1, value2, "linkman");
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

        public Criteria andLinkphoneIsNull() {
            addCriterion("linkphone is null");
            return (Criteria) this;
        }

        public Criteria andLinkphoneIsNotNull() {
            addCriterion("linkphone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkphoneEqualTo(String value) {
            addCriterion("linkphone =", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotEqualTo(String value) {
            addCriterion("linkphone <>", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneGreaterThan(String value) {
            addCriterion("linkphone >", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneGreaterThanOrEqualTo(String value) {
            addCriterion("linkphone >=", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneLessThan(String value) {
            addCriterion("linkphone <", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneLessThanOrEqualTo(String value) {
            addCriterion("linkphone <=", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneLike(String value) {
            addCriterion("linkphone like", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotLike(String value) {
            addCriterion("linkphone not like", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneIn(List<String> values) {
            addCriterion("linkphone in", values, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotIn(List<String> values) {
            addCriterion("linkphone not in", values, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneBetween(String value1, String value2) {
            addCriterion("linkphone between", value1, value2, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotBetween(String value1, String value2) {
            addCriterion("linkphone not between", value1, value2, "linkphone");
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

        public Criteria andModifiedonIsNull() {
            addCriterion("modifiedon is null");
            return (Criteria) this;
        }

        public Criteria andModifiedonIsNotNull() {
            addCriterion("modifiedon is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedonEqualTo(Date value) {
            addCriterion("modifiedon =", value, "modifiedon");
            return (Criteria) this;
        }

        public Criteria andModifiedonNotEqualTo(Date value) {
            addCriterion("modifiedon <>", value, "modifiedon");
            return (Criteria) this;
        }

        public Criteria andModifiedonGreaterThan(Date value) {
            addCriterion("modifiedon >", value, "modifiedon");
            return (Criteria) this;
        }

        public Criteria andModifiedonGreaterThanOrEqualTo(Date value) {
            addCriterion("modifiedon >=", value, "modifiedon");
            return (Criteria) this;
        }

        public Criteria andModifiedonLessThan(Date value) {
            addCriterion("modifiedon <", value, "modifiedon");
            return (Criteria) this;
        }

        public Criteria andModifiedonLessThanOrEqualTo(Date value) {
            addCriterion("modifiedon <=", value, "modifiedon");
            return (Criteria) this;
        }

        public Criteria andModifiedonIn(List<Date> values) {
            addCriterion("modifiedon in", values, "modifiedon");
            return (Criteria) this;
        }

        public Criteria andModifiedonNotIn(List<Date> values) {
            addCriterion("modifiedon not in", values, "modifiedon");
            return (Criteria) this;
        }

        public Criteria andModifiedonBetween(Date value1, Date value2) {
            addCriterion("modifiedon between", value1, value2, "modifiedon");
            return (Criteria) this;
        }

        public Criteria andModifiedonNotBetween(Date value1, Date value2) {
            addCriterion("modifiedon not between", value1, value2, "modifiedon");
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