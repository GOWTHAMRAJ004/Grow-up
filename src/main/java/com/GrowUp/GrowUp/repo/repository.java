package com.GrowUp.GrowUp.repo;

import com.GrowUp.GrowUp.model.JobData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface repository extends JpaRepository<JobData,Integer> {

    //List<JobData> findByjobNameContainingOrjobprofileContaining(String JobName,String jobprofile);
}
