package com.GrowUp.GrowUp.repo;


import com.GrowUp.GrowUp.model.JobData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class reposervice {
    @Autowired
    private repository repo;
    public String addJob(JobData job){
        repo.save(job);
        return "Successfully";
    }

    public List<JobData> allJobs(){
        return repo.findAll();
    }

    public String updateJob(JobData job){
        repo.save(job);
        return "updated";
    }

    public String deleteJob(int Id){
        repo.deleteById(Id);
        return "Deleted";
    }
}
