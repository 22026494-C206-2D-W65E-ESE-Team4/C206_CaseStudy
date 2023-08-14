import org.junit.Before;
import org.junit.Test;

import GA_package.AdminPage;
import GA_package.JobOpportunity;
import GA_package.JobOpportunityManager;

import java.util.List;

import static org.junit.Assert.*;

public class JobAvailTestDelete {

    private JobOpportunityManager jobOpportunityManager;
    private AdminPage adminPage;

    @Before
    public void setUp() {
        jobOpportunityManager = new JobOpportunityManager();
        adminPage = new AdminPage(jobOpportunityManager);
    }

    @Test
    public void testDeleteFulfilledJobOpportunities_NormalCondition() {
        // Normal condition: Delete fulfilled job opportunities
        adminPage.addJobOpportunity("Software Engineer", "Company A");
        adminPage.addJobOpportunity("Data Analyst", "Company B");
        adminPage.markJobOpportunityAsFulfilled("Software Engineer", "Company A");
        adminPage.deleteFulfilledJobOpportunities();
        List<JobOpportunity> jobOpportunities = adminPage.viewJobOpportunities();
        assertEquals(2, jobOpportunities.size());
    }

    @Test
    public void testDeleteFulfilledJobOpportunities_NoFulfilledJobs() {
        // Boundary condition: Delete when there are no fulfilled job opportunities
        adminPage.addJobOpportunity("Software Engineer", "Company A");
        adminPage.addJobOpportunity("Data Analyst", "Company B");
        adminPage.deleteFulfilledJobOpportunities();
        List<JobOpportunity> jobOpportunities = adminPage.viewJobOpportunities();
        assertEquals(2, jobOpportunities.size());
    }

    @Test
    public void testDeleteFulfilledJobOpportunities_InvalidJob() {
        // Error condition: Delete a job that doesn't exist
        adminPage.addJobOpportunity("Software Engineer", "Company A");
        adminPage.addJobOpportunity("Data Analyst", "Company B");
        adminPage.markJobOpportunityAsFulfilled("Software Developer", "Company A");
        adminPage.deleteFulfilledJobOpportunities();
        List<JobOpportunity> jobOpportunities = adminPage.viewJobOpportunities();
        assertEquals(2, jobOpportunities.size());
    }
}
