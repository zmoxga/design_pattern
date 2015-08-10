package com.design.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jason on 15/4/27.
 */
public class CriteriaFemale implements Criteria{
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")){
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
}
