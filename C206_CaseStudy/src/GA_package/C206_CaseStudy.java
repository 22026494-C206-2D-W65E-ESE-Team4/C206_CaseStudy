
package GA_package;
import java.util.ArrayList;

public class C206_CaseStudy {
    
    private static ArrayList<User> userList = new ArrayList<User>();
    private static ArrayList<Job> jobList = new ArrayList<Job>();
    private static ArrayList<Resume> resumeList = new ArrayList<Resume>();
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
    }
    
    public static void registerForAccount() {
        
        String email = Helper.readString("Email: ");
        String name = Helper.readString("Name: ");
        String password = Helper.readString("Password: ");
        
        boolean isEmailInUse = false;
        
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                isEmailInUse = true;
                break;
            }
        }
        
        if (!isEmailInUse) {
            userList.add(new User(email, name, password));
        } else {
            System.out.println("Email is already in use.");
        }
        
    }
    
    public static String manageProfile() {
        
        String email = Helper.readString("Email: ");
        String password = Helper.readString("Password: ");
        
        String output = "";
        
        for (User user : userList) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                output += "User Profile\n";
                Helper.line(60, "-");
                output += String.format("%-10s %-10s %-10s\n", user.getEmail(), user.getName(), user.getPassword());
            }
        }
        
        return output;
    }
    
    public static void searchForAvailableJobs() {
        
        String search = Helper.readString("Search For Available Jobs: ");
        
        boolean isJobFound = false;
        
        for (Job job : jobList) {
            if (job.getTitle().equalsIgnoreCase(search)) {
                job.display();
                isJobFound = true;
            }
        }
        
        if (!isJobFound) {
            System.out.println("Unable To Find Job Title: " + search);
        }
        
    }
    
    public static void manageResume() {
        // TODO: Implement resume management logic
    }
    
    public static void createResume() {
        // TODO: Implement resume creation logic
    }
}
