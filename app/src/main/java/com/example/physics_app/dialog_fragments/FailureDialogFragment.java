package com.example.physics_app.dialog_fragments;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.physics_app.R;

//Диалоговое окно которое открывается по завершению теста в случае если есть ошибки
public class FailureDialogFragment extends DialogFragment implements View.OnClickListener {


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getDialog().setTitle("Сіз сынақты сәтті аяқтадыңыз 15/15!");
        View v = inflater.inflate(R.layout.failure_dialog_fragment, null);
        v.findViewById(R.id.failure_dialog_ok).setOnClickListener(this);

        Bundle bundle = getArguments();
        int resultInt = bundle.getInt("results",0);

        TextView title = v.findViewById(R.id.failure_dialog_result_text);

        title.setText("Тест нәтижесі: "+resultInt+"/15");


        return v;
    }

    public void onClick(View v) {
        dismiss();
        getActivity().finish();
    }

    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        getActivity().finish();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        getActivity().finish();
    }

    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
    }
}
