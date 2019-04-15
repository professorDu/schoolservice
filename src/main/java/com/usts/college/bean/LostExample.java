package com.usts.college.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LostExample() {
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

        public Criteria andLostIdIsNull() {
            addCriterion("lost_id is null");
            return (Criteria) this;
        }

        public Criteria andLostIdIsNotNull() {
            addCriterion("lost_id is not null");
            return (Criteria) this;
        }

        public Criteria andLostIdEqualTo(Integer value) {
            addCriterion("lost_id =", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdNotEqualTo(Integer value) {
            addCriterion("lost_id <>", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdGreaterThan(Integer value) {
            addCriterion("lost_id >", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lost_id >=", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdLessThan(Integer value) {
            addCriterion("lost_id <", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdLessThanOrEqualTo(Integer value) {
            addCriterion("lost_id <=", value, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdIn(List<Integer> values) {
            addCriterion("lost_id in", values, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdNotIn(List<Integer> values) {
            addCriterion("lost_id not in", values, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdBetween(Integer value1, Integer value2) {
            addCriterion("lost_id between", value1, value2, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lost_id not between", value1, value2, "lostId");
            return (Criteria) this;
        }

        public Criteria andLostTitleIsNull() {
            addCriterion("lost_title is null");
            return (Criteria) this;
        }

        public Criteria andLostTitleIsNotNull() {
            addCriterion("lost_title is not null");
            return (Criteria) this;
        }

        public Criteria andLostTitleEqualTo(String value) {
            addCriterion("lost_title =", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleNotEqualTo(String value) {
            addCriterion("lost_title <>", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleGreaterThan(String value) {
            addCriterion("lost_title >", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleGreaterThanOrEqualTo(String value) {
            addCriterion("lost_title >=", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleLessThan(String value) {
            addCriterion("lost_title <", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleLessThanOrEqualTo(String value) {
            addCriterion("lost_title <=", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleLike(String value) {
            addCriterion("lost_title like", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleNotLike(String value) {
            addCriterion("lost_title not like", value, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleIn(List<String> values) {
            addCriterion("lost_title in", values, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleNotIn(List<String> values) {
            addCriterion("lost_title not in", values, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleBetween(String value1, String value2) {
            addCriterion("lost_title between", value1, value2, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostTitleNotBetween(String value1, String value2) {
            addCriterion("lost_title not between", value1, value2, "lostTitle");
            return (Criteria) this;
        }

        public Criteria andLostMessageIsNull() {
            addCriterion("lost_message is null");
            return (Criteria) this;
        }

        public Criteria andLostMessageIsNotNull() {
            addCriterion("lost_message is not null");
            return (Criteria) this;
        }

        public Criteria andLostMessageEqualTo(String value) {
            addCriterion("lost_message =", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageNotEqualTo(String value) {
            addCriterion("lost_message <>", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageGreaterThan(String value) {
            addCriterion("lost_message >", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageGreaterThanOrEqualTo(String value) {
            addCriterion("lost_message >=", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageLessThan(String value) {
            addCriterion("lost_message <", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageLessThanOrEqualTo(String value) {
            addCriterion("lost_message <=", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageLike(String value) {
            addCriterion("lost_message like", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageNotLike(String value) {
            addCriterion("lost_message not like", value, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageIn(List<String> values) {
            addCriterion("lost_message in", values, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageNotIn(List<String> values) {
            addCriterion("lost_message not in", values, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageBetween(String value1, String value2) {
            addCriterion("lost_message between", value1, value2, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostMessageNotBetween(String value1, String value2) {
            addCriterion("lost_message not between", value1, value2, "lostMessage");
            return (Criteria) this;
        }

        public Criteria andLostPlaceIsNull() {
            addCriterion("lost_place is null");
            return (Criteria) this;
        }

        public Criteria andLostPlaceIsNotNull() {
            addCriterion("lost_place is not null");
            return (Criteria) this;
        }

        public Criteria andLostPlaceEqualTo(String value) {
            addCriterion("lost_place =", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceNotEqualTo(String value) {
            addCriterion("lost_place <>", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceGreaterThan(String value) {
            addCriterion("lost_place >", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("lost_place >=", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceLessThan(String value) {
            addCriterion("lost_place <", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceLessThanOrEqualTo(String value) {
            addCriterion("lost_place <=", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceLike(String value) {
            addCriterion("lost_place like", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceNotLike(String value) {
            addCriterion("lost_place not like", value, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceIn(List<String> values) {
            addCriterion("lost_place in", values, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceNotIn(List<String> values) {
            addCriterion("lost_place not in", values, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceBetween(String value1, String value2) {
            addCriterion("lost_place between", value1, value2, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostPlaceNotBetween(String value1, String value2) {
            addCriterion("lost_place not between", value1, value2, "lostPlace");
            return (Criteria) this;
        }

        public Criteria andLostDateIsNull() {
            addCriterion("lost_date is null");
            return (Criteria) this;
        }

        public Criteria andLostDateIsNotNull() {
            addCriterion("lost_date is not null");
            return (Criteria) this;
        }

        public Criteria andLostDateEqualTo(Date value) {
            addCriterionForJDBCDate("lost_date =", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("lost_date <>", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateGreaterThan(Date value) {
            addCriterionForJDBCDate("lost_date >", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lost_date >=", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateLessThan(Date value) {
            addCriterionForJDBCDate("lost_date <", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lost_date <=", value, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateIn(List<Date> values) {
            addCriterionForJDBCDate("lost_date in", values, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("lost_date not in", values, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lost_date between", value1, value2, "lostDate");
            return (Criteria) this;
        }

        public Criteria andLostDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lost_date not between", value1, value2, "lostDate");
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