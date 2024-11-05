// MainViewModel.java (ViewModel 예시)
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<ExchangeRate> exchangeRate = new MutableLiveData<>();

    public MutableLiveData<ExchangeRate> getExchangeRate() {
        return exchangeRate;
    }

    public void loadExchangeRate() {
        // 여기에 API 호출 로직 추가 가능 (Retrofit 사용)
    }
}