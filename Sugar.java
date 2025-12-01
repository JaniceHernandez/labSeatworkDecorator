public class Sugar implements Coffee {
    private Coffee wrappedCoffee;

    public Sugar(Coffee coffee) {
        this.wrappedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + 15.00;
    }
}

