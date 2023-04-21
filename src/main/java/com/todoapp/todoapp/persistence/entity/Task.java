package com.todoapp.todoapp.persistence.entity;

import javax.persistence.Id;
import java.time.LocalDateTime;

public class Task {
        @Id
        private String title;
        private String descrition;
        private LocalDateTime createDate;
        private LocalDateTime eta;
        private boolean finished;
        private TaskStatus taskStatus;


}
