package com.example.alcides.exemplolayouts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LinearLayout_horizontal(View view) {
        setContentView(R.layout.linearlayout_h);
    }

    public void LinearLayout_vertical(View view) {
        setContentView(R.layout.linearlayout_v);
    }

    public void FrameLayout(View view) {
        setContentView(R.layout.framelayout);
    }

    public void GridLayout(View view) {
        setContentView(R.layout.gridlayout);
    }

    public void TableLayout(View view) {
        setContentView(R.layout.tablelayout);
    }

    public void RelativeLayout(View view) {
        setContentView(R.layout.relativelayout);
    }

    public void ScrollView(View view) {
        setContentView(R.layout.scrollview);
    }

    public void Voltar(View view) {
        setContentView(R.layout.activity_main);
    }

}
