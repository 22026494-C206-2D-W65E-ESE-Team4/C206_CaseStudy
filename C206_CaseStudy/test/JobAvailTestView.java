import org.junit.Before;
import org.junit.Test;

import GA_package.JobOpportunityManager;
import GA_package.JobOpportunity;
import GA_package.AdminPage;

import java.util.List;

import static org.junit.Assert.*;

public class JobAvailTestView {

    private JobOpportunityManager jobOpportunityManager;
    private AdminPage adminPage;

    @Before
    public void setUp() {
        jobOpportunityManager = new JobOpportunityManager();
        adminPage = new AdminPage(jobOpportunityManager);
    }

    @Test
    public void testViewJobOpportunities_NormalCondition() {
        // Normal condition: View job opportunities
        adminPage.addJobOpportunity("Software Engineer", "Company A");
        adminPage.addJobOpportunity("Data Analyst", "Company B");

        List<JobOpportunity> jobOpportunities = adminPage.viewJobOpportunities();

        assertEquals(2, jobOpportunities.size());
    }

    @Test
    public void testViewJobOpportunities_NoJobOpportunities() {
        // Boundary condition: View when there are no job opportunities
        List<JobOpportunity> jobOpportunities = adminPage.viewJobOpportunities();

        assertEquals(0, jobOpportunities.size());
    }

    @Test
    public void testViewJobOpportunities_AfterFulfillment() {
        // Error condition: View job opportunities after some are fulfilled
        adminPage.addJobOpportunity("Software Engineer", "Company A");
        adminPage.addJobOpportunity("Data Analyst", "Company B");
        adminPage.markJobOpportunityAsFulfilled("Software Engineer", "Company A");

        List<JobOpportunity> jobOpportunities = adminPage.viewJobOpportunities();

        assertEquals(2, jobOpportunities.size());
        assertFalse(jobOpportunities.get(0).isFulfilled());
       
    }
}

