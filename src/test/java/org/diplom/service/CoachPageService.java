package org.diplom.service;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.diplom.page.CoachPage;
@Log4j2

public class CoachPageService {
    private static final String COACH_PAGE_URL = "https://www.jefit.com/coach";
    private final CoachPage coachPage = new CoachPage();

    @Step("Open Page Coach")
    public CoachPage openCoachPage() {
        log.info("Open Page Coach");
        return coachPage.openPage(COACH_PAGE_URL);
    }
}
