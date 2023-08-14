package GA_package;
import java.util.List;

public class AdminPage {
    private JobOpportunityManager jobOpportunityManager;

    public AdminPage(JobOpportunityManager jobOpportunityManager) {
        this.jobOpportunityManager = jobOpportunityManager;
    }

    public void addJobOpportunity(String title, String company) {
        JobOpportunity job = new JobOpportunity(title, company);
        jobOpportunityManager.addJobOpportunity(job);
    }

    public void deleteFulfilledJobOpportunities() {
        jobOpportunityManager.deleteFulfilledJobOpportunities();
    }

    public List<JobOpportunity> viewJobOpportunities() {
        return jobOpportunityManager.getJobOpportunities();
    }

	public void markJobOpportunityAsFulfilled(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}

