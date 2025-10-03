package com.pluralsight;

import java.time.LocalDate;

public class task {

    private String title;
    private LocalDate duedate;
    private boolean complete;
    private String urgency; // (A list of default values => ENUM)
    private String NotificationMessage;
    private boolean Reminder;

    //Create a constructor
    public task(String inst_title) {
        this.title = inst_title;
    }
        public void complete (Boolean inst_complete) {
            this.complete = inst_complete;
        }
            public String toString() {
                if (complete) {
                    return "[✓] " + title;
                } else {
                    return "[ ] " + title;
                }
            }




    }
    //
     //
     //
     //
     //
     //
     //