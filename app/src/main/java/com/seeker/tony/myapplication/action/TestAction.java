package com.seeker.tony.myapplication.action;

import android.content.Context;
import android.widget.Toast;

import com.meiyou.annotation.JUriAction;
import com.seeker.tony.myapplication.route.action.Action;

/**
 * @author zhengxiaobin@xiaoyouzi.com
 * @since 17/7/13
 */

@JUriAction("meiyou:///home/user")
public class TestAction extends Action {
    @Override
    public void run(Context context) {
        super.run(context);
        Toast.makeText(context, "Test Action", Toast.LENGTH_SHORT).show();
    }
}