package com.example.circket_score

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews
import es.antonborri.home_widget.HomeWidgetPlugin

/**
 * Implementation of App Widget functionality.
 */
class cricket_score_1 : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        // There may be multiple widgets active, so update all of them
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    override fun onEnabled(context: Context) {
        // Enter relevant functionality for when the first widget is created
    }

    override fun onDisabled(context: Context) {
        // Enter relevant functionality for when the last widget is disabled
    }

    internal fun updateAppWidget(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetId: Int
    ) {
        val widgetData = HomeWidgetPlugin.getData(context)
        val widgetText = loadTitlePref(context, appWidgetId)
        // Construct the RemoteViews object
        val views = RemoteViews(context.packageName, R.layout.cricket_widget).apply{
            val team1Name = widgetData.getString("team_1",null)
            setTextViewText(R.id.team1,team1Name ?: "")
            val team1score = widgetData.getString("team1_score",null)
            setTextViewText(R.id.team1score,team1score ?: "")
            val oversPlayed = widgetData.getString("overs_played",null)
            setTextViewText(R.id.oversPlayed,oversPlayed ?: "")
            val matchStatus = widgetData.getString("match_status",null)
            setTextViewText(R.id.matchStatus,matchStatus ?: "")
            val team2score = widgetData.getString("team2_score",null)
            setTextViewText(R.id.team2score,team2score ?: "")
            val team2overs = widgetData.getString("team2_overs",null)
            setTextViewText(R.id.team2overs,team2overs ?: "")
            val team2 = widgetData.getString("team_2",null)
            setTextViewText(R.id.team2,team2 ?: "")
            val player1 = widgetData.getString("player_1",null)
            setTextViewText(R.id.player1,player1 ?: "")
            val player2 = widgetData.getString("player_2",null)
            setTextViewText(R.id.player2,player2 ?: "")
            val player1score = widgetData.getString("player1_score",null)
            setTextViewText(R.id.player1score,player1score ?: "")
            val player2score = widgetData.getString("player2_score",null)
            setTextViewText(R.id.player2score,player2score ?: "")
            val bowler = widgetData.getString("bowler",null)
            setTextViewText(R.id.bowler,bowler ?: "")
            val overs = widgetData.getString("overs",null)
            setTextViewText(R.id.overs,overs ?: "")
        }

        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views)
    }
}
