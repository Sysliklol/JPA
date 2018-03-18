package ent;

import org.springframework.beans.factory.annotation.Autowired;

import Interface.LecturesDao;

public class LecturesWorker {
	@Autowired
	LecturesDao lecturesDao;
	public Lecture addLecture(Lecture lecture){
	lecture = lecturesDao.addLecture(lecture);
	System.out.println(lecture);
	return lecture;
	}
}
