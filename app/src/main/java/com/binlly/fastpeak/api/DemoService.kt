package com.binlly.fastpeak.api

import com.binlly.fastpeak.base.net.HttpResult
import com.binlly.fastpeak.business.demo.model.DemoModel
import io.reactivex.Observable
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by binlly on 16/6/24.
 */
interface DemoService {

    @FormUrlEncoded
    @POST(ApiConfig.URL_DEMO)
    fun requestDemo(@FieldMap fieldMap: Map<String, String>): Observable<HttpResult<DemoModel>>
}