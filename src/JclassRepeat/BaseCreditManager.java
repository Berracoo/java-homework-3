package JclassRepeat;

public  abstract class BaseCreditManager implements ICreditManager{
    @Override
    public abstract void calculate();  // bu değişken olan o yüzden sadece imza olarak bıraktık.

    public  void save() { // ortak operasyonları tutar tamamlanmış ve tamamlanmamış olanları farklı olarak tutar
            System.out.println("Kaydedildi.");
        }



}
