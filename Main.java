package second;


public class Main {
    public static void main(String[] args) {
        // write your code here
        PostOffice postoffice = new PostOffice();
        Person assylzhan = new Person("Assylzhan");
        Person ainura = new Person("Ainura");
        Mail m = new Mail("Assylzhan", "Dundee", "hello, my friend");

        postoffice.Attach(assylzhan);
        postoffice.Attach(ainura);

        postoffice.addMail(m);
    }
}


