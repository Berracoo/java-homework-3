package JclassRepeat;

public class CustomerManager {
    private Customer _customer; // beni çalıştırabilmek için bana bir müşteri ver diyorum.
    private ICreditManager _creditManager;
    public CustomerManager(Customer customer,ICreditManager creditManager){ // bu olay aslında polimorpizim yani çok biçimlilik oraya ICreditMAnager diyorsun ama istediğin biçimi kullanıyorsun farklı biçimlerde davranış
        // bu bir constructor başında void felan olmadan yazılıyo
      // her kim interface i implemente ediyorsa edenlerin referansını tutabilir
        _customer = customer; // parametrede belirttiğimiz customer a ulaşabilmek için bunu yaptık
        _creditManager = creditManager;
    }
    public void save() { // biz burada bir müşteri nesnesini parametre olarak gönderiyoruz.
        System.out.println("Müşteri kaydedildi : ");
    }
    public void delete() {
        System.out.println("Müşteri silindi : ");
    }

    public void giveCredit(){
        _creditManager.calculate();
        System.out.println("Kredi verildi.");

    }
    // interface i implemente ederek hepsinin aynı method imzasına bağlı kalmasını ve kendi işlerine göre ayrılmalarını sağladık.
    // class kulanamayız çünkü birden fazla inherite etmemiz gerekir ama öyle bir kullanım yok ve özelliklerini kullanma zorunluluğu da yok.
}
