package GA_package;
import java.util.ArrayList;
import java.util.List;

public class JobOpportunityManager {
    private List<JobOpportunity> jobOpportunities;

    public JobOpportunityManager() {
        jobOpportunities = new ArrayList<>();
    }

    public void addJobOpportunity(JobOpportunity job) {
        jobOpportunities.add(job);
    }

    public void deleteFulfilledJobOpportunities() {
        jobOpportunities.removeIf(JobOpportunity::isFulfilled);
    }

    public List<JobOpportunity> getJobOpportunities() {
        return jobOpportunities;
    }
}


