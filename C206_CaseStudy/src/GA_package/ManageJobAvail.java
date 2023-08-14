package GA_package;

import java.util.Scanner;
import java.util.List;

public class ManageJobAvail {

    public static void main(String[] args) {
        JobOpportunityManager jobOpportunityManager = new JobOpportunityManager();
        AdminPage adminPage = new AdminPage(jobOpportunityManager);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Job Opportunity Application");
            System.out.println("1. Add Job Opportunity");
            System.out.println("2. View Job Opportunities");
            System.out.println("3. Delete Fulfilled Job Opportunities");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter job title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter company: ");
                    String company = scanner.nextLine();
                    adminPage.addJobOpportunity(title, company);
                    System.out.println("Job opportunity added.");
                    break;
                case 2:
                    List<JobOpportunity> jobOpportunities = adminPage.viewJobOpportunities();
                    System.out.println("Current Job Opportunities:");
                    for (JobOpportunity job : jobOpportunities) {
                        System.out.println("Title: " + job.getTitle() + ", Company: " + job.getCompany());
                    }
                    break;
                case 3:
                    adminPage.deleteFulfilledJobOpportunities();
                    System.out.println("Fulfilled job opportunities deleted.");
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
