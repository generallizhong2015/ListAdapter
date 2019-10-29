package com.wen.commadapter;

/**
 * Created by abc on 2019/10/29.
 */

public class MultiBean1 implements MainActivity.IViewType {
    public String name;

    @Override
    public int getItemViewType() {
        return 2;
    }


    @Override
    public String toString() {
        return name;
    }
}
