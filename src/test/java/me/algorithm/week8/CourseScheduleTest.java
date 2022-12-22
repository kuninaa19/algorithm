package me.algorithm.week8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CourseScheduleTest {
    private CourseSchedule courseSchedule;

    @BeforeEach
    void setUp() {
        courseSchedule = new CourseSchedule();
    }

    @Test
    void 실패_케이스_단순_순환() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};

        assertThat(courseSchedule.canFinish(numCourses, prerequisites)).isFalse();
    }

    @Test
    void 실패_케이스_다중_인접_그래스_순환() {
        int numCourses = 3;
        int[][] prerequisites = {{1, 0}, {1, 2}, {2, 3}, {2, 4}, {4, 1}};

        assertThat(courseSchedule.canFinish(numCourses, prerequisites)).isFalse();
    }

    @Test
    void 성공_케이스_모든_요소_연결된_그래프() {
        int numCourses = 5;
        int[][] prerequisites = {{1, 4}, {2, 4}, {3, 1}, {3, 2}};

        assertThat(courseSchedule.canFinish(numCourses, prerequisites)).isTrue();
    }

    @Test
    void 성공_케이스_그래프_2개() {
        int numCourses = 8;
        int[][] prerequisites = {{1, 0}, {2, 6}, {1, 7}, {6, 4}, {7, 0}, {0, 5}};

        assertThat(courseSchedule.canFinish(numCourses, prerequisites)).isTrue();
    }
}

