package com.usts.college.bean;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuNumIsNull() {
            addCriterion("stu_num is null");
            return (Criteria) this;
        }

        public Criteria andStuNumIsNotNull() {
            addCriterion("stu_num is not null");
            return (Criteria) this;
        }

        public Criteria andStuNumEqualTo(String value) {
            addCriterion("stu_num =", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotEqualTo(String value) {
            addCriterion("stu_num <>", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumGreaterThan(String value) {
            addCriterion("stu_num >", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumGreaterThanOrEqualTo(String value) {
            addCriterion("stu_num >=", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumLessThan(String value) {
            addCriterion("stu_num <", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumLessThanOrEqualTo(String value) {
            addCriterion("stu_num <=", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumLike(String value) {
            addCriterion("stu_num like", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotLike(String value) {
            addCriterion("stu_num not like", value, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumIn(List<String> values) {
            addCriterion("stu_num in", values, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotIn(List<String> values) {
            addCriterion("stu_num not in", values, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumBetween(String value1, String value2) {
            addCriterion("stu_num between", value1, value2, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuNumNotBetween(String value1, String value2) {
            addCriterion("stu_num not between", value1, value2, "stuNum");
            return (Criteria) this;
        }

        public Criteria andStuPassIsNull() {
            addCriterion("stu_pass is null");
            return (Criteria) this;
        }

        public Criteria andStuPassIsNotNull() {
            addCriterion("stu_pass is not null");
            return (Criteria) this;
        }

        public Criteria andStuPassEqualTo(String value) {
            addCriterion("stu_pass =", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassNotEqualTo(String value) {
            addCriterion("stu_pass <>", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassGreaterThan(String value) {
            addCriterion("stu_pass >", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassGreaterThanOrEqualTo(String value) {
            addCriterion("stu_pass >=", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassLessThan(String value) {
            addCriterion("stu_pass <", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassLessThanOrEqualTo(String value) {
            addCriterion("stu_pass <=", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassLike(String value) {
            addCriterion("stu_pass like", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassNotLike(String value) {
            addCriterion("stu_pass not like", value, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassIn(List<String> values) {
            addCriterion("stu_pass in", values, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassNotIn(List<String> values) {
            addCriterion("stu_pass not in", values, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassBetween(String value1, String value2) {
            addCriterion("stu_pass between", value1, value2, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuPassNotBetween(String value1, String value2) {
            addCriterion("stu_pass not between", value1, value2, "stuPass");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("stu_name is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("stu_name is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("stu_name =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("stu_name <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("stu_name >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("stu_name >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("stu_name <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("stu_name <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("stu_name like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("stu_name not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("stu_name in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("stu_name not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("stu_name between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("stu_name not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuGenderIsNull() {
            addCriterion("stu_gender is null");
            return (Criteria) this;
        }

        public Criteria andStuGenderIsNotNull() {
            addCriterion("stu_gender is not null");
            return (Criteria) this;
        }

        public Criteria andStuGenderEqualTo(String value) {
            addCriterion("stu_gender =", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderNotEqualTo(String value) {
            addCriterion("stu_gender <>", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderGreaterThan(String value) {
            addCriterion("stu_gender >", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderGreaterThanOrEqualTo(String value) {
            addCriterion("stu_gender >=", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderLessThan(String value) {
            addCriterion("stu_gender <", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderLessThanOrEqualTo(String value) {
            addCriterion("stu_gender <=", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderLike(String value) {
            addCriterion("stu_gender like", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderNotLike(String value) {
            addCriterion("stu_gender not like", value, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderIn(List<String> values) {
            addCriterion("stu_gender in", values, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderNotIn(List<String> values) {
            addCriterion("stu_gender not in", values, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderBetween(String value1, String value2) {
            addCriterion("stu_gender between", value1, value2, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuGenderNotBetween(String value1, String value2) {
            addCriterion("stu_gender not between", value1, value2, "stuGender");
            return (Criteria) this;
        }

        public Criteria andStuCollegeIsNull() {
            addCriterion("stu_college is null");
            return (Criteria) this;
        }

        public Criteria andStuCollegeIsNotNull() {
            addCriterion("stu_college is not null");
            return (Criteria) this;
        }

        public Criteria andStuCollegeEqualTo(String value) {
            addCriterion("stu_college =", value, "stuCollege");
            return (Criteria) this;
        }

        public Criteria andStuCollegeNotEqualTo(String value) {
            addCriterion("stu_college <>", value, "stuCollege");
            return (Criteria) this;
        }

        public Criteria andStuCollegeGreaterThan(String value) {
            addCriterion("stu_college >", value, "stuCollege");
            return (Criteria) this;
        }

        public Criteria andStuCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("stu_college >=", value, "stuCollege");
            return (Criteria) this;
        }

        public Criteria andStuCollegeLessThan(String value) {
            addCriterion("stu_college <", value, "stuCollege");
            return (Criteria) this;
        }

        public Criteria andStuCollegeLessThanOrEqualTo(String value) {
            addCriterion("stu_college <=", value, "stuCollege");
            return (Criteria) this;
        }

        public Criteria andStuCollegeLike(String value) {
            addCriterion("stu_college like", value, "stuCollege");
            return (Criteria) this;
        }

        public Criteria andStuCollegeNotLike(String value) {
            addCriterion("stu_college not like", value, "stuCollege");
            return (Criteria) this;
        }

        public Criteria andStuCollegeIn(List<String> values) {
            addCriterion("stu_college in", values, "stuCollege");
            return (Criteria) this;
        }

        public Criteria andStuCollegeNotIn(List<String> values) {
            addCriterion("stu_college not in", values, "stuCollege");
            return (Criteria) this;
        }

        public Criteria andStuCollegeBetween(String value1, String value2) {
            addCriterion("stu_college between", value1, value2, "stuCollege");
            return (Criteria) this;
        }

        public Criteria andStuCollegeNotBetween(String value1, String value2) {
            addCriterion("stu_college not between", value1, value2, "stuCollege");
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