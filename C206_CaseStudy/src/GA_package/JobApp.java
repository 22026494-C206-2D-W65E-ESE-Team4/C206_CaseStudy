package GA_package;
import java.util.ArrayList;
import java.util.List;

public class JobApp {
	    private String name;
	    private String email;
	    private List<Job> appliedJobs;

	    public Student(String name, String email) {
	        this.name = name;
	        this.email = email;
	        this.appliedJobs = new ArrayList<>();
	    }

	    public void viewAllJobs(List<Job> jobs) {
	        System.out.println("Available Jobs:");
	        for (int i = 0; i < jobs.size(); i++) {
	            System.out.println((i + 1) + ". " + jobs.get(i));
	        }
	    }

	    public boolean applyForJob(Job job) {
	        if (!appliedJobs.contains(job)) {
	            appliedJobs.add(job);
	            return true;
	        }
	        return false;
	    }

	    public List<Job> getAppliedJobs() {
	        return appliedJobs;
	    }

	    // Other getters and setters

	    @Override
	    public String toString() {
	        return name + " (" + email + ")";
	    }
	}

	class Job {
	    private String title;
	    private String description;

	    public Job(String title, String description) {
	        this.title = title;
	        this.description = description;
	    }

	    @Override
	    public String toString() {
	        return title + ": " + description;
	    }

}
