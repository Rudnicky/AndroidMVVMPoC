package com.example.androidmvvmpoc.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.android.databinding.library.baseAdapters.BR;

public class MainActivityViewModel extends BaseObservable {

    @Bindable
    public String toastMessage = null;

    public void onButtonClicked() {
        setToastMessage("Button clicked!");
    }

    public String getToastMessage() {
        return toastMessage;
    }

    private void setToastMessage(String toastMessage) {

        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }
}
