//package com.GrowUp.GrowUp.repo;
//
//import com.GrowUp.GrowUp.model.JobData;
//import org.springframework.stereotype.Component;
//
//import javax.swing.text.html.HTMLDocument;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Iterator;
//
//@Component
//public class tempDB {
//    // these was an temperory DB which is used to store data in the list of Objects
//    ArrayList<JobData> jobDB = new ArrayList<JobData>(Arrays.asList(  new JobData(5,"javaBackend", new int[]{11, 23, 4, 5, 6}, "I am a Flutter Developer", true),
//            new JobData( 1,"javaBackend", new int[]{11, 23, 4, 5, 6}, "I am a Flutter Developer", true),
//            new JobData(2,"javaBackend", new int[]{11, 23, 4, 5, 6}, "I am a Flutter Developer", true),
//            new JobData(3,"javaBackend", new int[]{11, 23, 4, 5, 6}, "I am a Flutter Developer", true),
//            new JobData(4,"javaBackend", new int[]{11, 23, 4, 5, 6}, "I am a Flutter Developer", true)));
//    public void addJobs(JobData jb){
//        jobDB.add(jb);
//    }
//    public ArrayList<JobData> allJobs(){
//        return jobDB;
//    }
//    public ArrayList<JobData> updateJob(JobData job1){
//        for(JobData j1 : jobDB ){
//            if(j1.getJobId() == job1.getJobId() ){
//                j1.setJobName(job1.getJobName());
//                j1.setJobprofile(job1.getJobprofile());
//                j1.setValues(job1.getValues());
//                j1.setWorkexp(job1.getWorkexp());
//            }
//        }
//        return jobDB;
//    }
//    public String removeJob(int job1 ){
//        Iterator<JobData> iterator = jobDB.iterator();
//        while(iterator.hasNext()){
//            JobData jb = iterator.next();
//            if(jb.getJobId() == job1){
//                iterator.remove();
//                return "The particular job was deleted";
//            }
//        }
//       return "the job was not found";
//    }
//
//}
