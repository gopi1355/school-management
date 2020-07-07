/**
 * 
 */
package com.example.schoolmanagement.service;

import org.springframework.stereotype.Service;

import com.example.schoolmanagement.model.dto.AdmissionDTO;

/**
 * @author laxma
 *
 */
@Service
public interface AdmissionService {

	 AdmissionDTO admissionSave(AdmissionDTO admissiondetails) ;
		
		
	
}
