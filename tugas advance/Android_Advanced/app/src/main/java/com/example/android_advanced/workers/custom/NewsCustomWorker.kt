package com.example.android_advanced.workers.custom

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.Data
import androidx.work.ListenableWorker
import androidx.work.WorkerParameters
import com.example.android_advanced.api.ApiInterface
//import com.google.gson.Gson

class NewsCustomWorker
//    (appContext: Context, workerParams: WorkerParameters,
//    private val apiInterface: ApiInterface) :
//    CoroutineWorker(appContext, workerParams)
    {
//
//    companion object {
//        val tagResult = "TagNewsCustomWorkerResult"
//        val tagResultData = "TagNewsCustomWorkerResultData"
//        val tag = "TAG_NEWS_CORO_Custom_WORKER"
//    }

//    override suspend fun doWork(): Result {
//        Log.e("CheckLog", "$tag: do news work run")
//        val result: HewanDao? = apiInterface.getListDataHewan3()
//
//        result?.let {
//            return ListenableWorker.Result.success(
//                Data.Builder().putString(tagResult, "Success Message from News Worker").putString(
//                    tagResultData, Gson().toJson(result)
//                ).build()
//            )
//        }
//        return ListenableWorker.Result.failure()
//    }

}