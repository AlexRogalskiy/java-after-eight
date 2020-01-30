package org.codefx.demo.java_after_eight.article;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

// REFACTOR 14: records
public class Slug implements Comparable<Slug> {

	private final String value;

	private Slug(String value) {
		this.value = requireNonNull(value);
		if (value.isEmpty())
			throw new IllegalArgumentException("Slugs can't have an empty value.");
	}

	static Slug from(String value) {
		return new Slug(value);
	}

	public String value() {
		return value;
	}

	@Override
	public int compareTo(Slug right) {
		return this.value.compareTo(right.value);
	}

	@Override
	public boolean equals(Object o) {
		// REFACTOR 14: pattern matching
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Slug slug = (Slug) o;
		return value.equals(slug.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public String toString() {
		return "Slug{" +
				"value='" + value + '\'' +
				'}';
	}

}
