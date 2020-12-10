package com.json.pojo;


import com.google.gson.annotations.SerializedName;


import java.util.ArrayList;
import java.util.List;

public class Report {
    private final List<ScheduledReport> scheduledReports = new ArrayList<>();
    @SerializedName("error")
    private List<Error> errors;

    @SuppressWarnings("unused")
    public List<ScheduledReport> getScheduledReports() {
        return new ArrayList<>(this.scheduledReports);
    }

    @SuppressWarnings("unused")
    public void setScheduledReports(final List<ScheduledReport> scheduledReports) {
        this.scheduledReports.addAll(scheduledReports);
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(final List<Error> errors) {
        this.errors = errors;
    }

    public static class ScheduledReport{
        private String receiptID;
        private String userID;
        private String reportParameters;
        private String createDate;
        private String scheduleRunDateTime;
        private String incrementType;
        private String incrementFactor;
        private String expiryDate;

        public String getReceiptID() {
            return receiptID;
        }

        public void setReceiptID(final String receiptID) {
            this.receiptID = receiptID;
        }

        public String getUserID() {
            return userID;
        }

        public void setUserID(final String userID) {
            this.userID = userID;
        }

        public String getReportParameters() {
            return reportParameters;
        }

        public void setReportParameters(final String reportParameters) {
            this.reportParameters = reportParameters;
        }

        @SuppressWarnings("unused")
        public String getCreateDate() {
            return createDate;
        }
        @SuppressWarnings("unused")
        public void setCreateDate(final String createDate) {
            this.createDate = createDate;
        }
        @SuppressWarnings("unused")
        public String getScheduleRunDateTime() {
            return scheduleRunDateTime;
        }
        @SuppressWarnings("unused")
        public void setScheduleRunDateTime(final String scheduleRunDateTime) {
            this.scheduleRunDateTime = scheduleRunDateTime;
        }

        public String getIncrementType() {
            return incrementType;
        }

        public void setIncrementType(final String incrementType) {
            this.incrementType = incrementType;
        }

        public String getIncrementFactor() {
            return incrementFactor;
        }

        public void setIncrementFactor(final String incrementFactor) {
            this.incrementFactor = incrementFactor;
        }

        public String getExpiryDate() {
            return expiryDate;
        }

        public void setExpiryDate(final String expiryDate) {
            this.expiryDate = expiryDate;
        }



    }


}

