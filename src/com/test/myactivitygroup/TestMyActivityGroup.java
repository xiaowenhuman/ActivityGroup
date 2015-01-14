package com.test.myactivitygroup;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;

public class TestMyActivityGroup extends AbstractMyActivityGroup{
    //加载的Activity的名字，LocalActivityManager就是通过这些名字来查找对应的Activity的。
    private static final String CONTENT_ACTIVITY_NAME_0 = "contentActivity0";
    private static final String CONTENT_ACTIVITY_NAME_1 = "contentActivity1";
    private static final String CONTENT_ACTIVITY_NAME_2 = "contentActivity2";
    private static final String CONTENT_ACTIVITY_NAME_3 = "contentActivity3";
    private static final String CONTENT_ACTIVITY_NAME_4 = "contentActivity4";
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.my_activity_group);
        super.onCreate(savedInstanceState);
        
        ((RadioButton)findViewById(R.id.radio_button0)).setChecked(true);
    }
    
    /**
     * 找到自定义id的加载Activity的View
     */
    @Override
    protected ViewGroup getContainer() {
        return (ViewGroup) findViewById(R.id.container);
    }
    
    /**
     * 初始化按钮
     */
    @Override
    protected void initRadioBtns() {
        initRadioBtn(R.id.radio_button0);
        initRadioBtn(R.id.radio_button1);
        initRadioBtn(R.id.radio_button2);
        initRadioBtn(R.id.radio_button3);
        initRadioBtn(R.id.radio_button4);
    }
    
    /**
     * 导航按钮被点击时，具体发生的变化
     */
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            switch (buttonView.getId()) {
            
            case R.id.radio_button0:
                setContainerView(CONTENT_ACTIVITY_NAME_0, MainActivity3.class);
                break;
                
            case R.id.radio_button1:
                setContainerView(CONTENT_ACTIVITY_NAME_1, MainActivity1.class);
                break;
                
            case R.id.radio_button2:
                setContainerView(CONTENT_ACTIVITY_NAME_2, MainActivity2.class);
                break;
                
            case R.id.radio_button3:
                setContainerView(CONTENT_ACTIVITY_NAME_3, MainActivity3.class);
                break;
                
            case R.id.radio_button4:
                setContainerView(CONTENT_ACTIVITY_NAME_4, MainActivity4.class);
                break;
                
            default:
                break;
            }
        }
    }
    
}