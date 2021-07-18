package com.flyco.tablayout.listener;

import android.view.View;

public interface OnTabSelectListener {
    void onTabSelect(int position, View view);
    void onTabReselect(int position,View view);
}