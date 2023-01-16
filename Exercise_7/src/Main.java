public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Account a1 = new Account();
        Account a2 = new Account();
        a1.setId("11");
        a1.setName("arwa");
        a1.setBalance(200);
        a1.credit(500);
        a1.debit(30);
        System.out.println("a2");
        a2.setId("22");
        a2.setName("eman");
        a2.setBalance(500);
        a2.credit(300);
        a2.debit(30);
        System.out.println("---");
       System.out.println(a1.transferto(a2,22));
        System.out.println("---");

        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());

        System.out.println(a1.toString());
        System.out.println(a2.toString());


        System.out.println("--Employee--");

       Employee e1 = new Employee();
       Employee e2 = new Employee();
       e1.setId("22");
       e1.setName("e1");
       e1.setSalary(200);

       System.out.println(e1.getAnnualSalary());

       System.out.println(e1.raisedSalary(0.2));
       System.out.println(e1.toString());


    }




}