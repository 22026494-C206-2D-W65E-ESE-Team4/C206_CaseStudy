package GA_package;
public class JobOpportunity {
    private String title;
    private String company;
    private boolean fulfilled;

    public JobOpportunity(String title, String company) {
        this.title = title;
        this.company = company;
        this.fulfilled = false;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public boolean isFulfilled() {
        return fulfilled;
    }

    public void markFulfilled() {
        fulfilled = true;
    }

	public static void main(Object object) {
		// TODO Auto-generated method stub
		
	}
}

