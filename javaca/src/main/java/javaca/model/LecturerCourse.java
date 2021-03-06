package javaca.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the lecturercourse database table.
 * 
 */
@Entity
@Table(name="lecturercourse")
@NamedQuery(name="LecturerCourse.findAll", query="SELECT l FROM LecturerCourse l")
public class LecturerCourse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int teachingID;

	private String status;

	//bi-directional many-to-one association to Course
	@ManyToOne
	@JoinColumn(name="courseID")
	private Course course;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="userID")
	private User user;

	
	
	
	
	
	
	
	
	
	
	
	
	
	public LecturerCourse() {
	}

	public int getTeachingID() {
		return this.teachingID;
	}

	public void setTeachingID(int teachingID) {
		this.teachingID = teachingID;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCourse() {
		return this.course.getCourseID();
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getUser() {
		return this.user.getUserID();
	}

	public void setUser(User user) {
		this.user = user;
	}

}