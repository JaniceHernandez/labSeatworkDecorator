class CaramelSyrup implements Coffee {
    private Coffee wrappedCoffee;

    public CaramelSyrup(Coffee coffee) {
        this.wrappedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Caramel Syrup";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + 40.00;
    }
}