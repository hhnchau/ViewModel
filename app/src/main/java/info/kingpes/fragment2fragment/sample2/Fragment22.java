package info.kingpes.fragment2fragment.sample2;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import info.kingpes.fragment2fragment.R;

public class Fragment22 extends Fragment {
    private ShareModel shareModel;
    private EditText editText;
    private int i = 0;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);

        editText = view.findViewById(R.id.edt);


        view.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                shareModel.setMyAddress(new MyAddress("Ho Chi Minh" + i, 12));
            }
        });

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        shareModel = ViewModelProviders.of(getActivity()).get(ShareModel.class);
        shareModel.getMyModel().observe(this, new Observer<MyModel>() {
            @Override
            public void onChanged(@Nullable MyModel myModel) {
                editText.setText(myModel.getName());
            }
        });
    }

}
