// ExchangeRate.java (데이터 모델 예시)
public class ExchangeRate {
    private String currency;
    private double rate;

    public ExchangeRate(String currency, double rate) {
        this.currency = currency;
        this.rate = rate;
    }

    public String getCurrency() { return currency; }
    public double getRate() { return rate; }
}