package entities;

public class Individual extends Taxpayers{
    private Double healthcareExpenses;

    public Individual(){
        super();
    }


    public Individual(String name, Double annualIncome, Double healthcareExpenses) {
        super(name, annualIncome);
        this.healthcareExpenses = healthcareExpenses;
    }

    public Double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(Double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }


    @Override
    public Double tax() {
        return (super.getAnnualIncome()<20000) ? super.getAnnualIncome() * 0.15 - this.healthcareExpenses * 0.50 :
                super.getAnnualIncome()* 0.25 - this.healthcareExpenses * 0.50;
    }
}
