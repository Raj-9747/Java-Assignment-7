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

import java.util.ArrayList;

public class Prac3_main {
    public static void main(String[] args) {
        ArrayList<Prac3_AccountHolder> accounts = new ArrayList<Prac3_AccountHolder>();

        // adding 5 accounts
        accounts.add(new Prac3_AccountHolder("Abhi",19, 25000, 10, "Indian"));
        accounts.add(new Prac3_AccountHolder("Axay",25, 40000, 30, "Indian"));
        accounts.add(new Prac3_AccountHolder("Ajay",19, 10000, 3, "Indian"));
        accounts.add(new Prac3_AccountHolder("Arjun",66, 50000, 30, "Indian"));
        accounts.add(new Prac3_AccountHolder("Raj",35, 60000, 12, "Indian"));

        for (int i=0;i<accounts.size();i++) {
            Prac3_AccountHolder accountHolder = accounts.get(i);
            if (accountHolder.getAge() >= 21 && accountHolder.getAge() <= 60
                    && accountHolder.getMonthlyIncome() >= 15000 && accountHolder.getExperiance() >= 1
                    && accountHolder.getCitizenship().equals("Indian")) {
                continue;
            } else {
                accounts.remove(accountHolder); // removing other accounts
            }
        }

        System.out.println("Eligible accounts holder's name:");
        for (Prac3_AccountHolder accountHolder : accounts) {
            System.out.println(accountHolder.getName());
        }
    }

}