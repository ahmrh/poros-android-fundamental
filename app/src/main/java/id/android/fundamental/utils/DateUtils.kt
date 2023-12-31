package id.android.fundamental.utils

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

object DateUtils{
    fun getDayFromDateString(dateString: String): String {

        val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())
        val date = dateFormat.parse(dateString)

        val calendar = Calendar.getInstance()
        calendar.time = date

        val day = when (calendar.get(Calendar.DAY_OF_WEEK)) {
            Calendar.SUNDAY -> "Sunday"
            Calendar.MONDAY -> "Monday"
            Calendar.TUESDAY -> "Tuesday"
            Calendar.WEDNESDAY -> "Wednesday"
            Calendar.THURSDAY -> "Thursday"
            Calendar.FRIDAY -> "Friday"
            Calendar.SATURDAY -> "Saturday"
            else -> "Unknown day"
        }

        return day

    }

    fun getTimeFromDateString(dateString: String): String{

        val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())
        val date = dateFormat.parse(dateString)

        val calendar = Calendar.getInstance()
        calendar.time = date

        val timeFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
        val time = timeFormat.format(date)

        return time
    }
}