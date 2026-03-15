package coe528project;

class SilverState implements CustomerState {
    @Override
    public void handle(Customer c) {
        if (c.getPoints() >= 1000) {
            c.setState(new GoldState());
            System.out.println("Upgraded to Gold State!");
        }
    }
}