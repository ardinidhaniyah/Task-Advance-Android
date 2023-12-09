package com.example.android_advanced.workers.rxJava

//import android.content.Context
//import android.util.Log
//import androidx.work.*
//import androidx.work.RxWorker
//import com.example.android_advanced.api.ApiClient
//import io.reactivex.Single


class NewsRxNewsWorker
//    (appContext: Context, workerParams: WorkerParameters) :
//    RxWorker(appContext, workerParams)
{

//    companion object {
//        val tagResult = "TagNewsWorkerResult"
//        val tagResultData = "TagNewsWorkerResultData"
//        val tag = "TAG_NEWS_RX_WORKER"
//    }

//    override fun createWork(): Single<Result> {
//        Log.e("Ikhwan wm", "createWork")
//        setProgressAsync(workDataOf("progress" to 0))

//        return ApiClient.createWebService().getListDataHewan4()
//            .subscribeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe(object : SingleObserver<HewanDao> {
//                override fun onSuccess(t: HewanDao) {
//                }
//                override fun onSubscribe(d: Disposable) {
//                }
//                override fun onError(e: Throwable) {
//                }
//            })
//            .doOnSuccess {
//                it?.let {
//                    Log.e("Ikhwan wm", "doOnSuccess " + Gson().toJson(it))
//                } ?: run {
//                    Log.e("Ikhwan wm", "doOnSuccess null")
//                }
//            }
//            .map {
//                Log.e("Ikhwan wm", "map")
//                setProgressAsync(workDataOf("progress" to 100))
//                Result.success()
//            }
////            .onErrorReturn {
////                Log.e("Ikhwan wm", "onErrorReturn " + it.localizedMessage?.toString())
////                Result.failure()
////            }
//    }

}