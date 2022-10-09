/*
*  ID   : 21CE027
 * Name : Fachara Raj
 * Aim  : Personal Loan Eligibility Criteria for Salaried Applicant is as follows:
 *        Eligible Age Group - 21 years to 60 years
 *        Minimum Net Monthly Income - Rs. 15,000
 *        Minimum Total Work Experience - 1 year
 *        Citizenship – Indian
 *        Create a class AccountHolder to store above given information entered by a user. Create 5
 *        objects of AccountHolder class and store them in an ArrayList. Display names of account
 *        holders , who are eligible to get a loan based on given criteria.
 */
public class Prac3_AccountHolder {
    private String name;
    private int age;
    private int monthlyIncome;
    private int experiance;
    private String citizenship;

    public Prac3_AccountHolder() {
    }

    public Prac3_AccountHolder(String name,int age, int monthlyIncome, int experiance, String citizenship) {
        this.name = name;
        this.age = age;
        this.monthlyIncome = monthlyIncome;
        this.experiance = experiance;
        this.citizenship = citizenship;
    }

    public int getAge() {
        return age;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public String getName() {
        return name;
    }

    public int getExperiance() {
        return experiance;
    }

    public String getCitizenship() {
        return citizenship;
    }
    
}