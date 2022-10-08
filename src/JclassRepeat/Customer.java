package JclassRepeat;

public class Customer {

    public Customer(){
        System.out.println("müşteri nesnesi başlatıldı."); // heap kısmında nesne oltuşu zaman çalışacak
    }
    private int id;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
