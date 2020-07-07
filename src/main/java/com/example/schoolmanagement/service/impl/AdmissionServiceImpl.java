/**
 * 
 */
package com.example.schoolmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.schoolmanagement.model.bo.AdmissionBO;
import com.example.schoolmanagement.model.dto.AdmissionDTO;
import com.example.schoolmanagement.respository.AdmissionRepository;
import com.example.schoolmanagement.service.AdmissionService;
import com.example.schoolmanagement.utill.AdmissionUtill;


/**
 * @author laxma
 *
 */
@Service
public class AdmissionServiceImpl implements AdmissionService {
@Autowired
AdmissionUtill admissionUtill;
@Autowired
AdmissionRepository admissonrepo;
	@Override
	public AdmissionDTO admissionSave(AdmissionDTO admissiondetails) {
		System.out.println("StudentName..."+admissiondetails.getStudentName());
		System.out.println("FatherName"+admissiondetails.getFatherName());
		System.out.println("StudentAddress"+admissiondetails.getStudentAddress());
		System.out.println("Date of joining"+admissiondetails.getDateOfJoining());
		AdmissionBO adbo = admissionUtill.ConvertAdmissionDtoToAdmissionbo(admissiondetails);
		System.out.println("StudentName..."+adbo.getStudentName());
		System.out.println("FatherName"+adbo.getFatherName());
		System.out.println("StudentAddress"+adbo.getStudentAddress());
		System.out.println("Date of joining"+adbo.getDateOfJoining());
		AdmissionBO adsmissionBoRespose = admissonrepo.save(adbo);
		return admissionUtill.ConvertAdmissionBoToAdmissionDto(adsmissionBoRespose) ;
	}

}
