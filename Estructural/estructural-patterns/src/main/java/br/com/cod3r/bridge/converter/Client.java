package br.com.cod3r.bridge.converter;

import br.com.cod3r.bridge.converter.converters.CSVConverter;
import br.com.cod3r.bridge.converter.converters.Converter;
import br.com.cod3r.bridge.converter.converters.JsonConverter;
import br.com.cod3r.bridge.converter.employees.Employee;
import br.com.cod3r.bridge.converter.employees.ITGuy;
import br.com.cod3r.bridge.converter.employees.ProjectManager;

public class Client {

	public static void main(String[] args) {

		Converter jsonConverter = new JsonConverter();
		Converter csvConverter = new CSVConverter();

		Employee itGuy = new ITGuy("Jehmes", 27, 6000d);
		System.out.println(jsonConverter.getEmployeeFormated(itGuy));
		System.out.println(csvConverter.getEmployeeFormated(itGuy));

		Employee projectManager = new ProjectManager("Thales", 27, 10500d);
		System.out.println(jsonConverter.getEmployeeFormated(projectManager));
		System.out.println(csvConverter.getEmployeeFormated(projectManager));

	}
}
