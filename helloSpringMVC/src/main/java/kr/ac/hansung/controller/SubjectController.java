package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Subject;
import kr.ac.hansung.service.SubjectService;

@Controller
public class SubjectController {

	private SubjectService subjectService;

	@Autowired
	public void setOffersService(SubjectService offersService) {
		this.subjectService = offersService;
	}

	@RequestMapping("/grade")
	public String showOffers(Model model) {

		Integer grade1 = subjectService.getSubjectCount(2012, 1);
		Integer grade2 = subjectService.getSubjectCount(2012, 2);
		Integer grade3 = subjectService.getSubjectCount(2015, 1);
		Integer grade4 = subjectService.getSubjectCount(2015, 2);

		model.addAttribute("a",grade1);
		model.addAttribute("b",grade2);
		model.addAttribute("c",grade3);
		model.addAttribute("d",grade4);


		return "grade";
	}

	@RequestMapping("/com_grade")
	public String createOffers(Model model) {
		
		int a = subjectService.getSubjectCount("교필");
		int b = subjectService.getSubjectCount("핵교A");
		int c = subjectService.getSubjectCount("핵교B");
		int d = subjectService.getSubjectCount("전지");
		int e = subjectService.getSubjectCount("전선");
		int f = subjectService.getSubjectCount("전기");
		int g = subjectService.getSubjectCount("일교");
		int h = a+b+c+d+e+f+g;	
		model.addAttribute("a",a);
		model.addAttribute("b",b);
		model.addAttribute("c",c);
		model.addAttribute("d",d);
		model.addAttribute("e",e);
		model.addAttribute("f",f);
		model.addAttribute("g",g);
		model.addAttribute("h",h);

		return "com_grade";
	}
	
	@RequestMapping("/sub_class")
	public String sub_class(Model model) {

		return "sub_class";
	}

	@RequestMapping("/doapplication")
	public String doapplication(Model model,Subject subject) {

		subjectService.dataInsert(subject);
		return "sub_result";
	}

	@RequestMapping("/lookup")
	public String lookup(Model model) {

		List<Subject> subject = subjectService.getCurruntApplication();
		
		model.addAttribute("subject", subject);
		
		return "lookup";
	}
	
	@RequestMapping("/2012-1")
	public String A(Model model) {

		List<Subject> subject = subjectService.getCurrunt(2012, 1);
		
		model.addAttribute("subject", subject);
		
		return "2012-1";
	}
	
	@RequestMapping("/2012-2")
	public String B(Model model) {

		List<Subject> subject = subjectService.getCurrunt(2012, 2);
		
		model.addAttribute("subject", subject);
		
		return "2012-2";
	}
	
	@RequestMapping("/2015-1")
	public String C(Model model) {

		List<Subject> subject = subjectService.getCurrunt(2015, 1);
		
		model.addAttribute("subject", subject);
		
		return "2015-1";
	}
	
	@RequestMapping("/2015-2")
	public String D(Model model) {

		List<Subject> subject = subjectService.getCurrunt(2015, 2);
		
		model.addAttribute("subject", subject);
		
		return "2015-2";
	}


}
