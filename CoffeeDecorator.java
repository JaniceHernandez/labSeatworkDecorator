abstract class CoffeeDecorator implements Coffee {
    private Coffee wrappedCoffee;

    public void setWrappedCoffee(Coffee coffee) {
        this.wrappedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost();
    }
}