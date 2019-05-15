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

public class Fragment23 extends Fragment {
    private EditText editText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, container, false);

        editText = view.findViewById(R.id.edt);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ShareModel shareModel = ViewModelProviders.of(getActivity()).get(ShareModel.class);
        shareModel.getMyAddress().observe(this, new Observer<MyAddress>() {
            @Override
            public void onChanged(@Nullable MyAddress myAddress) {
                editText.setText(myAddress.getAddr());
            }
        });
    }

}

