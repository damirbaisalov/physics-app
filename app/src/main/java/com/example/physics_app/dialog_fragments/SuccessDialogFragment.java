package com.example.physics_app.dialog_fragments;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.example.physics_app.R;

public class SuccessDialogFragment extends DialogFragment implements OnClickListener {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getDialog().setTitle("Сіз сынақты сәтті аяқтадыңыз 15/15!");
        View v = inflater.inflate(R.layout.success_dialog, null);
        v.findViewById(R.id.success_dialog_ok).setOnClickListener(this);
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
