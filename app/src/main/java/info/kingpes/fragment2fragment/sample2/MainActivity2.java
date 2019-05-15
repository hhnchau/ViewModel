package info.kingpes.fragment2fragment.sample2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import info.kingpes.fragment2fragment.R;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment frg1 = new Fragment21();
        Fragment frg2 = new Fragment22();
        Fragment frg3 = new Fragment23();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame1, frg1)
                .add(R.id.frame2, frg2)
                .add(R.id.frame3, frg3)
                .commit();

    }
}