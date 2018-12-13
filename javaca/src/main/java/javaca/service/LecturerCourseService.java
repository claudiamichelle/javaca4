package javaca.service;

import java.util.List;

import javaca.model.LecturerCourse;

public interface LecturerCourseService {

	List<LecturerCourse> findAll();
	List<LecturerCourse> getActiveCourses();
	LecturerCourse save(LecturerCourse lc);

}
