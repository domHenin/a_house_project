package io.migenjutsu.project;

public class YearlyIncome extends Tenant {

    public final int YEAR=12;

    double income;

//CONSTRUCTOR:
    public YearlyIncome(String name, double income) {
        super(name);
        this.income = income;
    }

//SETTER:
    public void setIncome(double income) { this.income = income; }

//GETTER:
    public double getIncome() { return income; }


    public double makeThreeTimeMore() {
        double newIncome = getIncome();

        double calcu = getIncome() * 3;

        return calcu;
    }

//toString:
    @Override
    public String toString() {
        return "Tenants Yearly Income: "
                +income+
                "\n3x's Rent Total: "+makeThreeTimeMore();
    }
}


//TODO:
//If the monthly rent of an apartment is $2,000,
// then 3 times the monthly rent is $2000 x 3 = $6000
// (monthly income required to keep housing payments less than 1/3 of income)
// $6000 x 12 months = $72,000
// (annual income required to keep housing payments under 1/3 of income)
//https://charlesgaterealty.com/2013/02/13/how-much-can-i-afford-in-rent-each-month/