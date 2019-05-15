package info.kingpes.fragment2fragment.sample2;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

public class ShareModel extends AndroidViewModel {
    public ShareModel(@NonNull Application application) {
        super(application);
    }

    private MutableLiveData<MyModel> myModel = new MutableLiveData<>();

    private MutableLiveData<MyAddress> myAddress = new MutableLiveData<>();

    public MutableLiveData<MyModel> getMyModel() {
        return this.myModel;
    }

    public void setMyModel(MyModel myModel) {
        this.myModel.setValue(myModel);
    }

    public MutableLiveData<MyAddress> getMyAddress() {
        return this.myAddress;
    }

    public void setMyAddress(MyAddress myAddress) {
        this.myAddress.setValue(myAddress);
    }
}
