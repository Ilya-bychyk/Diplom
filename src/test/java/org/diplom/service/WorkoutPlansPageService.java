package org.diplom.service;

import org.diplom.page.WorkoutPlansPage;

public class WorkoutPlansPageService {
    private static final String WORKOUT_PLANS_PAGE_URL = "https://www.jefit.com/routines/";
    private WorkoutPlansPage workoutPlansPage = new WorkoutPlansPage();
    public WorkoutPlansPageService openWorkoutPage() {
        workoutPlansPage.openPage(WORKOUT_PLANS_PAGE_URL);
        return this;
    }
}
