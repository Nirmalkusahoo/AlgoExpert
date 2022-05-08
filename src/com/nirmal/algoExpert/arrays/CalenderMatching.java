package com.nirmal.algoExpert.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalenderMatching {
    public static List<StringMeeting> calendarMatching(List<StringMeeting> calendar1,
                                                       StringMeeting dailyBounds1,
                                                       List<StringMeeting> calendar2,
                                                       StringMeeting dailyBounds2,
                                                       int meetingDuration) {
        List<Meeting> updatedCalender1 = updateCalender(calendar1, dailyBounds1);
        List<Meeting> updatedCalender2 = updateCalender(calendar2, dailyBounds2);
        List<Meeting> mergedCalender = mergeCalender(updatedCalender1, updatedCalender2);
        List<Meeting> flattenedCalender = flattenCalender(mergedCalender);
        return getAvailabilities(flattenedCalender, meetingDuration);
    }

    public static List<Meeting> updateCalender(List<StringMeeting> calender, StringMeeting dailyBound) {
        List<StringMeeting> updated = new ArrayList<>();
        updated.add(new StringMeeting("0:00", dailyBound.start));
        updated.addAll(calender);
        updated.add(new StringMeeting(dailyBound.end, "23:59"));
        List<Meeting> calenderInMinutes = new ArrayList<>();
        for (int i = 0; i < updated.size(); i++) {
            calenderInMinutes.add(new Meeting(timeToMinutes(updated.get(i).start), timeToMinutes(updated.get(i).end)));
        }

        return calenderInMinutes;
    }

    public static List<Meeting> mergeCalender(List<Meeting> calender1, List<Meeting> calender2) {
        int i = 0;
        int j = 0;
        List<Meeting> merged = new ArrayList<>();
        while (i < calender1.size() && j < calender2.size()) {
            Meeting meeting1 = calender1.get(i);
            Meeting meeting2 = calender2.get(j);
            if (meeting1.start < meeting2.start) {
                merged.add(meeting1);
                i++;
            } else {
                merged.add(meeting2);
                j++;
            }
        }

        while (i < calender1.size()) {
            merged.add(calender1.get(i));
            i++;
        }
        while (j < calender2.size()) {
            merged.add(calender2.get(j));
            j++;
        }
        return merged;
    }

    public static List<Meeting> flattenCalender(List<Meeting> calender) {
        List<Meeting> flattenedCalender = new ArrayList<>();
        flattenedCalender.add(calender.get(0));

        for (int i = 1; i < calender.size(); i++) {
            Meeting previousMeeting = flattenedCalender.get(flattenedCalender.size() - 1);
            Meeting currentMeeting = calender.get(i);
            if (previousMeeting.end > currentMeeting.start) {
                Meeting newPreviousMeeting = new Meeting(previousMeeting.start, Math.max(previousMeeting.end, currentMeeting.end));
                flattenedCalender.set(flattenedCalender.size() - 1, newPreviousMeeting);
            } else {
                flattenedCalender.add(currentMeeting);
            }
        }
        return flattenedCalender;
    }

    public static List<StringMeeting> getAvailabilities(List<Meeting> meetings, int meetingDuration) {
        List<StringMeeting> availableTimes = new ArrayList<>();
        for (int i = 1; i < meetings.size(); i++) {
            int start = meetings.get(i - 1).end;
            int end = meetings.get(i).start;
            int difference = end - start;
            if (difference >= meetingDuration) {
                availableTimes.add(new StringMeeting(minutesToTime(start), minutesToTime(end)));
            }
        }
        return availableTimes;
    }

    public static String minutesToTime(int time) {
        int hour = time / 60;
        int min = time % 60;
        String hoursToString = Integer.toString(hour);
        String minToString = min < 10 ? "0" + Integer.toString(min) : Integer.toString(min);

        return hoursToString + ":" + minToString;
    }

    public static int timeToMinutes(String time) {
        int delimiterIndex = time.indexOf(':');
        int hour = Integer.parseInt(time.substring(0, delimiterIndex));
        int min = Integer.parseInt(time.substring(delimiterIndex + 1, time.length()));
        return hour * 60 + min;
    }

    public static class StringMeeting {
        String start;
        String end;

        StringMeeting(String start, String end) {
            this.start = start;
            this.end = end;
        }
    }

    public static class Meeting {
        int start;
        int end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {

        List<StringMeeting> calender1 = new ArrayList<>();
        List<StringMeeting> calender2 = new ArrayList<>();
        StringMeeting bound1 = new StringMeeting("9:30", "16:30");
        StringMeeting bound2 = new StringMeeting("9:30", "16:30");
        calendarMatching(Arrays.asList(), bound1, Arrays.asList(), bound2, 60);
    }
}
