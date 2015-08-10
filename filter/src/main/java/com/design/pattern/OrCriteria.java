package com.design.pattern;

import java.util.List;

/**
 * Created by jason on 15/4/27.
 */
public class OrCriteria implements Criteria {
	private Criteria criteria;
	private Criteria anotherCriteria;

	public OrCriteria(Criteria criteria, Criteria anotherCriteria) {
		this.anotherCriteria = anotherCriteria;
		this.criteria = criteria;
	}

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
		List<Person> otherCriteriaItems = anotherCriteria.meetCriteria(persons);
		for(Person person:firstCriteriaItems){
			if(!otherCriteriaItems.contains(person)){
				otherCriteriaItems.add(person);
			}
		}
		return otherCriteriaItems;
	}
}
