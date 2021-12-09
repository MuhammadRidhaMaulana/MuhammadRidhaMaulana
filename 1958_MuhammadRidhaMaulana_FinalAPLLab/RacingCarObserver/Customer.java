public class Customer implements Observer {

    private Observable observable;
    private String username;

    public Customer(Observable observable, String username){
        this.observable = observable;
        this.username = username;
    }

    @Override
    public void update() {
        System.out.println("New Racing Car available.");
        buyDress();
    }


    private void buyDress(){
        System.out.println(username +" getting new Racing Car.");
    }

    public void unsubscribe(){
        observable.removeObserver(this);
    }
}