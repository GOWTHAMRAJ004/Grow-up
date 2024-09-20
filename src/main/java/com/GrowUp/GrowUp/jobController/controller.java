package com.GrowUp.GrowUp.jobController;

import com.GrowUp.GrowUp.model.JobData;
import com.GrowUp.GrowUp.service.job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {
    @Autowired
    private job jobs;
    @GetMapping("Job")
    public List<JobData> getAllJobs(){
        return jobs.alljob();
    }
    @PostMapping("Job")

    public String addJob(@RequestBody JobData job1){
        jobs.addJob(job1);
        return "Added successfully";
    }
    @DeleteMapping("JobD/{jobId}")
    public  String deleteJob(@PathVariable("jobId") int jobId){
       return jobs.deleteJob(jobId);
    }

    @PutMapping("JobUpdate")
    public String updateJobPist (@RequestBody JobData job){
        return jobs.updateJob(job);
    }

//    @GetMapping("Search")
//    public List<JobData> searchJob(@RequestBody JobData job){
//return;
//    }
}
