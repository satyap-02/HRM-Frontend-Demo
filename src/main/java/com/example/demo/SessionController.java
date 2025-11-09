package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController {

    @Value("${app.api.base-url}")
    private String apiBaseUrl;

    @GetMapping("/")
    public String homePage() {
        return "home"; // maps to home.html
    }

    @GetMapping("/locations")
    public String locationsPage(Model model) {
        model.addAttribute("apiBaseUrl", apiBaseUrl);
        return "locations"; // maps to locations.html
    }

    @GetMapping("/employees")
    public String employeesPage(Model model) {
        model.addAttribute("apiBaseUrl", apiBaseUrl);
        return "employees"; // maps to employees.html
    }

    @GetMapping("/employees-anubhaw")
    public String employeesAnubhawPage(Model model) {
        model.addAttribute("apiBaseUrl", apiBaseUrl);
        return "employees-anubhaw"; // maps to employees-anubhaw.html
    }

    @GetMapping("/job-history-anubhaw")
    public String jobHistoryPage(Model model) {
        model.addAttribute("apiBaseUrl", apiBaseUrl);
        return "job-history-anubhaw"; // maps to job-history-anubhaw.html
    }
    
    @GetMapping("/vishnu/jobs")
	public String jobsPage(Model model) {
	    model.addAttribute("apiBaseUrl", apiBaseUrl);
	    return "jobs";
	}

	@GetMapping("/vishnu/employees-vishnu")
	public String employeesVishnuPage(Model model) {
	    model.addAttribute("apiBaseUrl", apiBaseUrl);
	    return "employees-vishnu";
	}
	
	@GetMapping("/jaheer/employees")
	public String employeesJaheerPage(Model model) {
	    model.addAttribute("apiBaseUrl", apiBaseUrl);
	    return "employees-jaheer";
	}

    @GetMapping("jaheer/departments")
    public String DepartmentJaheer(Model model) {
    	model.addAttribute("apiBaseUrl", apiBaseUrl);
        return "department-jaheer"; // maps to employees.html
    }
    
    @GetMapping("/regions-vighnesh")
    public String regionsPage(Model model) {
        model.addAttribute("apiBaseUrl", apiBaseUrl);
        return "regions-vighnesh"; // maps to templates/regions-vighnesh.html
    }
 
    // 👤 Vighnesh — Employees by Country (NEW)
    @GetMapping("/employees-vighnesh")
    public String employeesVighneshPage(Model model) {
        model.addAttribute("apiBaseUrl", apiBaseUrl);
        return "employees-vighnesh"; // maps to templates/employees-vighnesh.html
    }
    
    @GetMapping("/akhila/departments")
    public String departmentsAkhilaPage(Model model) {
        model.addAttribute("apiBaseUrl", apiBaseUrl);
        return "department-akhila"; // maps to templates/department-akhila.html
    }
    
    @GetMapping("/employees-akhila")
    public String employeesAkhilaPage(Model model) {
        model.addAttribute("apiBaseUrl", apiBaseUrl);
        return "employees-akhila"; // maps to templates/employees-akhila.html
    }
    
    @GetMapping("/swathi/employees-summary")
    public String employeesByCitySwathiPage(Model model) {
        model.addAttribute("apiBaseUrl", apiBaseUrl);
        return "employees-swathi"; // maps to employees-by-city-swathi.html
    }

    @GetMapping("/swathi/countries-cities")
    public String countriesCitiesSwathiPage(Model model) {
        model.addAttribute("apiBaseUrl", apiBaseUrl);
        return "countries-swathi"; // maps to countries-cities-swathi.html
    }

	
}