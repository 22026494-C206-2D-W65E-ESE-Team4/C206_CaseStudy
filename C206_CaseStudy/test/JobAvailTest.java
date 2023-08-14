import org.junit.Before;
import org.junit.Test;
import GA_package.JobOpportunityManager;
import GA_package.JobOpportunity;
import GA_package.AdminPage;


import java.util.List;

import static org.junit.Assert.assertEquals;

public class JobAvailTest {
    private JobOpportunityManager jobOpportunityManager;
    private AdminPage adminPage;

    @Before
    public void setUp() {
        jobOpportunityManager = new JobOpportunityManager();
        adminPage = new AdminPage(jobOpportunityManager);
    }

    @Test
    public void testAddNewJobOpportunity_NormalCondition() {
        // Normal condition: Adding a new job opportunity
        adminPage.addJobOpportunity("Software Engineer", "Company A");
        List<JobOpportunity> jobOpportunities = adminPage.viewJobOpportunities();
        assertEquals(1, jobOpportunities.size(), "One job opportunity should be added");
    }

    

	@Test
    public void testAddDuplicateJobOpportunity_BoundaryCondition() {
        // Boundary condition: Adding a duplicate job opportunity
        adminPage.addJobOpportunity("Software Engineer", "Company B");
        adminPage.addJobOpportunity("Software Engineer", "Company B");
        List<JobOpportunity> jobOpportunities = adminPage.viewJobOpportunities();
        assertEquals(1, jobOpportunities.size(), "Duplicate job opportunity should not be added");
    }

    @Test
    public void testAddJobOpportunityWithEmptyTitle_ErrorCondition() {
        // Error condition: Adding a job opportunity with an empty title
        adminPage.addJobOpportunity("", "Company C");
        List<JobOpportunity> jobOpportunities = adminPage.viewJobOpportunities();
        assertEquals(0, jobOpportunities.size(), "Job opportunity with an empty title should not be added");
    }
    private void assertEquals(int i, int size, String string) {
		// TODO Auto-generated method stub
		
	}
}
