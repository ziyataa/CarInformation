package com.ziyata.carinformation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.btnCompetible)
    Button btnCompetible;
    @BindView(R.id.btnCoupe)
    Button btnCoupe;
    @BindView(R.id.btnSuv)
    Button btnSuv;
    @BindView(R.id.btnSedan)
    Button btnSedan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.btnCompetible, R.id.btnCoupe, R.id.btnSuv, R.id.btnSedan})
    public void onViewClicked(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btnCompetible:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("tanda", "competible");
                startActivity(intent);
                break;
            case R.id.btnCoupe:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("tanda", "coupe");
                startActivity(intent);
                break;
            case R.id.btnSuv:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("tanda", "suv");
                startActivity(intent);
                break;
            case R.id.btnSedan:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("tanda", "sedan");
                startActivity(intent);
                break;
        }
    }
}
