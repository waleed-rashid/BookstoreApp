package coe528project;

class GoldState implements CustomerState {
    @Override
    public void handle(Customer c) {
        if (c.getPoints() < 1000) {
            c.setState(new SilverState());
            System.out.println("Downgraded to Silver State!");
        }
    }
}