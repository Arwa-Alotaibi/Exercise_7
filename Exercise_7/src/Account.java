public class Account {

    private String id ;

    private String name ;

    private int balance ;

    public Account(){

    }
    //Constructor
    public Account(String id , String name){
        this.id =id ;
        this.name = name;
    }
    public Account(String id , String name , int balance){
        this.id =id ;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int credit(int amount){
       if(amount > balance || amount< 0){
           System.out.println("Insufficient");
       }
       else{
           this.balance-=amount;
           System.out.println("has been withdrawn successfully "+amount+"and the balance is:$"+getBalance());
       }
        return balance;
    }
    public  int debit(int amount){
        this.balance+=amount;
        System.out.println("Your deposit is:$"+amount + "and balance is:$"+getBalance());
        return balance;
    }
    public int transferto( Account bank ,int amount){
        if(amount > balance){
            System.out.println("Insufficient");
        }
        else {
            this.balance-=amount;
            bank.balance+=amount;
            System.out.println("your transfer successfully");
        }
        return bank.balance;
    }


    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}