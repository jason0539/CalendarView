package com.haibin.calendarviewproject.partner;

import android.content.Intent;

import com.haibin.calendarview.CalendarView;
import com.haibin.calendarviewproject.MainActivity;
import com.haibin.calendarviewproject.R;
import com.haibin.calendarviewproject.base.activity.BaseActivity;

/**
 * Created by liuzhenhui on 2018/3/5.
 */

public class PartnerActivity extends BaseActivity{
    CalendarView mCalendarView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_partner;
    }

    @Override
    protected void initView() {
        mCalendarView = (CalendarView) findViewById(R.id.calendarView);
    }

    @Override
    protected void initData() {

    }

    public static void show(MainActivity mainActivity) {
        Intent intent = new Intent(mainActivity, PartnerActivity.class);
        mainActivity.startActivity(intent);
    }
}
