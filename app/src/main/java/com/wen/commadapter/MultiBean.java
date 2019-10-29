package com.wen.commadapter;

/**
 * Created by abc on 2019/10/29.
 */

public class MultiBean implements MainActivity.IViewType {
    public String name;

    @Override
    public int getItemViewType() {
        return 1;
    }


    @Override
    public String toString() {
        return name;
    }
}
