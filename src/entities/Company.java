package entities;

public class Company extends Taxpayers {
    private Integer numberOfEmployees;

    public Company(){};


    public Company(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        return (numberOfEmployees >10) ? super.getAnnualIncome() * 0.14 : super.getAnnualIncome() * 0.16;
    }
}
