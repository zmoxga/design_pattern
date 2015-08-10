package com.design.pattern;

import java.util.List;

/**
 * Created by jason on 15/4/27.
 */
public class AndCriteria implements Criteria {
	private Criteria criteria;
	private Criteria anotherCriteria;

	public AndCriteria(Criteria criteria, Criteria anotherCriteria) {
		this.anotherCriteria = anotherCriteria;
		this.criteria = criteria;
	}

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return anotherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
