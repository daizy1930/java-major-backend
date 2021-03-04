package com.example.cybage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.cybage.entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
	
	
	
//	@Query(value="select co.course_id, co.course_name,co.course_desc,co.course_logo,co.course_price,ca.category_name from course co, category ca where co.category_id=ca.category_id",nativeQuery = true)
//
//
//	List<Course> findAllWithCategoryName();


}
