package com.tns.dao;
import com.tns.entity.Student;

public interface StudentDao {
	public abstract Student getStudentById(int id);//find
	public abstract void addStudent(Student student);//insert
	public abstract void removeStudent(Student student);
	public abstract void updateStudent(Student student);
	public abstract void commitTransaction();
    public abstract	void beginTransaction();
}

