package org.diplom.service;

import org.diplom.page.CoachPage;

public class CoachPageService {
    private static final String COACH_PAGE_URL = "https://www.jefit.com/coach";
    private final CoachPage coachPage = new CoachPage();

    public CoachPage openCoachPage() {
        return coachPage.openPage(COACH_PAGE_URL);
    }
}
