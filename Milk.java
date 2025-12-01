class Milk implements Coffee {
    private Coffee wrappedCoffee;

    public Milk(Coffee coffee) {
        this.wrappedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + 25.00;
    }
}