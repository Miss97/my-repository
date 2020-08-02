package com.emental.dao.entity;

import java.io.Serializable;

public class EmDailyRecord implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EM_DAILY_RECORD.DATA_ID
     *
     * @mbg.generated
     */
    private String dataId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EM_DAILY_RECORD.USERNAME
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EM_DAILY_RECORD.WEIGHT_RECORD
     *
     * @mbg.generated
     */
    private String weightRecord;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EM_DAILY_RECORD.EXERCISE_RECORD
     *
     * @mbg.generated
     */
    private String exerciseRecord;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EM_DAILY_RECORD.SLEEP_RECORD
     *
     * @mbg.generated
     */
    private String sleepRecord;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EM_DAILY_RECORD.CREATE_DATE
     *
     * @mbg.generated
     */
    private String createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table EM_DAILY_RECORD
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EM_DAILY_RECORD.DATA_ID
     *
     * @return the value of EM_DAILY_RECORD.DATA_ID
     *
     * @mbg.generated
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EM_DAILY_RECORD.DATA_ID
     *
     * @param dataId the value for EM_DAILY_RECORD.DATA_ID
     *
     * @mbg.generated
     */
    public void setDataId(String dataId) {
        this.dataId = dataId == null ? null : dataId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EM_DAILY_RECORD.USERNAME
     *
     * @return the value of EM_DAILY_RECORD.USERNAME
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EM_DAILY_RECORD.USERNAME
     *
     * @param username the value for EM_DAILY_RECORD.USERNAME
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EM_DAILY_RECORD.WEIGHT_RECORD
     *
     * @return the value of EM_DAILY_RECORD.WEIGHT_RECORD
     *
     * @mbg.generated
     */
    public String getWeightRecord() {
        return weightRecord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EM_DAILY_RECORD.WEIGHT_RECORD
     *
     * @param weightRecord the value for EM_DAILY_RECORD.WEIGHT_RECORD
     *
     * @mbg.generated
     */
    public void setWeightRecord(String weightRecord) {
        this.weightRecord = weightRecord == null ? null : weightRecord.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EM_DAILY_RECORD.EXERCISE_RECORD
     *
     * @return the value of EM_DAILY_RECORD.EXERCISE_RECORD
     *
     * @mbg.generated
     */
    public String getExerciseRecord() {
        return exerciseRecord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EM_DAILY_RECORD.EXERCISE_RECORD
     *
     * @param exerciseRecord the value for EM_DAILY_RECORD.EXERCISE_RECORD
     *
     * @mbg.generated
     */
    public void setExerciseRecord(String exerciseRecord) {
        this.exerciseRecord = exerciseRecord == null ? null : exerciseRecord.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EM_DAILY_RECORD.SLEEP_RECORD
     *
     * @return the value of EM_DAILY_RECORD.SLEEP_RECORD
     *
     * @mbg.generated
     */
    public String getSleepRecord() {
        return sleepRecord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EM_DAILY_RECORD.SLEEP_RECORD
     *
     * @param sleepRecord the value for EM_DAILY_RECORD.SLEEP_RECORD
     *
     * @mbg.generated
     */
    public void setSleepRecord(String sleepRecord) {
        this.sleepRecord = sleepRecord == null ? null : sleepRecord.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EM_DAILY_RECORD.CREATE_DATE
     *
     * @return the value of EM_DAILY_RECORD.CREATE_DATE
     *
     * @mbg.generated
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EM_DAILY_RECORD.CREATE_DATE
     *
     * @param createDate the value for EM_DAILY_RECORD.CREATE_DATE
     *
     * @mbg.generated
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EM_DAILY_RECORD
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dataId=").append(dataId);
        sb.append(", username=").append(username);
        sb.append(", weightRecord=").append(weightRecord);
        sb.append(", exerciseRecord=").append(exerciseRecord);
        sb.append(", sleepRecord=").append(sleepRecord);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}