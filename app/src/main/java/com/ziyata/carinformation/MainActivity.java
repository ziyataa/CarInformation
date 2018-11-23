package com.ziyata.carinformation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerview)
    RecyclerView recyclerview;

    String [] jenisCompetible, jenisCoupe, jenisSedan, jenisSuv;
    int [] gambarJenisCompetible, gambarJenisCoupe, gambarJenisSedan, gambarJenisSuv;

    AdapterMobil adapterMobil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        jenisCompetible = getResources().getStringArray(R.array.JenisCompetible);
        jenisCoupe = getResources().getStringArray(R.array.JenisCoupe);
        jenisSedan = getResources().getStringArray(R.array.JenisSedan);
        jenisSuv = getResources().getStringArray(R.array.JenisSuv);

        gambarJenisCompetible = new int[]{R.drawable.bmw4cabrio, R.drawable.boxsterspyder, R.drawable.eclascabrio, R.drawable.miniconvertible, R.drawable.mx5};
        gambarJenisCoupe = new int[]{R.drawable.bmwseri4, R.drawable.jaguarf, R.drawable.nissansilvia, R.drawable.mercedesbenzcl};
        gambarJenisSedan = new int[]{R.drawable.audia4, R.drawable.audia6, R.drawable.bmw7series, R.drawable.mercededbenzs450, R.drawable.toyotacamri};
        gambarJenisSuv = new int[]{R.drawable.daihatsuterios,R.drawable.toyotarush,R.drawable.toyotalandcruiser,R.drawable.bmwx5,R.drawable.lexuslx570,R.drawable.audiq5};

        String tanda = getIntent().getStringExtra("tanda");

        if (tanda.equals("competible")){
            adapterMobil = new AdapterMobil(this, jenisCompetible, gambarJenisCompetible);
        }else if (tanda.equals("coupe")){
            adapterMobil = new AdapterMobil(this, jenisCoupe, gambarJenisCoupe);

        }else if (tanda.equals("suv")){
            adapterMobil = new AdapterMobil(this, jenisSuv, gambarJenisSuv);
        }else {
            adapterMobil = new AdapterMobil(this, jenisSedan,gambarJenisSedan);
        }

        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(adapterMobil);

    }
}
