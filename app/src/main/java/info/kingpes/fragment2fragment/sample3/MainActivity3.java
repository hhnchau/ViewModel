package info.kingpes.fragment2fragment.sample3;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import info.kingpes.fragment2fragment.R;
import info.kingpes.fragment2fragment.sample2.MyAddress;
import info.kingpes.fragment2fragment.sample2.MyModel;
import info.kingpes.fragment2fragment.sample2.ShareModel;

public class MainActivity3 extends AppCompatActivity {

    private ShareModel shareModel;

    private int count;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        shareModel = ViewModelProviders.of(this).get(ShareModel.class);

        final TextView text1 = findViewById(R.id.text1);
        final TextView text2 = findViewById(R.id.text2);

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                shareModel.setMyModel(new MyModel("MyModel" + count, 1));
            }
        });


        shareModel.getMyModel().observe(this, new Observer<MyModel>() {
            @Override
            public void onChanged(@Nullable MyModel myModel) {
                text1.setText(myModel.getName());
            }
        });


        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                shareModel.setMyAddress(new MyAddress("MyAddress" + count, 1));
            }
        });

        shareModel.getMyAddress().observe(this, new Observer<MyAddress>() {
            @Override
            public void onChanged(@Nullable MyAddress myAddress) {
                text2.setText(myAddress.getAddr());
            }
        });

    }
}
