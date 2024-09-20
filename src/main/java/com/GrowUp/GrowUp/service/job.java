package com.GrowUp.GrowUp.service;

import com.GrowUp.GrowUp.model.JobData;
import com.GrowUp.GrowUp.repo.reposervice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class job {
    @Autowired
   private reposervice Db;
    public void addJob(JobData job){
        Db.addJob(job);
    }
    public List<JobData> alljob(){
       return  Db.allJobs();

    }
    public  String deleteJob(int jobId){
       return Db.deleteJob(jobId);
    }
    public String updateJob (JobData j1){
        return Db.updateJob(j1);
    }
}
