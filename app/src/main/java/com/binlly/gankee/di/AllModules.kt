package com.binlly.gankee.di

import com.binlly.gankee.business.girl.GirlFragment
import com.binlly.gankee.business.history.HistoryActivity
import com.binlly.gankee.business.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by yy on 2017/8/24.
 */
@Module
abstract class AllModules {

    @ActivityScope
    @ContributesAndroidInjector(modules = [PresenterModules::class])
    abstract fun contributeHomeFragmentInjector(): HomeFragment

    @ActivityScope
    @ContributesAndroidInjector(modules = [PresenterModules::class])
    abstract fun contributeGirlFragmentInjector(): GirlFragment

    @ActivityScope
    @ContributesAndroidInjector(modules = [PresenterModules::class])
    abstract fun contributeHistoryActivityInjector(): HistoryActivity
}