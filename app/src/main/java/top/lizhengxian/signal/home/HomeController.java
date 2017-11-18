package top.lizhengxian.signal.home;


import android.util.Log;

import top.lizhengxian.event_lib.BaseController;
import top.lizhengxian.event_lib.anno.Subscribe;
import top.lizhengxian.signal.base.ID;

public class HomeController extends BaseController {
    @Subscribe(id = ID.START)
    public String start() {
        Log.e("lee..", "sha mo");
        pushWindow(new HomeWindow());
        return "Success";
    }
}
