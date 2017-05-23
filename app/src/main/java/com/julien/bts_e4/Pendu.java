package com.julien.bts_e4;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Pendu extends Fragment {
    private Button jeuPendu;
    private Button jeupcc;
    private View rootViews;

    public Pendu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootViews = inflater.inflate(R.layout.fragment_pendu, container, false);
        Game();
        return rootViews;
    }

    public void Game(){
        jeuPendu  =(Button) jeuPendu.findViewById(R.id.jeuPendu);
        jeupcc = (Button) jeupcc.findViewById(R.id.jeupcc);
        jeuPendu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),PenduActivity.class);
                startActivity(intent);
            }
        });

        jeupcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getActivity(), PccActivity.class);
                startActivity(intent);
            }
        });
    }
}
