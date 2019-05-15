package info.kingpes.fragment2fragment.sample1;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import info.kingpes.fragment2fragment.R;
import info.kingpes.fragment2fragment.sample2.MyAddress;
import info.kingpes.fragment2fragment.sample2.MyModel;

public class MainActivity extends AppCompatActivity {
    private MutableLiveData<MyModel> myModel = new MutableLiveData<>();
    private MutableLiveData<MyAddress> myAddress = new MutableLiveData<>();

    private int count = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        final TextView text1 = findViewById(R.id.text1);
        final TextView text2 = findViewById(R.id.text2);

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                myModel.setValue(new MyModel("MyModel" + count, 1));
            }
        });


        myModel.observe(this, new Observer<MyModel>() {
            @Override
            public void onChanged(@Nullable MyModel myModel) {
                text1.setText(myModel.getName());
            }
        });


        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                myAddress.setValue(new MyAddress("MyAddress" + count, 1));
            }
        });

        myAddress.observe(this, new Observer<MyAddress>() {
            @Override
            public void onChanged(@Nullable MyAddress myAddress) {
                text2.setText(myAddress.getAddr());
            }
        });

    }
}
