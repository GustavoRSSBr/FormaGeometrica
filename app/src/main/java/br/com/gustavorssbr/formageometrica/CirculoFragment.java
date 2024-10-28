package br.com.gustavorssbr.formageometrica;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.gustavorssbr.formageometrica.controller.CirculoController;
import br.com.gustavorssbr.formageometrica.controller.IGeometriaController;
import br.com.gustavorssbr.formageometrica.model.Circulo;


public class CirculoFragment extends Fragment {

    private View view;

    EditText etRaioC;
    Button btnCalcularC;
    TextView tvResC;


    public CirculoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_circulo, container, false);

        etRaioC = view.findViewById(R.id.etRaioC);
        btnCalcularC = view.findViewById(R.id.btnCalcularC);
        tvResC = view.findViewById(R.id.tvResC);

        btnCalcularC.setOnClickListener(op -> calcular());

        return view;
    }

    private void calcular() {
        Circulo circulo = new Circulo(Float.parseFloat(etRaioC.getText().toString()));

        IGeometriaController<Circulo> controller = new CirculoController();

        float area = controller.calcularArea(circulo);

        float perimetro = controller.calcularPerimetro(circulo);

        String texto = "Area: " + area + " | Perímetro: " + perimetro;

        tvResC.setText(texto);

        limpaCampo();
    }

    private void limpaCampo() {
        etRaioC.setText("");
    }
}