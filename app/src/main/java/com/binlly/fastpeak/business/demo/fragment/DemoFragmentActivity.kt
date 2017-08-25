package com.binlly.fastpeak.business.demo.fragment

import android.os.Bundle
import com.binlly.fastpeak.R
import com.binlly.fastpeak.base.mvp.BaseActivity
import javax.inject.Inject

/**
 * Created by yy on 2017/8/25.
 */
class DemoFragmentActivity: BaseActivity() {

    @Inject lateinit var fragment: DemoFragment

    override fun getContentView(): Int {
        return R.layout.activity_fragment_demo
    }

    override fun initView(savedInstanceState: Bundle?) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.content, fragment).commit()
    }
}