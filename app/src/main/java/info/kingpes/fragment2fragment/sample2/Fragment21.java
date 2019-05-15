package info.kingpes.fragment2fragment.sample2;

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

public class Fragment21 extends Fragment{
    private int i = 0;
    ShareModel shareModel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        shareModel = ViewModelProviders.of(getActivity()).get(ShareModel.class);
        EditText editText = view.findViewById(R.id.edt);
        view.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                shareModel.setMyModel(new MyModel("Chau" + i, 12));
            }
        });


        return view;
    }
}
