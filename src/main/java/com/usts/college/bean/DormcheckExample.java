package com.usts.college.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DormcheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DormcheckExample() {
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

        public Criteria andDormcheckIdIsNull() {
            addCriterion("dormcheck_id is null");
            return (Criteria) this;
        }

        public Criteria andDormcheckIdIsNotNull() {
            addCriterion("dormcheck_id is not null");
            return (Criteria) this;
        }

        public Criteria andDormcheckIdEqualTo(Integer value) {
            addCriterion("dormcheck_id =", value, "dormcheckId");
            return (Criteria) this;
        }

        public Criteria andDormcheckIdNotEqualTo(Integer value) {
            addCriterion("dormcheck_id <>", value, "dormcheckId");
            return (Criteria) this;
        }

        public Criteria andDormcheckIdGreaterThan(Integer value) {
            addCriterion("dormcheck_id >", value, "dormcheckId");
            return (Criteria) this;
        }

        public Criteria andDormcheckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dormcheck_id >=", value, "dormcheckId");
            return (Criteria) this;
        }

        public Criteria andDormcheckIdLessThan(Integer value) {
            addCriterion("dormcheck_id <", value, "dormcheckId");
            return (Criteria) this;
        }

        public Criteria andDormcheckIdLessThanOrEqualTo(Integer value) {
            addCriterion("dormcheck_id <=", value, "dormcheckId");
            return (Criteria) this;
        }

        public Criteria andDormcheckIdIn(List<Integer> values) {
            addCriterion("dormcheck_id in", values, "dormcheckId");
            return (Criteria) this;
        }

        public Criteria andDormcheckIdNotIn(List<Integer> values) {
            addCriterion("dormcheck_id not in", values, "dormcheckId");
            return (Criteria) this;
        }

        public Criteria andDormcheckIdBetween(Integer value1, Integer value2) {
            addCriterion("dormcheck_id between", value1, value2, "dormcheckId");
            return (Criteria) this;
        }

        public Criteria andDormcheckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dormcheck_id not between", value1, value2, "dormcheckId");
            return (Criteria) this;
        }

        public Criteria andDormcheckMessageIsNull() {
            addCriterion("dormcheck_message is null");
            return (Criteria) this;
        }

        public Criteria andDormcheckMessageIsNotNull() {
            addCriterion("dormcheck_message is not null");
            return (Criteria) this;
        }

        public Criteria andDormcheckMessageEqualTo(String value) {
            addCriterion("dormcheck_message =", value, "dormcheckMessage");
            return (Criteria) this;
        }

        public Criteria andDormcheckMessageNotEqualTo(String value) {
            addCriterion("dormcheck_message <>", value, "dormcheckMessage");
            return (Criteria) this;
        }

        public Criteria andDormcheckMessageGreaterThan(String value) {
            addCriterion("dormcheck_message >", value, "dormcheckMessage");
            return (Criteria) this;
        }

        public Criteria andDormcheckMessageGreaterThanOrEqualTo(String value) {
            addCriterion("dormcheck_message >=", value, "dormcheckMessage");
            return (Criteria) this;
        }

        public Criteria andDormcheckMessageLessThan(String value) {
            addCriterion("dormcheck_message <", value, "dormcheckMessage");
            return (Criteria) this;
        }

        public Criteria andDormcheckMessageLessThanOrEqualTo(String value) {
            addCriterion("dormcheck_message <=", value, "dormcheckMessage");
            return (Criteria) this;
        }

        public Criteria andDormcheckMessageLike(String value) {
            addCriterion("dormcheck_message like", value, "dormcheckMessage");
            return (Criteria) this;
        }

        public Criteria andDormcheckMessageNotLike(String value) {
            addCriterion("dormcheck_message not like", value, "dormcheckMessage");
            return (Criteria) this;
        }

        public Criteria andDormcheckMessageIn(List<String> values) {
            addCriterion("dormcheck_message in", values, "dormcheckMessage");
            return (Criteria) this;
        }

        public Criteria andDormcheckMessageNotIn(List<String> values) {
            addCriterion("dormcheck_message not in", values, "dormcheckMessage");
            return (Criteria) this;
        }

        public Criteria andDormcheckMessageBetween(String value1, String value2) {
            addCriterion("dormcheck_message between", value1, value2, "dormcheckMessage");
            return (Criteria) this;
        }

        public Criteria andDormcheckMessageNotBetween(String value1, String value2) {
            addCriterion("dormcheck_message not between", value1, value2, "dormcheckMessage");
            return (Criteria) this;
        }

        public Criteria andDormcheckDateIsNull() {
            addCriterion("dormcheck_date is null");
            return (Criteria) this;
        }

        public Criteria andDormcheckDateIsNotNull() {
            addCriterion("dormcheck_date is not null");
            return (Criteria) this;
        }

        public Criteria andDormcheckDateEqualTo(Date value) {
            addCriterionForJDBCDate("dormcheck_date =", value, "dormcheckDate");
            return (Criteria) this;
        }

        public Criteria andDormcheckDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("dormcheck_date <>", value, "dormcheckDate");
            return (Criteria) this;
        }

        public Criteria andDormcheckDateGreaterThan(Date value) {
            addCriterionForJDBCDate("dormcheck_date >", value, "dormcheckDate");
            return (Criteria) this;
        }

        public Criteria andDormcheckDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dormcheck_date >=", value, "dormcheckDate");
            return (Criteria) this;
        }

        public Criteria andDormcheckDateLessThan(Date value) {
            addCriterionForJDBCDate("dormcheck_date <", value, "dormcheckDate");
            return (Criteria) this;
        }

        public Criteria andDormcheckDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dormcheck_date <=", value, "dormcheckDate");
            return (Criteria) this;
        }

        public Criteria andDormcheckDateIn(List<Date> values) {
            addCriterionForJDBCDate("dormcheck_date in", values, "dormcheckDate");
            return (Criteria) this;
        }

        public Criteria andDormcheckDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("dormcheck_date not in", values, "dormcheckDate");
            return (Criteria) this;
        }

        public Criteria andDormcheckDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dormcheck_date between", value1, value2, "dormcheckDate");
            return (Criteria) this;
        }

        public Criteria andDormcheckDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dormcheck_date not between", value1, value2, "dormcheckDate");
            return (Criteria) this;
        }

        public Criteria andApartroomPidIsNull() {
            addCriterion("apartroom_pid is null");
            return (Criteria) this;
        }

        public Criteria andApartroomPidIsNotNull() {
            addCriterion("apartroom_pid is not null");
            return (Criteria) this;
        }

        public Criteria andApartroomPidEqualTo(Integer value) {
            addCriterion("apartroom_pid =", value, "apartroomPid");
            return (Criteria) this;
        }

        public Criteria andApartroomPidNotEqualTo(Integer value) {
            addCriterion("apartroom_pid <>", value, "apartroomPid");
            return (Criteria) this;
        }

        public Criteria andApartroomPidGreaterThan(Integer value) {
            addCriterion("apartroom_pid >", value, "apartroomPid");
            return (Criteria) this;
        }

        public Criteria andApartroomPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("apartroom_pid >=", value, "apartroomPid");
            return (Criteria) this;
        }

        public Criteria andApartroomPidLessThan(Integer value) {
            addCriterion("apartroom_pid <", value, "apartroomPid");
            return (Criteria) this;
        }

        public Criteria andApartroomPidLessThanOrEqualTo(Integer value) {
            addCriterion("apartroom_pid <=", value, "apartroomPid");
            return (Criteria) this;
        }

        public Criteria andApartroomPidIn(List<Integer> values) {
            addCriterion("apartroom_pid in", values, "apartroomPid");
            return (Criteria) this;
        }

        public Criteria andApartroomPidNotIn(List<Integer> values) {
            addCriterion("apartroom_pid not in", values, "apartroomPid");
            return (Criteria) this;
        }

        public Criteria andApartroomPidBetween(Integer value1, Integer value2) {
            addCriterion("apartroom_pid between", value1, value2, "apartroomPid");
            return (Criteria) this;
        }

        public Criteria andApartroomPidNotBetween(Integer value1, Integer value2) {
            addCriterion("apartroom_pid not between", value1, value2, "apartroomPid");
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