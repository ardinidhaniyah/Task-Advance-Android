package com.example.android_advanced.workers

import android.content.Context
import android.os.StrictMode
import android.util.Log
import androidx.work.ListenableWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.android_advanced.Preference
import com.example.android_advanced.api.ApiClient

class NewsSecondWorker
//    (appContext: Context, workerParams: WorkerParameters) :
//    Worker(appContext, workerParams)
{

//    override fun doWork(): Result {
//        Preference().setCountValue(
//            applicationContext,
//            (Preference().getCountValue(applicationContext, Preference.tagCountSecondWork) + 1),
//            Preference.tagCountSecondWork
//        )
//
//        Log.e("CheckLog", "do news second work run")
//        Thread.sleep(5_000)
//        try {
//            val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
//            StrictMode.setThreadPolicy(policy)
//            val x = ApiClient.createWebService().getListDataHewan2()
//            val respon = x.execute()
//            Log.e("CheckLog", "success worker")
//            return ListenableWorker.Result.success()
//        } catch (e: Exception) {
//            Log.e("CheckLog", "fail worker")
//            return ListenableWorker.Result.failure()
//        }
//    }

}