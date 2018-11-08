package jehealneil.sih.com.week14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class MainActivity extends AppCompatActivity {

    public ImageButton dimsumtreats;
         public void init(){
            dimsumtreats= (ImageButton)findViewById(R.id.dimsumtreats);
            dimsumtreats.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent food1 = new Intent(MainActivity.this,dimsumTreats.class);
                    startActivity(food1);

                }
            });




                {




            }




         };



    String [] SPINNERLIST={"DAPITAN", "P.NOVAL", "ESPANYA", "LACSON"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,SPINNERLIST);
        MaterialBetterSpinner betterSpinner=(MaterialBetterSpinner)findViewById(R.id.android_material_design_spinner);
        betterSpinner.setAdapter(arrayAdapter);





    }
}

