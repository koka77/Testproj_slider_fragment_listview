package com.example.october.testproj_slider_fragment_listview;

/**
 * Created by User on 18.01.2017.
 */

public enum ModelObject {

    RED (R.string.red, R.layout.tab1),
    BLUE (R.string.blue, R.layout.tab2),
    GREEN (R.string.green, R.layout.tab3);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject (int titleResId, int layoutResId){
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getmTitleResId(){
        return mTitleResId;
    }

    public int getmLayoutResId(){
        return mLayoutResId;
    }
}