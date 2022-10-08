package JclassRepeat;

public class Main {
    public static void main(String[] args){
//        CreditManager creditManager = new CreditManager();
//        creditManager.calculate();
//        creditManager.calculate();
//        creditManager.save();
//
//        Customer customer = new Customer(); // instance creation
//        customer.setId(1);
//
//        customer.setCity("Ankara");
//
//        CustomerManager customerManager = new CustomerManager(customer); // parametresini girmeliyiz
//        customerManager.save();
//        customerManager.delete();
//
//        Company company = new Company();
//        company.setTaxNumber("100000");
//        company.setCompanyName("Arçelik");
//        company.setId(100);
//
//        CustomerManager customerManager2 = new CustomerManager(new Company());
//
//        Person person = new Person();
//        person.setNationalIdentity("");
//
//        Customer c1 = new Customer();
//        Customer c2 = new Person();
//        Customer c3 = new Company();

       CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
       customerManager.giveCredit();
 // interface iş yapan sınıfların methodlarını sadce imza seviyesinde yazarak yazılımda bağımlılığı engellemek adına yapılan çalışmadır.
 // interface bir sınıfların ortak methodların imzasını barındırır
    }
}
