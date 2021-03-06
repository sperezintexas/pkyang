package com.jbb.user.biz.entity;

import java.util.ArrayList;
import java.util.List;

public class StatusWorkFlowExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    protected Integer limitStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    protected Integer limitEnd;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    public StatusWorkFlowExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNull() {
            addCriterion("status_id is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("status_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(String value) {
            addCriterion("status_id =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(String value) {
            addCriterion("status_id <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(String value) {
            addCriterion("status_id >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(String value) {
            addCriterion("status_id >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(String value) {
            addCriterion("status_id <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(String value) {
            addCriterion("status_id <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLike(String value) {
            addCriterion("status_id like", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotLike(String value) {
            addCriterion("status_id not like", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<String> values) {
            addCriterion("status_id in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<String> values) {
            addCriterion("status_id not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(String value1, String value2) {
            addCriterion("status_id between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(String value1, String value2) {
            addCriterion("status_id not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusNameIsNull() {
            addCriterion("status_name is null");
            return (Criteria) this;
        }

        public Criteria andStatusNameIsNotNull() {
            addCriterion("status_name is not null");
            return (Criteria) this;
        }

        public Criteria andStatusNameEqualTo(String value) {
            addCriterion("status_name =", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotEqualTo(String value) {
            addCriterion("status_name <>", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameGreaterThan(String value) {
            addCriterion("status_name >", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("status_name >=", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameLessThan(String value) {
            addCriterion("status_name <", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameLessThanOrEqualTo(String value) {
            addCriterion("status_name <=", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameLike(String value) {
            addCriterion("status_name like", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotLike(String value) {
            addCriterion("status_name not like", value, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameIn(List<String> values) {
            addCriterion("status_name in", values, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotIn(List<String> values) {
            addCriterion("status_name not in", values, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameBetween(String value1, String value2) {
            addCriterion("status_name between", value1, value2, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNameNotBetween(String value1, String value2) {
            addCriterion("status_name not between", value1, value2, "statusName");
            return (Criteria) this;
        }

        public Criteria andStatusNextIdIsNull() {
            addCriterion("status_next_id is null");
            return (Criteria) this;
        }

        public Criteria andStatusNextIdIsNotNull() {
            addCriterion("status_next_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatusNextIdEqualTo(String value) {
            addCriterion("status_next_id =", value, "statusNextId");
            return (Criteria) this;
        }

        public Criteria andStatusNextIdNotEqualTo(String value) {
            addCriterion("status_next_id <>", value, "statusNextId");
            return (Criteria) this;
        }

        public Criteria andStatusNextIdGreaterThan(String value) {
            addCriterion("status_next_id >", value, "statusNextId");
            return (Criteria) this;
        }

        public Criteria andStatusNextIdGreaterThanOrEqualTo(String value) {
            addCriterion("status_next_id >=", value, "statusNextId");
            return (Criteria) this;
        }

        public Criteria andStatusNextIdLessThan(String value) {
            addCriterion("status_next_id <", value, "statusNextId");
            return (Criteria) this;
        }

        public Criteria andStatusNextIdLessThanOrEqualTo(String value) {
            addCriterion("status_next_id <=", value, "statusNextId");
            return (Criteria) this;
        }

        public Criteria andStatusNextIdLike(String value) {
            addCriterion("status_next_id like", value, "statusNextId");
            return (Criteria) this;
        }

        public Criteria andStatusNextIdNotLike(String value) {
            addCriterion("status_next_id not like", value, "statusNextId");
            return (Criteria) this;
        }

        public Criteria andStatusNextIdIn(List<String> values) {
            addCriterion("status_next_id in", values, "statusNextId");
            return (Criteria) this;
        }

        public Criteria andStatusNextIdNotIn(List<String> values) {
            addCriterion("status_next_id not in", values, "statusNextId");
            return (Criteria) this;
        }

        public Criteria andStatusNextIdBetween(String value1, String value2) {
            addCriterion("status_next_id between", value1, value2, "statusNextId");
            return (Criteria) this;
        }

        public Criteria andStatusNextIdNotBetween(String value1, String value2) {
            addCriterion("status_next_id not between", value1, value2, "statusNextId");
            return (Criteria) this;
        }

        public Criteria andStatusNextNameIsNull() {
            addCriterion("status_next_name is null");
            return (Criteria) this;
        }

        public Criteria andStatusNextNameIsNotNull() {
            addCriterion("status_next_name is not null");
            return (Criteria) this;
        }

        public Criteria andStatusNextNameEqualTo(String value) {
            addCriterion("status_next_name =", value, "statusNextName");
            return (Criteria) this;
        }

        public Criteria andStatusNextNameNotEqualTo(String value) {
            addCriterion("status_next_name <>", value, "statusNextName");
            return (Criteria) this;
        }

        public Criteria andStatusNextNameGreaterThan(String value) {
            addCriterion("status_next_name >", value, "statusNextName");
            return (Criteria) this;
        }

        public Criteria andStatusNextNameGreaterThanOrEqualTo(String value) {
            addCriterion("status_next_name >=", value, "statusNextName");
            return (Criteria) this;
        }

        public Criteria andStatusNextNameLessThan(String value) {
            addCriterion("status_next_name <", value, "statusNextName");
            return (Criteria) this;
        }

        public Criteria andStatusNextNameLessThanOrEqualTo(String value) {
            addCriterion("status_next_name <=", value, "statusNextName");
            return (Criteria) this;
        }

        public Criteria andStatusNextNameLike(String value) {
            addCriterion("status_next_name like", value, "statusNextName");
            return (Criteria) this;
        }

        public Criteria andStatusNextNameNotLike(String value) {
            addCriterion("status_next_name not like", value, "statusNextName");
            return (Criteria) this;
        }

        public Criteria andStatusNextNameIn(List<String> values) {
            addCriterion("status_next_name in", values, "statusNextName");
            return (Criteria) this;
        }

        public Criteria andStatusNextNameNotIn(List<String> values) {
            addCriterion("status_next_name not in", values, "statusNextName");
            return (Criteria) this;
        }

        public Criteria andStatusNextNameBetween(String value1, String value2) {
            addCriterion("status_next_name between", value1, value2, "statusNextName");
            return (Criteria) this;
        }

        public Criteria andStatusNextNameNotBetween(String value1, String value2) {
            addCriterion("status_next_name not between", value1, value2, "statusNextName");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNameIsNull() {
            addCriterion("status_type_name is null");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNameIsNotNull() {
            addCriterion("status_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNameEqualTo(String value) {
            addCriterion("status_type_name =", value, "statusTypeName");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNameNotEqualTo(String value) {
            addCriterion("status_type_name <>", value, "statusTypeName");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNameGreaterThan(String value) {
            addCriterion("status_type_name >", value, "statusTypeName");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("status_type_name >=", value, "statusTypeName");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNameLessThan(String value) {
            addCriterion("status_type_name <", value, "statusTypeName");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNameLessThanOrEqualTo(String value) {
            addCriterion("status_type_name <=", value, "statusTypeName");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNameLike(String value) {
            addCriterion("status_type_name like", value, "statusTypeName");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNameNotLike(String value) {
            addCriterion("status_type_name not like", value, "statusTypeName");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNameIn(List<String> values) {
            addCriterion("status_type_name in", values, "statusTypeName");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNameNotIn(List<String> values) {
            addCriterion("status_type_name not in", values, "statusTypeName");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNameBetween(String value1, String value2) {
            addCriterion("status_type_name between", value1, value2, "statusTypeName");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNameNotBetween(String value1, String value2) {
            addCriterion("status_type_name not between", value1, value2, "statusTypeName");
            return (Criteria) this;
        }

        public Criteria andStatusTypeIsNull() {
            addCriterion("status_type is null");
            return (Criteria) this;
        }

        public Criteria andStatusTypeIsNotNull() {
            addCriterion("status_type is not null");
            return (Criteria) this;
        }

        public Criteria andStatusTypeEqualTo(String value) {
            addCriterion("status_type =", value, "statusType");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNotEqualTo(String value) {
            addCriterion("status_type <>", value, "statusType");
            return (Criteria) this;
        }

        public Criteria andStatusTypeGreaterThan(String value) {
            addCriterion("status_type >", value, "statusType");
            return (Criteria) this;
        }

        public Criteria andStatusTypeGreaterThanOrEqualTo(String value) {
            addCriterion("status_type >=", value, "statusType");
            return (Criteria) this;
        }

        public Criteria andStatusTypeLessThan(String value) {
            addCriterion("status_type <", value, "statusType");
            return (Criteria) this;
        }

        public Criteria andStatusTypeLessThanOrEqualTo(String value) {
            addCriterion("status_type <=", value, "statusType");
            return (Criteria) this;
        }

        public Criteria andStatusTypeLike(String value) {
            addCriterion("status_type like", value, "statusType");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNotLike(String value) {
            addCriterion("status_type not like", value, "statusType");
            return (Criteria) this;
        }

        public Criteria andStatusTypeIn(List<String> values) {
            addCriterion("status_type in", values, "statusType");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNotIn(List<String> values) {
            addCriterion("status_type not in", values, "statusType");
            return (Criteria) this;
        }

        public Criteria andStatusTypeBetween(String value1, String value2) {
            addCriterion("status_type between", value1, value2, "statusType");
            return (Criteria) this;
        }

        public Criteria andStatusTypeNotBetween(String value1, String value2) {
            addCriterion("status_type not between", value1, value2, "statusType");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jbb_work_flow
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table jbb_work_flow
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

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

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}