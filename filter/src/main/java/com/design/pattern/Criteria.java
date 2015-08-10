package com.design.pattern;

import java.util.List;

/**
 * Created by jason on 15/4/27.
 */
public interface Criteria {
	List<Person> meetCriteria(List<Person> persons);
}
