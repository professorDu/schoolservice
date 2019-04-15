package com.usts.college.bean;

import java.util.ArrayList;
import java.util.List;

public class ApartroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApartroomExample() {
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

        public Criteria andApartroomIdIsNull() {
            addCriterion("apartroom_id is null");
            return (Criteria) this;
        }

        public Criteria andApartroomIdIsNotNull() {
            addCriterion("apartroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andApartroomIdEqualTo(Integer value) {
            addCriterion("apartroom_id =", value, "apartroomId");
            return (Criteria) this;
        }

        public Criteria andApartroomIdNotEqualTo(Integer value) {
            addCriterion("apartroom_id <>", value, "apartroomId");
            return (Criteria) this;
        }

        public Criteria andApartroomIdGreaterThan(Integer value) {
            addCriterion("apartroom_id >", value, "apartroomId");
            return (Criteria) this;
        }

        public Criteria andApartroomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apartroom_id >=", value, "apartroomId");
            return (Criteria) this;
        }

        public Criteria andApartroomIdLessThan(Integer value) {
            addCriterion("apartroom_id <", value, "apartroomId");
            return (Criteria) this;
        }

        public Criteria andApartroomIdLessThanOrEqualTo(Integer value) {
            addCriterion("apartroom_id <=", value, "apartroomId");
            return (Criteria) this;
        }

        public Criteria andApartroomIdIn(List<Integer> values) {
            addCriterion("apartroom_id in", values, "apartroomId");
            return (Criteria) this;
        }

        public Criteria andApartroomIdNotIn(List<Integer> values) {
            addCriterion("apartroom_id not in", values, "apartroomId");
            return (Criteria) this;
        }

        public Criteria andApartroomIdBetween(Integer value1, Integer value2) {
            addCriterion("apartroom_id between", value1, value2, "apartroomId");
            return (Criteria) this;
        }

        public Criteria andApartroomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apartroom_id not between", value1, value2, "apartroomId");
            return (Criteria) this;
        }

        public Criteria andApartPidIsNull() {
            addCriterion("apart_pid is null");
            return (Criteria) this;
        }

        public Criteria andApartPidIsNotNull() {
            addCriterion("apart_pid is not null");
            return (Criteria) this;
        }

        public Criteria andApartPidEqualTo(Integer value) {
            addCriterion("apart_pid =", value, "apartPid");
            return (Criteria) this;
        }

        public Criteria andApartPidNotEqualTo(Integer value) {
            addCriterion("apart_pid <>", value, "apartPid");
            return (Criteria) this;
        }

        public Criteria andApartPidGreaterThan(Integer value) {
            addCriterion("apart_pid >", value, "apartPid");
            return (Criteria) this;
        }

        public Criteria andApartPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("apart_pid >=", value, "apartPid");
            return (Criteria) this;
        }

        public Criteria andApartPidLessThan(Integer value) {
            addCriterion("apart_pid <", value, "apartPid");
            return (Criteria) this;
        }

        public Criteria andApartPidLessThanOrEqualTo(Integer value) {
            addCriterion("apart_pid <=", value, "apartPid");
            return (Criteria) this;
        }

        public Criteria andApartPidIn(List<Integer> values) {
            addCriterion("apart_pid in", values, "apartPid");
            return (Criteria) this;
        }

        public Criteria andApartPidNotIn(List<Integer> values) {
            addCriterion("apart_pid not in", values, "apartPid");
            return (Criteria) this;
        }

        public Criteria andApartPidBetween(Integer value1, Integer value2) {
            addCriterion("apart_pid between", value1, value2, "apartPid");
            return (Criteria) this;
        }

        public Criteria andApartPidNotBetween(Integer value1, Integer value2) {
            addCriterion("apart_pid not between", value1, value2, "apartPid");
            return (Criteria) this;
        }

        public Criteria andApartroomAbcIsNull() {
            addCriterion("apartroom_abc is null");
            return (Criteria) this;
        }

        public Criteria andApartroomAbcIsNotNull() {
            addCriterion("apartroom_abc is not null");
            return (Criteria) this;
        }

        public Criteria andApartroomAbcEqualTo(String value) {
            addCriterion("apartroom_abc =", value, "apartroomAbc");
            return (Criteria) this;
        }

        public Criteria andApartroomAbcNotEqualTo(String value) {
            addCriterion("apartroom_abc <>", value, "apartroomAbc");
            return (Criteria) this;
        }

        public Criteria andApartroomAbcGreaterThan(String value) {
            addCriterion("apartroom_abc >", value, "apartroomAbc");
            return (Criteria) this;
        }

        public Criteria andApartroomAbcGreaterThanOrEqualTo(String value) {
            addCriterion("apartroom_abc >=", value, "apartroomAbc");
            return (Criteria) this;
        }

        public Criteria andApartroomAbcLessThan(String value) {
            addCriterion("apartroom_abc <", value, "apartroomAbc");
            return (Criteria) this;
        }

        public Criteria andApartroomAbcLessThanOrEqualTo(String value) {
            addCriterion("apartroom_abc <=", value, "apartroomAbc");
            return (Criteria) this;
        }

        public Criteria andApartroomAbcLike(String value) {
            addCriterion("apartroom_abc like", value, "apartroomAbc");
            return (Criteria) this;
        }

        public Criteria andApartroomAbcNotLike(String value) {
            addCriterion("apartroom_abc not like", value, "apartroomAbc");
            return (Criteria) this;
        }

        public Criteria andApartroomAbcIn(List<String> values) {
            addCriterion("apartroom_abc in", values, "apartroomAbc");
            return (Criteria) this;
        }

        public Criteria andApartroomAbcNotIn(List<String> values) {
            addCriterion("apartroom_abc not in", values, "apartroomAbc");
            return (Criteria) this;
        }

        public Criteria andApartroomAbcBetween(String value1, String value2) {
            addCriterion("apartroom_abc between", value1, value2, "apartroomAbc");
            return (Criteria) this;
        }

        public Criteria andApartroomAbcNotBetween(String value1, String value2) {
            addCriterion("apartroom_abc not between", value1, value2, "apartroomAbc");
            return (Criteria) this;
        }

        public Criteria andApartroomDormIsNull() {
            addCriterion("apartroom_dorm is null");
            return (Criteria) this;
        }

        public Criteria andApartroomDormIsNotNull() {
            addCriterion("apartroom_dorm is not null");
            return (Criteria) this;
        }

        public Criteria andApartroomDormEqualTo(String value) {
            addCriterion("apartroom_dorm =", value, "apartroomDorm");
            return (Criteria) this;
        }

        public Criteria andApartroomDormNotEqualTo(String value) {
            addCriterion("apartroom_dorm <>", value, "apartroomDorm");
            return (Criteria) this;
        }

        public Criteria andApartroomDormGreaterThan(String value) {
            addCriterion("apartroom_dorm >", value, "apartroomDorm");
            return (Criteria) this;
        }

        public Criteria andApartroomDormGreaterThanOrEqualTo(String value) {
            addCriterion("apartroom_dorm >=", value, "apartroomDorm");
            return (Criteria) this;
        }

        public Criteria andApartroomDormLessThan(String value) {
            addCriterion("apartroom_dorm <", value, "apartroomDorm");
            return (Criteria) this;
        }

        public Criteria andApartroomDormLessThanOrEqualTo(String value) {
            addCriterion("apartroom_dorm <=", value, "apartroomDorm");
            return (Criteria) this;
        }

        public Criteria andApartroomDormLike(String value) {
            addCriterion("apartroom_dorm like", value, "apartroomDorm");
            return (Criteria) this;
        }

        public Criteria andApartroomDormNotLike(String value) {
            addCriterion("apartroom_dorm not like", value, "apartroomDorm");
            return (Criteria) this;
        }

        public Criteria andApartroomDormIn(List<String> values) {
            addCriterion("apartroom_dorm in", values, "apartroomDorm");
            return (Criteria) this;
        }

        public Criteria andApartroomDormNotIn(List<String> values) {
            addCriterion("apartroom_dorm not in", values, "apartroomDorm");
            return (Criteria) this;
        }

        public Criteria andApartroomDormBetween(String value1, String value2) {
            addCriterion("apartroom_dorm between", value1, value2, "apartroomDorm");
            return (Criteria) this;
        }

        public Criteria andApartroomDormNotBetween(String value1, String value2) {
            addCriterion("apartroom_dorm not between", value1, value2, "apartroomDorm");
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