package com.usts.college.bean;

import java.util.ArrayList;
import java.util.List;

public class LifemanagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LifemanagerExample() {
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

        public Criteria andLifeIdIsNull() {
            addCriterion("life_id is null");
            return (Criteria) this;
        }

        public Criteria andLifeIdIsNotNull() {
            addCriterion("life_id is not null");
            return (Criteria) this;
        }

        public Criteria andLifeIdEqualTo(Integer value) {
            addCriterion("life_id =", value, "lifeId");
            return (Criteria) this;
        }

        public Criteria andLifeIdNotEqualTo(Integer value) {
            addCriterion("life_id <>", value, "lifeId");
            return (Criteria) this;
        }

        public Criteria andLifeIdGreaterThan(Integer value) {
            addCriterion("life_id >", value, "lifeId");
            return (Criteria) this;
        }

        public Criteria andLifeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("life_id >=", value, "lifeId");
            return (Criteria) this;
        }

        public Criteria andLifeIdLessThan(Integer value) {
            addCriterion("life_id <", value, "lifeId");
            return (Criteria) this;
        }

        public Criteria andLifeIdLessThanOrEqualTo(Integer value) {
            addCriterion("life_id <=", value, "lifeId");
            return (Criteria) this;
        }

        public Criteria andLifeIdIn(List<Integer> values) {
            addCriterion("life_id in", values, "lifeId");
            return (Criteria) this;
        }

        public Criteria andLifeIdNotIn(List<Integer> values) {
            addCriterion("life_id not in", values, "lifeId");
            return (Criteria) this;
        }

        public Criteria andLifeIdBetween(Integer value1, Integer value2) {
            addCriterion("life_id between", value1, value2, "lifeId");
            return (Criteria) this;
        }

        public Criteria andLifeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("life_id not between", value1, value2, "lifeId");
            return (Criteria) this;
        }

        public Criteria andLifeNameIsNull() {
            addCriterion("life_name is null");
            return (Criteria) this;
        }

        public Criteria andLifeNameIsNotNull() {
            addCriterion("life_name is not null");
            return (Criteria) this;
        }

        public Criteria andLifeNameEqualTo(String value) {
            addCriterion("life_name =", value, "lifeName");
            return (Criteria) this;
        }

        public Criteria andLifeNameNotEqualTo(String value) {
            addCriterion("life_name <>", value, "lifeName");
            return (Criteria) this;
        }

        public Criteria andLifeNameGreaterThan(String value) {
            addCriterion("life_name >", value, "lifeName");
            return (Criteria) this;
        }

        public Criteria andLifeNameGreaterThanOrEqualTo(String value) {
            addCriterion("life_name >=", value, "lifeName");
            return (Criteria) this;
        }

        public Criteria andLifeNameLessThan(String value) {
            addCriterion("life_name <", value, "lifeName");
            return (Criteria) this;
        }

        public Criteria andLifeNameLessThanOrEqualTo(String value) {
            addCriterion("life_name <=", value, "lifeName");
            return (Criteria) this;
        }

        public Criteria andLifeNameLike(String value) {
            addCriterion("life_name like", value, "lifeName");
            return (Criteria) this;
        }

        public Criteria andLifeNameNotLike(String value) {
            addCriterion("life_name not like", value, "lifeName");
            return (Criteria) this;
        }

        public Criteria andLifeNameIn(List<String> values) {
            addCriterion("life_name in", values, "lifeName");
            return (Criteria) this;
        }

        public Criteria andLifeNameNotIn(List<String> values) {
            addCriterion("life_name not in", values, "lifeName");
            return (Criteria) this;
        }

        public Criteria andLifeNameBetween(String value1, String value2) {
            addCriterion("life_name between", value1, value2, "lifeName");
            return (Criteria) this;
        }

        public Criteria andLifeNameNotBetween(String value1, String value2) {
            addCriterion("life_name not between", value1, value2, "lifeName");
            return (Criteria) this;
        }

        public Criteria andLifeUsernameIsNull() {
            addCriterion("life_username is null");
            return (Criteria) this;
        }

        public Criteria andLifeUsernameIsNotNull() {
            addCriterion("life_username is not null");
            return (Criteria) this;
        }

        public Criteria andLifeUsernameEqualTo(String value) {
            addCriterion("life_username =", value, "lifeUsername");
            return (Criteria) this;
        }

        public Criteria andLifeUsernameNotEqualTo(String value) {
            addCriterion("life_username <>", value, "lifeUsername");
            return (Criteria) this;
        }

        public Criteria andLifeUsernameGreaterThan(String value) {
            addCriterion("life_username >", value, "lifeUsername");
            return (Criteria) this;
        }

        public Criteria andLifeUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("life_username >=", value, "lifeUsername");
            return (Criteria) this;
        }

        public Criteria andLifeUsernameLessThan(String value) {
            addCriterion("life_username <", value, "lifeUsername");
            return (Criteria) this;
        }

        public Criteria andLifeUsernameLessThanOrEqualTo(String value) {
            addCriterion("life_username <=", value, "lifeUsername");
            return (Criteria) this;
        }

        public Criteria andLifeUsernameLike(String value) {
            addCriterion("life_username like", value, "lifeUsername");
            return (Criteria) this;
        }

        public Criteria andLifeUsernameNotLike(String value) {
            addCriterion("life_username not like", value, "lifeUsername");
            return (Criteria) this;
        }

        public Criteria andLifeUsernameIn(List<String> values) {
            addCriterion("life_username in", values, "lifeUsername");
            return (Criteria) this;
        }

        public Criteria andLifeUsernameNotIn(List<String> values) {
            addCriterion("life_username not in", values, "lifeUsername");
            return (Criteria) this;
        }

        public Criteria andLifeUsernameBetween(String value1, String value2) {
            addCriterion("life_username between", value1, value2, "lifeUsername");
            return (Criteria) this;
        }

        public Criteria andLifeUsernameNotBetween(String value1, String value2) {
            addCriterion("life_username not between", value1, value2, "lifeUsername");
            return (Criteria) this;
        }

        public Criteria andLifePasswordIsNull() {
            addCriterion("life_password is null");
            return (Criteria) this;
        }

        public Criteria andLifePasswordIsNotNull() {
            addCriterion("life_password is not null");
            return (Criteria) this;
        }

        public Criteria andLifePasswordEqualTo(String value) {
            addCriterion("life_password =", value, "lifePassword");
            return (Criteria) this;
        }

        public Criteria andLifePasswordNotEqualTo(String value) {
            addCriterion("life_password <>", value, "lifePassword");
            return (Criteria) this;
        }

        public Criteria andLifePasswordGreaterThan(String value) {
            addCriterion("life_password >", value, "lifePassword");
            return (Criteria) this;
        }

        public Criteria andLifePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("life_password >=", value, "lifePassword");
            return (Criteria) this;
        }

        public Criteria andLifePasswordLessThan(String value) {
            addCriterion("life_password <", value, "lifePassword");
            return (Criteria) this;
        }

        public Criteria andLifePasswordLessThanOrEqualTo(String value) {
            addCriterion("life_password <=", value, "lifePassword");
            return (Criteria) this;
        }

        public Criteria andLifePasswordLike(String value) {
            addCriterion("life_password like", value, "lifePassword");
            return (Criteria) this;
        }

        public Criteria andLifePasswordNotLike(String value) {
            addCriterion("life_password not like", value, "lifePassword");
            return (Criteria) this;
        }

        public Criteria andLifePasswordIn(List<String> values) {
            addCriterion("life_password in", values, "lifePassword");
            return (Criteria) this;
        }

        public Criteria andLifePasswordNotIn(List<String> values) {
            addCriterion("life_password not in", values, "lifePassword");
            return (Criteria) this;
        }

        public Criteria andLifePasswordBetween(String value1, String value2) {
            addCriterion("life_password between", value1, value2, "lifePassword");
            return (Criteria) this;
        }

        public Criteria andLifePasswordNotBetween(String value1, String value2) {
            addCriterion("life_password not between", value1, value2, "lifePassword");
            return (Criteria) this;
        }

        public Criteria andLifeGenderIsNull() {
            addCriterion("life_gender is null");
            return (Criteria) this;
        }

        public Criteria andLifeGenderIsNotNull() {
            addCriterion("life_gender is not null");
            return (Criteria) this;
        }

        public Criteria andLifeGenderEqualTo(String value) {
            addCriterion("life_gender =", value, "lifeGender");
            return (Criteria) this;
        }

        public Criteria andLifeGenderNotEqualTo(String value) {
            addCriterion("life_gender <>", value, "lifeGender");
            return (Criteria) this;
        }

        public Criteria andLifeGenderGreaterThan(String value) {
            addCriterion("life_gender >", value, "lifeGender");
            return (Criteria) this;
        }

        public Criteria andLifeGenderGreaterThanOrEqualTo(String value) {
            addCriterion("life_gender >=", value, "lifeGender");
            return (Criteria) this;
        }

        public Criteria andLifeGenderLessThan(String value) {
            addCriterion("life_gender <", value, "lifeGender");
            return (Criteria) this;
        }

        public Criteria andLifeGenderLessThanOrEqualTo(String value) {
            addCriterion("life_gender <=", value, "lifeGender");
            return (Criteria) this;
        }

        public Criteria andLifeGenderLike(String value) {
            addCriterion("life_gender like", value, "lifeGender");
            return (Criteria) this;
        }

        public Criteria andLifeGenderNotLike(String value) {
            addCriterion("life_gender not like", value, "lifeGender");
            return (Criteria) this;
        }

        public Criteria andLifeGenderIn(List<String> values) {
            addCriterion("life_gender in", values, "lifeGender");
            return (Criteria) this;
        }

        public Criteria andLifeGenderNotIn(List<String> values) {
            addCriterion("life_gender not in", values, "lifeGender");
            return (Criteria) this;
        }

        public Criteria andLifeGenderBetween(String value1, String value2) {
            addCriterion("life_gender between", value1, value2, "lifeGender");
            return (Criteria) this;
        }

        public Criteria andLifeGenderNotBetween(String value1, String value2) {
            addCriterion("life_gender not between", value1, value2, "lifeGender");
            return (Criteria) this;
        }

        public Criteria andLifeTelIsNull() {
            addCriterion("life_tel is null");
            return (Criteria) this;
        }

        public Criteria andLifeTelIsNotNull() {
            addCriterion("life_tel is not null");
            return (Criteria) this;
        }

        public Criteria andLifeTelEqualTo(String value) {
            addCriterion("life_tel =", value, "lifeTel");
            return (Criteria) this;
        }

        public Criteria andLifeTelNotEqualTo(String value) {
            addCriterion("life_tel <>", value, "lifeTel");
            return (Criteria) this;
        }

        public Criteria andLifeTelGreaterThan(String value) {
            addCriterion("life_tel >", value, "lifeTel");
            return (Criteria) this;
        }

        public Criteria andLifeTelGreaterThanOrEqualTo(String value) {
            addCriterion("life_tel >=", value, "lifeTel");
            return (Criteria) this;
        }

        public Criteria andLifeTelLessThan(String value) {
            addCriterion("life_tel <", value, "lifeTel");
            return (Criteria) this;
        }

        public Criteria andLifeTelLessThanOrEqualTo(String value) {
            addCriterion("life_tel <=", value, "lifeTel");
            return (Criteria) this;
        }

        public Criteria andLifeTelLike(String value) {
            addCriterion("life_tel like", value, "lifeTel");
            return (Criteria) this;
        }

        public Criteria andLifeTelNotLike(String value) {
            addCriterion("life_tel not like", value, "lifeTel");
            return (Criteria) this;
        }

        public Criteria andLifeTelIn(List<String> values) {
            addCriterion("life_tel in", values, "lifeTel");
            return (Criteria) this;
        }

        public Criteria andLifeTelNotIn(List<String> values) {
            addCriterion("life_tel not in", values, "lifeTel");
            return (Criteria) this;
        }

        public Criteria andLifeTelBetween(String value1, String value2) {
            addCriterion("life_tel between", value1, value2, "lifeTel");
            return (Criteria) this;
        }

        public Criteria andLifeTelNotBetween(String value1, String value2) {
            addCriterion("life_tel not between", value1, value2, "lifeTel");
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