class WhippedCream implements Coffee {
    private Coffee wrappedCoffee;

    public WhippedCream(Coffee coffee) {
        this.wrappedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + 25.00;
    }
}