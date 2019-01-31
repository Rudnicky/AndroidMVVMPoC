package com.example.androidmvvmpoc.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.Editable;
import android.text.TextWatcher;

import com.android.databinding.library.baseAdapters.BR;

public class MainActivityViewModel extends BaseObservable {

    @Bindable
    public String toastMessage = null;

    @Bindable
    public String text = null;

    public void onButtonClicked() {
        setToastMessage("Button clicked!");
    }

    public void onAfterTextChanged(CharSequence sequence) {
//        setToastMessage(sequence.toString());
    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        setTextViewText(s.toString());
    }

    public String getTextViewText() {
        return "Some random text";
    }

    public void setTextViewText(String text) {
        this.text = text;
        notifyPropertyChanged(BR.text);
    }

    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {

        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }
}
