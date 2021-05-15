package com.example.lifestyle


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.anychart.AnyChart
import com.anychart.AnyChartView
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry
import com.anychart.charts.Pie


class ActivityChart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart)

        val pie: Pie = AnyChart.pie()
        val chartData : MutableList<DataEntry> = ArrayList()

        chartData.add(ValueDataEntry("overweight", 62.0))
        chartData.add(ValueDataEntry("obese", 25.0))
        chartData.add(ValueDataEntry("slim-normal", 13.0))

        pie.data(chartData)

        val chartView = findViewById<View>(R.id.chartView) as AnyChartView
        chartView.setChart(pie)
    }
}