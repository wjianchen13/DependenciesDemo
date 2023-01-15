package com.example.dependenciesdemo;

import androidx.lifecycle.ViewModel;

public class MyViewmodel extends ViewModel {
    //a用来计数
    protected int a=0;
    public MyViewmodel() {
    }

    public MyViewmodel(int a) {
        this.a = a;
    }
}

