package JclassRepeat;

public class CarCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void calculate() {
        System.out.println("Araba Kredisi Hesaplandı.");
    }
    // DRY
}
