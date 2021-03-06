package com.jbb.user.biz.entity;

public class IntentionStatus {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jbb_intention_status.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jbb_intention_status.intention_status_id
     *
     * @mbggenerated
     */
    private String intentionStatusId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jbb_intention_status.intention_status_name
     *
     * @mbggenerated
     */
    private String intentionStatusName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jbb_intention_status.intention_status_notes
     *
     * @mbggenerated
     */
    private String intentionStatusNotes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jbb_intention_status.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbb_intention_status.id
     *
     * @return the value of jbb_intention_status.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbb_intention_status.id
     *
     * @param id the value for jbb_intention_status.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbb_intention_status.intention_status_id
     *
     * @return the value of jbb_intention_status.intention_status_id
     *
     * @mbggenerated
     */
    public String getIntentionStatusId() {
        return intentionStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbb_intention_status.intention_status_id
     *
     * @param intentionStatusId the value for jbb_intention_status.intention_status_id
     *
     * @mbggenerated
     */
    public void setIntentionStatusId(String intentionStatusId) {
        this.intentionStatusId = intentionStatusId == null ? null : intentionStatusId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbb_intention_status.intention_status_name
     *
     * @return the value of jbb_intention_status.intention_status_name
     *
     * @mbggenerated
     */
    public String getIntentionStatusName() {
        return intentionStatusName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbb_intention_status.intention_status_name
     *
     * @param intentionStatusName the value for jbb_intention_status.intention_status_name
     *
     * @mbggenerated
     */
    public void setIntentionStatusName(String intentionStatusName) {
        this.intentionStatusName = intentionStatusName == null ? null : intentionStatusName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbb_intention_status.intention_status_notes
     *
     * @return the value of jbb_intention_status.intention_status_notes
     *
     * @mbggenerated
     */
    public String getIntentionStatusNotes() {
        return intentionStatusNotes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbb_intention_status.intention_status_notes
     *
     * @param intentionStatusNotes the value for jbb_intention_status.intention_status_notes
     *
     * @mbggenerated
     */
    public void setIntentionStatusNotes(String intentionStatusNotes) {
        this.intentionStatusNotes = intentionStatusNotes == null ? null : intentionStatusNotes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbb_intention_status.remark
     *
     * @return the value of jbb_intention_status.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbb_intention_status.remark
     *
     * @param remark the value for jbb_intention_status.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}