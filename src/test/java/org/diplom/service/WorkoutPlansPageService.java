package org.diplom.service;

import lombok.extern.log4j.Log4j2;
import org.diplom.page.WorkoutPlansPage;

@Log4j2
public class WorkoutPlansPageService {
    private static final String WORKOUT_PLANS_PAGE_URL = "https://www.jefit.com/routines/";
    private final WorkoutPlansPage workoutPlansPage = new WorkoutPlansPage();

    public WorkoutPlansPage openWorkoutPage() {
        log.info("Open Workout Page");
       return workoutPlansPage.openPage(WORKOUT_PLANS_PAGE_URL);
    }
}
