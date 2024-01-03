//package com.example.circket_score
//
//import android.annotation.TargetApi
//import android.appwidget.AppWidgetManager
//import android.appwidget.AppWidgetProvider
//import android.content.Context
//import android.os.Build
//import android.widget.RemoteViews
//
///**
// * Implementation of App Widget functionality.
// * App Widget Configuration implemented in [CricketScoreWidgetConfigureActivity]
// */
//@TargetApi(Build.VERSION_CODES.CUPCAKE)
//class CricketScoreWidget : AppWidgetProvider() {
//    override fun onUpdate(
//        context: Context,
//        appWidgetManager: AppWidgetManager,
//        appWidgetIds: IntArray
//    ) {
//        // There may be multiple widgets active, so update all of them
////        for (appWidgetId in appWidgetIds) {
////            updateAppWidget(context, appWidgetManager, appWidgetId)
////        }
//    }
//
//    override fun onDeleted(context: Context, appWidgetIds: IntArray) {
//        // When the user deletes the widget, delete the preference associated with it.
//        for (appWidgetId in appWidgetIds) {
//            deleteTitlePref(context, appWidgetId)
//        }
//    }
//
//    override fun onEnabled(context: Context) {
//        // Enter relevant functionality for when the first widget is created
//    }
//
//    override fun onDisabled(context: Context) {
//        // Enter relevant functionality for when the last widget is disabled
//    }
//}
//
////@TargetApi(Build.VERSION_CODES.CUPCAKE)
////internal fun updateAppWidget(
////    context: Context,
////    appWidgetManager: AppWidgetManager,
////    appWidgetId: Int
////) {
////    val widgetText = loadTitlePref(context, appWidgetId)
////    // Construct the RemoteViews object
////    val views = RemoteViews(context.packageName, R.layout.cricket_score_widget)
////    views.setTextViewText(R.id.appwidget_text, widgetText)
////
////    // Instruct the widget manager to update the widget
////    appWidgetManager.updateAppWidget(appWidgetId, views)
////}