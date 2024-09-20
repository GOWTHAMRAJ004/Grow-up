package com.GrowUp.GrowUp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Entity
public class JobData {
    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }
@Id
    private int jobId;
    private String jobName;

    public JobData(int jobId, String jobName, int[] values, String jobprofile, Boolean workexp) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.values = values;
        this.jobprofile = jobprofile;
        this.workexp = workexp;
    }

    public JobData(){

}


    @Override
    public String toString() {
        return "JobData{" +
                "jobName='" + jobName + '\'' +
                ", values=" + Arrays.toString(values) +
                ", jobprofile='" + jobprofile + '\'' +
                ", workexp=" + workexp +
                '}';
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public String getJobprofile() {
        return jobprofile;
    }

    public void setJobprofile(String jobprofile) {
        this.jobprofile = jobprofile;
    }

    public Boolean getWorkexp() {
        return workexp;
    }

    public void setWorkexp(Boolean workexp) {
        this.workexp = workexp;
    }

    private int [] values;
    private String jobprofile;
    private Boolean workexp;



}
