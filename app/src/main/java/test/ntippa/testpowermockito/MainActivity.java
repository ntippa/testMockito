package test.ntippa.testpowermockito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import test.ntippa.testpowermockito.dto.PlantDTO;
import test.ntippa.testpowermockito.services.IPlantService;
import test.ntippa.testpowermockito.services.PlantService;

public class MainActivity extends AppCompatActivity {

    IPlantService plantService;
    private TextView msgTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plantService = new PlantService();
        msgTextView = findViewById(R.id.msgView);
    }

    public void search(View v){

        List<PlantDTO> plants = plantService.fetchPlants(msgTextView.getText().toString());

        for(PlantDTO plant : plants){

            String showText = " ";
            Toast.makeText(this,showText,Toast.LENGTH_LONG).show();

        }
    }
}
