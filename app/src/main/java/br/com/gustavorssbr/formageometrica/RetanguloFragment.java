package br.com.gustavorssbr.formageometrica;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.gustavorssbr.formageometrica.controller.IGeometriaController;
import br.com.gustavorssbr.formageometrica.controller.RetanguloController;
import br.com.gustavorssbr.formageometrica.model.Retangulo;


public class RetanguloFragment extends Fragment {

    private View view;
    private EditText etBaseR;
    private EditText etAlturaR;
    private Button btnCalcularR;
    private TextView tvResR;



    public RetanguloFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_retangulo, container, false);

        etBaseR = view.findViewById(R.id.etBaseR);
        etAlturaR = view.findViewById(R.id.etAlturaR);
        btnCalcularR = view.findViewById(R.id.btnCalcularR);
        tvResR = view.findViewById(R.id.tvResR);

        btnCalcularR.setOnClickListener(op -> calcular());

        return view;
    }

    private void calcular() {
        Retangulo retangulo = new Retangulo(Float.parseFloat(etBaseR.getText().toString())
                , Float.parseFloat(etAlturaR.getText().toString()));

        IGeometriaController<Retangulo> controller = new RetanguloController();

        float area = controller.calcularArea(retangulo);

        float perimetro = controller.calcularPerimetro(retangulo);

        String texto = "Area: " + area + " | Perímetro: " + perimetro;

        tvResR.setText(texto);

        limpaCampos();

    }

    private void limpaCampos() {
        etAlturaR.setText("");
        etBaseR.setText("");
    }
}